package projetJavaC3.gestionDesTalents;

public class TalentForeign extends Talent{
	
   private String  countryOrigin;
	
   
   /*constructor with 6parameters in the following order
	* nameTalent, firstNameTalent, ageTalent, levelTalent, specializationCoursetalent, countryOriginTalent
	* call the constructor of the Talent class
     * initializes the attributes of the TalentForeign class 
    */
   public TalentForeign(String nameTalent, String fisrtNameTalent, int ageTalent, String levelTalent,
			String specializationCourseTalent, String countryOriginTalent) {
		super(nameTalent, fisrtNameTalent, ageTalent, levelTalent, specializationCourseTalent);
		countryOrigin =  countryOriginTalent;
	}

    //method that display identity of a TalentForeign
   //call the method print() of the Talent class
    public String print() {
    	return super.print()+ "," +countryOrigin;
    }

}
