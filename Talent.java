package projetJavaC3.gestionDesTalents;

public class Talent {
	
	   private  String  name;
	   private  String  fisrtName;
	   private  int     age;
	   private  String  level;
	   private  String  specializationCourse;
	   
	   /*constructor with 5parameters in the following order
	    * nameTalent, firstNameTalent, ageTalent, levelTalent, specializationCoursetalent
	    * initializes the attributes of the Talent class 
	    */
	   public Talent(String nameTalent, String fisrtNameTalent, int ageTalent, String levelTalent, String specializationCourseTalent) 
	   {   
		   name = nameTalent;
		   fisrtName = fisrtNameTalent;
		   age = ageTalent;
		   level = levelTalent;
		   specializationCourse = specializationCourseTalent;	
		  
	   }


		public String getName() {
			return name;
		  }
		   
	      public String getFisrtName() {
		    return fisrtName;
	      }

	      public int getAge() {
	    	return age;
	      }

	      public String getLevel() {
		    return level;
	      }

	      public String getSpecializationCourse() {
		    return specializationCourse;
	      }
	      
	      //method that display identity of a Talent
	      public String print() {
	    	  return "A talent -> "+name+ "," +fisrtName+ "," +age+ "," +level+ "," +specializationCourse;
	      }
}
