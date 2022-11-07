package com.admin;


import java.io.File;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Fileinfo;
import com.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		
		Fileinfo fileinfo=new Fileinfo();
	File file= new File("C:\\Users\\HP\\workspaceHibernate\\check.txt");
	}

}
