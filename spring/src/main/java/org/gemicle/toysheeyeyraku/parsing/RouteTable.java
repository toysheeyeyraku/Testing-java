package org.gemicle.toysheeyeyraku.parsing;

import java.io.Serializable;
import java.util.ArrayList;

public class RouteTable implements Serializable {
		public String stop;
		public ArrayList<HourTime> stopsTime ;
		@Override 
		public String toString() {
			StringBuilder ans =new StringBuilder();
		//	ans.append(stop+"\n");
			for (HourTime h:stopsTime) {
				ans.append(h+"\n");
			}
			return ans.toString();
			
		}
		
}
