<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URL" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">

    <!-- Bootstrap CSS - 1 -->
    <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen">

    <!-- Login CSS - 2 -->
    <link rel="stylesheet/less" type="text/css" href="/css/login.less">


    <title>${title}</title>
    <!-- Bootstrap JS - 1 -->
    <script src="/js/bootstrap.min.js"></script>
    
    <!-- LESS - 2 -->
    <script type="text/javascript">
        less = {
            env: "production"
        };
    </script>
    <script src="/js/less-1.3.3.min.js"></script>
</head>
<body>
  <form action="qoslogin" id="form" method="post">

  <div class="container">
    <div class="content">
       <div class="login-form">
         <div  style="background:url(/img/home.jpg);width:558px;height:250px;"></div>
           <fieldset>
             <div class="control-group">
               <input type="text" name="username" placeholder="Username">
             </div>
             <div class="control-group">
               <input type="password" name="password" placeholder="Password">
             </div>
             <button class="btn btn-primary" type="submit" value="Log In" >Log In</button>         
           </fieldset>
       </div>
    </div>
  </div> 
  </form>
</body>
</html>
