
/**
 * DistanceFilter that implements Filter. 
 * This class should include private instance variables for a location and a maximum distance, 
 * a constructor to initialize those variables, 
 * and a satisfies method that returns true if a QuakeEntry’s distance from the given location is less than the specified maximum distance. 
 * Otherwise it should return false.
 * 
 * @author ShreyamDuttagupta     
 * @version 1.0.1
 */
public class DistanceFilter implements Filter {
    Location loc;
    double maxDist;
    
    public DistanceFilter(Location loc, double maxDist) {
        this.loc = loc;
        this.maxDist = maxDist;
        
    }
    
    
    public boolean satisfies(QuakeEntry qe) {
        double dist = loc.distanceTo(qe.getLocation());
        return (dist<maxDist);
    }
    
    public String getName() {
		return "Distance";
	}
}
