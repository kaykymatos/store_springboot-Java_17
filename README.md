# store_springboot-Java_17

This project is a springboot app maked in java 17. He is a crud project, and have two profiles(teste and dev).

- Used technologies 
  - <a href="http://www.h2database.com/html/download.html" target="_blank">Local H2 Database</a>
  - <a href="https://dev.mysql.com/downloads/workbench/" target="_blank">MySQL workbench</a>
  - <a href="https://dev.mysql.com/downloads/installer/" target="_blank">MySql Database</a>
  - <a href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html" target="_blank">Java 17</a>
  - <a href="https://spring.io/tools" target="_blank">SpringToolSuite4</a>

It is the application file settings, here you can change the profile between teste and dev
![ApplicationProperties](https://user-images.githubusercontent.com/64444829/172061456-fc61d5b4-b41d-43e6-8f9b-08a345640aab.PNG)<br>

This is the configuration to teste using h2 database with small informations inserteds.
![TestApplicationProperties](https://user-images.githubusercontent.com/64444829/172059032-f9b2f27f-fa05-4fa3-a665-a12a173bbd67.PNG)<br>

This is the configuration to dev using MySQL database.
![DevApplicationProperties](https://user-images.githubusercontent.com/64444829/172059025-4941e25b-1e1f-40de-8a1f-3141009fc7dc.PNG)<br>

## H2 Database
To access the H2database you need change de profile of project to teste and after run the project how springbootapp you will go open your browser and access this URL: ``http://localhost:8080/h2-console``, will be shown to you the login screen with the informations, in this project is configures how show the image.<br>
![H2DataBaseLoginScreen](https://user-images.githubusercontent.com/64444829/172060548-74e51cd1-44e1-49f1-ba5a-d2ff012e703f.PNG)

<br>After you access the H2database you can make selects, and any other daabase query in this screen
![H2DataBaseTables](https://user-images.githubusercontent.com/64444829/172059028-2e9ff2b1-1042-475c-b4c1-c072c408c927.PNG)

## Postman Examples
I use Postman to do testes, here is the postman response in the methods using JSON format to do Post, Get, Update and Delete
### GetAllResponse
![GetAllUsers](https://user-images.githubusercontent.com/64444829/172059026-e8c767ec-5452-46d0-9bee-c29060c234a2.PNG)
### getOneByIdResponse
![GetUserById](https://user-images.githubusercontent.com/64444829/172059027-58cad3c5-3f85-4681-890a-38e3fa36dc29.PNG)
### PostResponse
![PostUser](https://user-images.githubusercontent.com/64444829/172059029-2466e275-a27d-45f6-93b3-15ba3b962723.PNG)
### PutResponse
![UpdateUser](https://user-images.githubusercontent.com/64444829/172059034-976cf1ef-3cb1-4d95-8dd7-231a3d913a92.PNG)
### DeleteResponse
![DeleteUsers](https://user-images.githubusercontent.com/64444829/172059023-0e44cae7-6b76-4b66-9b43-e833f2fde7b0.PNG)

