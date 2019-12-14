<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>usrList</title>
</head>
<body>
hello!
<table border="1">
    <th>username</th>
    <th>password</th>
    <c:forEach var="usr" items="${userList}">
        <tr>
            <td>${usr.name}</td>
            <td>${usr.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
