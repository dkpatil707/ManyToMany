package ManytoMany.controller;

import java.util.ArrayList;


import java.util.List;

import ManytoMany.dao.CoursesDao;
import ManytoMany.dao.StudentDao;
import ManytoMany.dto.Course;
import ManytoMany.dto.Student;


public class MainCont {

	public static void main(String[] args) {

//			
			Course course7=new Course();
			course7.setId(7);
			course7.setName(" web Full Stack devloper");
			course7.setFees(5400);
	
			Course course8=new Course();
			course8.setId(8);
			course8.setName(" hibrenate ,  jdbc ");
			course8.setFees(10000);
		
			Student student4=new Student();	
			student4.setId(4);
			student4.setName("Sudarshan");
			student4.setAddress("Bangalore");
//			
			List<Course> coursesofAvi=new ArrayList<Course>();
			coursesofAvi.add(course7);
			coursesofAvi.add(course8);
//			
			student4.setCourses(coursesofAvi);
//			
			Student student5=new Student();
			student5.setId(5);
			student5.setName("Mrunali desai");
			student5.setAddress("Chennai");
//		    
			student5.setCourses(coursesofAvi);
//			
			CoursesDao coursesDao=new CoursesDao();
			coursesDao.saveCourse(course7);
	        coursesDao.saveCourse(course8);
//			
			StudentDao studentDao=new StudentDao();
			studentDao.saveStudent(student4);
//			
			studentDao.saveStudent(student5);
//			
//			
//			UPDATE
			
			
//			Course course1=new Course();
//			course1.setName("Corejava");
//			course1.setFees(3000);
			
//			CoursesDao coursesDao=new CoursesDao();
//			coursesDao.updateCourse(1, course1);
			
			
//			Student student=new Student();
//			student.setName("Avi");
//			student.setAddress("mangalore");
			
			
			
			
//			StudentDao studentDao=new StudentDao();
//			studentDao.updateStudent(1, student);
			
			
//			FIND
//			StudentDao studentDao=new  StudentDao();
//			studentDao.findStudent(1);
		//    
//			CoursesDao coursesDao=new CoursesDao();
//			coursesDao.findCourse(1);
			
			
//			DELETE
//			CoursesDao coursesDao=new CoursesDao();
//			coursesDao.deleteCourse(1);
			
//			StudentDao studentDao=new StudentDao();
//			studentDao.deleteStudent(1);
//			
			
			
//			find all
			
			
//			StudentDao studentDao=new  StudentDao();
//			studentDao.findAllStudent();
		//    
//			CoursesDao coursesDao=new CoursesDao();
//			coursesDao.findAllCourse();
//			
			
			
			
			
			
}
	}
