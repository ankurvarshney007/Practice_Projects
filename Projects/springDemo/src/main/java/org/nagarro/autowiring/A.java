package org.nagarro.autowiring;




import org.springframework.beans.factory.annotation.Autowired;

public class A {
	@Autowired
	private B b;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the x
	 */
	 
	@Override
	public String toString() {
		return "A [   b=" + b + "]";
	}
	/**
	 * @param x the x to set
	 */
	
	/**
	 * @return the b
	 */
	public B getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(B b) {
		this.b = b;
	}
}
