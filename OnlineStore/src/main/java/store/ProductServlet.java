package store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Database data = (Database) req.getServletContext().getAttribute("database");
        String id = req.getParameter("id");
        Product product = data.getProduct(id);

        req.setAttribute("id", product.getId());
        req.setAttribute("name", product.getName());
        req.setAttribute("price", product.getPrice());
        req.setAttribute("img", product.getImg());
        req.getRequestDispatcher("/WEB-INF/product.jsp").forward(req, resp);
    }
}
