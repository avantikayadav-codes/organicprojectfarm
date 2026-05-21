

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add File Here</title>
</head>
<body>
   // ../ for out from admin folder ans send request to servlet
     <form method="post" action="ImageServlet" 
           enctype="multipart/form-data">
     
     <div>
      <label>Prod.Name:</label> 
      <input type="text" name="prodnm" size="50" placeholder="ProdName" />
     </div>
     <div>
      <label>Price:</label> 
      <input type="text" name="price" size="50" placeholder="Price" />
     </div>
     <div>
      <label>Profile Photo: </label> 
      <input type="file" name="photo" size="50" />
     </div>
     <input type="submit" value="Save">
    </form>
 </body>
</html>
