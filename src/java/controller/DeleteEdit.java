/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.PersonaFacade;
import entity.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tamyg
 */
public class DeleteEdit extends HttpServlet {

    @EJB
    private PersonaFacade personaFacade;
    private static String LIST_USER = "/mostrartodo.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String forward = LIST_USER;
        
        if (action.equalsIgnoreCase("delete")){
            forward = "mostrartodo.do";
            String userId = request.getParameter("userId");
            Persona p = personaFacade.find(userId); //busco al usuario a eliminar
            //tendría que corroborar que exista pero...
            personaFacade.remove(p);
        } else if (action.equalsIgnoreCase("edit")){
            forward = "/editarPersona.jsp";
            String userId = request.getParameter("userId");
            Persona p = personaFacade.find(userId); //busco al usuario a eliminar
            request.setAttribute("persona", p);
        } else if(action.equalsIgnoreCase("add")){
            forward = "/crearPersona.jsp";
        }
        //forward a la vista correspondiente        
        request.getRequestDispatcher(forward).forward(request, response);        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
