package org.example;

import org.example.Task;

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

   public void delete(int identifiant){

        Task taskToRemove = null;
        for (Task task : taskList){
            if (task.getIdentifiant() == identifiant){
                taskToRemove = task;
            }
        }

        if (taskToRemove != null){
            taskList.remove(taskToRemove);
        }

   }

   public void update(int identifiant){
        Task taskToUpdate = null;
        for (Task task : taskList){
            if (task.getIdentifiant() == identifiant){
                taskToUpdate = task;
            }
        }

        if (taskToUpdate != null){
            taskToUpdate.setState(!taskToUpdate.isState());
        }
   }

}
