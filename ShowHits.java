package Labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ShowHits implements Comparable<ShowHits>{
	private static Map<String, String> numofHitsIntoaMap = new HashMap<>();
	private static Map<String, String> hitsperIP = new HashMap<>();
	
	
	public static void main(String[] args) {
	//	public Map<String Integer> loadRequestCountsfromaFileName("access_log") {
		numofHitsIntoaMap = new HashMap<>();
		hitsperIP = new HashMap<>();
		int lineCounter = 0;
		 BufferedReader bufIn = null;
	        try {
	            bufIn = new BufferedReader(new FileReader("access_log"));

	            String line;
	            while ((line = bufIn.readLine()) != null) {
	            	lineCounter++;
	            	//inputted line to split output
//	            	String[] fields = line.split(" - - ");  
//	                System.out.println(fields[0] + " - " + fields[1]);
//	                //here I printed out a lineCounter to display number of lines
//	                System.out.println(lineCounter);
//	               numofHitsIntoaMap.put(fields[0], fields[1]);
	               String [] fields2 = line.split(Insertregex);
	               System.out.println(fields2[0] + " - " + fields2[1]);
	               hitsperIP.put(fields2[0], fields2[1]);
	               
	            }
	        }
	        catch (IOException e) {
	            System.err.println(e);
	           

	}
	        
	}



	@Override
	public int compareTo(ShowHits o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

//Then display the unique visitors along with the corresponding
//number of total hits. (Hint: Use String's split() method to get 
//the first field of each line, which represents the hostname of the visitor.)
//4: (Optional) Modify your ShowHits program to sort the displayed records according to the total number of hits.


//    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, 
//JACK, QUEEN, KING, ACE
