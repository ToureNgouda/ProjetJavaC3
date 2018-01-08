package projetJavaC3.gestionDesTalents;

public class TalentForeign extends Talent{
	
   private String  countryOrigin;
	
   public TalentForeign(String nameTalent, String fisrtNameTalent, int ageTalent, String levelTalent,
			String specializationCourseTalent, String countryOriginTalent) {
		super(nameTalent, fisrtNameTalent, ageTalent, levelTalent, specializationCourseTalent);
		countryOrigin =  countryOriginTalent;
	}


    public String print() {
    	return super.print()+ "," +countryOrigin;
    }

}
