package mainsurvey;

import java.io.InputStream;

import net.sf.json.JSONObject; 
import net.sf.json.JSONSerializer; 

import org.apache.commons.io.IOUtils;


public class parseJson {

    public static void main(String[] args) throws Exception {
        InputStream rawTxt = parseJson.class.getResourceAsStream( "examplejson.txt");
        String jsonTxt = IOUtils.toString( rawTxt );

        JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt ); 
        System.out.println(json);
    }
}