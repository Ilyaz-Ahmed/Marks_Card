package Markscard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Markscarddao.Marksdao;

@WebServlet("/delete")
public class Marksdelete extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	String usn=req.getParameter("USN");
	long usn1=Long.parseLong(usn);
	
	Marksdao dao=new Marksdao();
	String msg=dao.delete(usn1);
	resp.getWriter().print(msg);
}
}
