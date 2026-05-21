package com.univ.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.univ.DAO.CustomerDAO;
import com.univ.DTO.CustomerDTO;

/**
 * Servlet implementation class CustReg
 */
@WebServlet("/CustReg")
public class CustReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDTO dto=new CustomerDTO();
		dto.setCname(request.getParameter("cname"));
		dto.setCadd(request.getParameter("cadd"));
		dto.setEmail(request.getParameter("email"));
		dto.setMob(Long.parseLong(request.getParameter("mob")));
		dto.setUnm(request.getParameter("unm"));
		dto.setPw(request.getParameter("pw"));
		CustomerDAO dao=new CustomerDAO();
		int x= dao.insert(dto);
		if(x==1)
		{
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("signup.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
