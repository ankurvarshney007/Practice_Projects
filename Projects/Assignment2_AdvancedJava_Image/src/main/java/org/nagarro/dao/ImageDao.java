package org.nagarro.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.nagarro.dto.Images;
import org.nagarro.dto.userInfo;

public class ImageDao {

	public boolean addImage(String path,userInfo user) throws IOException{


		File file = new File(path);

		FileInputStream f = new FileInputStream(file);


		byte[] data = new byte[f.available()];
		f.read(data);

		Configuration con = new Configuration().configure().addAnnotatedClass(Images.class).addAnnotatedClass(userInfo.class);
		SessionFactory s = con.buildSessionFactory();
		Session session = s.openSession();
		session.beginTransaction();
		Images img = new Images();
		ArrayList<Images> image = getImages(user.getUserID(),user.getPassword());
		double size  = img.maxSizeCheckAllImages(image);

		size = size +(file.length()/1024.0)/1024.0;


		if((file.length()/1024) <=1024 && size<=10.0) {

			img.setImage(data);
			img.setUserID(user);

			img.setSize(file.length()/1024);
			int index = path.lastIndexOf("\\");
			String fileName = path.substring(index + 1);

			img.setImageName(fileName);


			session.save(img);

			session.getTransaction().commit();

			session.close();
			s.close();
			f.close();

			return true;

		}
		else {
			f.close();
			return false ;
		}


	}
	public ArrayList<Images> getImages(String userId,String password){
		Configuration con = new Configuration().configure().addAnnotatedClass(Images.class).addAnnotatedClass(Images.class).addAnnotatedClass(userInfo.class);
		SessionFactory s = con.buildSessionFactory();
		Session session = s.openSession();
		session.beginTransaction();
		userInfo user = new userInfo();
		user.setPassword(password);
		user.setUserID(userId);



		Query query = session.createQuery("from Images u where user = :user").setParameter("user",user);

		ArrayList<Images> image = (ArrayList<Images>)query.list();
		System.out.println("get Images function");

		return image;



	}
	public boolean delete(int imageId) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Images.class).addAnnotatedClass(userInfo.class);
		SessionFactory s = con.buildSessionFactory();
		Session session = s.openSession();
		session.beginTransaction();
		
		Query q = session.createQuery("delete from Images where imageID=:id").setParameter("id", imageId);
		int result =q.executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		s.close();
		if(result!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void update(int imageId,String fileName) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Images.class).addAnnotatedClass(userInfo.class);
		SessionFactory s = con.buildSessionFactory();
		Session session = s.openSession();
		session.beginTransaction();
		
		Query q = session.createQuery("update Images set imageName=:name where imageID=:id").setParameter("name", fileName).setParameter("id", imageId);
		q.executeUpdate();
		session.getTransaction().commit();
		session.close();
		s.close();
	}
}
