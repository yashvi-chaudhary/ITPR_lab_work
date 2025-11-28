package com.knmodicollege.collegemanagement.collegemanagement.dao;

{
	import com.knmodicollege.collegemanagement.model.Course;
	import java.util.*;
	/*---- this is DAO layer which will interact will database directly -----*/
	public interface CourseDAO 
	{
		/*---- to insert data into the table ----*/
		int save(Course courseData);
		
		/*--- to fetch complete course list ---*/
		ArrayList<Course> findAll();
		
		/*--- to fetch course details based on course id ----*/
		Course findByCourseId(String courseId);
		
		/*---- to update Course Duration based on course id ---*/
		int updateCourseDurationByCourseId(String courseId, int duration);
		
	}
}
