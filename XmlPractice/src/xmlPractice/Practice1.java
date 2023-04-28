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
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document doc = docBuilder.parse(new File("C:\\Users\\kopo24\\Desktop\\score.xml"));
		
		Element root = doc.getDocumentElement();
		
		NodeList tag_name = doc.getElementsByTagName("name");
		NodeList tag_studentid = doc.getElementsByTagName("studentid");
		NodeList tag_kor = doc.getElementsByTagName("kor");
		NodeList tag_eng = doc.getElementsByTagName("eng");
		NodeList tag_mat = doc.getElementsByTagName("mat");
		
		System.out.printf("************************************\n");
		for (int i = 0; i < tag_name.getLength(); i++) {
			System.out.printf("�̸� : %s\n", tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.printf("************************************\n");
		}
	}

}
