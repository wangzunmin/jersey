package jersey.zun.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

@Path("context")
public class ContextController {

	/**
	 * @Context注入特殊资源
	 * @param httpServletRequest
	 * @param context
	 * @return
	 */
	@GET
	public String context(@Context HttpServletRequest httpServletRequest, @Context ServletContext context,
			@Context UriInfo ui, @Context HttpHeaders  httpHeaders){
		System.out.println(httpServletRequest);
		System.out.println(context);
		System.out.println(ui.getAbsolutePath());
		System.out.println(httpHeaders.getMediaType());
		return "success";
	}
}
