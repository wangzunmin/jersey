package jersey.zun.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ExceptionMapperSupport implements ExceptionMapper<Exception> {

	public Response toResponse(Exception exception) {
		return null;
		
	}

}
