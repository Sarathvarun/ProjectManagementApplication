# ProjectManagementApplication

Implementation details:

i) This object model for a project management application has been creaed using Java. 

ii) This object model has been arirved in the basis of MVC Pattern. 

Requirements:

i) A project will have multiple tasks that can be performed by Users.

ii) A Task will have deadline and dependency taks. 

iii) This application might have multiple projects. 

iv) A Task may require a user of some specific type like developer, tester

v) A project and tasks both have scheduled time and deadline. 


UML Class Diagram:

![UML Class Diagram](https://github.com/Sarathvarun/ProjectManagementApplication/blob/main/ClassDiagram.jpeg)


Models / Entities:

    i) These models are the object with the attributes of correspiondant model. 
    ii) These Models need to be passed to create/update the project.
    iii) The attributes of each model has been provided below. 

1. Project.java

    Attributes : id, name, startDate, dueDate, owner, associatedUsers, status, tasks

2 . Task.java

    Attributes : id, name, startDate, dueDate, owner, role, dependendTasks, status

3 . User.java

    Attributes : id, name, email, role;

4 . Role.java

    Attributes : id, name, description;

5 . Status.java (Enum)

    Values: PIPELINE, INPROGRESS, ONHOLD, COMPLETED


Controllers:

    i) The utilities of each model has been provided in below controllers.
    ii) Each model has each controller. 
    iii) The method of each controllers has been provided below. 

1. ProjectController.java

    methos: createProject(), updateProject(), deleteProject(), getProject(), getCompletionDate(), associateTask(), disAssociateTask()

2 . TaskController.java

    methods: createTask(), updateTask(), deleteTask(), getTask(), getCompletionDate()

3 . UserController.java

    methods: createUser()), updateUser(), deleteUser(), getUser(), updateRole()

4 . RoleController.java

    methods: createRole()), updateRole(), deleteRole(), getRole()
