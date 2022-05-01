package controller;

import model.Role;

public class RoleController {
    
    /**
     * 
     * @param role
     * @exception exception will be thrown based on input validation. InvalidDataException
     * This method is used to create the new role
     * 
     */
    public static long createRole(Role role) throws Exception  {
        //Implementation
        return role.getId();
    }  

    /**
     * 
     * @param role
     * @exception exception will be thrown based on input validation. InvalidDataException
     * This method is used to update the new role
     */
    public static void updateRole(Role role) throws Exception {
        //Implementation
    }  

    /**
     * 
     * @param roleId
     * @exception - exception will be thrown based on validation. NoRoleException
     * This method is used to delete the new role
     */
    public static void deleteRole(long roleId) throws Exception {
        //Implementation        
    }  

    /**
     * 
     * @param roleId
     * @return
     * @throws Exception
     * This method is used to get the new role
     */
    public static Role getRole(long roleId) throws Exception {
        //Implementation
        return new Role();       
    }  

}
