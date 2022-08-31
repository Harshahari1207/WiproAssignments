package Encapsulation_Abstraction.Assignment1;

public class Author {
	private String name;
	private String email;
	private Character gender;
	public Author(String name, String email, Character gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	

	

}
