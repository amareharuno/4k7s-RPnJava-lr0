package service;

import model.Model;

import javax.servlet.http.HttpServletRequest;

public class Service {
    public String getGreetingPage(HttpServletRequest request){
        String pathToPage = "/jsp/greeting.jsp";

        Model model = new Model();
        request.setAttribute("greeting", model.getGreeting());

        return pathToPage;
    }
}
