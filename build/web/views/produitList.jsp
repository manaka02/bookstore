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
        <link href="webroot/css/boottrap.min.css" rel="stylesheet" media="screen">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="">
            <h1>Liste des produits</h1>
            <s:form action="save" method="post">
                <s:textfield label="REF" name="produit.reference"></s:textfield>
                <s:textfield label="Désignation" name="produit.designation"></s:textfield>
                <s:textfield label="Prix" name="produit.prix"></s:textfield>
                <s:textfield label="Quantite" name="produit.quantite"></s:textfield>
                <s:checkbox label="promo" name="produit.promo"></s:checkbox>
                <s:hidden name="editMode"></s:hidden>
                <s:hidden name="produit.id"></s:hidden>
                <s:textarea
                <s:submit value="Save"></s:submit>
            </s:form>


            <div>
                <table class="table-hover">
                    <tr>
                        <th>Ref</th>
                        <th>Designation</th>
                        <th>Prix</th>
                        <th>Quantite</th>
                        <th>Promo</th>
                    </tr>
                    <s:iterator value="produitList">
                        <tr>
                            <td><s:property value="reference"/></td>
                            <td><s:property value="designation"/></td>
                            <td><s:property value="prix"/></td>
                            <td><s:property value="quantite"/></td>
                            <td><s:property value="promo"/></td>
                            <s:url namespace="/" action="delete" var="lien1">
                                <s:param name="id">
                                    <s:property value="id"/>
                                </s:param>
                            </s:url>
                            <s:url namespace="/" action="update" var="lien2">
                                <s:param name="id">
                                    <s:property value="id"/>
                                </s:param>
                            </s:url>
                            <td>
                                <s:a href="%{lien1}">Suppr</s:a> 
                            </td>
                            <td>
                                <s:a href="%{lien2}">Modifier</s:a> 
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </div>
            
    </body>
</html>
