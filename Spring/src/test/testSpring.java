package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import poj.Course;
import poj.Student;

public class testSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student stu = (Student) context.getBean("Student");// 根据ID得到对象
		Course c = (Course) context.getBean("Course");
		System.out.println(stu.getName());
		System.out.println(c.getTeacher().getName());
	}

}
