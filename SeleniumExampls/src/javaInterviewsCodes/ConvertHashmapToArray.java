package javaInterviewsCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertHashmapToArray {

	public static void main(String[] args) {

		HashMap<String, Integer> namesAndIDs = new HashMap<String, Integer> ();
		
		namesAndIDs.put("elmar", 13);
		namesAndIDs.put("Sahib", 17);
	    namesAndIDs.put("Adel", 53);
	    namesAndIDs.put("fasmankes", 1);
	   
	    System.out.println("==> Size of namesAndIDs Map.  " + namesAndIDs.size());
	    


	    Object [] objectsArray = namesAndIDs.entrySet().toArray();
	    System.out.println(Arrays.toString(objectsArray));
	
	/*    Iterator it = namesAndIDs.entrySet().iterator();
	    while (it.hasNext()) {
		
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " +pairs.getValue());
		} */

	}

}
