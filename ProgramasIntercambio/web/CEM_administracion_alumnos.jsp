<%-- 
    Document   : CEM_administracion_alumnos
    Created on : 25-10-2017, 19:37:39
    Author     : Bugueño
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                    <li><a href="menuCEM.jsp">Home</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Administracion de Usuarios
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="CEM_administracion_alumnos.jsp">Alumnos</a></li>
                            <li><a href="CEM_administracion_familia.jsp">Familia</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Administracion de programas
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="CEM_administrar_programas.jsp">Ver listado de Programas</a></li>
                            <li><a href="CEM_agregarPrograma.jsp">Agregar Programas</a></li>
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
        <div class="container">
            <h2>Alumnos</h2>      
            <p>Buscar un alumno puedes hacerlo aqui:</p>
            <input class="form-control" id="myInput" type="text" placeholder="Escribe aca lo que buscas..">
            <br>
            <form action="">
                <table class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th>Nombre del alumno</th>
                            <th>ID</th>
                            <th>Programa que cursa</th>
                            <th>Carrera que cursa</th>
                            <th>Numero de matricula</th>
                            <th>Eliminar</th>
                            <th>Editar</th>
                        </tr>
                    </thead>
                    <tbody id="myTable">
                        <tr>
                            <td><input type=text name="nombre"></td>
                            <td><input type=number name="id"></td><!-- este cambio se genera solo por ende si lo necesitas sacar para probar solo los datos entrantes, hazlo -->
                            <td><input type=text name="Programa"></td>
                            <td><input type=text name="carrera"></td>
                            <td><input type=number name="numMatri"></td><!-- este cambio se genera solo por ende si lo necesitas sacar para probar solo los datos entrantes, hazlo -->
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        </tr>
                        <tr>
                            <td>Mary</td>
                            <td>0088</td>
                            <td>Desarrollo Full Stack</td>
                            <td>Ingenieria en Informatica</td>
                            <td>78545412</td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        </tr>
                        <tr>
                            <td>July</td>
                            <td>0090</td>
                            <td>Gestion de Personas</td>
                            <td>Recursos Humanos</td>
                            <td>785545489</td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        <tr>
                            <td>Anja</td>
                            <td>0091</td>
                            <td>Pasteleria internacional</td>
                            <td>COcina</td>              
                            <td>456232871</td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        </tr>
                        <input  type="submit" value="Enviar">
                    </tbody>
                </table>
            </form>
            <button type="button" class="btn btn-primary">
                <i class="glyphicon glyphicon-plus"> Agregar un Alumno</i>
            </button>
        </div>
        <div class="container">
            <h2>Notas por Asignatura</h2>           
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Nombre  Alumno</th>
                        <th>Programa</th>
                        <th>Asignatura</th>
                        <th>Nota 1</th>
                        <th>Nota 2</th>
                        <th>Nota 3</th>
                        <th>Nota Final</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>John</td>
                        <td>Doe</td>
                        <td>john@example.com</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Mary</td>
                        <td>Moe</td>
                        <td>mary@example.com</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>July</td>
                        <td>Dooley</td>
                        <td>july@example.com</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
            <button type="button" class="btn btn-primary">
                <i class="glyphicon glyphicon-plus"></i>
            </button>
            <button type="button" class="btn btn-primary">
                <i class="glyphicon glyphicon-pencil"></i>
            </button>
             <button type="button" class="btn btn-primary">
                <i class="glyphicon glyphicon-minus"></i>
            </button>
            
        </div>
    </body>
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
</html>
