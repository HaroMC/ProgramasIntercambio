<%-- 
    Document   : listadoDocentes
    Created on : 18-oct-2017, 13:40:31
    Author     : HaroMC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de docentes</title>
    </head>
    <body>
        <c:forEach items="${docentes}" var="d">
            ${d.getRutPersona()}
            <br>
        </c:forEach>
    </body>
</html>
