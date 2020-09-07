package day49_inheritance.ScrumteamTask;

import day42_Static.ScrumTeams;

public class Applinc {
    public static void main(String[] args) {


        Tester tester1 = new Tester("Ahmed", 30, 'M', 125000, 1123456, "SDET");
        Tester tester2 = new Tester("Mehmed", 33, 'M', 125000, 2243456, "SDET");
        Tester tester3 = new Tester("Selman", 30, 'M', 100000, 1653456, "SDET");

        Tester[] testers = {tester1, tester2, tester3};

        Developer developer = new Developer("Kamil", 30, 'M', 125000, 8123456, "SDET");
        Developer developer2 = new Developer("Mehmed", 33, 'M', 125000, 9243456, "SDET");
        Developer developer3 = new Developer("Selman", 30, 'M', 110000, 2653456, "SDET");

        Developer[] developers = {developer, developer2, developer3};
        ScrumTeam scrum1 = new ScrumTeam(testers, developers);
        System.out.println(scrum1);

        Tester[]testers2={
                new Tester("Salim", 30, 'M', 150000, 9123456, "SDET"),
                new Tester("Kerem", 30, 'M', 125000, 6123456, "SDET")
        };
        Developer[]developers2={
                new Developer("Salih", 30, 'M', 125000, 4123456, "SDET"),
                new Developer("Mert", 30, 'M', 155000, 3123456, "SDET"),
                new Developer("Kadir", 30, 'M', 175000, 5123456, "SDET")

        };
        ScrumTeam scrum2 = new ScrumTeam(testers2,developers2);
        System.out.println(scrum2);

        ScrumTeam[] allScrumTeam = {scrum1,scrum2};
        for(ScrumTeam eachScrum : allScrumTeam){
            for (Tester eachTester:eachScrum.testers) {
                System.out.println(eachTester.name+""+eachTester.salary);

            }
        }
        System.out.println("======================================================");
        for (ScrumTeam eachScrum:allScrumTeam) {
            for (Developer eachDeveloper:eachScrum.developers) {
                System.out.println(eachDeveloper.name+" "+eachDeveloper.salary);

            }

        }
    }
}
