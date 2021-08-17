package com.dbConfig;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.inject.Singleton;

@Singleton
@WebServlet("/save")
public class StoreStudent extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sid = Integer.parseInt(req.getParameter("roll_no"));
		String sname = req.getParameter("sname");
		int marks=Integer.parseInt(req.getParameter("marks"));
		
		Student std=new Student();
		std.setSid(sid);
		std.setSname(sname);
		std.setMarks(marks);
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(std);
		tx.commit();
		session.close();
		sf.close();
		
		String msg="This is nothing";
		req.setAttribute("mes", msg);
		RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
		rd.forward(req, resp);
		
	}
}
