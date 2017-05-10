<%@include file="header.jsp" %>

    <div id="page-wrapper">
        <div class="col-sm-offset-1">
            <h1>Genre de livre</h1>
            <div class="tab-pane active" id="horizontal-form">
                <h5 style="color:red;"></h5>
                <s:form action="saveGenre" method="post" class="form-horizontal">
                        <div data-parsley-check-children="2" data-parsley-validate-if-empty="">
                                <h5 class="">Inserer les données de la nouvelle genre :</h5>
                                <div class="form-group">
                                    <label for="focusedinput" class="col-sm-2 control-label">Designation :</label>
                                    <div class="col-sm-8">  
                                        <input type="text" class="form-control" placeholder="designation" name="genre.designation" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="focusedinput" class="col-sm-2 control-label">Details :</label>
                                    <div class="col-sm-8">
                                        <textarea name="genre.details" class="form-control" required></textarea>
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
                <h3>Listes des genres disponibles</h3>
                <table class="table col-sm-10 table-hover">
                    <tr>
                        <th>Designation</th>
                        <th>details</th>
                        <th>Action</th>
                        
                    </tr>
                    <s:iterator value="genreList">
                        <tr>
                            <td><s:property value="designation"/></td>
                            <td><s:property value="details"/></td>
                            <s:url namespace="/" action="deleteGenre" var="lien1">
                                <s:param name="id">
                                    <s:property value="id"/>
                                </s:param>
                            </s:url>
                            <s:url namespace="/" action="updateGenre" var="lien2">
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
                <ul class="pagination pull-right">
                    <li><a href="changePageGenre.action?numpage=<s:property value="%{numpage-1}" />"><-- Précedente </a></li>
                    <s:set var="cnt" value="1" />
                    <s:iterator begin="1" end="%{(rownumber/numberByPage)+1}">
                        <s:url namespace="/" action="changePageGenre" var="lien3">
                            <s:param name="numpage">
                                <s:property value="%{#cnt}"/>
                            </s:param>
                        </s:url>
                    
                        <li>
                            <s:a href="%{lien3}"><s:property value="%{#cnt}" /></s:a> 
                        </li>
                        <s:set var="cnt" value="%{#cnt + 1}"/>
                    </s:iterator>
                    <li><a href="changePageGenre.action?numpage=<s:property value="%{numpage+1}" />">Suivante --></a></li>
                  </ul>

                
            </div>
        </div>
            <div class="clearfix"> </div>
            
	     </div>
       <div class="clearfix"> </div>
<%@include file="footer.jsp" %>

    
	  
