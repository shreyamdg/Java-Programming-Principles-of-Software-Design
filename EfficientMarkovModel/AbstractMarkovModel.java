

import java.util.*;

public abstract class AbstractMarkovModel implements IMarkovModel {
    protected String myText;
    protected Random myRandom;
     protected int order;
    
    public AbstractMarkovModel(int order) {
        myRandom = new Random();
        this.order = order;
    }
    
    public void setTraining(String s) {
        myText = s.trim();
    }
    
     public void setRandom(int seed) {
    	myRandom.setSeed(seed);
    }
    
    abstract public String getRandomText(int numChars);
    
	protected ArrayList<String> getFollows(String key) {
		int len = key.length();
		ArrayList<String> result = new ArrayList<String>();
		for(int i=0;i<myText.length()-len;i++) {
			if (key.equals(myText.substring(i, i+len))){
				result.add(myText.substring(i+len, i+len+1));
			}
		}
		return result;
	}
	public String toString() {
    	return "Markov Model order " + order;
    }
}
