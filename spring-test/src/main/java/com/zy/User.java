package com.zy;

import java.util.List;
import javax.annotation.PostConstruct;

public class User {

	private String username;

	private Element element;

	private List<String> nameList;

	public User() {
	}

	@PostConstruct
	public void postConstructMethod() {
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public Element getElement() {
		return this.element;
	}

	public void destroyMethod() {
		System.out.println("destroyMethod");
	}
}