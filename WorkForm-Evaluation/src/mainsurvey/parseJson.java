package mainsurvey;

import java.io.File;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import net.sf.json.JSONSerializer; 

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;


public class parseJson {

    public static void main(String[] args) throws Exception {
    	readJson();
    }
    
    public static JSONObject readJson() throws IOException {
    	BufferedReader br = null;
    	String line;
    	StringBuilder sb = new StringBuilder();
    	
    	try {
    		br = new BufferedReader(new FileReader("/Users/micduan/Documents/Side projects/WorkTerm-Evaluation/WorkForm-Evaluation/src/mainsurvey/questions.json"));

    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	try {
    	    while ((line = br.readLine()) != null) {
    	        sb.append(line);
    	    }
    	    System.out.println(sb);
    	    JSONObject json = new JSONObject(sb.toString());
    	    return json;
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		br.close();
    	}
		return null;
    }
}
