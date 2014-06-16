<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/qos.css">
<script src="/js/qosjs.js"></script>
<script src="/js/table.js"></script>
<script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
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
<div id="Host_Qos" class="up"  ><!--主机Qos查询操作  -->
<form method="post" name="Qoslist" id="Qoslist" class="form">
	<input type="button" value="添加主机QOS" onclick="document.getElementById('addqosdiv').style.display='block';document.getElementById('fade').style.display='block'">&nbsp;&nbsp;
  	<input type="button" value="删除选中QOS" onclick="deleteqos()">&nbsp;&nbsp;
   	<input type="button" value="修改选中QOS" onclick="modhostqos()">&nbsp;&nbsp;
   	<input type="button" value="审核选中" onclick="audit_host()"><br>
   	<input type="text" name="choosenqosinfomation" id="choosenqosinfomation" style="display:none" ><br>
   	<div id="host_qos" style="font-family:Consolas;">
    </div>
    <div id="host_qosPage"></div>
</form>
</div>

<div id="Host_Groups" class="down" ><!--主机分组查询操作  -->
<form method="post" name="Grouplist" id="Grouplist" class="form">
	<input type="button" value="添加主机QOS分组" onclick="document.getElementById('addhgroup').style.display='block';document.getElementById('fade').style.display='block'">&nbsp;&nbsp;
  	<input type="button" value="删除选中QOS分组" onclick="deletehostgroup()">&nbsp;&nbsp;
   	<input type="button" value="修改选中QOS分组" onclick="modHostGroup()"><br>
   	  <input type="text" name="deletegroup" id="deletegroup" style="display:none" ><br>
   	<div id="host_qos_group" style="font-family:Consolas;">
    </div>
    <div id="host_qos_group_Page"></div>
</form>
</div>

<div id="addhgroup" class="white_content">
<form method="post" name="addhostgroup" id="addhostgroup">
  请输入优先级:<input type="text" name="priority" id="g_priority"><br>
  请输入带宽:<input type="text" name="bandwidth" id="g_bandwidth"><br>
  请输入延迟:<input type="text" name="delay" id="g_delay"><br>
  请输入丢包率:<input type="text" name="packetLoss" id="g_packetLoss"><br>
<input type="button" value="取消" onclick="document.getElementById('addhgroup').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
<input type="button" value="提交" onclick="addgroup()">
</form>
</div>
<div id="fade" class="black_overlay"> 
</div>


<div id="modifyhostgroup" class="white_content">
<form method="post" name="modhostgroup" id="modhostgroup">
  请输入优先级:<input type="text" name="priority"><br>
  请输入带宽:<input type="text" name="bandwidth"><br>
  请输入延迟:<input type="text" name="delay"><br>
  请输入丢包率:<input type="text" name="packetLoss"><br>
  <input type="text" name="groupInfo" id="groupInfo" style="display:none" ><br>
  <input type="button" value="取消" onclick="document.getElementById('modifyhostgroup').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
  <input type="button" value="提交" onclick="modQosGroup()">
</form>
</div>


<div id="addqosdiv" class="white_content">
<form method="post" name="addqos" id="addqos">
  请输入需求名:<input type="text" name="qosname"><br>
  请输入主机MAC:<input type="text" name="macaddr"><br>
  请输入主机IP:<input type="text" name="ipaddr"><br>
<!--   请输入用户编号:<input type="text" name="userid"><br> -->
  请输入分组编号:<input type="text" name="groupid"><br>
<input type="button" value="取消" onclick="document.getElementById('addqosdiv').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
<input type="button" value="提交" onclick="addhostqos()">
</form>
</div>


<div id="modqosdiv" class="white_content">
<form method="post" name="modqos" id="modqos">
  请输入需求名:<input type="text" name="qosname"><br>
  请输入MAC地址：<input type="text" name="macaddr"><br>
  请输入IP地址:<input type="text" name="ipaddr"><br>
  请输入分组编号:<input type="text" name="groupid"><br>
  <input type="text" name="choosenqos" id="choosenqos" style="display:none" ><br>
  <input type="button" value="取消" onclick="document.getElementById('modqosdiv').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
  <input type="button" value="提交" onclick="modQos()">
</form>
</div>
</div>

<script type="text/javascript">
 function goPage(pageIndex) {
    var arrTh = ['编号','需求名','主机MAC','主机IP','用户编号','分组编号','审核标识','选中'];
    var hostlist=${requestScope.hostlist};
    var count=0;
    var tablename='hostlist';
    var arrTr = [];
    var page=(pageIndex-1)*5;
    for(var item in hostlist){
        count++;
    }
    for(var i=page;i<page+5;i++){
        if(i<count){
        	var qosInfo=hostlist[i].hostQosID+','+hostlist[i].qosName+','+hostlist[i].hostMac+
        	','+hostlist[i].hostIP+','+hostlist[i].userID+','+hostlist[i].groupID;
            if(hostlist[i].auditTag!=1){
                var checkbox='<input type=\"checkbox\" name=\"hostaudit\" value='+hostlist[i].hostQosID+'>';
            }
            else{
                var checkbox='已审核';
            }
            var radio='<input type=\"radio\" id=\"qosinfo\" name=\"qosinfo\" value='+qosInfo+'>';
            arrTr.push([hostlist[i].hostQosID,hostlist[i].qosName,hostlist[i].hostMac,hostlist[i].hostIP,
                        hostlist[i].userID,hostlist[i].groupID,checkbox,radio]);
        }
    } 
    document.getElementById('host_qos').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('host_qosPage', count, 5, pageIndex, 'goPage');  
}
function gohgroupPage(pageIndex) {
    var arrTh = ['分组编号','优先级','带宽','延迟','丢包率','选中'];
    var grouplist=${requestScope.grouplist};
    var count=0;
    var tablename='grouplist';
    var arrTr = [];
    var page=(pageIndex-1)*5;
    for(var item in grouplist){
        count++;
    }
    for(var i=page;i<page+5;i++){
        if(i<count){           
            var radio='<input type=\"radio\" id=\"hgInfo\" name=\"hgInfo\" value='+grouplist[i].hostGroupID+'>';
            arrTr.push([grouplist[i].hostGroupID,grouplist[i].priority,grouplist[i].bandwidth,
                        grouplist[i].delay,grouplist[i].packetLoss,radio]);
        }
    } 
    document.getElementById('host_qos_group').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('host_qos_group_Page', count, 5, pageIndex, 'gohgroupPage');
}
goPage(1);
gohgroupPage(1);
</script>
</body>
</html>