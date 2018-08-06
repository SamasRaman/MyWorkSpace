package com.training;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetQueryData {
	
	public static void main(String[] args) {
		//localhost:27017
		MongoClient mongoClient=new MongoClient("localhost",27017);
		
		DB db=mongoClient.getDB("exdb");
		
		DBCollection dbc=db.getCollection("emps");
		DBObject queryCondition=new BasicDBObject("empid",102);
		DBObject sortCondition=new BasicDBObject("empname",-1);
		BasicDBObject field = new BasicDBObject();
		
		
		field.put("empname", 1);
		field.put("empemail", 1);

		DBCursor cursor=dbc.find(queryCondition,field).sort(sortCondition).limit(2);
		
		for(DBObject myObj : cursor) {
			//System.out.println(myObj);
			System.out.println("Emplyee Id::"+myObj.get("empid"));
			System.out.println("Emplyee Name::"+myObj.get("empname"));
			System.out.println("Emplyee Email::"+myObj.get("empemail"));
			System.out.println("-----------------------------------");
			
			}	
		
	}
}
