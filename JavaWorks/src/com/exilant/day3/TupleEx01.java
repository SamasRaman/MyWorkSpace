package com.exilant.day3;

import java.util.ArrayList;
import java.util.List;

class MyTuple<A,B,C>{
	private A aa;
	private B bb;
	private C cc;
	
	
	public MyTuple() {
		super();
	}
	public MyTuple(A aa, B bb, C cc) {
		super();
		this.aa = aa;
		this.bb = bb;
		this.cc = cc;
	}
	public A getAa() {
		return aa;
	}
	public void setAa(A aa) {
		this.aa = aa;
	}
	public B getBb() {
		return bb;
	}
	public void setBb(B bb) {
		this.bb = bb;
	}
	public C getCc() {
		return cc;
	}
	public void setCc(C cc) {
		this.cc = cc;
	}
	
	
}

class EMP{}
class DEPT{}
class SomeThing{}

public class TupleEx01 {
	
	public static MyTuple<Integer,String,Boolean> newTuple(){
		//TODO
		return new MyTuple(100,"hello",true);
	}
	public static MyTuple<EMP,DEPT,SomeThing> newCustomTuple(){
		//TODO
		return new MyTuple(new EMP(),new DEPT(),new SomeThing());
	}
	
	public static void main(String[] args) {
		MyTuple<Integer,String,Boolean> tuple1=newTuple();
		System.out.println("Integer Value:"+tuple1.getAa());
		System.out.println("String Value:"+tuple1.getBb());
		System.out.println("Boolean Value:"+tuple1.getCc());
		
		List<MyTuple<Integer,String,Boolean>> myList=new ArrayList<MyTuple<Integer,String,Boolean>>();
		
		
		
		
	}

}
