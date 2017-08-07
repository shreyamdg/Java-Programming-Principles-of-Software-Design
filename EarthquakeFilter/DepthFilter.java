
/**
 * DepthFilter that implements Filter. 
 * This class includes private instance variables for a minimum and maximum depth, 
 * a constructor to initialize those variables, 
 * and a satisfies method that returns true if a QuakeEntry’s depth is between the minimum and maximum depths, 
 * or equal to one of them. Otherwise it should return false.
 * 
 * @author ShreyamDuttaGupta
 * @version 1.0.1
 */
public class DepthFilter implements Filter {
    private double min;
    private double max;
    
    public DepthFilter(double min, double max) {
        this.min = min;
        this.max = max;
    }
    
    
    public boolean satisfies(QuakeEntry qe) {
        double depth = qe.getDepth();
        return (depth >= min && depth <= max);
    }
    
    public String getName() {
		return "Depth";
	}

}
