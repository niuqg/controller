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
<%User user=(User)session.getAttribute("user"); %>
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
<div>
<form id="routelist" class="form">
<%if(user.getUserLevelID()==1){ %>
<input type="button" value="审核选中静态路由" onclick="auditroute()">
<input type="button" value="删除选中静态路由" onclick="deleteroute_pre()">
<%} %>
<input type="button" value="显示选中路由" onclick="display_route()">
<div id="divData" style="font-family:Consolas;">
</div>
<div id="divPage"></div>
</form>
</div>
<div>
<form class="form">
<div id="nodelist" style="font-family:Consolas;">
<div id="nodelistPage"></div>
</div>
</form>
</div>
</div>
<script type="text/javascript">
function deleteroute_pre(){
    var choose=document.getElementsByName("staticroute");
    var choosenuser,routeID,b="no";
    var name=${user.userID};
    var routelist=${requestScope.sta_routelist};
    for(i=0;i<choose.length;i++){
        if(choose.item(i).checked){
            choosenroute=choose.item(i).getAttribute("value");
            var routeown=routelist[i].userID;
            b="yes";
            if(name==routeown){
            	deleteroute();
            }
            else{
             alert("不能删除他人QOS");
            }
        }
    }
    if(b=="no"){//没有选中任何一个
        alert("请选被删除的静态路由");
    }
}

function display_route(){
	//获取选中的静态路由ID，在display(i)中画表格
	var choose=document.getElementsByName("staticroute");
    var choosenuser,b="no";
    var routelist=${requestScope.sta_routelist};
    for(i=0;i<choose.length;i++){
        if(choose.item(i).checked){
            routeID=choose.item(i).getAttribute("value");//获取到选中route的ID
            b="yes";
            display(routeID,1);
        }
    }
    if(b=="no"){//没有选中任何一个
        alert("请选要显示的静态路由");
    }
    
}
function display(index,pageIndex){
	var arrTh = ['静态路由ID','跳数','节点ID','节点类型','节点地址'];
	var count=0;
	var nodelist =new Array();
	var table_name='sta_nodelist';
    var arrTr = [];
    var nodes=${requestScope.sta_nodelist};//所有的节点信息
    for(var i in nodes){//获取这个ID的所有节点信息
        count++;
        if(nodes[i].routePathID==routeID){
            nodelist.push(nodes[i]);
            arrTr.push([nodes[i].routePathID,nodes[i].hop,
                        nodes[i].nodeID,nodes[i].nodeType,nodes[i].nodeAddr]);
        }
    }
    document.getElementById('nodelist').innerHTML = getTable(arrTh, arrTr,table_name);
}



function goPage(pageIndex) {
    var arrTh = ['静态路由ID','用户ID','源地址','目的地址','带宽','审核标识','选中'];
    var routelist=${requestScope.sta_routelist};
    var count=0;
    var tablename='sta_routelist';
    var arrTr = [];
    var page=(pageIndex-1)*10;
    for(var item in routelist){
    	count++;
    }
    for(var i=page;i<page+10;i++){
    	if(i<count){
    	if(routelist[i].AuditTag!=1){
             var checkbox='<input type=\"checkbox\" name=\"audit_route\" value='+routelist[i].staticRouteID+'>';
        }
        else{
             var checkbox='已审核';
        }
    	var radio='<input type=\"radio\" id=\"staticroute\" name=\"staticroute\" value='+routelist[i].staticRouteID+'>';
    	arrTr.push([routelist[i].staticRouteID,routelist[i].userID,routelist[i].staticRouteSrc,
    	            routelist[i].staticRouteDis,routelist[i].bandwidth,checkbox,radio]);
    	}
    } 
    document.getElementById('divData').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('divPage', count, 10, pageIndex, 'goPage');
}
goPage(1);
</script>
</body>
</html>