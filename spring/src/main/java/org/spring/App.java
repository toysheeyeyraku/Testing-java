package org.spring;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.gemicle.toysheeyeyraku.parsing.GetRozklad;
import org.gemicle.toysheeyeyraku.parsing.HourTime;
import org.gemicle.toysheeyeyraku.parsing.Rozklad;
import org.gemicle.toysheeyeyraku.parsing.Stop;
import org.gemicle.toysheeyeyraku.parsing.Transport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.Route;
import model.TransportBlock;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	private TransportBlockRepository repository;
    public static void main( String[] args )
    {
        
        SpringApplication.run(App.class, args);
    }
    @Override
	public void run(String... args) throws Exception {
    	System.out.println("Zapusk");
		/*repository.deleteAll();
		Rozklad roz=GetRozklad.get();
		TransportBlock ans =new TransportBlock();
		for (org.gemicle.toysheeyeyraku.parsing.TransportBlock block :roz.transportTypes) {
			ans.type=block.transportName;
			for (Transport transport :block.transports) {
				model.Transport tr=new model.Transport();
				tr.name=transport.number;
				tr.forwardRoute=getRoute(transport.StopsForward);
				tr.backRoute=getRoute(transport.StopsBack);
				ans.transports.add(tr);
				
			}
		}*/
		
		
		

	}
    Route getRoute(ArrayList<Stop> stops) {
    	Route ans =new Route();
    	ans.name=stops.get(0).StopName+"-"+stops.get(stops.size()-1).StopName;
    	for (Stop st :stops) {
    		model.Stop mns =new model.Stop();
    		mns.name=st.StopName;
    		
    		for (HourTime time : st.chillDay.stopsTime) {
    			for (int x :time.minutes) {
    				mns.chillDay.times.add(LocalTime.of(time.hour, x).toString());
    			}
    		}
    		for (HourTime time : st.workDay.stopsTime) {
    			for (int x :time.minutes) {
    				mns.workDay.times.add(LocalTime.of(time.hour, x).toString());
    			}
    		}
    		ans.stops.add(mns);
    	}
    	return ans;
    	
    }
    
}
