package org.steinko.restapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MessageController {
	
	  @PostMapping("/message")
	  public Message newMessage( @RequestBody Message aMessage) {
	        return aMessage ; 
	    }
	  
	  @GetMapping("/message")
	  public Message getMessage( ) {
	        return new Message("get message"); 
	    }
	  
}
