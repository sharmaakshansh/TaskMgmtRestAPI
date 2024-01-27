# TaskMgmtRestAPI

Vedio demenstration links 



A. Postman demenstration-  https://drive.google.com/file/d/1A6adk_ZL3rOZQmu2M5t42nWijOf9Xq-J/view?usp=drive_link


B. Code Explanation-   https://drive.google.com/file/d/1aNexPZR2lk2_ZtUh7qJ2P-RjxI0Ry3TK/view?usp=drive_link



ScreenShot link--  https://drive.google.com/drive/folders/1IEspdDxez6rsXJHLaClPKDaQ8lrBbUV3?usp=sharing

# POSTMAN commands

AUTHORIZATION Type - Basic Auth
username- user
password- akshansh

1.) Example to post data in database 
      
         POST || http://localhost:8081/task
         Body
                  {
                     "taskName": "make  api 1",
                     "taskDetail": "create apis for assighnment no. 1",
                     "taskstatus": "Pending",
                     "dueDate":"2024-01-31"
  
                   }
2.) Example to get all data from database
       
       GET  || http://localhost:8081/task


3.) Example to get a particular data from database

       GET ||  http://localhost:8081/task/{taskId}

       GET ||   http://localhost:8081/task/5

4.) Example to Update a given Data from database 

       PUT || http://localhost:8081/task/{taskId}
        
       PUT || http://localhost:8081/task/5

5.) Example to delete a given data from the data base

      DELETE || http://localhost:8081/task/{taskId}
        
      DELETE || http://localhost:8081/task/5
       
