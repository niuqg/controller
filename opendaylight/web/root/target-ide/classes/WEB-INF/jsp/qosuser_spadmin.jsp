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

<div id="right" class="right" >
<form  method="post" name="user" id="user" class="form">
  <input type="button" value="创建用户" onclick="document.getElementById('add').style.display='block';document.getElementById('fade').style.display='block'">&nbsp;&nbsp;
  <input type="button" value="删除用户" onclick="deleteuser()">&nbsp;&nbsp;
  <input type="button" value="修改用户信息" onclick="moduserInfo()"><br>
 <div id="divData" style="font-family:Consolas;">
 </div>
 <div id="divPage"></div>
</form>
</div>

<div id="modify" class="white_content">
<form method="post" name="moduser" id="moduser">
  您只有权限修改一下信息:<br>
  请选择用户等级：<select name="userLevelID" >
  				<!--<option value="1">管理员</option>  -->
  				<option value="2">普通管理员</option>
  				<option value="3" selected>访客</option>
             </select><br>
  请输入用户密码：<input type="password" name="password1"><br>
  请再次输入用户密码：<input type="password" name="password2"><br>
  请输入用户描述：<input type="text" name="description"><br>
  <input type="text" name="deleteInfo" id="deleteInfo" style="display:none" ><br>
  <input type="button" value="取消" onclick="document.getElementById('modify').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
  <input type="button" value="提交" onclick="mod()">
</form>
</div>

<div id="normalmodify" class="white_content">
<form method="post" name="modnormaluser" id="modnormaluser">
  您只有权限修改一下信息:<br>
  请输入用户密码：<input type="password" name="password1"><br>
  请再次输入用户密码：<input type="password" name="password2"><br>
  请输入用户描述：<input type="text" name="description"><br>
  <input type="button" value="取消" onclick="document.getElementById('normalmodify').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
  <input type="button" value="提交" onclick="modoperator()">
</form>
</div>

<div id="add" class="white_content">
<form method="post" name="adduser" id="adduser">
  请输入用户名：<input type="text" name="username"><br>
  请选择用户等级：<select name="userLevelID">
  				 <!--<option value="1">管理员</option>  --> 
  				  <option value="2">普通管理员</option>
  				  <option value="3">访客</option>
              </select><br>
  请输入用户密码：<input type="password" name="password1"><br>
  请再次输入用户密码：<input type="password" name="password2"><br>
  请输入用户描述：<input type="text" name="description"><br>
<input type="button" value="取消" onclick="document.getElementById('add').style.display='none';document.getElementById('fade').style.display='none'">&nbsp;&nbsp;
<input type="button" value="提交" onclick="add()">
</form>
</div>

<div id="fade" class="black_overlay"> 
</div>
</div>
<script type="text/javascript">
function deleteuser(){
    var choose=document.getElementsByName("choose");
    var choosenuser,b="no";
    var userlist=${requestScope.userlist};
    var username=${user.userID};
    for(i=0;i<choose.length;i++){
        if(choose.item(i).checked){
            b="yes";
            if(username==userlist[i].userID){
            	alert("不能删除自己");
            }
            else{
            	user.action="deleteuser";
                user.submit();
            }
        }
    }
    if(b=="no"){//没有选中任何一个
        alert("请选被删除的用户");
        return;
    }
}
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
        var radiovalue=userlist[i].userName+','+userlist[i].userID+','+userlist[i].userPassword+
        ','+userlist[i].userLevelID+','+userlist[i].userDescription;
        var radio=' <input type="checkbox" id="choose" name="choose" value='+userlist[i].userID+'> ';
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
                    level,userlist[i].userDescription,radio]);
        }
    } 
    document.getElementById('divData').innerHTML = getTable(arrTh, arrTr,tablename);
    jsPage('divPage', count, 10, pageIndex, 'goPage');
}
goPage(1);
</script>
</body>
</html>