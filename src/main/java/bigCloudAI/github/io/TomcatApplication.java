package bigCloudAI.github.io;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
public class TomcatApplication extends SpringBootServletInitializer{

	private static Log logger = LogFactory.getLog(TomcatApplication.class);
	
	public static void main(String[] args) throws Exception {
		SpringApplication application = new SpringApplication(TomcatApplication.class); 
	    application.run(args);
	}
}
