package jersey.zun.controller;

import javax.inject.Singleton;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

@Path("exception")
@Singleton
public class ExceptionRest {

	@POST
	@Path("regist")
	public String regist(@FormParam("name")String username){
		
		if ("admin".equals(username)) {
            throw new WebApplicationException("用户名已经存在!",
                    Response.Status.CONFLICT);
        } else {
            return "注册成功!";
        }

	}
}
