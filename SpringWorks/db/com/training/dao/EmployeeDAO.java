package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.interfaces.IEmployeeDao;

public class EmployeeDAO implements IEmployeeDao{
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee getEmployee(int empId) {
		String sql="select empid,empname,empsal from employee where empid=?";
		Employee emp=jdbcTemplate.queryForObject(sql, new Object[] {empId},
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return emp;
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql="select empid,empname,empsal from employee";
		List<Employee> list=new ArrayList<>();
		
		List<Map<String,Object>> rows=jdbcTemplate.queryForList(sql);
		
		
		for(Map row : rows) {
			Employee emp=new Employee();
			emp.setEmpId(Integer.parseInt(row.get("empid").toString()));
			emp.setEmpName((row.get("empname").toString()));
			emp.setEmpSal(Double.parseDouble((row.get("empsal").toString())));
			list.add(emp);
		}
		return list;
	}

	@Override
	public void insertEmployee(Employee employee) {
		String sql="insert into employee(empid,empname,empsal)"+"values(?,?,?)";
		jdbcTemplate.update(sql,employee.getEmpId(),employee.getEmpName(),employee.getEmpSal());
		System.out.println("Record Created :"+employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		String sql="delete from employee where empid=?";
		jdbcTemplate.update(sql,new Employee(empId));
		System.out.println("Employee"+empId+" Deleted");
		
	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub
		
	}
    
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

}
