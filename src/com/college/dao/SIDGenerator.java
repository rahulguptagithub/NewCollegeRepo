package com.college.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SIDGenerator {
public static String getNextSid(){
	String sid="MTPJPL-001";
	try{
		SessionFactory sf=ConnectionUtil.getfactory();
		Session session=sf.openSession();
		Transaction tx= session.beginTransaction();
		Query q1=session.createQuery("from Student stu");
		int size=q1.list().size();
		if(size!=0){
			Query q2=session.createQuery("select max(stu.sid) from Student stu");
			List list=q2.list();
			Object o=list.get(0);
			String id="";
			id=o.toString();
			String p2=id.substring(7);
			int existingValue=Integer.parseInt(p2);
			existingValue=existingValue+1;
			if(existingValue<=9){
				sid="MTPJPL-00"+existingValue;
			}else if(existingValue<=99){
				sid="MTPJPL-0" + existingValue;
			}else if(existingValue<=999){
				sid="MTPJPL-"+existingValue;
			}else{
				sid="MTPJPL-"+existingValue;
			}
		}
		tx.commit();
		session.close();
	}catch(Exception exception){
		exception.printStackTrace();
	}
	return sid;
}
public static void main(String[] args) {
	getNextSid();
}
}
