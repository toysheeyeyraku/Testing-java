package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="pk")
public class TransportBlock {
	 @Id
	public String id;
	public String type ;
	public List<Transport> transports=new ArrayList<Transport>();
}
