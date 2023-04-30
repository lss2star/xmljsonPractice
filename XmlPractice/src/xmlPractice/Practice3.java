package xmlPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser k21_parser = new JSONParser();
		
		Object k21_obj = k21_parser.parse(new FileReader("C:\\Users\\kopo24\\Desktop\\scorejson.json"));
		
		JSONArray k21_array = (JSONArray)k21_obj;
		System.out.println("*********************\n");
		for (int k21_i = 0; k21_i < k21_array.size(); k21_i++) {
			JSONObject k21_result = (JSONObject) k21_array.get(k21_i);
			System.out.println("이름 : " +k21_result.get("name"));
			System.out.println("학번 : " +k21_result.get("studentid"));
			
			JSONArray k21_score = (JSONArray) k21_result.get("score");
			long k21_kor = (long)k21_score.get(0);
			long k21_eng = (long)k21_score.get(1);
			long k21_mat = (long)k21_score.get(2);
			System.out.println("국어 : " + k21_kor);
			System.out.println("영어 : " + k21_eng);
			System.out.println("수학 : " + k21_mat);
			System.out.println("총점 : " + (k21_kor + k21_eng + k21_mat));
			System.out.println("평균 : " + ((k21_kor + k21_eng + k21_mat) / 3.0));
		}
		
	}

}
