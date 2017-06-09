<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'index.jsp' starting page</title>
	<script src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#registerInfo").on("click",function(){
			$.ajax({
				  url:getBasePath()+"/saveUserAction.action",
				  type:"post",
				  data:'aa',
				  dataType:"json",
				  success:function(data){
					  alert(data.username);
				  }
			  });
		});
	});
	 function getBasePath(){
		  var local = window.location;  
		  var contextPath = local.pathname.split("/")[1];  
		  var basePath = local.protocol+"//"+local.host+"/"+contextPath; 
		  return basePath;
	 }
	</script>
  </head>
  
  <body>
  <div class="container">
     <form action="" id="registerForm">
   <button type="button" id="registerInfo">注册</button>
    </form> 
       </div>
  </body>
</html>
