package org.steinko.restapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.CREATED;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.boot.web.server.LocalServerPort;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MessageControllerIT {
	
	@Autowired
	MessageController controller;
	
	@Autowired
	  private WebApplicationContext webApplicationContext;
	

	 @LocalServerPort
	 private  int localServerPort;
	 
	
	@Test
	public void shouldExist() {
		assertNotNull(controller);
	}
	
	@Test
	public void shouldStoreMessage() {
		
		 
   	   String url =  "http://localhost:" + localServerPort + "/message";	
   	   Message message = new Message("message");
   	   given()
         .webAppContextSetup(webApplicationContext)
         .contentType("application/json")
         .body(message)
       .when()
          .post(url)
       .then()
         .statusCode(OK.value()); 
	}
	
	@Test
	public void shouldGetMessage() {
		
		 
   	   String url =  "http://localhost:" + localServerPort + "/message";	
   	   Message message = new Message("message");
   	   given()
         .webAppContextSetup(webApplicationContext)
         .contentType("application/json")
         .body(message)
       .when()
          .get(url)
       .then()
         .statusCode(OK.value()); 
	}
	
	

}
