package hello.servlet.basic.request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet{
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("RequestParamServlet.service() Start");
        request.getParameterNames().asIterator()
        .forEachRemaining(paramName -> System.out.println(paramName + ": " + request.getParameter(paramName)));;
        System.out.println();

        System.out.println("single");
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        System.out.println("username: " + username);
        System.out.println("age: " + age);

        System.out.println();

        System.out.println("Same name");
        String[] usernames = request.getParameterValues("username");
        for (String name: usernames) {
            System.out.println(name);
        }

        response.getWriter().write("ok");
    }

}