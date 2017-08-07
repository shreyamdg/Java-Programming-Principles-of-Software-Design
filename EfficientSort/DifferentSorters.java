

import java.util.*;

public class DifferentSorters {
    public void sortWithCompareTo() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/earthQuakeDataWeekDec6sample1.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list);
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
        int quakeNumber = 600;
        System.out.println("Print quake entry in position " + quakeNumber);
        System.out.println(list.get(quakeNumber));
    }    

    public void sortByMagnitude() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list, new MagnitudeComparator());
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }

    }

    public void sortByDistance() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        // Location is Durham, NC
        Location where = new Location(35.9886, -78.9072);
        Collections.sort(list, new DistanceComparator(where));
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }

    }
    
     public  ArrayList<QuakeEntry> getQuakeData() {
        EarthQuakeParser parser = new EarthQuakeParser(); 
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        String source = "data/quakedata/nov20quakedata.atom";
        //String source = "data/nov20quakedata.atom";
        return parser.read(source); 
    }
    
    public  ArrayList<QuakeEntry> getQuakeData(String fname) {
        EarthQuakeParser parser = new EarthQuakeParser(); 
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        String source = "data/"+fname;
        return parser.read(source); 
    }
    
    public void sortByTitleAndDepth() {
    	
    	  ArrayList<QuakeEntry> list = getQuakeData("earthQuakeDataWeekDec6sample1.atom");
    	  Collections.sort(list, new TitleAndDepthComparator());
          for(QuakeEntry qe: list) {
              System.out.println(qe);
          }
          
          int pos = 500;
          
          System.out.println("Value on position: " + pos);
          System.out.println(list.get(pos));
    	  
    	
    }
    
     public void sortByLastWordInTitleThenByMagnitude() {
    	
  	  ArrayList<QuakeEntry> list = getQuakeData("earthQuakeDataWeekDec6sample2.atom");
  	  Collections.sort(list, new TitleLastAndMagnitudeComparator());
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
        
        int pos = 500;
        
        System.out.println("Value on position: " + pos);
        System.out.println(list.get(pos));
    	
    }
}








