package com.dbConfig;

import java.io.IOException;

import javax.persistence.NoResultException;
import javax.persistence.Query;
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
@WebServlet("/delete")
public class DeleteStudent extends HttpServlet{
		@Override
		public void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
		{
			int sid=Integer.parseInt(req.getParameter("sid"));
			
			Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
			SessionFactory sf=con.buildSessionFactory();
			Session session=sf.openSession();
			
			Transaction tx=session.beginTransaction();

			Query q1=session.createQuery("delete from Student where sid="+sid);
			q1.executeUpdate();
			resp.getWriter().println("Roll-no "+sid+" Successfully Removed");
	
			tx.commit();
			session.close();
			sf.close();
			
			
		}
}
