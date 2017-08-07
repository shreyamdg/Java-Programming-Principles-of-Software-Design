
import java.util.*;
public class TitleAndDepthComparator implements Comparator<QuakeEntry>{
    public int compare(QuakeEntry q1, QuakeEntry q2) {
	
		int titleCompare = q1.getInfo().compareTo(q2.getInfo());
		// sort by title
		//then sort by depth
		if (titleCompare==0) 
			return Double.compare(q1.getDepth(), q2.getDepth());
		
		return titleCompare;
	}
}
