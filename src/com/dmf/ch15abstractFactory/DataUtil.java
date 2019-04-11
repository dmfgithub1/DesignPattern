package com.dmf.ch15abstractFactory;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DataUtil {

	private static String dbStr = "Mysql";
	static {
		getdataBase();
	}
	public static void getdataBase() {
		try {
			//1.创建DOM解析器工厂
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//2.由DOM解析器工厂创建DOM解析器
			DocumentBuilder  db = dbf.newDocumentBuilder();
			FileInputStream xmlInputStream = new FileInputStream("src/com/dmf/ch15abstractFactory/db.xml");
			//3.由DOM解析器解析文档，生成DOM树
			Document doc = db.parse(xmlInputStream);
			//4.解析DOM树，获取文档内容（元素   属性  文本）
	        //4.1获取根元素
	        NodeList list = doc.getChildNodes();
	        Node node = list.item(0);
	        dbStr= node.getTextContent().trim();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//也可以直接反射具体的Service类
	public static ServiceFactory createService() {
		String className = "com.dmf.ch15abstractFactory."+dbStr+"ServiceFactory";
		ServiceFactory serviceFactory = null;
		try {
			Class cls = Class.forName(className);
			serviceFactory = (ServiceFactory)cls.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviceFactory;
	}
	public static void main(String[] args) {
		getdataBase();
	}
}
