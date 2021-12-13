package org.nagarro.ref;

public class A {
	private int x;
	private B b;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
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
