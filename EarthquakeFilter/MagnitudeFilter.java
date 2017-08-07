
/**
 * MagnitudeFilter that implements Filter. 
 * This class includes private instance variables for a minimum and maximum magnitude, 
 * a constructor to initialize those variables, 
 * and a satisfies method that returns true if a QuakeEntry’s magnitude is 
 * between the minimum and maximum magnitudes, 
 * or equal to one of them. Otherwise it should return false.
 * 
 * @author ShreyamDuttagupta 
 * @version 1.0.1
 */
public class MagnitudeFilter implements Filter {
    private double min;
    private double max;
    
    MagnitudeFilter(double min, double max){
        this.min = min;
        this.max = max;
    }
    
    public boolean satisfies(QuakeEntry qe) {
		double mag = qe.getMagnitude();
		return (mag >= min && mag <= max);
	}
	
	public String getName() {
		return "Magnitude";
	}
}
