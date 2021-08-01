package BDDAutomationAPI2;

import java.util.HashMap;
import java.util.Map;

public class CreatePOSTOptions {
	
	
	public void createUser () {
	
	Map<String, Object> map = new HashMap<> ();
		
		map.put("name", "Leet stroy");
		map.put("Job", "Accounttant");
		
		System.out.println(map);
		
		
	}

}
