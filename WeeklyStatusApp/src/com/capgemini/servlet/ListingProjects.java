package com.capgemini.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.Utils.MyUtils;
import com.capgemini.beans.Project;


@WebServlet("/listingProjects")
public class ListingProjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListingProjects() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Project> list = MyUtils.getListOfProjects(session);
		request.setAttribute("listingProjects", list);
		
        RequestDispatcher dispatcher //
        		= this.getServletContext().getRequestDispatcher("/WEB-INF/jsps/sample2.jsp");
        		dispatcher.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
