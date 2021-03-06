package org.praneeth.umkc.messenger.resources;




import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.praneeth.umkc.messenger.model.Message;
import org.praneeth.umkc.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageservice = new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageservice.getAllMessages();
	}

}
