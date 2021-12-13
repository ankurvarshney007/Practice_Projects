package org.nagarro.springDemo;

public class Student {
	private int id ;
	private String name;
	private String address;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		System.out.println("Hey");
		this.id = id;
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
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Destroy");
	}
}
