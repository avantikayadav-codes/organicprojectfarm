<!DOCTYPE html>
<%@page import="java.util.Vector"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.univ.DAO.CustomerDAO"%>
<html lang="en">
  <%@ include file="header.jsp" %>
      <% List<Vector> lst3=(List) session.getAttribute("cart"); %>
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
           

              <div class="row mt">
                  <div class="col-md-12">
                      <div class="content-panel">
                          <table class="table table-striped table-advance table-hover">
	                  	  	  <h4><i class="fa fa-angle-right"></i> Advanced Table</h4>
	                  	  	  <hr>
                              <thead>
                              <tr>
                                  <th><i class="fa fa-bullhorn"></i>IID</th>
                                  <th><i class="fa fa-bullhorn"></i>IName</th>
                                  <th><i class="fa fa-bullhorn"></i>Price</th>
                                  <th><i class="fa fa-bullhorn"></i>Type</th>
                                  </tr>
                              </thead>
                           <% for(Vector v2:lst3){ %>
                              <tbody>
                              <tr>
                                  <td><a href=""><%=  v2.get(0) %></a></td>
                                  <td><a href=""><%=  v2.get(1) %> </a></td>
                                  <td><a href=""><%=  v2.get(2) %></a></td>
                                  <td><a href=""><%=  v2.get(3) %> </a></td>
                                                            
                                  <td>
                                      <button class="btn btn-success btn-xs"><i class="fa fa-check"></i></button>
                                      <button class="btn btn-primary btn-xs"><i class="fa fa-pencil"></i></button>
                                      <button class="btn btn-danger btn-xs"><i class="fa fa-trash-o "></i></button>
                                  </td>
                              </tr>
                              <% } %>
                              </tbody>
                              </table>
                              </div>
                              </div>
                              </div>
                              </ul>
                              </div>
                              </aside>
                     
  <%@ include file="footer.jsp" %>

  </body>
</html>