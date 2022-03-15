package it.classesAndObjects2;

public class CompetitionRules {
    private static CompetitionRules competitionRules = new CompetitionRules();

    private String competitionRule1 = " Do not copy and paste from StackOverflow! ";
    private String competitionRule2 = " Learn every day! ";
    private String competitionRule3 = " Be the best team! ";
    public void printRules() {
        System.out.println(competitionRule1 + competitionRule2 + competitionRule3);
    }

    private CompetitionRules(){}

    public static CompetitionRules getInstance(){
        return competitionRules;
    }


}
