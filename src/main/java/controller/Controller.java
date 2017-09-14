package controller;

import service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Service service = new Service();
        String pathToPage = service.getGreetingPage(request);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pathToPage);
        dispatcher.forward(request, response);
    }
}
