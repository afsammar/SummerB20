package day42_Static;

public class BOA {
    public static void main(String[] args) {

        Tester [] testers = {new Tester(),new Tester(),new Tester(),};
        testers[0].setInfo("Ali",'M',15111L,"Lead Tester",150000);
        testers[1].setInfo("Veli",'M',151011L,"QA Tester",150000);
        testers[2].setInfo("Zeynep",'F',15133L," Tester",150000);

        Developer [] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer(),};
        developers[0].setInfo("Ali",'M',151121L,"Lead Tester",150000);
        developers[1].setInfo("Veli",'M',151113L,"QA Tester",150000);
        developers[2].setInfo("waqar",'F',15133L," Tester",150000);
        developers[3].setInfo("roza",'F',151303L," Tester",150000);
        developers[4].setInfo("burak",'M',151353L," Tester",150000);

        ScrumTeams team1 = new ScrumTeams();
        team1.setInfo("Ahmet Afsin","Lale Sopur","Erkam Afsin");
        team1.addTesters(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);

        System.out.println("========================");
        for(Tester each : team1.testers) {
            System.out.println(each.name);
        }
            System.out.println("========================");

            for (Developer each:team1.developers){
                System.out.println(each.name+" : $"+each.salary);

        }
        System.out.println("========================");
        team1.removeTester(15111);
        team1.removeDevelopers(151121);
        System.out.println(team1);


        System.out.println("========================");



        }

    }
