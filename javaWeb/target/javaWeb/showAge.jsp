<%--
  Created by IntelliJ IDEA.
  User: bery
  Date: 5/3/2020
  Time: 12:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Age</title>
</head>
<body>
Age in Years: <%=request.getAttribute("years")%><br/>
Age in Days:  <%=request.getAttribute("days")%>

</body>
</html>
