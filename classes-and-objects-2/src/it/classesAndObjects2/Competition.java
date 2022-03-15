package it.classesAndObjects2;

public class Competition {
    public static void main(String args[]){

    CompetitionRules competitionRules = CompetitionRules.getInstance();
    competitionRules.printRules();

    Team teamA = new Team();
    Team teamB = new Team();

    teamA.teamName = "Team A";
    teamB.teamName = "Team B";

    teamA.p1.name = "Danilo";
    teamA.p1.yearsOfExperience = 1;
    teamA.p1.programmingLanguage = "Java";
    teamA.p2.name = "Cristiano";
    teamA.p2.yearsOfExperience = 8;
    teamA.p2.programmingLanguage = "C++";

    teamB.p1.name = "Giorgio";
    teamB.p1.yearsOfExperience = 0;
    teamB.p1.programmingLanguage = "Nessuno";
    teamB.p2.name = "Alessio";
    teamB.p2.yearsOfExperience = 50;
    teamB.p2.programmingLanguage = "Python";

    teamA.p1.printProgrammerDetails();
    teamA.p2.printProgrammerDetails();
    teamB.p1.printProgrammerDetails();
    teamB.p2.printProgrammerDetails();

    }
}
