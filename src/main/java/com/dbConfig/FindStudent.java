package com.dbConfig;

import java.io.IOException;

import javax.persistence.NoResultException;
import javax.persistence.Query;
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
@WebServlet("/find")
public class FindStudent extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException
	{
		int sid=Integer.parseInt(req.getParameter("sid"));
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		Query q1=session.createQuery("from Student where sid="+sid);
		Student s=null;
		try {
		s=(Student) q1.getSingleResult();
		}
		catch(NoResultException e)
		{
			resp.getWriter().println("Roll-no "+sid+" is not Present");
		}
		tx.commit();
		session.close();
		sf.close();
		if(s!=null)
		{
			req.setAttribute("roll", s.getSid());
			req.setAttribute("name", s.getSname());
			req.setAttribute("marks", s.getClass());
			RequestDispatcher rd=req.getRequestDispatcher("/result.jsp");
			rd.forward(req, resp);
		}
		
		
	}

}
