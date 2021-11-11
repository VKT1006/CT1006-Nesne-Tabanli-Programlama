package Hafta2.mirasBasitOrnek;

public class CompanyUser extends User{

	private String companyName;
	private String taxNumber;
	
	
	public CompanyUser() {
		super();
		
	}

	public CompanyUser(int id, String email, String password, String companyName, String taxNumber) {
		super(id, email, password);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	
	
	
	
	
}
