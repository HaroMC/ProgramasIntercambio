<%-- 
    Document   : index
    Created on : 13-10-2017, 15:19:50
    Author     : Bugueño
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingreso de programa</h1>
        <%-- formulario de ingreso de un programa--%>
        <form action="" method="">
            <div class="form-group">
          Nombre del programa: <input type="text" name="nombreDePrograma"/><br/>
            </div>
            <div class="form-group">
            Nombre asignatura:  <input type="text" name="nombreAsignatura"/><br/>
            </div>
            <div class="form-group">
            Valor:  <input type="number" name="valor"/><br/>
            </div>            
            Tipo de programa<br/>
            <div class="checkbox">
            Corto <input type="checkbox" name="programaCorto"/> 
            Normal <input type="checkbox" name="programaNormal"/><br/>
            </div>
            <div class="form-group">
            Pais Destino:  <input type="text" name="pais"/><br/>
            </div>
            <div class="form-group">
            Fecha de Inicio: <input type="datetime" name="fechaInicio"/> Fecha de Termino: <input type="datetime" name="fechaTermino"/>
            </div>
            Observaciones:
            <div class="form-group">
            
            <textarea name="observacion" rows="10" cols="50" >no estoy seguro de como capturar todo el texto ayuda companieros :(</textarea>
            </div>
            <input type="submit" value="Ingresar Programa"/>
            
        </form>
    </body>
</html>
