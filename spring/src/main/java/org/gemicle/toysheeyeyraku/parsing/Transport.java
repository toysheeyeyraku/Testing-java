package org.gemicle.toysheeyeyraku.parsing;

import java.io.Serializable;
import java.util.ArrayList;

public class Transport implements Serializable {
	public String number;
	public String transport;
	public ArrayList<Stop> StopsForward;
	public ArrayList<Stop> StopsBack;
	@Override
	public String toString() {
		StringBuilder ans =new StringBuilder();
		ans.append("Transport-"+transport+"\n");
		ans.append("Number "+number+"\n");
		for (Stop st:StopsForward) {
			ans.append(st+"\n");
		}
		return ans.toString();
	}
}
