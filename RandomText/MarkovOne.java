import java.util.*;

public class MarkovOne {
    private String myText;
	private Random myRandom;
	
	public MarkovOne() {
		myRandom = new Random();
	}
	
	public void setRandom(int seed){
		myRandom = new Random(seed);
	}
	
	public void setTraining(String s){
		myText = s.trim();
	}
	
	public String getRandomText(int numChars){
	    if (myText == null){
				return "";
		}
			StringBuilder sb = new StringBuilder();
			int index = myRandom.nextInt(myText.length()-1);
			String key = myText.substring(index, index+1);
			sb.append(key);
			
	    for(int k=0; k < numChars-1; k++){
				ArrayList<String> follows = getFollows(key);
				String followsRandom = follows.get(myRandom.nextInt(follows.size()));
				sb.append(followsRandom);
				key = followsRandom;
	    }
			
	  return sb.toString();
	   }
	
	public ArrayList<String> getFollows(String key) {
			
			ArrayList<String> follows = new ArrayList<String>();
			
			for (int i = 0; i<myText.length()-1; i++) {
				
				if (key.equals(myText.substring(i, i+1))) 
					follows.add(myText.substring(i+1,i+2)); 
			}
			
			return follows;
			
		}
}
