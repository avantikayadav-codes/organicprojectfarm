package com.univ.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;

import com.univ.DAO.ImageDAO;
import com.univ.DAO.CustomerDAO;


/**
 * Servlet implementation class ImageServlet
 */
@WebServlet("/ImageServlet")
@MultipartConfig(maxFileSize = 16177215)
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type= request.getParameter("prodnm");
		String price= request.getParameter("price");
		  

				        // Input stream of the upload file
				   InputStream in= null;
				   
				   // Obtains the upload file
				        // part in this multipart request
				  Part filePart=request.getPart("photo");
				  String fnm="";

				        if (filePart != null) {

				     fnm=filePart.getSubmittedFileName();
				 // Obtains input stream of the upload file
				 in= filePart.getInputStream();
				        }

				        // Sends the statement to the
				        // database server
				  ImageDAO dao=new ImageDAO();

				int row= dao.uploadFile(fnm,price,type,in);
				        if (row > 0) {
				     response.sendRedirect("file.jsp");
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
