<%-- 
    Document   : editarPersona
    Created on : 14/03/2016, 09:22:37 PM
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
        <form method="POST" action='editarpersona.do'>
            User ID : <input type="text" readonly="readonly" name="txtRut"
                             value="${persona.rut}" /> <br /> 
            Nombre : <input
                type="text" name="txtNombre"
                value="${persona.nombre}" /> <br /> 
            
            Apellido : <input
                type="text" name="txtApellido"
                value="${persona.apellido}" /> <br /> 

            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
