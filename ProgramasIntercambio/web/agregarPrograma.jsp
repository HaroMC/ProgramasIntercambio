
<%-- 
    Document   : agregarPrograma
    Created on : 16-10-2017, 02:25:50 AM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Programa</title>
    </head>
    <body>
        <h1>Ingreso de programa</h1>
        <%-- formulario de ingreso de un programa--%>
        <form action="AgregarPrograma" method="post">
            <!--Lo ordenè por tabla, tr es la fila, y td la columna, te genera un sector estàtico-->
            <table>
                <tr>
                    <td>
                        <!--
                         Asi se comenta en esta parte, y los textos planos no requieren tag.
                        -->
                        Nombre del programa:
                    </td>
                    <td>
                        <input type="text" name="nombreDePrograma"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Nombre asignatura:
                    </td>
                    <td>
                        <input type="text" name="nombreAsignatura"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Valor:
                    </td>
                    <td>
                        <input type="number" name="valor"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <!--saquè el chek y puse un radio button ya que solo puede tener una 
                        opcion seleccionada-->
                        Tipo de Programa
                    </td>
                </tr>
                <tr>
                    <td>
                        Corto 
                        <input type="radio" name="tipoPrograma" value="corto" checked="checked" />
                    </td>
                    <td>
                        Normal 
                        <input type="radio" name="tipoPrograma" value="normal" checked="checked" />
                    </td>
                </tr>
                <tr>
                    <td>Pais Destino:</td>
                    <td>
                        <input type="text" name="pais"/>
                    </td>
                </tr>
                <tr>
                    <td>Fecha de inicio:</td>
                    <td>
                        <input type="datetime" name="fechaInicio"/>
                    </td>
                </tr>
                <tr>
                    <td>Fecha de Termino:</td>
                    <td>
                        <input type="datetime" name="fechaTermino"/>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Ingresar Programa"/></td>
                </tr>
            </table>
        </form>
        ${mensaje}
    </body>
</html>
