package in.learnspringboot.java.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class States {
    
	
	private int id;
	@Id
	private String Name;
	private String Capital;
	
	public Integer getId(){
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getCapital(){
		return Capital;
		
	}
	public void setCapital(String Capital){
		this.Capital=Capital;
	}

}
