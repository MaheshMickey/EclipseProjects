//package firstpkg;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.*;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import javax.servlet.*;
//
///**
// * Servlet implementation class loginServlet
// */
//@WebServlet("/Login")
//public class Login extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	RequestDispatcher dispatcher = null;
//
//    /**
//     * Default constructor. 
//     */
//    public Login() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.print("Welcome to Home Page!");
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		String username = request.getParameter("username");
//		String userpassword = request.getParameter("password");
//		HttpSession session = request.getSession(); 
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//       	 	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehousedata","root","Mahesh@1");
//       	    Statement stmt = con.createStatement();
//       	    ResultSet count = stmt.executeQuery("select * from signupdetails where email='"+username+"' and userPassword='"+userpassword+"'");
////       	 	stmt.setString(1, username);
////       	 	stmt.setString(2, userpassword);
//       	    	//System.out.println(count);
//       	 if(count.next()) {
//       		//session.setAttribute("name",count.getString("firstname"));
//       		 //response.sendRedirect("home.html");
//       		 
//       		 dispatcher = request.getRequestDispatcher("/home.html");
//    		 request.setAttribute("status", "Success");
//    		 dispatcher.forward(request, response);
//       	 }
//       	 else
//       	 {
//       		request.getRequestDispatcher("index.html").include(request, response);
//       		 out.println("<script>document.getElementById('loginbox').innerHTML +='<br/>Sorry Invalid Credentials';</script>");
//       	 }
//		}catch(Exception r)
//		{
//			System.out.println(r.getMessage());
//		}
//		
//	}
//
//}



package firstpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Welcome to Home Page!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
