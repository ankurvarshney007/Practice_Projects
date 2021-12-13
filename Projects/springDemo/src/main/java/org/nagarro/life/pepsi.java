package org.nagarro.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean,DisposableBean{
	private int x ;
	private String name ;
	
	public pepsi(int x, String name) {
		super();
		this.x = x;
		this.name = name;
	}
	public pepsi() {
		super();
		
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("taking pepsi");
		
	}
	public void destroy() throws Exception {
		System.out.println("pepsi finishes");
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "pepsi [x=" + x + ", name=" + name + "]";
	}
	
	
}
