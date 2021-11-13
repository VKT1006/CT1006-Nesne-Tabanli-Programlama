package Hafta2.mirasBasitOrnek;

public class Main {

	public static void main(String[] args) {
		
		
		PersonalUser personalUser1 = new PersonalUser();
		CompanyUser companyUser1 = new CompanyUser();
		
		User personalUser = new PersonalUser(1,"karanituran@hotmail.com","123456","Veysel karani","TURAN","44487559632");
		User companyUser = new CompanyUser(2,"abs@gmail.com","12345","abc","47859632541");
		
		
		idYazdir(companyUser1);
		idYazdir(personalUser);
		
		
		
	}
	
	
	public static void idYazdir(User user) {
		
		
		System.out.println(user.getEmail());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
