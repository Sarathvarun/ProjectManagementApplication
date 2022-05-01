package controller;

import model.Task;

public class TaskController {
    
    /**
     * 
     * @param task
     * @return
     * @throws Exception
     * this method is used to create the task
     */
    public static long createTask(Task task) throws Exception {
        //Implementation
        return task.getId();
    }

    /**
     * 
     * @param task
     * @throws Exception
     * this method is used to update the task
     */
    public static void updateTask(Task task) throws Exception {
        //Implementation
    }

    /**
     * 
     * @param taskId
     * @throws Exception
     * this method is used to delete the task
     */
    public static void deleteTask(long taskId) throws Exception {
        //Implementation
    }

    /**
     * 
     * @return
     * @throws Exception
     * this method is used to get the task
     */
    public static Task getTask() throws Exception {
        //Implementation
        return new Task();
    }

    /**
     * 
     * @param taskId
     * @throws Exception
     * this method is used to get the completion date of the task
     * It will return the completion date based on dependent task's and current task's due dates calculation.
     */
    public static void getCompletionDate(long taskId) throws Exception {
        //Implementation
    }
}
