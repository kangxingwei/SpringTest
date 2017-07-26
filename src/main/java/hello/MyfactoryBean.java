package hello;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyfactoryBean implements FactoryBean<String>{

	public String getObject() throws Exception {
		
		return "hehehe";
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return String.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	

   
}