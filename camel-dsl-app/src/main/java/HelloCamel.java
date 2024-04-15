import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloCamel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = 
				  new ClassPathXmlApplicationContext("camel-context.xml");
	}

}
