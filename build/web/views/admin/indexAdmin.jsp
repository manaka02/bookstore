<%@include file="header.jsp" %>
    <div id="page-wrapper">
        <div class="graphs">
     	<div class="col_3">
        	<div class="col-md-3 widget widget1">
        		<div class="r3_counter_box">
                    <i class="pull-left fa fa-thumbs-up icon-rounded"></i>
                    <div class="stats">
                      <h5><strong>test</strong></h5>
                      <span>Billets vendus</span>
                    </div>
                </div>
        	</div>
        	<div class="col-md-3 widget widget1">
        		<div class="r3_counter_box">
                    <i class="pull-left fa fa-users user1 icon-rounded"></i>
                    <div class="stats">
                      <h5><strong>test</strong></h5>
                      <span>Clients</span>
                    </div>
                </div>
        	</div>
        	<div class="col-md-3 widget widget1">
        		<div class="r3_counter_box">
                    <i class="pull-left fa fa-comment user2 icon-rounded"></i>
                    <div class="stats">
                      <h5><strong>test</strong></h5>
                      <span>Utilisateurs</span>
                    </div>
                </div>
        	</div>
        	<div class="col-md-3 widget">
        		<div class="r3_counter_box">
                    <i class="pull-left fa fa-dollar dollar1 icon-rounded"></i>
                    <div class="stats">
                      <h5><strong>test</strong></h5>
                      <span>Aujourd'hui (Ar)</span>
                    </div>
                </div>
        	 </div>
        	<div class="clearfix"> </div>
      </div>
      <div class="col-sm-12" style="background-color: white;">
		    <div class="col-md-4 grid_2" style="margin-top: 30px;">

          <div class="grid_1">
            <h3>Vente par pack (Ar)</h3>
            <canvas id="pie" height="300" width="400" style="width: 400px; height: 300px;"></canvas>
          </div>
        </div>
        <div class="col-md-8">

            <div class="tab-content col-sm-12">
            <a href="index.php/Liste/toCSV" class="pull-right btn btn-primary"><i class="fa fa-plus"></i> Exporter en CSV</a>
              <table class="table">
                <thead>
                  <tr>
                    <th>Pack vendu</th>
                    <th>prix unitaire (Ar)</th>
                    <th>Nombre vente</th>
                    <th>billet</th>
                    <th>Total (Ar)</th>
                  </tr>
                </thead>
                <tbody>
                 
                  <tr>
                    <td>test</td>
                    <td>test</td>
                    <td>test</td>
                    <td>test</td>
                    <td>test</td>
                    
                  </tr>

                </tbody>            
              </table>
            </div>
        </div>	
            <div class="clearfix"> </div>
            
	     </div>
       <div class="clearfix"> </div>
<%@include file="footer.jsp" %>

    
	  
