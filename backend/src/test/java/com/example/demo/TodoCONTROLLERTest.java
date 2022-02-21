package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

/*
    ToDo: - teste ob ein ToDoItem richtig hinzugefügt wird
    ToDo: - teste ob alle ToDoItems als liste zurückgegeben werden
    ToDo: - teste ob ein ToDoItem anhand der ID gefunden wird
    ToDo: - teste ob du den Status eines ToDoItems ändern kannst
    ToDo: - teste ob du ein ToDoItem löschen kannst
    use the restTestTemplate to send HTTP Requests to your Controller and see if all classes work
     */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoCONTROLLERTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

}