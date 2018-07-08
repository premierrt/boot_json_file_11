package boot_json_11;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import boot_json_11.service.JsonFileReader;

@SpringBootApplication
public class BootJson11Application implements ApplicationRunner {

	@Autowired
	JsonFileReader jsonFileReader;
	
	private static final Log log = LogFactory.getLog(BootJson11Application.class);
	public static void main(String[] args) {
		SpringApplication.run(BootJson11Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		if (args.getNonOptionArgs().size() ==1){
			//findFirst zwraca Optional. get pobiera wartosc z Optinal<String>
//						https://examples.javacodegeeks.com/core-java/util/optional/java-8-optional-example/
						String fileName = args.getNonOptionArgs().stream().findFirst().get(); 
						log.info("***param :" + fileName);
						jsonFileReader.readFromFile(fileName);
					}
	}
	
	
}
