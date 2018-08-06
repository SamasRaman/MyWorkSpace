package com.training.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setEmpId(rs.getInt("empid"));
		emp.setEmpName(rs.getString("empname"));
		emp.setEmpSal(rs.getDouble("empsal"));
		return emp;
	}

}
