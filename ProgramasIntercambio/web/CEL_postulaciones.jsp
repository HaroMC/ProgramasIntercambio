<%-- 
    Document   : postulaciones
    Created on : 19-10-2017, 4:35:45
    Author     : Bugueño
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <title>JSP Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
                    <li><a href="CEL_home.jsp">Home</a></li>
                    <li><a href="CEL_calificaciones.jsp">Calificaciones</a></li>
                    <li class="active"><a href="CEL_postulaciones.jsp">Postulaciones</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <h2>Programas a los cuales puede postular </h2>      
            <p>Si necesitas buscar un programa en especifico puedes hacerlo aqui:</p>
            <input class="form-control" id="myInput" type="text" placeholder="Escribe aca lo que buscas..">
            <br>
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Codigo</th>
                        <th>Nombre</th>
                        <th>Fecha de Inicio</th>
                        <th>Fecha de Termino</th>
                        <th>Valor</th>
                        <th>Estado</th>
                        <th>Codigo_asignatura</th>
                    </tr>
                </thead>
                <tbody id="myTable">
                    <tr>
                        <td>001</td>>
                        <td>Ingles</td>
                        <td>11/06/1017</td>
                        <td>11/07/1017</td>
                        <td>$1.800.000</td>
                        <td>Estado</td>
                        <td>002</td>
                    </tr>
                    <tr>
                        <td>002</td>>
                        <td>Recursos Humanos</td>
                        <td>11/06/1017</td>
                        <td>11/07/1017</td>
                        <td>$1.400.000</td>
                        <td>Estado</td>
                        <td>003</td>
                    </tr>
                    <tr>
                        <td>003</td>>
                        <td>Desarrollo en MEAN</td>
                        <td>11/06/1017</td>
                        <td>11/07/1017</td>
                        <td>$1.900.000</td>
                        <td>Estado</td>
                        <td>004</td>
                    </tr>
                    <tr>
                        <td>004</td>>
                        <td>Desarrollo Full Stack</td>
                        <td>11/06/1017</td>
                        <td>11/07/1017</td>
                        <td>$1.900.000</td>
                        <td>Estado</td>
                        <td>005</td>
                    </tr>
                </tbody>
            </table>
            <button type="button" class="btn btn-primary">
                Postular
            </button>
        </div>


        <div class="container">
            <h2>Programas a los que estas postulando </h2>      
            <p>Si necesitas buscar un programa a los cuales has postulado hazlo aqui:</p>
            <input class="form-control" id="myInput2" type="text" placeholder="Escribe aca lo que buscas..">
            <br>
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody id="myTable2">
                    <tr>
                        <td>John</td>
                        <td>Doe</td>
                        <td>john@example.com</td>
                    </tr>
                    <tr>
                        <td>Mary</td>
                        <td>Moe</td>
                        <td>mary@mail.com</td>
                    </tr>
                    <tr>
                        <td>July</td>
                        <td>Dooley</td>
                        <td>july@greatstuff.com</td>
                    </tr>
                    <tr>
                        <td>Anja</td>
                        <td>Ravendale</td>
                        <td>a_r@test.com</td>
                    </tr>
                </tbody>
            </table>
            <button type="button" class="btn btn-primary">
                Eliminar Postulación
            </button>
        </div>
        <script>
            $(document).ready(function () {
                $("#myInput").on("keyup", function () {
                    var value = $(this).val().toLowerCase();
                    $("#myTable tr").filter(function () {
                        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                    });
                });
            });
        </script>
        <script>
            $(document).ready(function () {
                $("#myInput2").on("keyup", function () {
                    var value = $(this).val().toLowerCase();
                    $("#myTable2 tr").filter(function () {
                        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                    });
                });
            });
        </script>


    </body>
</html>
