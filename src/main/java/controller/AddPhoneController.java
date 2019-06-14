package controller;

import Model.PhoneModel;
import entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addphone")
public class AddPhoneController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("addphone.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Phone phone = new Phone();
        phone.setName(req.getParameter("name"));
        phone.setBrand(req.getParameter("brand"));
        phone.setPrice(Integer.parseInt(req.getParameter("price")));
        phone.setDescription(req.getParameter("description"));

        PhoneModel phoneModel = new PhoneModel();
        phoneModel.insert(phone);
//        if (!phone.isValid()) {
//            req.setAttribute("errors", user.getErrors());
//            req.setAttribute("user", user);
//            req.getRequestDispatcher("view/register.jsp").forward(req, resp);
//            return;
//        }
    }
}
