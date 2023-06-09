package Markscard;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Markscarddao.Marksdao;
import Markscarddto.Marksdto;
@WebServlet("/fetchall")
public class Marksfetchall extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	Marksdao dao=new Marksdao();
	List<Marksdto> dto=dao.fetchall();
	req.setAttribute("list", dto);
	resp.getWriter().print("<h1>dto</h1>");
	RequestDispatcher rd=req.getRequestDispatcher("fetchall.jsp");
	rd.include(req, resp);
	
}
}
