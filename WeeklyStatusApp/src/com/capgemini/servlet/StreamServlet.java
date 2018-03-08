package com.capgemini.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.Utils.DBUtils;
import com.capgemini.Utils.MyUtils;
import com.capgemini.beans.Project;
import com.capgemini.beans.Stream;


@WebServlet("/stream")
public class StreamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public StreamServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/jsps/sample.jsp");
		dispatcher.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String streamName = request.getParameter("streamName");
		
		Stream stream = null;
		boolean error =false;
		String errorMsg = null;
		Connection connection = MyUtils.getConnection(request.getServletContext());
		
		if(streamName==null){
			error = true;
			errorMsg = "Please Select the Stream ";
		}else{
			try{
				stream = DBUtils.findStream(connection, streamName);
				if(stream == null){
					error = true;
					errorMsg = "Selected Stream is Invalid";
				}
			}catch (SQLException e) {
                e.printStackTrace();
                error = true;
                errorMsg = e.getMessage();
            }
		}
		if(error){
			request.setAttribute("errorMsg", errorMsg);
			
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/jsps/sample.jsp");
			dispatcher.forward(request, response);
		}else{
			List<Project> list = new ArrayList<Project>();
			
			try {
				list = DBUtils.findProjects(connection, stream.getStreamID());
				HttpSession session = request.getSession();
				MyUtils.storeListOfProjects(session, list);
				
				response.sendRedirect(request.getContextPath()+"/listingProjects");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}


















