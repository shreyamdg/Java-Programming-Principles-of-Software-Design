
/**
 * MatchAllFilter that implements Filter. 
 * This class has a private ArrayList of Filters that is created in the constructor that has no parameters. 
 * This class has two methods, 1) a void method named addFilter with one Filter parameter that adds the Filter to its private ArrayList, 
 * and 2) a method named satisfies that has one QuakeEntry parameter and returns true if the QuakeEntry satisfies all the filter conditions, otherwise it returns false.
 * 
 * @author ShreyamDuttaGupta 
 * @version 1.0.1
 */

import java.util.ArrayList;

public class MatchAllFilter implements Filter {
    private ArrayList<Filter> filters;
	
	public MatchAllFilter() {
		filters = new ArrayList<Filter>();
	}
	
	public void addFilter(Filter f) {
		filters.add(f);
	}
	
	public boolean satisfies(QuakeEntry qe) {
		
		for (Filter f : filters) {
			if (!f.satisfies(qe)) return false;
		}
		return true;
	}
	
	public String getName() {
		StringBuilder sb = new StringBuilder("Filters used: ");
		
		for (Filter f : filters) {
			sb.append(f.getName()+ " ");
		}
		
		return sb.toString();
	}
}
