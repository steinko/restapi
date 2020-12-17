package org.steinko.restapi;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class MessageControlerTest {
	
	
	@Test
	public void shouldExist() {
		assertNotNull(new MessageController());
	}
	
	@Test
	public void shouldStoreMessage() {
		
	   MessageController controller = new MessageController();
   	   Message message = new Message("message");
   	   
   	   given()
   	      .standaloneSetup(controller)
         .contentType("application/json")
         .body(message)
       .when()
          .post("/message")
       .then()
         .statusCode(OK.value()); 
	}
	
	@Test
	public void shouldGetMessage() {
		
	   MessageController controller = new MessageController();
   	   
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .get("/message")
       .then()
         .statusCode(OK.value()); 
	}

}
