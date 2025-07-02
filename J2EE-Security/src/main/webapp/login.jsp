<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/2/2025
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login Pager</h1>
    <form method="POST" action="j_security_check">

        <table>
            <tr>
                <th>Username</th>
                <td><input type="text" name="j_username"/></td>
            </tr>
            <tr>
                <th>Password</th>
                <td><input type="password" name="j_password"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="Login"/></td>
            </tr>
        </table>

    </form>

</body>
</html>
