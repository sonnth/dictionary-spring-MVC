<%--
  Created by IntelliJ IDEA.
  User: Jimmy
  Date: 10/26/2018
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  <style>
    .container{
      width:350px;
      margin:0 auto;
    }
  </style>
  </head>
  <body>
  <div class="container">
    <form action="translate" method="post">
      Eng: <input type="text" name="eng" placeholder="input english"><br>
      <input type="submit" value="Translate"><br>
    </form>
    Vi: ${vi}<br>
  </div>
  </body>
</html>
