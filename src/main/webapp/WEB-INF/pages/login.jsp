<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">
</head>
<body>
<p> Picture: ${picture} </p>
<form action="nature">
    <input type="submit" name="Submit" value="Show nature">
</form>

<form action="car">
    <input type="submit" name="Submit" value="Show car">
</form>

<form action="bart">
    <input type="submit" name="Submit" value="Show bart">
</form>

</body>
</html>