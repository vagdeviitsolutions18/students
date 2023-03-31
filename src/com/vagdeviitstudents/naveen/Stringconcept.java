package com.vagdeviitstudents.naveen;

public class Stringconcept 
{
    
    	private int id;
    	private	String name;
    	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
public Stringconcept(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
       public String toString() {
		return  "Stringconcept id:" + id + " name:" + name  ;
	
       }		
//       @Override
//    public int hashCode() {
//    
//    return id;
//    }
		public static void main(String[] args) {
			Stringconcept emp1= new Stringconcept (5,"Naveen");
			Stringconcept emp2= new Stringconcept (3,"Ravi");
			Stringconcept emp3= new Stringconcept (5,"Naveen");
			Stringconcept emp4= emp1;
			emp1=null;
			System.out.println(emp1.equals(emp2));
			System.out.println(emp1.equals(emp3));
			System.out.println(emp1.equals(emp4));
			
							System.out.println(emp1);
							System.out.println(emp1.hashCode());
				
			
		}
		@Override
		public boolean equals(Object obj) {
			try {
			Stringconcept emp= (Stringconcept)obj;
			if(name.equals(emp.getName()) && id==emp.getId())
		return true;
			else
				return false;
			}catch(Exception ex) {
				return false;
			}
			}
			
		}

    	
    	
                