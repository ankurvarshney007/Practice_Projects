package org.nagarro.dto;

import java.util.ArrayList;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Images {
	@Id
	@GeneratedValue
	private int imageID;
	@Lob
	@Column(length=100000)
	private byte[] image;
	private String imageName;
	@ManyToOne
	//@JoinColumn(name = "userID", nullable = false)
	userInfo user;
	private double size ;
	/**
	 * @return the imageID
	 */
	public int getImageID() {
		return imageID;
	}
	/**
	 * @param imageID the imageID to set
	 */
	public void setImageID(int imageID) {
		this.imageID = imageID;
	}
	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}
	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}
	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	/**
	 * @return the userID
	 */
	public userInfo getUserID() {
		return user;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(userInfo userID) {
		this.user = userID;
	}
	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
	public String getBase64Image() {
		String base = Base64.getEncoder().encodeToString(this.image);
		return base;
	}
	
	public double maxSizeCheckAllImages(ArrayList<Images> img) {
		double size =0.0;
		for(Images image : img) {
			size = size + image.getSize();
		}
		
		
		return size/1024;
	}


}
