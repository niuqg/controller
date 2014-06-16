/**
 * 
 */
//document.write(”<script language=javascript src=’/js/jquery-1.9.1.min.js’></script>”);
//new_element=document.createElement("script");
//new_element.setAttribute("type","text/javascript");
//new_element.setAttribute("src","/js/jquery-1.9.1.min.js");
// document.body.appendChild(new_element);
function check(){
	var username=adduser.username.value;
	var password1=adduser.password1.value;
	var password2=adduser.password2.value;
	if(username==""){
		alert("用户名不能为空");
		return "error";
	}
	if(password1==""||password2==""){
		alert("密码不能为空");	
		return "error";
	}
	if(password1!=password2){
		alert("两次输入的密码不一致");
		return "error";
	}
	return "true";	
}
//增加用户
function add(){
	if(check()=="true"){
    	if(confirm("确认操作?")){
			adduser.action="adduser";
			adduser.submit();
		}
	}
}

function moduserInfo(){
	var choose=document.getElementsByName("choose");
	var choosenuser,b="no";
		 for(i=0;i<choose.length;i++){
			 if(choose.item(i).checked){
				 choosenuser=choose.item(i).getAttribute("value");
				 b="yes";
				 window.document.getElementById('modify').style.display='block';
				 window.document.getElementById('fade').style.display='block';
			 }
		 }
		 if(b=="no"){//没有选中任何一个
			 alert("请选要修改的用户");
		 }
}
//修改用户信息 只能该密码和描述
function mod(){
	var password1=moduser.password1.value;
	var password2=moduser.password2.value;
	var choose=document.getElementsByName("choose");
	for(i=0;i<choose.length;i++){
		if(choose.item(i).checked){
			choosenuser=choose.item(i).getAttribute("value");//获取选中的用户信息
		 }
	 }
	if(password1==""||password2==""){
		alert("密码不能为空");	
		return "error";
	}
	if(password1!=password2){
		alert("两次输入的密码不一致");
		return "error";
	}
	if(confirm("确认操作?")){
		document.getElementById("deleteInfo").value=choosenuser;
		moduser.action="moduser";
		moduser.submit();
	}
}

function modnormal(){//普通用户修改信息

	var password1=modnormaluser.password1.value;
	var password2=modnormaluser.password2.value;
	var normal=document.getElementsByName("normal");
	userInfo=normal.item(0).getAttribute("value");
	if(password1==""||password2==""){
		alert("密码不能为空");	
		return "error";
	}
	if(password1!=password2){
		alert("两次输入的密码不一致");
		return "error";
	}
	if(confirm("确认操作?")){
		document.getElementById("deleteInfo").value=userInfo;
		modnormaluser.action="modnormaluser";
		modnormaluser.submit();
	}
}

function modoperator(){
	var password1=modopuser.password1.value;
	var password2=modopuser.password2.value;
	userInfo=modopuser.deleteInfo.value;
	if(password1==""||password2==""){
		alert("密码不能为空");	
		return "error";
	}
	if(password1!=password2){
		alert("两次输入的密码不一致");
		return "error";
	}
	if(confirm("确认操作?")){
		modopuser.action="modnormaluser";
		modopuser.submit();
	}
}

	
function addgroup(){
	var priority=$('#g_priority').val();
	var bandwidth=$('#g_bandwidth').val();
	var delay=$('#g_delay').val();
	var packetLoss=$('#g_packetLoss').val();
	if(priority==""){
		alert("优先级不能为空");
	}else if(bandwidth==""){
		alert("带宽不能为空");
	}else if(delay==""){
		alert("延迟不能为空");
	}else if(packetLoss==""){
		alert("丢包率不能为空");
	}else{
	    validateGroup();
	}
}

