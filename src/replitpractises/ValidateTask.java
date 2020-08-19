package replitpractises;

public class ValidateTask {
    public boolean validateTask(boolean notEmpty,int taskId,int currentId){
        return notEmpty&&taskId == currentId+1;
    }
}
