package com.knmodicollege.collegemanagement.collegemanagement.util;


	import java.sql.*;

	public class DataBaseutil 
	{
		//to store url of database server
		private static final String url = "jdbc:mysql://localhost:3306/collegemanagement";
		//to store username of the database
		private static final String username ="root";
		//to store password of the database
		private static final String password ="sql@yashvi123";
		
		//to store Connection data
		private static Connection con=null;
		
		//method to establish connection
		public static Connection establishConnection()
		{
			try
			{
				con = DriverManager.getConnection(url,username,password);
				//calling method to create a table
				createTables();
			}
			catch(SQLException sqe)
			{
				System.out.println(sqe);
			}
			return con;
		}
		
		//method to close the connection
		public static void closeConnection()
		{
			try {
				if(con!=null)
				{
					con.close();
				}
			}
			catch(SQLException sqe)
			{
				System.out.println(sqe);
			}
		}
		
		//method to create tables if not exists
		
		private static void createTables()
		{
			try
			{
				if(con != null)
				{
					//creating statement reference
					Statement stmt = con.createStatement();
					
					//Query for table creation
					String createCourseTable = "create table if not exists course("
							+"courseid varchar(30) primary key,"
							+"coursename varchar(300) not null,"
							+"description varchar(1000) not null,"
							+"duration int not null,"
							+"min_enrollment int not null,"
							+"max_enrollment int not null)";
					//Query for creation of Module table
					String createModuleTable = "create table if not exists module("
							+"moduleid varchar(30) primary key,"
							+"modulename varchar(300) not null,"
							+"description varchar(1000) not null,"
							+"duration int not null,"
							+"courseid varchar(30) not null,"
							+"foreign key(courseid) references course(courseid))";
					//Query for creation of Faculty table
					String createFacultyTable = "create table if not exists faculty("
							+"facultyid varchar(30) primary key,"
							+"facultyname varchar(300) not null,"
							+"qualification varchar(1000) not null,"
							+"status varchar(30) not null)";
					//Query for creation of faculty_module table
					String createfaculty_moduleTable = "create table if not exists faculty_module("
							+"facultyid varchar(30) not null,"
							+"moduleid varchar(30) not null,"
							+"foreign key(facultyid) references faculty(facultyid),"
							+"foreign key(moduleid) references module(moduleid))";
					
					
					// adding queries into batches
					stmt.addBatch(createCourseTable);
					stmt.addBatch(createModuleTable);
					stmt.addBatch(createFacultyTable);
					stmt.addBatch(createfaculty_moduleTable);
					//executing batch
					stmt.executeBatch();
				}
			}catch(SQLException sqe)
			{
				System.out.println(sqe);
			}
		}
	}


