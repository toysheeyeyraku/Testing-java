package org.gemicle.toysheeyeyraku.parsing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class GetRozklad {
	public static Rozklad get() throws ClassNotFoundException, IOException {
		/*try (Stream<Path> walk = Files.walk(Paths.get(".\\src\\main\\resources\\data.txt"))) {

			List<String> result = walk.filter(Files::isRegularFile)
					.map(x -> x.toString()).collect(Collectors.toList());

			result.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}*/
		FileInputStream file = new FileInputStream(".\\\\src\\\\main\\\\resources\\\\data.txt"); 
		
        ObjectInputStream in = new ObjectInputStream(file); 
          
        
        Rozklad object1 = (Rozklad)in.readObject(); 
          
        in.close(); 
        file.close(); 
        return object1;
	}
}