function validateGroup(){
	 var priority=$('#g_priority').val();
	 var bandwidth=$('#g_bandwidth').val();
	 $.ajax({
		 type:"POST",
		 url:"/validategroup",
		 data:"priority="+priority+"&bandwidth="+bandwidth,
		  success: function(data){       
			    if(data=="false"){     
			     alert("主机分组已经存在"+data);
			    }else{     
			        alert("主机分组可用"+data); 
			         if(confirm("确认操作?")){
			             addhostgroup.action="addhostgroup";
			             addhostgroup.submit();
			         }
			    }     
			  } 
	 });
}

function deletehostgroup(){
	var hgInfo=document.getElementsByName("hgInfo");
	var choosenhg,b="no";
		 for(i=0;i<hgInfo.length;i++){
			 if(hgInfo.item(i).checked){			 
				 choosenhg=hgInfo.item(i).getAttribute("value");
				 b="yes";
				 if(confirm("确认操作?")){
					 document.getElementById("deletegroup").value=choosenhg;
					 Grouplist.action="deletehostgroup";
					 Grouplist.submit();
				 }
			 }
		 }
		 if(b=="no"){//没有选中任何一个
			 alert("请选被删除的主机QOS分组");
		 }
}

function modHostGroup(){
	var hostgroup=document.getElementsByName("hgInfo");
	var host,b="no";
	for(i=0;i<hostgroup.length;i++){
		if(hostgroup.item(i).checked){
			 host=hostgroup.item(i).getAttribute("value");
			 b="yes";
			 window.document.getElementById('modifyhostgroup').style.display='block';
			 window.document.getElementById('fade').style.display='block';
		}
	}
	if(b=="no"){
		alert("请选要修改的QOS分组");
	}
}
function modQosGroup(){
	var priority=modhostgroup.priority.value;
	var bandwidth=modhostgroup.bandwidth.value;
	var b="yes";
	if(priority==""){
		alert("优先级不能为空");
		b="no";
	}
	if(bandwidth==""){
		alert("带宽不能为空");
		b="no";
	}
	if(b=="yes"){
		var groupInfo=document.getElementsByName("hgInfo");
		for(i=0;i<groupInfo.length;i++){
			if(groupInfo.item(i).checked){
				var choosengroup=groupInfo.item(i).getAttribute("value");//获取选中的用户信息
			 }
		 }
		if(confirm("确认操作?")){
			document.getElementById("groupInfo").value=choosengroup;
			modhostgroup.action="modhostgroup";
			modhostgroup.submit();
		}
	}
}

function addhostqos(){
	var qosname=addqos.qosname.value;
	var macaddr=addqos.macaddr.value;
	var ipaddr=addqos.ipaddr.value;
	var groupid=addqos.groupid.value; 
	var b="yes";
	if(qosname==""){
		b="no";
		alert("需求名不能为空");
	}
	if(macaddr==""){
		b="no";
		alert("MAC地址不能为空");
	}
	if(ipaddr==""){
		b="no";
		alert("IP地址不能为空");
	}
	if(groupid==""){
		b="no";
		alert("分组编号不能为空");
	}
	/*Mac地址,ip判断*/
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
	if(isNaN(groupid)){
		alert("分组编号必须为数字");
		b="no";
	}
	if(b=="yes"){
		if(confirm("确认操作?")){
			addqos.action="addqos";
			addqos.submit();
		}
	}
	
}

function useraddhostqos(){
	var qosname=useraddqos.qosname.value;
	var macaddr=useraddqos.macaddr.value;
	var ipaddr=useraddqos.ipaddr.value;
	var userid=useraddqos.userid.value;
	var groupid=useraddqos.groupid.value;
	var b="yes";
	if(qosname==""){
		b="no";
		alert("需求名不能为空");
	}
	if(macaddr==""){
		b="no";
		alert("MAC地址不能为空");
	}
	if(ipaddr==""){
		b="no";
		alert("IP地址不能为空");
	}
	if(userid==""){
		b="no";
		alert("用户编号不能为空");
	}
	if(groupid==""){
		b="no";
		alert("分组编号不能为空");
	}
	if(isNaN(userid)||isNaN(groupid)){
		alert("用户编号，分组编号必须为数字");
		b="no";
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
		if(confirm("确认操作?")){
			useraddqos.action="addqos";
			useraddqos.submit();
		}
	}
}

