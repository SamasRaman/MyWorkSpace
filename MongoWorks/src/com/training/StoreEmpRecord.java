package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmpRecord {
	
	
	public static void main(String[] args) {
		//localhost:27017
		MongoClient mongoClient=new MongoClient("localhost",27017);
		
		DB db=mongoClient.getDB("exdb");	
		DBCollection dbc=db.getCollection("emps");
		
		//first way
		DBObject object=new BasicDBObject();
		object.put("empid", 106);
		object.put("empname", "kavitha");
		object.put("empemail", "kavitha@gmail.com");
		//dbc.save(object);
		//System.out.println("Object saved");
		
		
		//second way
		Map<String,Object> map=new HashMap<>();
		map.put("empid", 107);
		map.put("empname", "rupa");
		map.put("empemail", "rupa@gmail.com");
		//dbc.save(new BasicDBObject(map));
		//System.out.println("Object saved");
		
		
		//third way
		String jsonString="{empid:108 , empname: 'siddhart', empemail:'sidhart@gmail.com'}";
		//dbc.save((DBObject) JSON.parse(jsonString));
		//System.out.println("Object saved");
		
		
		//Fourth way
		
		Employee emp=new Employee();
		
		emp.setEmpEmail("anuj@gmail.com");
		emp.setEmpId(111);
		emp.setEmpName("anuj");
			
		dbc.save(emp);
		System.out.println("Object Saved");
				
		
	}
	
	
}
