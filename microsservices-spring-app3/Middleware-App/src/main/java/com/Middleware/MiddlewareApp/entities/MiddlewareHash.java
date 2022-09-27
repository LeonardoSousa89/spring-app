package com.Middleware.MiddlewareApp.entities;

public class MiddlewareHash {
	
	private long id;
	private String name;
	private String email;
	private Integer hash=1000;
	
	public MiddlewareHash() {}
	
	public MiddlewareHash(long id,String name, String email, Integer hash) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.hash=hash;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getHash() {
		this.hash+=(int) (Math.random() * 1000);
		return hash;
	}
	
}
