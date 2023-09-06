# LITTLE CRM CLIENT/LEAD

### CONTENT

-   Folder "*app*": **React Js** app **for Front End**.
    
-   Folder "*oportunities*": **Spring Boot app for Back End**.

### HOW TO START :

-   Download both folders.
    
-   Start first the Spring Bot part. If you don´t start it, Front End will not start right.
    
-   Start React Js app.
    ```diff
    !Log in credentials: email:  solera@solera.com  & password: solera.
    ```


## Worth Of Aplication
This App is made for enterprises who want see the Contacts, Opportunities with the contacts and clients.
We have got only 2 Entities: User and Logger.
User can be everything you want changing 3 booleans: isContact, isOportunity or isClient. The application make that.
Let's see the app.
***LOG IN***
![Log In Image](https://github.com/aleguztor/Week6_AppContacts/blob/main/imagesofApp/LogIn.png)

***WORTH OF APP***
![Worth Of APp Image](https://github.com/aleguztor/Week6_AppContacts/blob/main/imagesofApp/Worth%20Of%20app.png)
## Api Rest Documentation

> ***[http://localhost:8686/](http://localhost:8686/)***

| GET USER/S | POST USER | PUT OPORTUNITY OR CLIENT|DELETE USER |
|--   |--    |--  |--|
|[/](http://localhost:8686/)|[/](http://localhost:8686/)|[/{id}/tipoDeOportunidad/{oportunidad}](http://localhost:8686/{id}/tipoDeOportunidad/{oportunidad})|[/id](http://localhost:8686/{id})
|  [/id](http://localhost:8686/{id})   |      |[/{id}/tipoDeCliente/{cliente}](http://localhost:8686/{id}/tipoDeCliente/{cliente}) 
----------------
| GET LOGGER/S | POST LOGGER| PUT LOG IN/OUT|DELETE ID
|--   |--    |--  |--|
|[/loggers](http://localhost:8686/loggers)|[/loggers](http://localhost:8686/loggers)|[/login](http://localhost:8686/login)        [/logout](http://localhost:8686/logout)|[/loggers/{id}](http://localhost:8686/loggers/%7Bid%7D)









