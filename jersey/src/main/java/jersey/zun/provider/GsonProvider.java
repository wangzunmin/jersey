package jersey.zun.provider;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Provider
public class GsonProvider implements MessageBodyWriter<Object> {
	
	public static Gson gson = new GsonBuilder()
	.excludeFieldsWithoutExposeAnnotation()//不导出实体中没有用@Expose注解的属性  
	.enableComplexMapKeySerialization() //支持Map的key为复杂对象的形式  
	.serializeNulls()   //空字段的值设置为null暴露出去
	.setDateFormat("yyyy-MM-dd")//格式化日期
	.setPrettyPrinting() //对json结果格式化.  
//	.setVersion(1.0)    //有的字段不是一开始就有的,会随着版本的升级添加进来,那么在进行序列化和返序列化的时候就会根据版本号来选择是否要序列化.  
                    //@Since(版本号)能完美地实现这个功能.还的字段可能,随着版本的升级而删除,那么  
                    //@Until(版本号)也能实现这个功能,GsonBuilder.setVersion(double)方法需要调用.  
	.create();

	@Produces(MediaType.APPLICATION_JSON)	
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return type.isAnnotationPresent(FastGson.class);
	}

	public long getSize(Object t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return -1;
	}

	public void writeTo(Object t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream) throws IOException,
			WebApplicationException {
		 entityStream.write(gson.toJson(t, type).getBytes("UTF-8"));
	}

}
