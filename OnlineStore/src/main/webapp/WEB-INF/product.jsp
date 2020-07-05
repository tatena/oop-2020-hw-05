<%@ page contentType="text/html" pageEncoding="UTF-8" language = "java" %>
<%@ page import = "java.util.List, store.*" %>

<html>
<head>
    <title>${name}</title>
    <h1>${name}</h1>
</head>
<body>
    <img src="store-images/${img}" alt="${name}" width="200" height="200"></br>
    <form action = "shoppingCart" method = "get">
        <input name = "id" type= "hidden", value = ${id}>
        <label>$ ${price} </label>
        <button type="submit"> Add to Cart</button>
    </form>
</body>
</html>