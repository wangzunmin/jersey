package jersey.zun.entity;

import com.google.gson.annotations.Expose;

import jersey.zun.provider.FastGson;

@FastGson
public class Person {
	@Expose
	private Long id;
	@Expose
	private String name;
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
	
	
}
