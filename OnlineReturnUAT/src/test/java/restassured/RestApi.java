package restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class RestApi {
 
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		String ab=given().log().all().baseUri(baseURI).queryParams("key","qaclick123").
		body(MethodBody.addPlace()).when().post("maps/api/place/add/json").
		then().log().all().statusCode(200).extract().asString();
		
		JsonPath js= new JsonPath(ab);
		String pid =js.getString("place_id");
		
		
		System.out.println("***********PUT****************PUT*****************PUT**************");
		System.out.println("");
		
		given().log().all().queryParams("key","qaclick123","place_id", pid).
		body("{\r\n"
				+ "\"place_id\":\""+pid+"\",\r\n"
				+ "\"address\":\"GrowskillIT Mysore\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").when().put("maps/api/place/update/json").
		then().log().all().statusCode(200);
		
		
		
		System.out.println("***********GET****************GET*****************GET**************");
		System.out.println("");
		
		given().log().all().queryParams("key","qaclick123","place_id", pid).
		when().get("maps/api/place/get/json").then().log().all().statusCode(200);
		
		}
	
	
         

}

