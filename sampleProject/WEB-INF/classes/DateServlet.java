import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class DateServlet extends GenericServlet
{
public void service(ServletRequest req, ServletResponse res) throws
ServletException, IOException
{
PrintWriter pw=null;
Date date=null;
//set response content type
res.setContentType("text/html");
//get PrintWriter object
pw=res.getWriter();
//write request processing
date =new Date();
//write output to response object
pw.println("<h1 style ='text-align:center'>Date and Time is " +
date + "</h1>");
//close PrintWriter
pw.close();
}
}