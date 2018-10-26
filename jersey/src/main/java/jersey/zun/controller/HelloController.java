package jersey.zun.controller;

import java.util.Set;

import javax.inject.Singleton;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
@Singleton //单例
public class HelloController {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hi() {
		System.out.println(this);
		return "hello jersey";
	}
	
	
	@GET
	@Path("{id}")
	public String pathParam(@PathParam("id") Long id) {
	    System.out.println(id);
	    return "success";
	}
	
	
	@GET
	@Path("/query")
	public String queryParam(@QueryParam("name") String name) {
	    System.out.println(name);
	    return "success";
	}

	
	@POST
	@Path("/hobby")//@FormParam注解只能接受x-www-form-urlencoded编码格式的form表单提交，这个是必要条件；
	public String formParam(@FormParam("hobby") Set<String> hobbies) {
	    System.out.println(hobbies);
	    return "success";
	}
	
	
	@Path("/response")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response rep(){
		return Response.status(200).entity("A new podcast/resource has been Getted").build();
	}
}
