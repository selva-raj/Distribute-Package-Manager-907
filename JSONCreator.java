import org.json.JSONObject;
import org.json.JSONArray;
public class JSONCreator {
	public static void main(String[] arg) {
		try {
			JSONObject formJson = new JSONObject();
			JSONArray formArray = new JSONArray();
			
			JSONObject unameJson = new JSONObject();
			unameJson.put("key", "username");
			JSONObject metaDataJson = new JSONObject();
			metaDataJson.put("title", "Specify User Name");
			unameJson.put("htmlMetaData", metaDataJson);
			formArray.put(unameJson);
			
			JSONObject passJson = new JSONObject();
			passJson.put("key", "password");
			JSONObject metaDataJson1 = new JSONObject();
			metaDataJson1.put("title", "Specify User Password");
			passJson.put("htmlMetaData", metaDataJson1);
			formArray.put(passJson);

			JSONObject targetJson = new JSONObject();
			targetJson.put("key", "targettype");
			JSONObject metaDataJson2 = new JSONObject();
			metaDataJson2.put("title", "Specify Target type");
			targetJson.put("htmlMetaData", metaDataJson2);
			formArray.put(targetJson);

			formJson.put("form", formArray);
			System.out.println("Result : " + formJson.toString());
		} catch (Exception ed) {
			ed.printStackTrace();
		}
	}
}