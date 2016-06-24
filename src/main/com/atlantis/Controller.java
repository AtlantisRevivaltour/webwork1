package atlantis;
/**
 *
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public  class Controller extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        doPost(request,response);

    }

    @Override
    protected  void doPost(HttpServletRequest request,HttpServletResponse response)
            throws  ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        request.setAttribute("name",name);
        System.out.println(name);
        request.getRequestDispatcher("index.jsp").forward(request,response);


    }

}