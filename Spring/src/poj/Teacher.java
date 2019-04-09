package poj;

import org.springframework.stereotype.Component;

@Component("teacher")
public class Teacher {
	private String name = "ls";
	private String age = "30";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
