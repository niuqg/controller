<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/qos.css">
<script src="/js/qosjs.js"></script>
<script src="/js/table.js"></script>
</head>
<body>
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
<div id="App_Qos"  >
<form method="post" name="App_Qoslist" id="App_Qoslist" class="form">
<input type="button" value="请求添加应用QOS" onclick="document.getElementById('addappqpsdiv').style.display='block';document.getElementById('fade').style.display='block'">&nbsp;&nbsp;
    <div id="app_qos" style="font-family:Consolas;">
    </div>
    <div id="app_qosPage"></div>
</form>
</div>

<div id="App_Groups"  >
<form method="post" name="App_Grouplist" id="App_Grouplist" class="form">
    <div id="app_qos_group" style="font-family:Consolas;">
    </div>
    <div id="app_qos_group_Page"></div>
</form>
</div>

<div id="addappqpsdiv" class="white_content">
<form method="post" name="useraddapp" id="useraddapp">
  请输入QOS名:<input type="text" name="qosname"><br>
  请输入协议名称:<input type="text" name="protocolname"><br>
  请输入端口名称<input type="text" name="portid"><br>
  请输入用户编号:<input type="text" name="userid"><br>
  请输入分组编号:<input type="text" name="groupid"><br>
<input type="button" value="取消" onclick="document.getElementById('addappqpsdiv').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
<input type="button" value="提交" onclick="useraddappqos()">
</form>
</div>

</div>
<script type="text/javascript">
function goPage(pageIndex) {
    var arrTh = ['编号','qos名','协议名称','端口编号','分组编号','审核标识'];
    var appqoslist=${requestScope.appqoslist};
    var count=0;
    var tablename='appqoslist';
    var arrTr = [];
    var page=(pageIndex-1)*5;
    for(var item in appqoslist){
        count++;
    }
    for(var i=page;i<page+5;i++){
        if(i<count){
            if(appqoslist[i].auditTag!=1){
                var checkbox='未审核';
            }
            else{
                var checkbox='已审核';
            }
            arrTr.push([appqoslist[i].appQosID,appqoslist[i].qosName,appqoslist[i].protocolName,
                    appqoslist[i].portID,appqoslist[i].groupID,checkbox]);
        }
    } 
    document.getElementById('app_qos').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('app_qosPage', count, 5, pageIndex, 'goPage');  
}
function gogroupPage(pageIndex) {
    var arrTh = ['分组编号','带宽'];
    var appgrouplist=${requestScope.appgrouplist};
    var count=0;
    var tablename='appgrouplist';
    var arrTr = [];
    var page=(pageIndex-1)*5;
    for(var item in appgrouplist){
        count++;
    }
    for(var i=page;i<page+5;i++){
        if(i<count){           
            arrTr.push([appgrouplist[i].groupId,appgrouplist[i].bandwidth]);
        }
    } 
    document.getElementById('app_qos_group').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('app_qos_group_Page', count, 5, pageIndex, 'gogroupPage');
}
goPage(1);
gogroupPage(1);
</script>
</body>
</html>