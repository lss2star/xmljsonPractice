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
		// DocumentBuilder ��ü�� ����
		Document k21_doc = k21_docBuilder.parse(new File("C:\\Users\\kopo24\\Desktop\\�ڵ� �� ������ ����\\score.xml"));
		// XML ������ �Ľ�
		Element k21_root = k21_doc.getDocumentElement();
		//XML������ ��Ʈ ������Ʈ ��ü ��������
		
		// �� �׸��� ���� �������� ���� NodeList ��ü ����
		NodeList k21_tag_name = k21_doc.getElementsByTagName("name");
		// name �̶�� �׺��� ���� �����ͼ� k21_tag_name�� ����
		NodeList k21_tag_studentid = k21_doc.getElementsByTagName("studentid");
		// studentid �̶�� �׺��� ���� �����ͼ� k21_tag_studentid�� ����
		NodeList k21_tag_kor = k21_doc.getElementsByTagName("kor");
		// kor �̶�� �׺��� ���� �����ͼ� k21_tag_kor�� ����
		NodeList k21_tag_eng = k21_doc.getElementsByTagName("eng");
		// eng �̶�� �׺��� ���� �����ͼ� k21_tag_eng�� ����
		NodeList k21_tag_mat = k21_doc.getElementsByTagName("mat");
		// mat �̶�� �׺��� ���� �����ͼ� k21_tag_mat�� ����
		
		System.out.printf("************************************\n"); // ������ ���
		for (int k21_i = 0; k21_i < k21_tag_name.getLength(); k21_i++) { //������ ��ü������ �б����� for���� ����
			System.out.printf("�̸� : %s\n", k21_tag_name.item(k21_i).getFirstChild().getNodeValue());
			// �̸��� ���� ������ �������µ� k21_i��° �̸� �±׾ȿ� �ִ� �ؽ�Ʈ�� ��ȯ	
			System.out.printf("�й� : %s\n", k21_tag_studentid.item(k21_i).getFirstChild().getNodeValue());
			// �й��� ���� ������ �������µ� k21_i��° studentid �±׾ȿ� �ִ� �ؽ�Ʈ�� ��ȯ
			System.out.printf("���� : %s\n", k21_tag_kor.item(k21_i).getFirstChild().getNodeValue());
			// ��� ���� ������ �������µ� k21_i��° ���� �±׾ȿ� �ִ� �ؽ�Ʈ�� ��ȯ
			System.out.printf("���� : %s\n", k21_tag_eng.item(k21_i).getFirstChild().getNodeValue());
			// ��� ���� ������ �������µ� k21_i��° ���� �±׾ȿ� �ִ� �ؽ�Ʈ�� ��ȯ
			System.out.printf("���� : %s\n", k21_tag_mat.item(k21_i).getFirstChild().getNodeValue());
			// ���п� ���� ������ �������µ� k21_i��° ���� �±׾ȿ� �ִ� �ؽ�Ʈ�� ��ȯ
			System.out.printf("************************************\n");
		}
	}

}
