<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : mostrartodo.jsp
    Created on : 14/03/2016, 07:28:36 PM
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
        <table border=1>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th colspan=2>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${sessionScope.personas}">
                    <tr>
                        <td><c:out value="${p.rut}" /></td>
                        <td><c:out value="${p.nombre}" /></td>
                        <td><c:out value="${p.apellido}" /></td>
                        <td><a href="editareliminar.do?action=edit&userId=<c:out value="${p.rut}"/>">Update</a></td>
                        <td><a href="editareliminar.do?action=delete&userId=<c:out value="${p.rut}"/>">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p><a href="editareliminar.do?action=add">Add User</a></p>
    </body>
</html>
