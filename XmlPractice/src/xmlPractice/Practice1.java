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
		
		Document k21_doc = k21_docBuilder.parse(new File("C:\\Users\\kopo24\\Desktop\\score.xml"));
		
		Element k21_root = k21_doc.getDocumentElement();
		
		NodeList k21_tag_name = k21_doc.getElementsByTagName("name");
		NodeList k21_tag_studentid = k21_doc.getElementsByTagName("studentid");
		NodeList k21_tag_kor = k21_doc.getElementsByTagName("kor");
		NodeList k21_tag_eng = k21_doc.getElementsByTagName("eng");
		NodeList k21_tag_mat = k21_doc.getElementsByTagName("mat");
		
		System.out.printf("************************************\n");
		for (int k21_i = 0; k21_i < k21_tag_name.getLength(); k21_i++) {
			System.out.printf("이름 : %s\n", k21_tag_name.item(k21_i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", k21_tag_studentid.item(k21_i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", k21_tag_kor.item(k21_i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", k21_tag_eng.item(k21_i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", k21_tag_mat.item(k21_i).getFirstChild().getNodeValue());
			System.out.printf("************************************\n");
		}
	}

}
