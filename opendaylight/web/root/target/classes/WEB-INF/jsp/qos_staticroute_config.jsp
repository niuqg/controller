<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ page import="edu.ustc.qos.databasemanager.User" %>
<head>
    <title>QOS</title>
    <link rel="stylesheet" type="text/css" href="/css/qos.css">
    <script src="/js/qosjs.js"></script>
    <script src="/js/table.js"></script>
</head>
<body>
<%User user=(User)session.getAttribute("user"); %>
<div id="head" >
<div id="title">
<h1 align="center">基于SDN的IPv6服务质量管理系统</h1>
</div>
<div id="userinfo" class="login_info">
欢迎您，${user.userName }<br>
<a href="/qos_logout">退出</a>
</div>
</div>
<div id="bottom">
<div id="left" class="left">
<br><br><br>
<a href="/topo_view">拓扑展示</a><br>
<a href="/useradmin">用户管理</a><br>
带宽管理<br>
<a href="/qoshost">主机带宽控制</a><br>
<a href="/qosapp">应用带宽控制</a><br>
路由管理<br>
<a href="/staticroute_manage">流表信息查询</a><br>
<a href="/staticroute_config">流表项配置</a><br>
<a href="/staticroute_config">转发路径配置</a><br>
状态监测<br>
<a href="/logger">设备信息查询</a><br>
<a href="/perform_monitor">流表状态监测</a><br>
<a href="/perform_statistic">设备状态检测</a><br>
日志管理<br>
<a href="/logger">网络运行日志</a><br>
<a href="/logger">系统操作日志</a><br>
</div>
<div id="right" class="right">
<br><br><br>
<form id="loglist" class="form">
<%if(user.getUserLevelID()==1){ %>
<input type="button" value="新建静态路由" onclick="document.getElementById('addroutediv').style.display='block';document.getElementById('fade').style.display='block'">
 <input type="button" value="修改静态路由" onclick="document.getElementById('modstaticroutediv').style.display='block'">
<%} %>
<div id="divData" style="font-family:Consolas;">
</div>
<div id="divPage"></div>
</form>
<div id="modstaticroutediv" style="display: none">
<form id="modstaticroute" method="post" name="modstaticroute" style="margin-left:140px">
请输入要修改的静态路由ID：<input type="text" name="staticrouteid"><br>
请输入源主机IP: <input type="text" name="srcnode" style="margin-left:80px"><br>
请输入交换机路径: <input type="text" name="routepath" style="margin-left:65px"><br>
请输入目的主机IP: <input type="text" name="desnode" style="margin-left:65px"><br>
<input type="button" value="取消" onclick="document.getElementById('modstaticroutediv').style.display='none'">
<input type="button" value="提交" onclick="modify_route()">
</form>
</div>


<div id="addroutediv" class="white_content">
<form method="post" name="addroute_form" id="addroute_form">
  请输入静态路由名:<input type="text" name="routename"><br>
  请输入源主机IP:<input type="text" name="srcnode"><br>
  请输入交换机路径:<input type="text" name="routepath"><br>
  请输入目的主机IP:<input type="text" name="desnode"><br>
  请输入静态路由所有者ID:<input type="text" name="userid"><br>
<input type="button" value="取消" onclick="document.getElementById('addroutediv').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
<input type="button" value="提交" onclick="addroute()">
</form>
</div>
<div id="fade" class="black_overlay"> 
</div>
</div>
<script type="text/javascript">
function goPage(pageIndex) {
    var arrTh = ['源交换机地址','源交换机端口','目的交换机地址','目的交换机端口'];
    var routelist=${requestScope.route_config};
    var count=0;
    var tablename='routelist';
    var arrTr = [];
    var page=(pageIndex-1)*5;
    for(var item in routelist){
    	count++;
    }
    for(var i=page;i<page+5;i++){
    	if(i<count){
    	arrTr.push([routelist[i].srcaddr,routelist[i].srcport,
    	            routelist[i].desaddr,routelist[i].desport]);
    	}
    } 
    document.getElementById('divData').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('divPage', count, 5, pageIndex, 'goPage');
}
goPage(1);
</script>
</body>
</html>