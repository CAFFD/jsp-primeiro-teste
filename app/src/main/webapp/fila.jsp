<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<%@ page import="application.filaSimples" %>

<%
 filaSimples fila = new filaSimples(4);
 fila.enqueue(10);
 fila.enqueue(30);

 session.setAttribute("fila", fila);
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <c:catch var="ex">
        <p>${fila.dequeue()}</p>
        <p>${fila.dequeue()}</p>
        <p>${fila.dequeue()}</p>
    </c:catch>
    <c:if test="${ex !=null}">
        <p>${ex.message}</p>
    </c:if>
</body>
</html>