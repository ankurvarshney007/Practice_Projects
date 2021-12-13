package org.nagarro.service;

import java.io.IOException;
import java.util.ArrayList;

import org.nagarro.dao.ImageDao;
import org.nagarro.dto.Images;
import org.nagarro.dto.userInfo;

public class ImageService {
	private ImageDao imageDao = new ImageDao() ;
	
	public boolean addImage(String path,userInfo user) throws IOException{
		
		boolean result =this.imageDao.addImage(path, user);
		return result;
		
	}
	
	public ArrayList<Images> getImages(String userId,String password){
		
		ArrayList<Images> imageList=this.imageDao.getImages(userId, password);
		return imageList;
		
	}
	public boolean delete(int imageId) {
		boolean result =this.imageDao.delete(imageId);
		return result;
	}
	public void editImageName(int imageId,String fileName) {
		this.imageDao.update(imageId, fileName);
	}
}
