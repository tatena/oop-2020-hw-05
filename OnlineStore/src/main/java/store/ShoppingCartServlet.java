package store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ShoppingCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShoppingCart cart = (ShoppingCart)req.getSession().getAttribute("shoppingCart");
        Database data = (Database) req.getServletContext().getAttribute("database");
        String id = req.getParameter("id");
        Product product = data.getProduct(id);
        cart.addItem(product);
        req.getRequestDispatcher("/WEB-INF/shoppingCart.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Database data = (Database) req.getServletContext().getAttribute("database");
        ShoppingCart cart = (ShoppingCart) req.getSession().getAttribute("shoppingCart");
        List<String> items = Collections.list(req.getParameterNames());
        for (String s : items) {
            cart.updateQuantity(data.getProduct(s), Integer.valueOf(req.getParameter(s)));
        }

        req.getRequestDispatcher("/WEB-INF/shoppingCart.jsp").forward(req, resp);
    }
}
