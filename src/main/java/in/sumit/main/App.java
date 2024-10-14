package in.sumit.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sumit.beans.Student;
import in.sumit.mapper.StudentRowMapper;
import in.sumit.resources.SpringConfigFile;

public class App {
	public static void main( String[] args )
    {
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
    	
    	//1. INSERT -----------------------------------------------
//    	
//    	String std_rollno = "104";
//        String std_name = "yuvi";
//        float std_marks = 88.5f;
//    	String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//    	int count = jdbcTemplate.update(insert_sql_query,std_name,std_rollno,std_marks);
//    	
//    	if(count>0) {
//    		System.out.println("insertion success");
//    	}
//    	else {
//    		System.out.println("insertion failed");
//    	}
    	
    	//2.UPDATE-------------------------------
//    	String std_rollno = "104";
//        float std_marks = 61.5f;
//    	String update_sql_query = "UPDATE student SET std_marks=? WHERE std_rollno=?";
//    	int count = jdbcTemplate.update(update_sql_query,std_marks,std_rollno);
//    	
//    	if(count>0) {
//    		System.out.println("update success");
//    	}
//    	else {
//    		System.out.println("update failed");
//    	}
    	
    	//3.DELETE-------------------------------------------------------
//    	String rollno = "104";
//    	String delete_sql_query = "DELETE FROM student WHERE std_rollno=?";
//    	int count = jdbcTemplate.update(delete_sql_query,rollno);
//    	
//    	if(count>0) {
//    		System.out.println("delete success");
//    	}
//    	else {
//    		System.out.println("delete success");
//    	}
    	
    	//4.SELECT QUERY 1 ------------------------------------------------------------
//    	String select_sql_query = "SELECT * FROM student";
//    	List<Student> list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//    	
//    	for(Student std:list) {
//    		System.out.println("Roll no : "+std.getRollno());
//    		System.out.println("Name : "+std.getName());
//    		System.out.println("Marks : "+std.getMarks());
//    		System.out.println("-----------------------------");
//    	}
    	
    	//5.SELECT QUERY 2 -------------------------------------------------------------
//    	String rollno="102";
//    	String select_sql_query = "SELECT * FROM student WHERE std_rollno=?";
//    	
//    	List<Student> list = jdbcTemplate.query(select_sql_query, new StudentRowMapper(),rollno);
//    	for(Student std:list) {
//		System.out.println("Roll no : "+std.getRollno());
//		System.out.println("Name : "+std.getName());
//		System.out.println("Marks : "+std.getMarks());
//		System.out.println("-----------------------------");
//	}
    	
    	//5.SELECT QUERY 3 -------------------------------------------------------------
    	String rollno="103";
    	String select_sql_query = "SELECT * FROM student WHERE std_rollno=?";
    	
    	Student std = jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(),rollno);
    
		System.out.println("Roll no : "+std.getRollno());
		System.out.println("Name : "+std.getName());
		System.out.println("Marks : "+std.getMarks());


    	
    }
}
