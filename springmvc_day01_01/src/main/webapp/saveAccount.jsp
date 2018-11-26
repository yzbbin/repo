<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/17
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
       $(function () {
           $("#btn").click(function () {
               //alert("fhgfhgfhg");
               $.ajax({
                   url:"account/textAJax",
                   contentType:"application/json;charset=UTF-8",
                   data:{"username":"张珊","password":"1234","money":200},
                   dataType:"json",
                   type:"post",
                   success:function (data) {
                        alert(data.username)
                   }


               })
           })
       })


    </script>
</head>
<body>
<form method="post" action="account/textModelAndView">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    金额:<input type="text" name="money"><br>
    客户名称:<input type="text" name="user.uname"><br>
    客户年龄:<input type="text" name="user.uage"><br>
    <input type="submit"value="提交"><br>
</form>

<a href="account/textForwardOrRedirect">textForwardOrRedirect</a><br>
<a href="account/textModelAndView">textModelAndView</a><br>

<button id="btn">发送ajax请求</button>

</body>
</html>
