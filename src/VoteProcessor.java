import java.util.ArrayList;

public class VoteProcessor {

	
	
	public String calculateElectionWinner(ArrayList<String> votes) {
		int popeScore = 0;
		int edScore = 0;
		for(String s : votes) {
			if(s.toLowerCase().equals("edward snowden")) {
				System.out.println(s.toLowerCase());
				edScore++;
			} else if (s.toLowerCase().equals("pope francis")){
				popeScore++;
			}
			
		}
		
		if(edScore > popeScore) {
			return "edward snowden";
		} else if (edScore < popeScore) {
			return "pope francis";
		} 
		
		return "TIE";
	}
}
