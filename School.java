package projetJavaC3.gestionDesTalents;

import java.util.ArrayList;

public class School {
 
	private ArrayList <Talent> talents = new ArrayList<Talent>();
	private static int numberTalent = 0;
	private Talent talent;
	private String name;      //adding the name attribute to give a name to a School
	
	
	//a constructor with array of talents as an arguments
	public School(ArrayList<Talent> talent ) {
		talents = talent;
	}
	
	//constructor with a parameter talentSchool
	//initialize a talent
	public School(Talent talentSchool) {
		talent = talentSchool;
	}
	
	
	//constructor with a parameter nameSchool
	//initialize a name of a school
	public School(String nameSchool) {
		name = nameSchool;
	}
	
    //adding a talent in a school
	public void addTalent(Talent talent) {
		School school = new School(talent);
		talents.add(talent);
		++numberTalent;
	}
	
	public String getName() {
	  return name;
	}
	public static int getNumberTalent() {
		return numberTalent;
	}
	
	//method for displaying talents in a school
	public void printTalent() {
		
		ArrayList <Talent> talent = new ArrayList<Talent>();
		ArrayList <Talent> talentEtranger = new ArrayList<Talent>();
		
		//display of all talents in a school 
		System.out.println("====================Display of all talents in "+name+ "================");		 
		System.out.println();
		for(Talent tal : talents) {
			 System.out.println(tal.print());
		 }
		 System.out.println("The total number of talent in " +name+ " est : " +numberTalent);
		 System.out.println();
		 
		//display of talents according of their type
		for(Object o: talents) {
           if (o instanceof TalentForeign) {
        	   
        	   talentEtranger.add((Talent)o);         
           }else {
        	   talent.add((Talent)o);
           }
           }
		System.out.println("========Display of National Talents in "+name+"=========================");
		for(Talent t : talent) {
	        System.out.println(t.print());  
	           }
		System.out.println("The number of national talent: " +talent.size());
		
		System.out.println();
		
		System.out.println("=============Display of foreign talents in  "+name+"==================");
		for(Talent t : talentEtranger) {
        System.out.println(t.print());    
		}
		System.out.println("the number of foreign tatent: " +talentEtranger.size()); 
	   }
	
	
	      public static void main(String[] args) {
	    	  
		 //creation of talents 
		 Talent t1 = new Talent("Ndiaye "," Serigne", 24," Master1 "," java");
		 Talent t2 = new Talent("Mboup"," Mor ", 24," Master2 "," Reseau des entreprises"); 
		 TalentForeign t3 = new TalentForeign("diallo "," abdoulaye ", 24," Master1 "," conduite de projet "," guinee");
		 TalentForeign t4 = new TalentForeign("diedhiou"," youssou ", 22 ," Master1 "," conduite de projet "," benin");
		 Talent t5  = new TalentForeign("kouame"," krouma ", 25 , " Mater2 "," securite reseau "," cote d'divoire ");
		 
		 System.out.println("========================Display of all talents ===============================");
		 System.out.println(t1.print());
		 System.out.println(t2.print());
		 System.out.println(t3.print());
		 System.out.println(t4.print());
		 System.out.println(t5.print());
		 
		 //creating an instance of the school
		 School school = new School("UASZ");
		 
		 //adding the talents to a school
		 school.addTalent(t1);
		 school.addTalent(t2);
		 school.addTalent(t3);
		 school.addTalent(t4);
		 school.addTalent(t5);
		 System.out.println();
		 
	     //call the method printTalent to display the talents to a school
		 school.printTalent();
		 
	     System.out.println();
	     System.out.println("=================================================================================");
	
	}
	  
	
}
