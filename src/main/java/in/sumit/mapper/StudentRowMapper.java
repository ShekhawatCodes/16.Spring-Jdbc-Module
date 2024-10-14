package in.sumit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sumit.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		std.setMarks(rs.getFloat("std_marks"));
		std.setName(rs.getString("std_name"));
		std.setRollno(rs.getInt("std_rollno"));

		
		return std;
	}

}
