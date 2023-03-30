package com.vagdeviitstudents.naveen.collections;

import java.util.HashMap;
import java.util.Map;

public class CommenMap {
	
	

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hero",new Integer(210));
		map.put("honda",new Integer(600));
		
		 System.out.println("Map1 = "+map);
		HashMap map2 = new HashMap();
		map2.put("tata",new Integer(320));
		map2.put("mahi",new Integer(450));
		map2.put("maruti",new Integer(180));
		 System.out.println("Map2 = "+map2);
		 
		map.putAll(map2);
		 System.out.println("copayelements = "+map);
		
		
	}


}
