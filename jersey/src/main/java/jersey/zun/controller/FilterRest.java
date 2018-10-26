package jersey.zun.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("filter")
public class FilterRest {
	
	
	@GET
	public String resource1() {
	    return "success";
	}
}
