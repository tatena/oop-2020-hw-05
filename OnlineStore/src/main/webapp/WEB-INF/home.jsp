<%@ page contentType="text/html" pageEncoding="UTF-8" language = "java" %>
<%@ page import = "java.util.List, store.*" %>

<html>
<head>
    <title>Student Store</title>
    <h1>Student Store</h1>

</head>
<body>
<p>Items available:</p>
<ul>
    <% Database data = (Database)request.getServletContext().getAttribute("database"); %>
    <% for(Product p : data.getAll()){ %>
    <li><a href="product?id=<%= p.getId() %>"><%= p.getName()%> </a></li>
    <% } %>
</ul>
</body>
</html>