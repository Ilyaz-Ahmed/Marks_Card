package Markscard;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Markscarddao.Marksdao;
import Markscarddto.Marksdto;
@WebServlet("/student")
public class Marksftechid extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	String usn=req.getParameter("USN");
	long usn1=Long.parseLong(usn);
	
	Marksdao dao=new Marksdao();
	Marksdto dto=dao.fetchid(usn1);
	req.setAttribute("Ilyaz", dto);
	RequestDispatcher rd=req.getRequestDispatcher("fetchid.jsp");
	rd.forward(req, resp);
	//resp.getWriter().print(dto);
}
}
