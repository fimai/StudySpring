package api.cloudfoundry.com;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;


public class FormBean {
	//@Size(min = 3, max = 10)
	private String name = "your name";
	//@Email
	private String mail = "your@mail";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
