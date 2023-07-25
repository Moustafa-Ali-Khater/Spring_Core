package com.spring.di;

public class User implements UserInterface {

	private PersonInterface person;
	private String email, team;
	
	/*public User(PersonInterface person) {
		this.person = person;
	}*/
	
	@Override
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public void start() {
		System.out.println("I'm User");
	}
	
	@Override
	public void setperson(PersonInterface person) {
		this.person = person;

	}
	
	@Override
	public void getperson() {
		this.person.show();
	}
	
	public void dostart() {
		System.out.println("Start");
	}
	
	public void doend() {
		System.out.println("End");
	}
}
