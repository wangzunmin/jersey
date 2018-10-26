package jersey.zun.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersey.zun.entity.Person;

@Path("person")
public class PersonRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Person getPer(@PathParam("id")Long id){
		Person person = new Person();
		person.setId(id);
		person.setName("tom");
		return person;
	}
}
