package jersey.zun.controller;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import jersey.zun.entity.Employ;

@Path("employ")
public class EmployRest {

	/**
	 * @BeanParam 和 实体中@FormParam的绑定的属性 将请求数据绑定至对象中
	 * MultivaluedMap直接获取表单内容
	 * @param ee
	 * @param fs
	 * @return
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Employ create(@BeanParam Employ ee, MultivaluedMap<String, String> fs){
		ee.setId(55L);
		System.out.println(fs);
		return ee;
	}
	
	/**
	 * 获取请求头headers中的信息
	 * @param token
	 * @return
	 */
	@GET
	@Path("/head")
	public String headParam(@HeaderParam("token") String token) {
	    System.out.println(token);
	    return "success";
	}
	
	/**
	 * 矩阵参数@MatrixParam
	 * http://localhost:8082/webapi/employ/matrix;currentPage=10;pageSize=10;keyword=ssss
	 * @param currentPage
	 * @param pageSize
	 * @param keyword
	 * @return
	 */
	@GET
	@Path("/matrix")
	public String matrix(@MatrixParam("currentPage") int currentPage, @MatrixParam("pageSize") int pageSize,
	        @MatrixParam("keyword") String keyword) {
	    System.out.println("currentPage:" + currentPage);
	    System.out.println("pageSize:" + pageSize);
	    System.out.println("keyword:" + keyword);
	    return "success";
	}

	
}
