package com.listener;

import com.dbConfig.FindStudent;
import com.dbConfig.StoreStudent;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.servlet.ConfigServlet;

public class ServiceListener extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {
			@Override
			public void configureServlets(){
				serve("/index.jsp");
				serve("/demo").with(ConfigServlet.class);
				serve("/save").with(StoreStudent.class);
				serve("/find").with(FindStudent.class);
			}
		});
	}

}
