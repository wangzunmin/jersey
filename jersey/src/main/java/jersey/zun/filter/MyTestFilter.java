package jersey.zun.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
/**
 * servlet中的过滤器是双向过滤器，即一个过滤器可以对请求进行一次过滤，然后调用执行链，
 * 	让请求向下运行，然后再返回响应的时候，再次通过过滤器，在这个时候就可以对响应进行处理。
 * 
 * Jersey是单向的过滤器
 * 	ContainerRequestFilter 针对请求的过滤器
 * 	ContainerResponseFilter 针对响应的过滤器
 * @author WZM
 *
 * 2018年10月10日
 */

@Provider
public class MyTestFilter implements ContainerRequestFilter, ContainerResponseFilter {

	public void filter(ContainerRequestContext requestContext)
			throws IOException {
		System.out.println("===my request test filter===");
	}
	
	public void filter(ContainerRequestContext requestContext,
			ContainerResponseContext responseContext) throws IOException {
		 System.out.println("===my response filter test===");
	}

}
