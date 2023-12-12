package lk.ijse.gdse65.demotwo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DemoTask extends HttpServlet {


    @Override
    public void init() throws ServletException {
       // System.out.println("Demo Task");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        System.out.println(Integer.parseInt(getServletContext().getInitParameter("num")) % 2 == 0 ? "Even" :"Odd");
    }
}
