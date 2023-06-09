package Markscard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Markscarddao.Marksdao;
@WebServlet("/update")
public class Marksupdate extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	
	String usn=req.getParameter("USN");
	long usn1=Long.parseLong(usn);
	
	String sname=req.getParameter("Sname");
	
	
	String dob=req.getParameter("DOB");
	
	
	String fname=req.getParameter("Fname");
	
	String mname=req.getParameter("Mname");
	
	String kan=req.getParameter("I_Kannada");
	int kan1=Integer.parseInt(kan);
	
	String hin=req.getParameter("I_Hindi");
	int hin1=Integer.parseInt(hin);
	
	String eng=req.getParameter("I_English");
	int eng1=Integer.parseInt(eng);
	
	String maths=req.getParameter("I_Maths");
	int maths1=Integer.parseInt(maths);
	
	String sci=req.getParameter("I_Science");
	int sci1=Integer.parseInt(sci);
	
	String soc=req.getParameter("I_Social");
	int soc1=Integer.parseInt(soc);
	
	String kannada=req.getParameter("E_Kannada");
	int kannada1=Integer.parseInt(kannada);
	
	String hindi=req.getParameter("E_Hindi");
	int hindi1=Integer.parseInt(hindi);
	
	String english=req.getParameter("E_English");
	int english1=Integer.parseInt(english);
	
	String math=req.getParameter("E_Maths");
	int math1=Integer.parseInt(math);
	
	String science=req.getParameter("E_Science");
	int science1=Integer.parseInt(science);
	
	String social=req.getParameter("E_Social");
	int social1=Integer.parseInt(social);
	
	int marks=kan1+eng1+hin1+maths1+soc1+sci1+kannada1+hindi1+english1+math1+science1+social1;
	
	double d=marks*100/750;
	
	Marksdao dao=new Marksdao();
	dao.update(usn1,sname,dob,fname,mname,kan1,eng1,hin1,maths1,sci1,soc1,kannada1,english1,math1,hindi1,science1,social1,marks,d);
}
}
