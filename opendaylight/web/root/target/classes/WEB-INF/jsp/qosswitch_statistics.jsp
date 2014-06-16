<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<head>
    <title>QOS</title>
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
<div id="right" class="right" >
<form id="loglist" class="form" style="width:900px">
<div id="divData" style="font-family:Consolas;">
</div>
<div id="divPage"></div>
</form>
</div>
<script type="text/javascript">
function goPage(pageIndex) {
    var arrTh = ['交换机ID','端口ID','发送速率','接收速率','发送丢包率','接收丢包率','发送错误率','接收错误率','时间'];
    var switchlist=${requestScope.switchlist};
    var count=0;
    var tablename='switchlist';
    var arrTr = [];
    var page=(pageIndex-1)*10;
    for(var item in switchlist){
    	count++;
    }
    for(var i=page;i<page+10;i++){
    	if(i<count){
    	arrTr.push([switchlist[i].switchID,switchlist[i].portID,switchlist[i].tranRate,
    	            switchlist[i].recvRate,switchlist[i].tranLoss,switchlist[i].recvLoss,
    	            switchlist[i].tranError,switchlist[i].recvError,switchlist[i].timestamp]);
    	}
    } 
    document.getElementById('divData').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('divPage', count, 10, pageIndex, 'goPage');
}
goPage(1);
</script>
</body>
</html>



















