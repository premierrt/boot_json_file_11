package boot_json_11.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import boot_json_11.model.Response2GoalArray;

@Service
public class JsonFileReader {

	private static final Log log = LogFactory.getLog(JsonFileReader.class);
	
	public void readFromFile(String fileName){
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Response2GoalArray response = objectMapper.readValue(new File(fileName), Response2GoalArray.class);
			log.info(response.toString());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
