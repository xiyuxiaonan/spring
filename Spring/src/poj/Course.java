package poj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Course")
public class Course {// ����2
	private String name;
	@Autowired
	private Teacher teacher;// ������teacher��,�����teacher��Ϊidֵ

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void showInfo() {
		System.out.println(this.name + "," + this.teacher.getName());
	}

}
