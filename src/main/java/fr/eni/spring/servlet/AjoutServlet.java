package fr.eni.spring.servlet;

import fr.eni.spring.bean.Media;
import fr.eni.spring.bean.Mediatheque;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/AjoutServlet")
public class AjoutServlet extends HttpServlet {
    @Autowired
    private Mediatheque mediatheque;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = request.getParameter("nom");
        String titre = request.getParameter("titre");
        Media media = new Media(titre, nom);
        Mediatheque mediatheque = (Mediatheque) request.getSession().getAttribute("mediatheque");
        mediatheque.getCollection().add(media);
        response.sendRedirect("MediathequeServlet");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Mediatheque mediatheque = (Mediatheque) request.getSession().getAttribute("mediatheque");
        RequestDispatcher rd = request.getRequestDispatcher("ajout.jsp");
        rd.forward(request, response);
    }
}
