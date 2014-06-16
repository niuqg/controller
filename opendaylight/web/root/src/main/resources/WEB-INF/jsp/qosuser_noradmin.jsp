<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

<div id="right" class="right" align="center">
<form  method="post" name="user" id="user" class="form">
  <input type="button" value="修改本人信息" onclick="document.getElementById('normalmodify').style.display='block';document.getElementById('fade').style.display='block'"><br>
 <div id="divData" style="font-family:Consolas;">
 </div>
 <div id="divPage"></div>
</form>
</div>


<div id="normalmodify" class="white_content">
<form method="post" name="modopuser" id="modopuser">
  您只有权限修改一下信息:<br>
  请输入用户密码：<input type="password" name="password1"><br>
  请再次输入用户密码：<input type="password" name="password2"><br>
  请输入用户描述：<input type="text" name="description"><br>
  <input type="text" name="deleteInfo" style="display:none"  value=${user.userName },${user.userID },${user.userPassword },${user.userLevelID },${user.userDescription }><br>
  <input type="button" value="取消" onclick="document.getElementById('normalmodify').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
  <input type="button" value="提交" onclick="modoperator()">
</form>
</div>

<div id="fade" class="black_overlay"> 
</div>
<script type="text/javascript">
function goPage(pageIndex) {
	var arrTh = ['用户编号','用户名','角色类型','用户描述','选中用户'];
    var userlist=${requestScope.userlist};
    var count=0;
    var tablename='userlist';
    var arrTr = [];
    var page=(pageIndex-1)*10;
    for(var item in userlist){
        count++;
    }
    var level;
    for(var i=page;i<page+10;i++){
        if(i<count){
        var radiovalue=userlist[i].userName+','+userlist[i].userID+
        ','+userlist[i].userLevelID+','+userlist[i].userDescription;
        if(userlist[i].userLevelID==1){
        	level="超级管理员";
        }
        else{
        	if(userlist[i].userLevelID==2){
        		level="普通管理员";
        	}
        	else{
        		level="访客";
        	}
        }
        arrTr.push([userlist[i].userID,userlist[i].userName,
                    level,userlist[i].userDescription]);
        }
    } 
    document.getElementById('divData').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('divPage', count, 10, pageIndex, 'goPage');
}
goPage(1);
alert(${user.userName});
</script>
</body>
</html>