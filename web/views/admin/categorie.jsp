<%@include file="header.jsp" %>

    <div id="page-wrapper">
        <div class="col-sm-offset-1">
            <h1>Categorie de livre</h1>
            <div class="tab-pane active" id="horizontal-form">
                <h5 style="color:red;"></h5>
                <s:form action="saveCategorie" method="post" class="form-horizontal">
                        <div data-parsley-check-children="2" data-parsley-validate-if-empty="">
                                <h5 class="">Inserer les données de la nouvelle catégorie :</h5>
                                <div class="form-group">
                                    <label for="focusedinput" class="col-sm-2 control-label">Designation :</label>
                                    <div class="col-sm-8">  
                                        <input type="text" class="form-control" placeholder="designation" name="categorie.designation" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="focusedinput" class="col-sm-2 control-label">Details :</label>
                                    <div class="col-sm-8">
                                        <textarea name="categorie.details" class="form-control" required></textarea>
                                    </div>
                                </div>
                                <div class="form-group col-sm-8" >
                                    <input class="btn btn-primary btn-lg col-sm-offset-3" type="submit" value="Sauvegarder">
                                </div>
                        </div>
                        <hr>
                </s:form>
            </div>


            <div class="col-sm-8">
                <h3>Listes des catégories disponibles</h3>
                <table class="table col-sm-10">
                    <tr>
                        <th>Designation</th>
                        <th>details</th>
                        <th>Action</th>
                        
                    </tr>
                    <s:iterator value="categorieList">
                        <tr>
                            <td><s:property value="designation"/></td>
                            <td><s:property value="details"/></td>
                            <s:url namespace="/" action="deleteCategorie" var="lien1">
                                <s:param name="id">
                                    <s:property value="id"/>
                                </s:param>
                            </s:url>
                            <s:url namespace="/" action="updateCategorie" var="lien2">
                                <s:param name="id">
                                    <s:property value="id"/>
                                </s:param>
                            </s:url>
                            
                            <td>
                                <s:a href="%{lien1}">Supprimer</s:a> 
                            </td>
                            <td>
                                <s:a href="%{lien2}">Modifier</s:a> 
                            </td>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </div>
            <div class="clearfix"> </div>
            
	     </div>
       <div class="clearfix"> </div>
<%@include file="footer.jsp" %>

    
	  
