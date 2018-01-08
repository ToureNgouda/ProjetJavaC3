package projetJavaC3.gestionDesTalents;

import java.util.ArrayList;

public class School {
 
	private ArrayList <Talent> talents = new ArrayList<Talent>();
	private static int numberTalent = 0;
	private Talent talent;
	private String name;
	
	
	
	public School(ArrayList<Talent> talent ) {
		talents = talent;
	}
	
	
	public School(Talent talentSchool) {
		talent = talentSchool;
	}
	
	
	
	public School(String nameSchool) {
		name = nameSchool;
	}
	

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
	
	public void printTalent() {
		
		//affichage de tous les talents 
		System.out.println("====================Affichage de tous les Talents dans "+name+ 
				"============"); 
		System.out.println();
		
		 for(Talent tal : talents) {
			 System.out.println(tal.print());
		 }
		 System.out.println("le nombre de talent dans " +name+ " est : " +numberTalent);
		 System.out.println();
		 
		//affichage polymorphique  des talents
		ArrayList <Talent> talent = new ArrayList<Talent>();
		ArrayList <Talent> talentEtranger = new ArrayList<Talent>();
		for(Object o: talents) {
           if (o instanceof TalentForeign) {
        	   
        	   talentEtranger.add((Talent)o);         
           }else {
        	   talent.add((Talent)o);
           }
           }
		System.out.println("========Affichage des talents nationales dans "+name+"=================");
		for(Talent t : talent) {
	        System.out.println(t.print());  
	           }
		System.out.println("le nombre de talent national est :" +talent.size());
		
		System.out.println();
		
		System.out.println("=============Affichage des talents etrangers dans "+name+"==================");
		for(Talent t : talentEtranger) {
        System.out.println(t.print());    
		}
		System.out.println("le nombre de talent etranger est :" +talentEtranger.size()); 
	   }
	
	
	      public static void main(String[] args) {
	    	  
		 
		 Talent t1 = new Talent("Toure "," Ngouda", 24," Master1 "," conduite de projet");
		 Talent t2 = new Talent("Mboup"," Mor ", 24," Master2 "," Reseau des entreprises"); 
		 TalentForeign t3 = new TalentForeign("diallo "," abdoulaye ", 24," Master1 "," conduite de projet "," guinee");
		 TalentForeign t4 = new TalentForeign("diedhiou"," youssou ", 24 ," Master1 "," conduite de projet "," benin");
		 Talent t5  = new TalentForeign("kouame"," krouma ", 25 , " Mater2 "," securite reseau "," cote d'divoire ");
		 
		 System.out.println("======================Affichage de tous les talents ===========================");
		 System.out.println(t1.print());
		 System.out.println(t2.print());
		 System.out.println(t3.print());
		 System.out.println(t4.print());
		 System.out.println(t5.print());
		 
		 //create a school
		 School school = new School("UASZ");
		 school.addTalent(t1);
		 school.addTalent(t2);
		 school.addTalent(t3);
		 school.addTalent(t4);
		 school.addTalent(t5);
		 System.out.println();
	     
		 school.printTalent();
	     System.out.println();
	     System.out.println("=================================================================================");
	
	}
	  
	
}
