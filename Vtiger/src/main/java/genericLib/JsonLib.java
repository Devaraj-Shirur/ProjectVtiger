package genericLib;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.json.JsonOutput;

public class JsonLib extends Constants {
	
	public static String readStringDatafromPropertyFile(String value) {
		
		JSONParser parser =new JSONParser();
		try {
			FileReader fr = new FileReader(jsonPath);
			JSONObject jsonObj = (JSONObject)parser.parse(fr);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return value;
		
	}

}
