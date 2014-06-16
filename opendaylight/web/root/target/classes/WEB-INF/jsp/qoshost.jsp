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
<div id="right" class="right" >
<div id="Host_Qos" class="up" ><!--主机Qos查询操作  -->
<form method="post" name="Qoslist" id="Qoslist" class="form">
<input type="button" value="请求添加主机QOS" onclick="document.getElementById('addqosdiv').style.display='block';document.getElementById('fade').style.display='block'">&nbsp;&nbsp;
<input type="button" value="修改选中QOS" onclick="normalmodhostqos_pre()">
    <div id="host_qos" style="font-family:Consolas;">
    </div>
    <div id="host_qosPage"></div>
</form>
</div>

<div id="Host_Groups" class="down"  ><!--主机分组查询操作  -->
<form method="post" name="Grouplist" id="Grouplist" class="form">
    <div id="host_qos_group" style="font-family:Consolas;">
    </div>
    <div id="host_qos_group_Page"></div>
</form>
</div>

<div id="addqosdiv" class="white_content">
<form method="post" name="useraddqos" id="useraddqos">
  请输入需求名:<input type="text" name="qosname"><br>
  请输入主机MAC:<input type="text" name="macaddr"><br>
  请输入主机IP:<input type="text" name="ipaddr"><br>
  请输入用户编号:<input type="text" name="userid"><br>
  请输入分组编号:<input type="text" name="groupid"><br>
<input type="button" value="取消" onclick="document.getElementById('addqosdiv').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
<input type="button" value="提交" onclick="useraddhostqos()">
</form>
</div>

<div id="modqosdiv" class="white_content">
<form method="post" name="normalmodqos" id="normalmodqos">
  请输入需求名:<input type="text" name="qosname"><br>
  请输入MAC地址：<input type="text" name="macaddr"><br>
  请输入IP地址:<input type="text" name="ipaddr"><br>
  请输入分组编号:<input type="text" name="groupid"><br>
  <input type="text" name="choosenqos" id="choosenqos" style="display:none" ><br>
  <input type="button" value="取消" onclick="document.getElementById('normalmodqos').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
  <input type="button" value="提交" onclick="normalmodQos()">
</form>
</div>
</div>
<script type="text/javascript">
 function normalmodhostqos_pre(){
	 var hostlist=${requestScope.hostlist};
	 var qos=document.getElementsByName("qosinfo");
	    var choosenqos,b="no";
	    for(i=0;i<qos.length;i++){
	         if(qos.item(i).checked){
	             choosenqos=qos.item(i).getAttribute("value");
	             b="yes";
	             alert(${user.userID });
	             alert(hostlist[i].userID);
	             if(${user.userID }==hostlist[i].userID){
	            	 choosenqos=qos.item(i).getAttribute("value");
	            	 document.getElementById("choosenqos").value=choosenqos;
	            	 window.document.getElementById('modqosdiv').style.display='block';
	                 window.document.getElementById('fade').style.display='block';
	             }
	             else{
	            	 alert("只能修改自己的主机QoS");
	             }
	         }
	     }
	    if(b=="no"){//没有选中任何一个
	         alert("请选要修改的主机QOS");
	     }
 }
 function normalmodQos(){
	    var qosname=normalmodqos.qosname.value;
	    var ipaddr=normalmodqos.ipaddr.value;
	    var macaddr=normalmodqos.macaddr.value;
	    var b="yes";
	    if(qosname==""){
	        alert("需求名不能为空");
	        b="no";
	    }
	    var groupid=normalmodqos.groupid.value;
	    if(groupid==""){
	        alert("分组不能为空");
	        b="no";
	    }
	    if(isNaN(groupid)){
	        alert("分组编号必须为数字");
	        b="no";
	    }
	    if(macaddr==""){
	        b="no";
	        alert("MAC地址不能为空");
	    }
	    if(ipaddr==""){
	        b="no";
	        alert("IP地址不能为空");
	    }
	    var exp=/^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
	    var reg = ipaddr.match(exp);
	    if(reg==null){
	        alert("ip地址不符合规则");
	        b="no";
	    }
	    var reg1 = /[A-F\d]{2}:[A-F\d]{2}:[A-F\d]{2}:[A-F\d]{2}:[A-F\d]{2}:[A-F\d]{2}/;
	    if(!reg1.test(macaddr)){
	        alert("mac地址不符合规则");
	        b="no";
	    }
	    if(b=="yes"){
	    var qos=document.getElementsByName("qosinfo");
	    var choosenqos;
	    for(i=0;i<qos.length;i++){
	         if(qos.item(i).checked){
	             choosenqos=qos.item(i).getAttribute("value");
	             if(confirm("确认操作?")){
	                 document.getElementById("choosenqos").value=choosenqos;
	                 normalmodqos.action="modqos";
	                 normalmodqos.submit();
	             }
	         }
	     }
	    }
 }
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
                var checkbox='未审核'
            }
            else{
                var checkbox='已审核';
            }
            var radio='<input type=\"radio\" id=\"qosinfo\" name=\"qosinfo\" value='+qosInfo+'>';
            arrTr.push([hostlist[i].hostQosID,hostlist[i].qosName,hostlist[i].hostMac,
                        hostlist[i].hostIP,hostlist[i].userID,hostlist[i].groupID,checkbox,radio]);
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