package com.DSA.ProblemSolving;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Activity_Selection {
	
	class Activity{
		int length;
		int breadth;
		public Activity(int length,int breadth) {
			// TODO Auto-generated constructor stub
			this.length=length;
			this.breadth=breadth;
		}
		@Override
		public String toString() {
			return "Activity [length=" + length + ", breadth=" + breadth + "]";
		}
		
		
	}
	
	public static LinkedList<Activity> activitySelection(List<Activity> al)
	{
		Activity cur=al.get(0);
		LinkedList<Activity> alnew=new LinkedList<Activity_Selection.Activity>();
		alnew.add(cur);
		for (Activity activity : al	) {
			if(activity.length>cur.length && activity.breadth>cur.breadth)
			{
				alnew.add(activity);
				cur=activity;
				
			}
			
		}
		return alnew;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity_Selection as=new Activity_Selection();
		Activity a=as.new Activity(1,3);
		Activity b=as.new Activity(3,8);
		Activity c=as.new Activity(4,5);
		
		List<Activity> al=new LinkedList<Activity>();
		al.add(c);
		al.add(b);
		al.add(a);
		//System.out.println("before "+al);
		Collections.sort(al, (a1,a2)->a1.length-a2.length);		
		//System.out.println("after "+al);
		
		LinkedList<Activity> aln=activitySelection(al);
		
		System.out.println(aln);
		

	}

}
