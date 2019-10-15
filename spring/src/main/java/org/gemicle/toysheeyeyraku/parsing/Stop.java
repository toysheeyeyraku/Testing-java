package org.gemicle.toysheeyeyraku.parsing;

import java.io.Serializable;

public class Stop implements Serializable {
		public RouteTable workDay;
		public RouteTable chillDay;
		public String StopName;
		@Override
		public String toString() {
			StringBuilder ans =new StringBuilder();
			ans.append("StopName "+StopName+"\n");
			ans.append("WorkDay"+"\n");
			ans.append(workDay);
			ans.append("ChillDay"+"\n");
			ans.append(chillDay);
			return ans.toString();
		}
		
}
