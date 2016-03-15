<%-- 
    Document   : crearPersona
    Created on : 15/02/2016, 06:27:07 PM
    Author     : tamyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crear Personas</h1><br/>
        <form action="registrarpersona.do" method="post"><br/>
            rut: <input type="text" name="txtRut" value="" /><br/>
            nombre: <input type="text" name="txtNombre" value="" /><br/>
            apellido: <input type="text" name="txtApellido" value="" /><br/>
            <input type="submit" value="Crear" />
        </form>
    </body>
</html>
