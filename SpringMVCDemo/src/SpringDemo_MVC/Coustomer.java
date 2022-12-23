package SpringDemo_MVC;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Coustomer
{
	private String firstName;
	
	
	@NotNull(message = "cant be null") //setting validation rule on the parameter
	@Size(min = 1, message = "cant be null")
	private String lastName;
	
	public Coustomer()
	{
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
