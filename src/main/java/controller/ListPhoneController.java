package controller;

import Model.PhoneModel;
import entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/list")
public class ListPhoneController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PhoneModel phoneModel = new PhoneModel();
        ArrayList<Phone> phoneArrayList = phoneModel.getList("SELECT * from phone");
        System.out.println("feedback size: " + phoneArrayList.size());
        req.setAttribute("list", phoneArrayList);
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }
}
