package com.knmodicollege.collegemanagement.collegemanagement.dao;
 
{
	package com.knmodicollege.collegemanagement.dao.impl;

	import java.util.ArrayList;
	import java.sql.*;
	import com.knmodicollege.collegemanagement.dao.CourseDAO;
	import com.knmodicollege.collegemanagement.model.Course;
	import com.knmodicollege.collegemanagement.util.*;
	/*----------------------------------------------------
	 * ------- Structure of the Table -----------
	 * Table name : course
	 * --------------------------------------
	 * field - datatype - properties
	 * courseid - varchar(30) - primary key
	 * coursename - varchar(300) - not null
	 * description - varchar(1000) - not null
	 * duration - int - not null
	 * min_enrollment - int - not null
	 * max_enrollment - int - not null
	 * -------------------------------------*/
	public class CourseDAOImpl implements CourseDAO
	{

		@Override
		public int save(Course courseData) 
		{
			int insertedRows = 0;
			try(Connection con = DataBaseUtil.establishConnection();)
			{
				
				/*--- creating reference of Prepared Statement interface ---*/
				PreparedStatement stmt = con.prepareStatement("insert into course values(?,?,?,?,?,?)");
				/*--- setting values into the query parameters */
				stmt.setString(1, courseData.getCourseId());
				stmt.setString(2, courseData.getCourseName());
				stmt.setString(3, courseData.getDescription());
				stmt.setInt(4, courseData.getDuration());
				stmt.setInt(5, courseData.getMin_enrollment());
				stmt.setInt(6, courseData.getMax_enrollment());
				/*-------------------------------------------------*/
				//executing the query
				insertedRows = stmt.executeUpdate();
			}
			catch(SQLException sqe)
			{
				System.out.println(sqe);
			}
			return insertedRows;
		}

		@Override
		public ArrayList<Course> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Course findByCourseId(String courseId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int updateCourseDurationByCourseId(String courseId, int duration) 
		{
			int updatedRows = 0;
			try(Connection con = DataBaseUtil.establishConnection();)
			{
				
				/*--- creating reference of Prepared Statement interface ---*/
				PreparedStatement stmt = con.prepareStatement("update course set duration = ? where courseid = ?");
				/*--- setting values into the query parameters */
				stmt.setInt(1, duration);
				stmt.setString(2, courseId);
				/*-------------------------------------------------*/
				//executing the query
				updatedRows = stmt.executeUpdate();
			}
			catch(SQLException sqe)
			{
				System.out.println(sqe);
			}
			return updatedRows;
		}

	}

}
