package Hafta2.mirasBasitOrnek;

public class User implements UserInterface{
	
	private int id;
	private String email;
	private String password;
	
	
	public User(int id, String email, String password) {
		
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public User() {
		
	}

	
	public void yemekYe() {
		System.out.println("User yemek yiyor " + a + " KG");
	}

	@Override
	public boolean kontrol() {
		return true;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	
	

}
