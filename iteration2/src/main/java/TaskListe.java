import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class TaskListe {

    private List<Task> taskList;

    public List<Task> getTaskList() {
        return taskList;
    }

    public TaskListe() {
        taskList = new ArrayList<>();
    }

   public void add(int identifiant, String description, boolean state) {
       Task task = new Task(identifiant, description, state);
        taskList.add(task);
   }


}
