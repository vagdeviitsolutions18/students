package com.vagdeviitstudents.naveen.collections;

import java.util.Comparator;


public class EmployeDoj implements Comparator<Employedemo> {
    
    @Override
    public int compare(Employedemo e1, Employedemo e2) {
      if(e1.doj.after(e2.doj))
    	  return 1;
      else
    	  return -1;
    	  
 
    }
}