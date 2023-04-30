package xmlPractice;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Practice1 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder k21_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// DocumentBuilder 객체를 생성
		Document k21_doc = k21_docBuilder.parse(new File("C:\\Users\\kopo24\\Desktop\\코딩 후 생성된 파일\\score.xml"));
		// XML 파일을 파싱
		Element k21_root = k21_doc.getDocumentElement();
		//XML파일의 루트 엘리먼트 객체 가져오기
		
		// 각 항목의 값을 가져오기 위한 NodeList 객체 생성
		NodeList k21_tag_name = k21_doc.getElementsByTagName("name");
		// name 이라는 항복의 값을 가져와서 k21_tag_name에 저장
		NodeList k21_tag_studentid = k21_doc.getElementsByTagName("studentid");
		// studentid 이라는 항복의 값을 가져와서 k21_tag_studentid에 저장
		NodeList k21_tag_kor = k21_doc.getElementsByTagName("kor");
		// kor 이라는 항복의 값을 가져와서 k21_tag_kor에 저장
		NodeList k21_tag_eng = k21_doc.getElementsByTagName("eng");
		// eng 이라는 항복의 값을 가져와서 k21_tag_eng에 저장
		NodeList k21_tag_mat = k21_doc.getElementsByTagName("mat");
		// mat 이라는 항복의 값을 가져와서 k21_tag_mat에 저장
		
		System.out.printf("************************************\n"); // 구분자 출력
		for (int k21_i = 0; k21_i < k21_tag_name.getLength(); k21_i++) { //파일을 전체적으로 읽기위한 for문의 시작
			System.out.printf("이름 : %s\n", k21_tag_name.item(k21_i).getFirstChild().getNodeValue());
			// 이름에 대한 정보를 가져오는데 k21_i번째 이름 태그안에 있는 텍스트값 반환	
			System.out.printf("학번 : %s\n", k21_tag_studentid.item(k21_i).getFirstChild().getNodeValue());
			// 학번에 대한 정보를 가져오는데 k21_i번째 studentid 태그안에 있는 텍스트값 반환
			System.out.printf("국어 : %s\n", k21_tag_kor.item(k21_i).getFirstChild().getNodeValue());
			// 국어에 대한 정보를 가져오는데 k21_i번째 국어 태그안에 있는 텍스트값 반환
			System.out.printf("영어 : %s\n", k21_tag_eng.item(k21_i).getFirstChild().getNodeValue());
			// 영어에 대한 정보를 가져오는데 k21_i번째 영어 태그안에 있는 텍스트값 반환
			System.out.printf("수학 : %s\n", k21_tag_mat.item(k21_i).getFirstChild().getNodeValue());
			// 수학에 대한 정보를 가져오는데 k21_i번째 수학 태그안에 있는 텍스트값 반환
			System.out.printf("************************************\n");
		}
	}

}