function deleteqos(){
	var qos=document.getElementsByName("qosinfo");
	var choosenqos,b="no";
	for(i=0;i<qos.length;i++){
		 if(qos.item(i).checked){
			 choosenqos=qos.item(i).getAttribute("value");
			 b="yes";
			 if(confirm("确认操作?")){
				 document.getElementById("choosenqosinfomation").value=choosenqos;
				 Qoslist.action="deleteqos";
				 Qoslist.submit();
			 }
		 }
	 }
	 if(b=="no"){//没有选中任何一个
		 alert("请选被删除的主机QOS");
	 }
}

function modhostqos(){
	var qos=document.getElementsByName("qosinfo");
	var choosenqos,b="no";
	for(i=0;i<qos.length;i++){
		 if(qos.item(i).checked){
			 choosenqos=qos.item(i).getAttribute("value");
			 b="yes";
			 window.document.getElementById('modqosdiv').style.display='block';
			 window.document.getElementById('fade').style.display='block';
		 }
	 }
	if(b=="no"){//没有选中任何一个
		 alert("请选要修改的主机QOS");
	 }
}

function modQos(){
	var qosname=modqos.qosname.value;
	var ipaddr=modqos.ipaddr.value;
	var macaddr=modqos.macaddr.value;
	var b="yes";
	if(qosname==""){
		alert("需求名不能为空");
		b="no";
	}
	var groupid=modqos.groupid.value;
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
				 modqos.action="modqos";
				 modqos.submit();
			 }
		 }
	 }
	}
}

function addappqosgroup(){
	/*alert("addappgroup");
	var groupid=addappgroup.groupid.value;*/
	var brandwidth=addappgroup.bandwidth.value;
	var b="yes";
	/*if(groupid==""){
		alert("分组不能为空");
		b="no";
	}*/
	if(brandwidth==""){
		alert("带宽不能为空");
		b="no";
	}
	if(isNaN(brandwidth)){
		alert("带宽必须为数字");
		b="no";
	}
	if(b=="yes"){
		if(confirm("确认操作?")){
			addappgroup.action="addappgroup";
			addappgroup.submit();
		}
	}
}

function addappqos(){
	var qosname=addapp.qosname.value;
	var protocolname=addapp.protocolname.value;
	var portid=addapp.portid.value;
	var userid=addapp.userid.value;
	var groupid=addapp.groupid.value;
	var b="yes";
	if(qosname==""){
		alert("app名不能为空");
		b="no";
	}
	if(protocolname==""){
		alert("协议不能为空");
		b="no";
	}
	if(portid==""){
		alert("端口不能为空");
		b="no";
	}
	if(userid==""){
		alert("用户ID不能为空");
		b="no";
	}
	if(groupid==""){
		alert("分组不能为空");
		b="no";
	}
	if(isNaN(portid)||isNaN(userid)||isNaN(groupid)){
		alert("端口编号，用户编号，分组编号必须为数字");
		b="no";
	}
	if(b=="yes"){
		if(confirm("确认操作?")){
			addapp.action="addappqos";
			addapp.submit();
		}
	}
}

function deleteappqos(){
	var appinfo=document.getElementsByName("appinfo");
	var app,b="no";
	for(i=0;i<appinfo.length;i++){
		 if(appinfo.item(i).checked){
			 app=appinfo.item(i).getAttribute("value");
			 b="yes";
			 if(confirm("确认操作?")){
				 document.getElementById("qosID").value=app;
				 App_Qoslist.action="deleteappqos";
				 App_Qoslist.submit();
			 }
		 }
	 }
	if(b=="no"){//没有选中任何一个
		 alert("请选被删除的app QOS");
	 }
}

