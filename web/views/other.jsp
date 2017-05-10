<%-- 
    Document   : index
    Created on : 8 mai 2017, 09:51:09
    Author     : Toavina RALAMBOSOA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! eo ara hoe</h1>
        <s:url namespace="/" action="produits" var="lien1"></s:url>
        <s:a href="%{lien1}">Produits</s:a>
    </body>
</html>
