package com.training.spark;

import static org.apache.spark.sql.functions.avg;
import static org.apache.spark.sql.functions.col;
import static org.apache.spark.sql.functions.max;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import com.training.commons.SparkConnection;

public class SparkSQLDemo {
	
	public static void main(String[] args) {
		
		// Logger.getLogger("org").setLevel(Level.ERROR);
		 Logger.getLogger("org").setLevel(Level.ERROR);
		 Logger.getLogger("akka").setLevel(Level.ERROR);
		 
		 JavaSparkContext sparkContext=SparkConnection.getContext();
		 
		 SparkSession spSession=SparkConnection.getSession();
		 
		 Dataset<Row> empDataFields=spSession.read().json("./data/customerData.json");
		 
		 empDataFields.show();
		 empDataFields.printSchema();
		 
		 //data queries
		 System.out.println("SELECT Demo");
		 empDataFields.select(col("name"),col("salary")).show();
		 
		 //data query on selection(condition)
		 System.out.println("Select Demo with Condition");
		 empDataFields.filter(col("gender").equalTo("male")).show();
		 
		 System.out.println("Agreegate group by gender ");
		 empDataFields.groupBy(col("gender")).count().show();
		 
		 //group by deptid ,average salary, max age
		 Dataset<Row> summaryData=empDataFields.groupBy(col("deptid")).
				 agg(avg(empDataFields.col("salary")),
						 max(empDataFields.col("age")));
		 summaryData.show();
		 
		 // ------------------Try With Bean Classes------------------
		 
		 Department dept1=new Department(100,"Developement");
		 Department dept2=new Department(102,"Testing");
		 
		 List<Department> deptList=new ArrayList<Department>();
		 
		 deptList.add(dept1);
		 deptList.add(dept2);
		 
		 Dataset<Row> deptDataFields=spSession.createDataFrame(deptList, Department.class);
		 
		 System.out.println("Department Content are ::");
		 
		 deptDataFields.show();
		 
		 System.out.println("Join Emplopyee with Dept::");
		 
		 Dataset<Row> empDeptJoin=empDataFields.join(deptDataFields,col("deptid").
				 equalTo(col("departmentId")));
		 
		 empDeptJoin.show();
		 
		System.out.println("Join with agreegation (Depr and emp)");
		
		empDataFields.
		filter(col("age").gt(30)).join(deptDataFields,col("deptid").
				equalTo(col("departmentId"))).groupBy(col("deptid"))
		         .agg(avg(empDataFields.col("salary")),
		        		 max(empDataFields.col("age"))
		        		 ).show();
		         
		 //loading csv file
		 Dataset<Row> autoData=spSession.read().option("header","true").csv("./data/auto-data.csv");
		 
		 autoData.show(5);
		 
		 //create RDD with row objects
		 Row row1=RowFactory.create(1,"India","Bengaluru");
		 Row row2=RowFactory.create(2,"Usa","Reston");
		 Row row3=RowFactory.create(3,"UK","Steevenscreek");
		 
		 List<Row> rowList=new ArrayList<Row>();
		 rowList.add(row1);
		 rowList.add(row2);
		 rowList.add(row3);
		 
		 JavaRDD<Row> rowRDD=sparkContext.parallelize(rowList);
		 
		 StructType schema=DataTypes.createStructType(new StructField[] {
				 
		 
				DataTypes.createStructField("id", DataTypes.IntegerType, false),
				DataTypes.createStructField("country", DataTypes.StringType, false),
				DataTypes.createStructField("city", DataTypes.StringType, false)
		 });
		 
		 Dataset<Row> tempDataFields=spSession.createDataFrame(rowRDD,schema);
		 tempDataFields.show();
		 
		 //working with csv data,with sql statements 
		 //provide the data is kept in the table like format
		 //the persistence will be only till the end of program
		 
         autoData.createOrReplaceTempView("autos");
         System.out.println("Temp Table Content");
         
         spSession.sql("select * from autos where hp > 200").show();
         
         //to find make,maximum of RPM from autos group by make
         
         spSession.sql("select make,max(rpm) from autos group by make order by 2").show();
         
         //convert DataFram to JavRDD
         JavaRDD<Row> autoRDD=autoData.rdd().toJavaRDD();
         
         //reading the data from MYSQL DB
         
         //db samas ,table person
         Map<String,String> jdbcConnectParams=new HashMap<String,String>();
         
         jdbcConnectParams.put("url","jdbc:mysql://localhost:3306/samas");
         jdbcConnectParams.put("driver", "com.mysql.jdbc.Driver");
         jdbcConnectParams.put("dbtable", "person");
         jdbcConnectParams.put("user", "root");
         jdbcConnectParams.put("password", "root1234");
       
         
         
         Dataset<Row> sqlDataFields=spSession.read().format("jdbc").
        		 options(jdbcConnectParams).load();
         
         sqlDataFields.show();
            
         
        
	}
}
