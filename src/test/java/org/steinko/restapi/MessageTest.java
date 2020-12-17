package org.steinko.restapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MessageTest {
	
	@Test
	public void shouldExist() {
		assertNotNull(new Message("messag"));
	}
	
	@Test
	public void shouldgetaMessage() {
		String aMessage = "Message";
		Message message = new Message(aMessage);
		assertEquals(aMessage,message.getMessage());
	}
	
	@Test
	public void shouldgetaMessage2() {
		String aMessage = "Message";
        String aMessage2 = "Message2";
		Message message = new Message(aMessage);
		message.setMessage(aMessage2);
		assertEquals(aMessage2,message.getMessage());
	}

}
