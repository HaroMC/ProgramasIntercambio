<%-- 
    Document   : CEM_administracion_familia
    Created on : 23-10-2017, 23:12:45
    Author     : Bugueño
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                    <li><a href="CEM_home.jsp">Home</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Administracion de Usuarios
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Alumnos</a></li>
                            <li class="active"><a href="#">Familia</a></li>
                        </ul>
                    </li>
                    <li><a href="CEL_postulaciones.jsp">Administracion de programas</a></li>
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
            <h2>Familias</h2>      
            <p>Buscar una familia puedes hacerlo aqui:</p>
            <input class="form-control" id="myInput" type="text" placeholder="Escribe aca lo que buscas..">
            <br>
            <form action="" method="">
                <table class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th>Nombre Jefe familia</th>
                            <th>Cantidad de integrantes</th>
                            <th>Rut</th>
                            <th>Direccion</th>
                            <th>Pais</th>
                            <th>Eliminar</th>
                            <th>Editar</th>
                        </tr>
                    </thead>
                    <tbody id="myTable">
                        <tr>
                            <td><input type=text name="nombre"></td>
                            <td><input type=number name="cantidad"></td>
                            <td><input type=text name="rut"></td>
                            <td><input type=text name="direccion"></td>
                            <td><input type=text name="pais"></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        </tr>
                        <tr>
                            <td>Mary</td>
                            <td>5</td>
                            <td>9.805.788-6</td>
                            <td>porahi 23</td>
                            <td>EE.UU</td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        </tr>
                        <tr>
                            <td>July</td>
                            <td>2</td>
                            <td>12.356.959-7</td>
                            <td>poraca 7</td>
                            <td>España</td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        <tr>
                            <td>Anja</td>
                            <td>3</td>
                            <td>17.676.357-4</td>
                            <td>poracuya 80</td>              
                            <td>Canada</td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-minus"></i>
                                </button></td>
                            <td><button type="button" class="btn btn-primary">
                                    <i class="glyphicon glyphicon-pencil"></i>
                                </button></td>
                        </tr>
                    </tbody>
                    <input  type="submit" value="Enviar">
                </table>
            </form>
            <button type="button" class="btn btn-primary">
                <span class="glyphicon glyphicon-plus"></span>
            </button>
            <button type="button" class="btn btn-primary">
                <i class="glyphicon glyphicon-pencil"></i>
            </button>
             <button type="button" class="btn btn-primary">
                <i class="glyphicon glyphicon-minus"></i>
            </button>
        </div>


        <div class="container">
            <h2>Antecedentes</h2>      
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
    </body>
</html>
