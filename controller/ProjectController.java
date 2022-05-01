package controller;

import java.util.List;

import model.Project;

public class ProjectController {
    
    /**
     * 
     * @param project
     * @return
     * @throws Exception
     * This method is used to create the project
     */
    public static long createProject(Project project) throws Exception {
        //Implementation
        return project.getId();
    }

    /**
     * 
     * @param project
     * @throws Exception
     * This method is used to update the project
     */
    public static void updateProject(Project project) throws Exception {
        //Implementation
    
    }

    /**
     * 
     * @param projectId
     * @throws Exception
     * This method is used to delete the project
     */
    public static void deleteProject(long projectId) throws Exception {
        //Implementation
        
    }

    /**
     * 
     * @param projectId
     * @return
     * @throws Exception
     * This method is used to get the project
     */
    public static Project getProject(long projectId) throws Exception {
        return new Project();
    }

    /**
     * 
     * @param projectId
     * @throws Exception
     */
    public static void getCompletionDate(long projectId) throws Exception {
        //Implementation
       
    }

    /**
     * 
     * @param projectId
     * @param taskIdsList
     * @throws Exception
     * This method is used to associate the tasks to project
     */
    public static void associateTask(long projectId, List<Long> taskIdsList) throws Exception {
        //Implementation
       
    }

    /**
     * 
     * @param projectId
     * @param taskIdsList
     * @throws Exception
     * This method is used to disassociate the tasks to project
     */
    public static void disAssociateTask(long projectId, List<Long> taskIdsList) throws Exception {
        //Implementation
       
    }
}
