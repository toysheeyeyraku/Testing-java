package org.gemicle.toysheeyeyraku.parsing;

import java.io.Serializable;
import java.util.ArrayList;

public class TransportBlock implements Serializable {
		public ArrayList<Transport> transports =new ArrayList<>();
		public String transportName;
		@Override
		public String toString() {
			StringBuilder ans =new StringBuilder();
			ans.append("Transport "+transportName);
			for (Transport t :transports) {
				ans.append(t+"\n");
			}
			return ans.toString();
		}
}
