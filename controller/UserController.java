package controller;

import model.User;

public class UserController {
    /**
     * 
     * @param user
     * @exception exception will be thrown based on input validation. InvalidDataException
     * This method is used to create the new user
     * 
     */
    public static long createUser(User user) throws Exception  {
        //Implementation
        return user.getId();
    }  

    /**
     * 
     * @param user
     * @exception exception will be thrown based on input validation. InvalidDataException
     * This method is used to update the user
     */
    public static void updateUser(User user) throws Exception {
        //Implementation
    }  

    /**
     * 
     * @param userId
     * @exception - exception will be thrown based on validation. NoRoleException
     * This method is used to delete the user
     */
    public static void deleteUser(long userId) throws Exception {
        //Implementation
               
    } 

    /**
     * 
     * @param userId
     * @return
     * @throws Exception
     * This method is used to get the user
     */
    public static User getUser(long userId) throws Exception {
        //Implementation
        return new User();
    } 

    /**
     * 
     * @param userId
     * @param roleId
     * @exception - exception will be thrown based on validation.
     * This method is used to update the role to the user
     */
    public static void updateRole(long userId, long roleId) throws Exception  {
        //Implementation
    }
    
}