function deleteappqosgroup(){
	var appgroupinfo=document.getElementsByName("appgroupinfo");
	var group,b="no";
	for(i=0;i<appgroupinfo.length;i++){
		 if(appgroupinfo.item(i).checked){
			 group=appgroupinfo.item(i).getAttribute("value");
			 alert(group);
			 b="yes";
			 if(confirm("确认操作?")){
				 document.getElementById("groupinfo").value=group;
				 App_Grouplist.action="deleteappgroup";
				 App_Grouplist.submit();
			 }
		 }
	 }
	if(b=="no"){//没有选中任何一个
		 alert("请选被删除的app group");
	 }
}

function modappqospre(){
	var appinfo=document.getElementsByName("appinfo");
	var app,b="no";
	for(i=0;i<appinfo.length;i++){
		 if(appinfo.item(i).checked){
			 app=appinfo.item(i).getAttribute("value");
			 b="yes";
			 document.getElementById("appqosidnum").value=app;
			 window.document.getElementById('modappqosdiv').style.display='block';
			 window.document.getElementById('fade').style.display='block';
		 }
	 }
	if(b=="no"){//没有选中任何一个
		 alert("请选中要修改的APP QOS");
	 }
}

function modappgrouppre(){
	var groupinfo=document.getElementsByName("appgroupinfo");
	var group,b="no";
	for(i=0;i<groupinfo.length;i++){
		 if(groupinfo.item(i).checked){
			 group=groupinfo.item(i).getAttribute("value");
			 document.getElementById("appgroupIDnum").value=group;
			 b="yes";
			 window.document.getElementById('modappgroupdiv').style.display='block';
			 window.document.getElementById('fade').style.display='block';
		 }
	 }
	if(b=="no"){//没有选中任何一个
		 alert("请选中要修改的APP 分组");
	 }
}

function modAppQos(){
	var qosname=modappqosform.qosname.value;
	var protocolname=modappqosform.protocolname.value;
	var portid=modappqosform.portid.value;
	var userid=modappqosform.userid.value;
	var groupid=modappqosform.groupid.value;
	var b="yes";
	if(qosname==""){
		alert("QOS名不能为空");
		b="no";
	}
	if(protocolname==""){
		alert("协议不能为空");
		b="no";
	}
	if(portid==""){
		alert("端口不能为空");
		b="no";
	}
	if(userid==""){
		alert("用户ID不能为空");
		b="no";
	}
	if(groupid==""){
		alert("分组不能为空");
		b="no";
	}
	if(isNaN(portid)||isNaN(userid)||isNaN(groupid)){
		alert("端口编号，用户编号，分组编号必须为数字");
		b="no";
	}
	var appinfo=document.getElementsByName("appinfo");
	var app;
	if(b=="yes"){
		for(i=0;i<appinfo.length;i++){
			 if(appinfo.item(i).checked){
				 app=appinfo.item(i).getAttribute("value");
 				 if(confirm("确认操作?")){
 					
 					modappqosform.action="modappqos";
 					modappqosform.submit();
				 }
			 }
		 }
	}
	
}

function modAppGroupQos(){
	var groupinfo=document.getElementsByName("appgroupinfo");
	/*var groupid=modappgroup.groupid.value;*/
	var bandwidth=modappgroup.bandwidth.value;
	var group,b="yes";
/*	if(groupid==""){
		alert("分组编号不能为空");
		b="no";
	}*/
	if(bandwidth==""){
		alert("带宽不能为空");
		b="no";
	}
	if(isNaN(bandwidth)){
		alert("带宽必须为数字");
		b="no";
	}
	if(b=="yes"){
		for(i=0;i<groupinfo.length;i++){
			 if(groupinfo.item(i).checked){	
				 group=groupinfo.item(i).getAttribute("value");
				 alert(group);
				 if(confirm("确认操作?")){
					 modappgroup.action="modappgroup";
					 modappgroup.submit();
				 }
			 }
		 }
	}
	
}


