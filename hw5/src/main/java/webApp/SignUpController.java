package webApp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpController extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountManager manager = (AccountManager) req.getServletContext().getAttribute("database");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        req.setAttribute("name", username);

        if (!manager.checkAccountExists(username, password)) {
            manager.addAccount(username, password);
            req.getRequestDispatcher("/WEB-INF/Welcome.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/AlreadyUsed.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/Register.jsp").forward(req, resp);
    }
}
