package org.nagarro.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", address=" + address + ", course=" + course + "]";
	}
	private String name ;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> course;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
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
	 * @return the phones
	 */
	public List<String> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	/**
	 * @return the address
	 */
	public Set<String> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	/**
	 * @return the course
	 */
	public Map<String, String> getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
}