function audit_app(){
	var checkinfo=document.getElementsByName("audit");
	var b="yes";
	alert(checkinfo+" length: "+checkinfo.length);
	for(i=0;i<checkinfo.length;i++){
		alert(checkinfo.item(i));
		if(checkinfo[i].checked){
			b="no";
			if(confirm("确认操作?")){
				App_Qoslist.action="auditapp";
				App_Qoslist.submit();
			}
		}
	}
	if(b=="yes"){
		alert("请选择要审核的APP QOS");
	}
}


function audit_host(){
	var checkinfo=document.getElementsByName("hostaudit");;
	var b="yes";
	for(i=0;i<checkinfo.length;i++){
		if(checkinfo[i].checked){
			b="no";
			if(confirm("确认操作?")){
				Qoslist.action="audithost";
				Qoslist.submit();
			}
		}
	}
	if(b=="yes"){
		alert("请选择要审核的主机 QOS");
	}
}

function useraddappqos(){
	var qosname=useraddapp.qosname.value;
	var protocolname=useraddapp.protocolname.value;
	var portid=useraddapp.portid.value;
	var userid=useraddapp.userid.value;
	var groupid=useraddapp.groupid.value;
	var b="yes";
	if(qosname==""){
		alert("QOS名不能为空");
		b="no";
	}
	if(protocolname==""){
		alert("协议名不能为空");
		b="no";
	}
	if(portid==""){
		alert("端口名不能为空");
		b="no";
	}
	if(userid==""){
		alert("用户编号不能为空");
		b="no";
	}
	if(groupid==""){
		alert("分组编号不能为空");
		b="no";
	}
	if(isNaN(portid)||isNaN(userid)||isNaN(groupid)){
		alert("端口编号，用户编号，分组编号必须为数字");
		b="no";
	}
	if(b=="yes"){
		if(confirm("确认操作?")){
			useraddapp.action="addappqos";
			useraddapp.submit();
		}
	}
}

function auditroute(){
	var checkinfo=document.getElementsByName("audit_route");
	var b="yes";
	for(i=0;i<checkinfo.length;i++){
		if(checkinfo[i].checked){
			b="no";
			if(confirm("确认操作?")){
				routelist.action="audit_static_route";
				routelist.submit();
			}
		}
	}
	if(b=="yes"){
		alert("请选择要审核的静态路由");
	}
}
function deleteroute(){
	if(confirm("确认操作?")){
		routelist.action="delete_route";
		routelist.submit();
	}
}

function addroute(){
	var routepath=addroute_form.routepath.value;
	var srcnode=addroute_form.srcnode.value;
	var desnode=addroute_form.desnode.value;
	var b="yes";
	if(routepath==""){
		alert("路径不能为空");
		b="no";
	}
	if(srcnode==""){
		alert("源主机ID不能为空");
		b="no";
	}
	if(desnode==""){
		alert("目的主机ID不能为空");
		b="no";
	}
	if(b=="yes"){
		if(confirm("确认操作?")){
			addroute_form.action="addroute";
			addroute_form.submit();
		}
	}
}



function modify_route(){
	var routeid=modstaticroute.staticrouteid.value;
	var routepath=modstaticroute.routepath.value;
	var srcnode=modstaticroute.srcnode.value;
	var desnode=modstaticroute.desnode.value;
	var b="yes";
	if(routeid==""){
		alert("静态路由编号不能为空");
		b="no";
	}
	if(routepath==""){
		alert("静态路由路径不能为空");
		b="no";
	}
	if(srcnode==""){
		alert("源主机ID不能为空");
		b="no";
	}
	if(desnode==""){
		alert("目的主机ID不能为空");
		b="no";
	}
	if(b=="yes"){
		if(confirm("确认操作?")){
			modstaticroute.action="modstaticroute";
			modstaticroute.submit();
		}
	}
}













