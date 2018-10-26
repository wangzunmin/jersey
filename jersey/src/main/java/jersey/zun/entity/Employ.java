package jersey.zun.entity;

import javax.ws.rs.FormParam;

public class Employ {

	private Long id;
	
	@FormParam("name") //配合@BeanParam使用 可以实现请求参数到实体的绑定
	private String name;
	
	@FormParam("age")
	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
