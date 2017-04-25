package com.college.dao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class ConnectionUtil {

	static SessionFactory factory;
	static {
			AnnotationConfiguration acf= new AnnotationConfiguration();
			acf=(AnnotationConfiguration) acf.configure(ConnectionUtil.class.getResource("/hibernate.cfg.xml"));
			factory = acf.buildSessionFactory();
	}

	public static SessionFactory getfactory() {
		return factory;
	}
	
	public static void shutdown(){
		factory.close();
	}
}
