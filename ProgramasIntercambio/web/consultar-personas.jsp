<%-- 
    Document   : consultar-personas
    Created on : 18-oct-2017, 22:32:25
    Author     : Kevin
--%>


<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="org.cem.entities.Persona" %>


<%  %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de personas</title>
    </head>
    <body>
        <h1>Personas</h1>
        Personas en BD:
        <table>
            <c:forEach items="${personas}" var="persona">
            <tr>
                <td> <c:out value="${persona.id}" /> </td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>