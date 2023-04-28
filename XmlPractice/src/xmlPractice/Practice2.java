package xmlPractice;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Practice2 {

	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		
		JSONArray dataArray = new JSONArray();
		
		JSONObject dataObject = new JSONObject();
		
		dataObject.put("name", "����");
		dataObject.put("studentid", "209901");
		JSONArray score = new JSONArray();
		
		score.add(90);
		score.add(100);
		score.add(95);
		dataObject.put("score" ,score);
		dataArray.add(dataObject);
		
		dataArray.add(oneRec("����", 209902, 100, 85, 75));
		dataArray.add(oneRec("���", 209903, 90, 75, 85));
		dataArray.add(oneRec("�糪", 209904, 90, 85, 75));
		dataArray.add(oneRec("��ȿ", 209905, 80, 75, 85));
		dataArray.add(oneRec("�̳�", 209906, 90, 85, 55));
		dataArray.add(oneRec("����", 209907, 70, 75, 65));
		dataArray.add(oneRec("ä��", 209908, 100, 75, 95));
		dataArray.add(oneRec("����", 209909, 80, 85, 95));
		
		try {
			FileWriter file= new FileWriter("C:\\Users\\kopo24\\Desktop\\scorejson.json");
			file.write(dataArray.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON ����� : " + dataArray);

	}
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", name);
		dataObject.put("studentid", studentid);
		
		JSONArray score = new JSONArray();
		score.add(kor);
		score.add(eng);
		score.add(mat);
		dataObject.put("score", score);
		
		return dataObject;
	}

}
