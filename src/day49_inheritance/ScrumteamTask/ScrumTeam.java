package day49_inheritance.ScrumteamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ArrayList<Tester>testers = new ArrayList<>();
    public ArrayList<Developer>developers= new ArrayList<>();

    public ScrumTeam(Tester[] testers,Developer[]developers){
        addTesters(testers);
        addDevelopers(developers);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addTesters(Tester[]testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void addDevelopers(Developer[]developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeTester(long ID){
        testers.removeIf(p->p.ID==ID);
    }
    public void removeDeveloper(long ID){
        developers.removeIf(p->p.ID==ID);
    }
    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);
        removeDeveloper(developerID);
    }

}
