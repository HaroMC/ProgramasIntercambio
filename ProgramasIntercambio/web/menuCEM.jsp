<%-- 
    Document   : menuCEM
    Created on : 16-10-2017, 02:26:39 AM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Usuario CEM</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">WebSiteName</a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="CEM_home.jsp">Home</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Administracion de Usuarios
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Alumnos</a></li>
                            <li><a href="CEM_administracion_familia.jsp">Familia</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Administracion de programas
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Ver listado de Programas</a></li>
                            <li><a href="agregarPrograma.jsp">Agregar Programas</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Consultar Postulaciones
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">CEL's</a></li>
                            <li><a href="#">Alumnos</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
            </div>
        </nav>
        <!-- <div class="panel panel-default">

            <div class="container">
                <h2>tablas con Programas a los cuales puede postular </h2>           
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Nombre del Programa</th>
                            <th>Asignatura</th>
                            <th>Docente que la imparte</th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>John</td>
                            <td>Doe</td>
                            <td>john@example.com</td>
                        </tr>
                        <tr>
                            <td>Mary</td>
                            <td>Moe</td>
                            <td>mary@example.com</td>
                        </tr>
                        <tr>
                            <td>July</td>
                            <td>Dooley</td>
                            <td>july@example.com</td>
                        </tr>
                    </tbody>
                </table>
                <button type="button" class="btn btn-primary">
                    Postular
                </button>
            </div>
            <div class="container">
                <h2>Programas a los que estas postulando</h2>           
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Nombre del Programa</th>
                            <th>Asignatura</th>
                            <th>Docente que la imparte</th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>John</td>
                            <td>Doe</td>
                            <td>john@example.com</td>
                        </tr>
                    </tbody>
                </table>
                <button type="button" class="btn btn-primary">
                    Eliminar Postulación
                </button>
            </div> -->
    </body>
</html>
