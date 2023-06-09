package org.example;


public class TaskManager {
    private ApplicationConsole applicationConsole;

    TaskListe taskList = new TaskListe();

    public TaskManager(ApplicationConsole applicationConsole) {
        this.applicationConsole = applicationConsole;
    }

    public void menu() {
        while (true) {

            applicationConsole.message("add, list, delete, update, exit");
            String command = applicationConsole.readLine();

            if (command.equals("add")) {
                applicationConsole.message("id");
                String identification = applicationConsole.readLine();
                applicationConsole.message("description");
                String description = applicationConsole.readLine();
                taskList.add(Integer.parseInt(identification), description, false);
            }

            if (command.equals("list")) {

                for (Task task : taskList.getTaskList()) {
                    applicationConsole.message(task.toString());
                }
            }

            if (command.equals("delete")) {
                Task taskToRemove = null;
                for (Task task : taskList.getTaskList()) {
                    taskToRemove = task;
                    applicationConsole.message(task.toString());
                }

                if (taskToRemove != null){
                    applicationConsole.message("id");
                    String identification = applicationConsole.readLine();
                    taskList.delete(Integer.parseInt(identification));
                }else{
                    applicationConsole.message("pas de tasks !");
                }

            }

            if (command.equals("update")){
                for (Task task : taskList.getTaskList()) {
                    applicationConsole.message(task.toString());
                }
                applicationConsole.message("id");
                String identification = applicationConsole.readLine();
                taskList.update(Integer.parseInt(identification));
            }

            if (command.equals("exit")) {
                return;
            }
        }
    }


}
