<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="edu.ustc.qos.databasemanager.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/qos.css">
<script src="/js/qosjs.js"></script>
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
<div id="right">
<div >
<form id="statistic" style="background:url(/img/topo3.jpg);height:455px;width:808px;"class="form1">
<input type="text" id="switchtwo1" name="switchtwo1" class="switch21" readOnly="true" value=""/>
<input type="text" id="switchthree1" name="switchthree1"  class="switch31" readOnly="true" value=""/>
<input type="text" id="switchthree3" name="switchthree3" class="switch33" readOnly="true" value=""/>
<input type="text" id="switchfour1" name="switchfour1" class="switch41" readOnly="true" value=""/>
<input type="text" id="t1" name="t1" class="switcht1" readOnly="true" value=""/>
<input type="text" id="switchtwo2" name="switchtwo2" class="switch22" readOnly="true" value=""/>
<input type="text" id="switchthree2" name="switchthree2"  class="switch32" readOnly="true" value=""/>
<input type="text" id="switchfour2" name="switchfour1" class="switch42" readOnly="true" value=""/>
<input type="text" id="h5" name="h5" class="h5" style="text-align:right" readOnly="true" value="10.0.0.5"/>
<input type="text" id="h6" name="h6" class="h6" style="text-align:right" readOnly="true" value="10.0.0.6"/>
<input type="text" id="switchfive1" name="switchfive1"  class="switch51" readOnly="true" value=""/>
<input type="text" id="switchfive2" name="switchfive2"  class="switch52" readOnly="true" value=""/>
<input type="text" id="t2" name="t2" class="switcht2" readOnly="true" value="" />
<input type="text" id="switchone1" name="switchone1" class="switch11" readOnly="true" value=""/>
<input type="text" id="switchone2" name="switchone2" class="switch12" readOnly="true" value=""/>
<input type="text" id="switchsix2" name="switchsix2" class="switch62" readOnly="true" value=""/>
<input type="text" id="t3" name="t3" class="switcht3" readOnly="true" value="" />
<input type="text" id="switchone3" name="switchone3" class="switch13" readOnly="true" value=""/>
<input type="text" id="switchsix1" name="switchsix1" class="switch61" readOnly="true" value=""/>
<input type="text" id="h3" name="h3" class="h3" readOnly="true"  value="10.0.0.3"/>
<input type="text" id="h4" name="h4" class="h4" readOnly="true" value="10.0.0.4"/>
<input type="text" id="h1" name="h1" class="h1" readOnly="true" value="10.0.0.1"/>
<input type="text" id="h2" name="h2" class="h2" readOnly="true" value="10.0.0.2"/>
</form>
</div>
</div>
</div>
<script type="text/javascript">
    function  getData() {
        $.ajax({
			type: "get", 
			url : "GetSpeed", 
			dataType:'json',
			success: function(json){
			 $("#switchtwo1").attr("value",'');
			 if(json[3].tranRate>1000){
				 var rate=json[3].tranRate/1000;
				 rate=rate.toFixed(2);
				 $("#switchtwo1").attr("value",rate+"kbit/s");
			 }
			 else{
				 var rate=json[3].tranRate.toFixed(2);
				 $("#switchtwo1").attr("value",rate+"bit/s");
			 }
			 
             $("#switchthree1").attr("value",'');
             if(json[5].tranRate>1000){
                 var rate=json[5].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchthree1").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[5].tranRate.toFixed(2);
                 $("#switchthree1").attr("value",rate+"bit/s");
             }
             
             $("#switchthree3").attr("value",'');
             if(json[7].tranRate>1000){
                 var rate=json[7].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchthree3").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[7].tranRate.toFixed(2);
                 $("#switchthree3").attr("value",rate+"bit/s");
             }

             $("#switchfour1").attr("value",'');
             if(json[8].tranRate>1000){
                 var rate=json[8].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchfour1").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[8].tranRate.toFixed(2);
                 $("#switchfour1").attr("value",rate+"bit/s");
             }

             $("#switchtwo2").attr("value",'');
             if(json[4].tranRate>1000){
                 var rate=json[4].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchtwo2").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[4].tranRate.toFixed(2);
                 $("#switchtwo2").attr("value",rate+"bit/s");
             }
             
             $("#switchthree2").attr("value",'');
             if(json[6].tranRate>1000){
                 var rate=json[6].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchthree2").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[6].tranRate.toFixed(2);
                 $("#switchthree2").attr("value",rate+"bit/s");
             }

             $("#switchfour2").attr("value",'');
             if(json[9].tranRate>1000){
                 var rate=json[9].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchfour2").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[9].tranRate.toFixed(2);
                 $("#switchfour2").attr("value",rate+"bit/s");
             }

             $("#switchfive1").attr("value",'');
             if(json[10].tranRate>1000){
                 var rate=json[10].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchfive1").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[10].tranRate.toFixed(2);
                 $("#switchfive1").attr("value",rate+"bit/s");
             }

             $("#switchfive2").attr("value",'');
             if(json[11].tranRate>1000){
                 var rate=json[11].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchfive2").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[11].tranRate.toFixed(2);
                 $("#switchfive2").attr("value",rate+"bit/s");
             }

             $("#switchone1").attr("value",'');
             if(json[0].tranRate>1000){
                 var rate=json[0].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchone1").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[0].tranRate.toFixed(2);
                 $("#switchone1").attr("value",rate+"bit/s");
             }

             $("#switchone2").attr("value",'');
             if(json[1].tranRate>1000){
                 var rate=json[1].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchone2").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[1].tranRate.toFixed(2);
                 $("#switchone2").attr("value",rate+"bit/s");
             }

             $("#switchsix1").attr("value",'');
             if(json[12].tranRate>1000){
                 var rate=json[12].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchsix1").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[12].tranRate.toFixed(2);
                 $("#switchsix1").attr("value",rate+"bit/s");
             }

             $("#switchone3").attr("value",'');
             if(json[2].tranRate>1000){
                 var rate=json[2].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchone3").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[2].tranRate.toFixed(2);
                 $("#switchone3").attr("value",rate+"bit/s");
             }

             $("#switchsix2").attr("value",'');
             if(json[13].tranRate>1000){
                 var rate=json[13].tranRate/1000;
                 rate=rate.toFixed(2);
                 $("#switchsix2").attr("value",rate+"kbit/s");
             }
             else{
                 var rate=json[13].tranRate.toFixed(2);
                 $("#switchsix2").attr("value",rate+"bit/s");
             }
			} ,
 			error:function (XMLHttpRequest,textStatus,errThrown ){
				//alert('state = '+XMLHttpRequest.readyState +'status='+ XMLHttpRequest.status + XMLHttpRequest.responseText);
			}
        } );
    } 
getData();
setInterval("getData()",5000);
</script>
</body>
</html>