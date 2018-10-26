package jersey.zun.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersey.zun.entity.Department;

@Path("dept")
public class DepartmentRest {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)//代表该资源方法生产的响应MIME格式为application/xml
//    @Consumes(MediaType.APPLICATION_JSON)//代表该资源方法能够接受请求MIME类型为application/json
	public List<Department> list() {
        List<Department> dept = new ArrayList<Department>();
        dept.add(new Department(1L, "dept1"));
        dept.add(new Department(2L, "dept2"));
        return dept;
    }
	
	
	@POST //2  created
	@Produces(MediaType.APPLICATION_JSON)
	public Department save(@FormParam("name") String name) {
	    Department d = new Department(1L, name);
	    return d;
	}
	
	@PUT //3 update
	@Path("{id}") 
	@Produces(MediaType.APPLICATION_JSON)
	public Department update(@PathParam("id") Long id, @FormParam("name") String name) {
	    Department d = new Department(id, name);
	    return d;
	}
	
	@DELETE //4
	@Path("{id}")
	public void delete(@PathParam("id") Long id) {
	    System.out.println("删除部门：" + id);
	}
	
	
	
}
