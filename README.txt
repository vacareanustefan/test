README - Java REST Application


1. App Description
Our application is capable of tracking a list of todo(s) with the possibility of reading, adding, modifying or deleting todo tasks. Each todo has a title which specifies the details about it and a completed field that confirms if the todo task is done or not. 
Each todo belongs to a user which is by default added to the application and, at the current level of the application, they cannot be modified. So far, the following users exist in the application: { "id": 1, "username": "andrew” }, { "id": 2, "username": "steve” }. For adding more users to the application, please contact the Technical Team.
When adding or modifying a todo, you have to specify which user it belongs to. More details about these processes are explained in chapter 3. How to use the application.


2. How to run the application
        The app has a Java component which is the core of the application and a Postgres database where the data is securely saved. For running the application, it is mandatory to use a machine having a Unix OS.
        For downloading the Postgres component, please access the link https://www.postgresql.org/download/ and select the file according to your machine’s OS. Install the application wherever you want and:
* set the database name stefanvacareanu
* set the username stefanvacareanu
* the password should be left empty
* Start the server. The mark should indicate “Running”
For downloading the Java component, please run the following command into the terminal: git clone https://github.com/vacareanustefan/test.git  This will create a test folder that contains the application files. Go into the test folder (using the cd test command) and run the following commands in this order:
1. mvn clean install   // for building the project
2. mvn spring-boot:run // start the application
3. You should observe that the last line in the terminal is indicating: Started Application in 12.096 seconds (JVM running for 12.954). This specifies that the application server has started.


        Now the application is running and you can interact with it. The following chapter explains how.
3. How to use the application
        The application offers 5 channels of interactions called endpoints that are used to read, add, modify and delete todos. These endpoints can be accessed using the Terminal interface, through a web browser (Google Chrome, Safari, etc.) or a dedicated application such as Postman. Please find below examples of how-to-use for each endpoint:
1. getAll
        This endpoint returns a list with all todos that are currently in the database. This endpoint in particular can be accessed by typing the URL in the web browser. 
URL: http://localhost:8080/todo/getAll
Request Type: GET
Request Sample: *no request needed*
Terminal command: curl -i -X GET http://localhost:8080/todo/getAll
2. get/{id}
        This endpoint returns the todo that has the {id} specified in the url. This endpoint in particular can be accessed by typing the URL in the web browser. 
URL: http://localhost:8080/todo/get/{id}
Request Type: GET
Request Sample: *no request needed*
Terminal command: curl -i -X GET http://localhost:8080/todo/get/1
3. create
        This endpoint creates a new todo with the information from the request sample and returns the new added todo.
URL: http://localhost:8080/todo/create
Request Type: PUT
Request Sample:
{
       "title": "todo creation test",
       "completed": false,
       "user": {
           "id": 1,
           "username": "andrew"
       }
   }


Terminal command: curl -i -X PUT -H 'Content-Type: application/json' -d '{ "title": "todo creation test", "completed": false, "user": {"id": 1,"username": "andrew"}}' http://localhost:8080/todo/create
4. update
        This endpoint updates the todo specified in the request sample and returns the updated todo. The id of the todo can be extracted from the getAll response.
URL: http://localhost:8080/todo/update
Request Type: PATCH
Request Sample: {
   "id": 7,
   "title": "this is an update",
   "completed": false,
   "user": {
       "id": 1,
       "username": "andrew"
   }
}
Terminal command: curl -i -X PATCH -H 'Content-Type: application/json' -d '{ "id": 7, "title": "this is an update", "completed": false, "user": { "id": 1, "username": "andrew"  }}' http://localhost:8080/todo/update
5. delete/{id}
        This endpoint deletes the todo that has the specified {id} number. The id of the todo can be extracted from the getAll response.
URL: http://localhost:8080/todo/delete/{id}
Request Type: DELETE
Request Sample: *no request needed*
Terminal command: curl -i -X DELETE http://localhost:8080/todo/delete/7