package com.master.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.master.beans.LoginBean;
import com.master.dao.ProviderLogin;

@WebServlet("/ProviderLoginController")
public class ProviderLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProviderLoginController() {
        super();
        
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/loginProvider.jsp").forward(request, response);
	
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		authenticate(request, response);
	}


	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setEmail(email);
		loginBean.setPassword(password);

		try {
			if (ProviderLogin.validateProvider(loginBean)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ProviderPanel.jsp");
				dispatcher.forward(request, response);
			} else {
				response.getWriter().append("invalid email or password for a service provider").append(request.getContextPath());
				
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
