package pl.javastart.adnnotations;

public class User {

	@DatabaseField(columnName = "userName")
	private String name;
	
	public String surname;

}
