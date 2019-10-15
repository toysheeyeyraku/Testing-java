package org.gemicle.toysheeyeyraku.parsing;

import java.io.Serializable;
import java.util.ArrayList;

public class HourTime implements Serializable {
	
	public int hour;
	public ArrayList<Integer> minutes;
	static HourTime previous=null;
	public static HourTime ParseHour(String hour,ArrayList<String> minutes) {
		HourTime ans =new HourTime();
		ans.minutes=new ArrayList<Integer>();
		try {
		ans.hour=Integer.parseInt(hour);
		}catch(Exception exc) {
			ans=previous;
			
		}
	   for (String min:minutes) {
		   StringBuilder min1=new StringBuilder(min);
		  
		  try {
		   ans.minutes.add(Integer.parseInt(min1.toString()));
		   }catch(Exception exc) {
			  // System.out.println(min1);
		   }
	   }
	   previous=ans;
		return ans;
	}
	@Override
	public String toString() {
		StringBuilder ans =new StringBuilder();
		ans.append("hour-"+hour+"\n");
		ans.append("minutes-");
		for (int x:minutes) {
			ans.append(x+" ");
		}
		return ans.toString();
	}
	
}
