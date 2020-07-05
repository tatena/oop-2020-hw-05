<%@ page import="store.Product" %>
<%@ page import="store.ShoppingCart" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" language = "java" %>

<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
<h1>Shopping Cart</h1>
<form action = "shoppingCart" method = "post">
    <ul>
        <% ShoppingCart cart = (ShoppingCart) request.getSession().getAttribute("shoppingCart"); %>
        <% for(Product p : cart.getItems()){ %>
        <li>
            <input type="number" value="<%=p.getQuantity()%>" name="<%=p.getId()%>">
            <%= p.getName()%>, <%= p.getPrice() %> <br/>
        </li>
        <% } %>
    </ul>
    <label> Total: $ <%= cart.getPrice()%> </label><br/>
    <button type="submit">Update Cart</button><br/>
    <a href="/">Continue shopping</a>
</form>
</body>
</html>
