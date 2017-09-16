package mainsurvey;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

public class parseJson {
	static StringBuilder sb;
	private static String jsonString;

    public static void main(String[] args) throws Exception {
    	readJson();
    }
    
    public static String readJson() throws IOException {
    	BufferedReader br = null;
    	String line;
    	sb = new StringBuilder();
    	
    	try {
    		br = new BufferedReader(new FileReader("/Users/micduan/Documents/Side projects/WorkTerm-Evaluation/WorkForm-Evaluation/src/mainsurvey/questions.json"));

    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	try {
    	    while ((line = br.readLine()) != null) {
    	        sb.append(line);
    	    }
    	    jsonString = sb.toString();
    	    return jsonString;
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		br.close();
    	}
    	return jsonString;
    }
    
    public static String getQuestions() {
    	//return jsonString;
    	try {
			return readJson();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error";
		}
    }
}
