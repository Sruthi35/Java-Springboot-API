package in.learnspringboot.java.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Staterepository extends JpaRepository<States, String>{
	
	

}
