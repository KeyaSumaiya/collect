package com.naztech.collect;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HumanTest1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	 private List<Human> unsortedList() {
	       
	       List<Human> list=new ArrayList<Human>();
	       
	      
	       list.add(new Human("muna",21,2030.4,LocalDate.of(1997, Month.SEPTEMBER, 20)));
	       list.add(new Human("keya",22,2000.4,LocalDate.of(1996, Month.SEPTEMBER, 10)));
	       list.add(new Human("sumaiya",24,5000.4,LocalDate.of(1994, Month.DECEMBER, 28)));
	       list.add(new Human("tasniah",26,22000.4,LocalDate.of(1994, Month.AUGUST, 22)));
	       
	       return (List<Human>)list;
	   }
	    
	    
	    private List<Human> ageSortList() {
	        
	        List<Human> list2=new ArrayList<Human>();

	        list2.add(new Human("muna",21,2030.4,LocalDate.of(1997, Month.SEPTEMBER, 20)));
	        list2.add(new Human("keya",22,2000.4,LocalDate.of(1996, Month.SEPTEMBER, 10)));
	        list2.add(new Human("sumaiya",24,5000.4,LocalDate.of(1994, Month.DECEMBER, 28)));
	        list2.add(new Human("tasniah",26,22000.4,LocalDate.of(1994, Month.AUGUST, 22)));
	     return (List<Human>)list2;
	    }
	    
	   
	   
	   
	   private List<Human> IncomeSortList() {
	       
	       List<Human> list2=new ArrayList<Human>();
	       
	       list2.add(new Human("keya",22, 2000.4, LocalDate.of(1996, Month.SEPTEMBER, 10)));
	       list2.add(new Human("muna",21, 2030.4, LocalDate.of(1997, Month.SEPTEMBER, 20)));
	       list2.add(new Human("sumaiya",24,5000.4,LocalDate.of(1994, Month.DECEMBER, 28)));
	       list2.add(new Human("tasniah",26,22000.4,LocalDate.of(1994, Month.AUGUST, 22)));
	       
	      
	       
	       return (List<Human>)list2;
	   }
	   
	   
	private List<Human> NameSortList() {
	       
	       List<Human> list2=new ArrayList<Human>();
	       
	       
	       list2.add(new Human("keya",22,2000.4,LocalDate.of(1996, Month.SEPTEMBER, 10)));
	       list2.add(new Human("muna",21,2030.4,LocalDate.of(1997, Month.SEPTEMBER, 20)));
	       list2.add(new Human("sumaiya",24,5000.4,LocalDate.of(1994, Month.DECEMBER, 28)));
	       list2.add(new Human("tasniah",26,22000.4,LocalDate.of(1994, Month.AUGUST, 22)));
	       
	      
	       return (List<Human>)list2;
	   }
	   
	  
	 
	   /**
	    * Test of compareTo method, of class Employee.
	    */
	   @Test
	   public void incomeListTest() {
	 
		   

	                
		   Collections.sort(unsortedList(), new Comparator<Human>(){
		          
			   public int compare(Human o1, Human o2) {
					// TODO Auto-generated method stub
					if (o1.getIncome() < o2.getIncome())
						return -1; 
				    if (o1.getIncome() > o2.getIncome()) 
				    	return 1; 
				    else 
				    	return 0;
				}
	    	
	           
	           
	           
	       });
	       
	       assertEquals(IncomeSortList(), unsortedList());
	      //assertNotSame(IncomeSortList(), unsortedList());
	       
	   }
	   
	   @Test
	   public void ageListTest() {
	 
		  Collections.sort(unsortedList(), new Comparator<Human>(){
		          
			   public int compare(Human o1, Human o2) {
				   return o1.age - o2.age; 
				}
	    	
	           
	           
	           
	       });
	       
		   System.out.println(ageSortList());
	       assertEquals(ageSortList(), unsortedList());
	       
	   }
	   
	   
	  
	   @Test
	   public void nameListTest() {
	 
		   
		   Collections.sort(unsortedList(), new Comparator<Human>(){
		          
	    	   public int compare(Human o1, Human o2) {
	    		   
	    		   String o1Name = o1.getName().toUpperCase();
	    		      String o2Name = o2.getName().toUpperCase();
	    			return o1Name.compareTo(o2Name);
	               
	              
	           }
	    	
	           
	           
	           
	       });
		   
		   assertEquals(NameSortList(), unsortedList());
		   //assertNotSame(NameSortList(), unsortedList());
	       
	         
	       
	   }

}
