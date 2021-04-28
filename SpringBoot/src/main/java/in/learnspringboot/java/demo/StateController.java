package in.learnspringboot.java.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/")
//mapping a given request
//creating end point
public class StateController {
	
	//autowire is for creating instant(object) to call a method
	@Autowired
	//calling repository
	private Staterepository staterepository;
	
	@GetMapping("/states")
	//get call will happen to retrieve data
	public List<States> getStates(){
		return staterepository.findAll();
		
	}
   @PostMapping("/states")
	   public void addState(@RequestBody States state) {
	   staterepository.save(state);
		   
	   }
   
}
