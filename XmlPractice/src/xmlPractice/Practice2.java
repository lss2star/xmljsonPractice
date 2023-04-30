package xmlPractice;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Practice2 {

	public static void main(String[] args) {
		JSONObject k21_jsonObject = new JSONObject();
		
		JSONArray k21_dataArray = new JSONArray();
		
		JSONObject k21_dataObject = new JSONObject();
		
		k21_dataObject.put("name", "나연");
		k21_dataObject.put("studentid", "209901");
		JSONArray k21_score = new JSONArray();
		
		k21_score.add(90);
		k21_score.add(100);
		k21_score.add(95);
		k21_dataObject.put("score" ,k21_score);
		k21_dataArray.add(k21_dataObject);
		
		k21_dataArray.add(oneRec("정연", 209902, 100, 85, 75));
		k21_dataArray.add(oneRec("모모", 209903, 90, 75, 85));
		k21_dataArray.add(oneRec("사나", 209904, 90, 85, 75));
		k21_dataArray.add(oneRec("지효", 209905, 80, 75, 85));
		k21_dataArray.add(oneRec("미나", 209906, 90, 85, 55));
		k21_dataArray.add(oneRec("다현", 209907, 70, 75, 65));
		k21_dataArray.add(oneRec("채영", 209908, 100, 75, 95));
		k21_dataArray.add(oneRec("쯔위", 209909, 80, 85, 95));
		
		try {
			FileWriter k21_file= new FileWriter("C:\\Users\\kopo24\\Desktop\\scorejson.json");
			k21_file.write(k21_dataArray.toJSONString());
			k21_file.flush();
			k21_file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON 만든거 : " + k21_dataArray);

	}
	public static JSONObject oneRec(String k21_name, int k21_studentid, int k21_kor, int k21_eng, int k21_mat) {
		JSONObject k21_dataObject = new JSONObject();
		k21_dataObject.put("name", k21_name);
		k21_dataObject.put("studentid", k21_studentid);
		
		JSONArray k21_score = new JSONArray();
		k21_score.add(k21_kor);
		k21_score.add(k21_eng);
		k21_score.add(k21_mat);
		k21_dataObject.put("score", k21_score);
		
		return k21_dataObject;
	}

}
