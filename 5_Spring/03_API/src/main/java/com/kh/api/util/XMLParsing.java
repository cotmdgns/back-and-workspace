package com.kh.api.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String serviceKey = "fEJKp%2BmJzWsMTXrJiAmzN5fF2QEnNoGiRlpIgs9cGW3jlgXZFBjBwQw3v%2B5em2ho2Q5Z28awd%2FJ9B%2BBdjPoyrg%3D%3D";
		String url = "https://apis.data.go.kr/6260000/FoodService/getFoodKr?serviceKey="+ serviceKey +"&pageNo=1&numOfRows=396&";
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("item");
			System.out.println("파싱할 데이터 수: "  + nList.getLength());
			
			for(int i =0;i<nList.getLength();i++) {
				Node nNode = nList.item(i);
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("MAIN_TITLE : " + getTagValue("MAIN_TITLE",eElement));
					System.out.println("ADDR1 : " + getTagValue("ADDR1",eElement).trim());
					System.out.println();
					System.out.println("--------------------------------------------------");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 그냥 가져다써두됨    ** 편리성 좋음 **
	public static String getTagValue(String tag, Element eElement) {
		NodeList nList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
		Node nValue = nList.item(0);
		if(nValue == null) return null;
		return nValue.getNodeValue();
	}
	

}
