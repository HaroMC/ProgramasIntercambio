<%-- 
    Document   : postulaciones
    Created on : 19-10-2017, 4:35:45
    Author     : Bugueño
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Link Bootstrap CSS -->
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" >
        <!--Link J.S.-->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>
    <body>
        <h1>Esta vista son las postulaciones y pertenece al usuario CEL</h1>
        <div class="panel panel-default">

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
            </div>

    </body>
</html>
