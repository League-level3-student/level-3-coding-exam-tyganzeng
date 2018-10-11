import java.util.HashMap;

public class HashMapCalculator {
	
	
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int sum = 0;
		
		
		for(String s : hashmap1.keySet()) {
			for(String b : hashmap2.keySet()) {
				if(s.equals(b) && hashmap1.get(s).equals(hashmap2.get(b))) {
					sum++;
				}
			}
		}
		
		return sum;
		
		
	}
}
