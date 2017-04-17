package ch18.ex32.exercise;

import lib.utils.TextFile;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class MapCount {
    public static Map<String, Integer> getMap(String fileName) {
        List<String> list = new TextFile(fileName, "\\W+");
        Map<String, Integer> hMap = new HashMap<>();

        for (String s : list) {
            Integer value = hMap.get(s);
            if (value == null) {
                value = 0;
            }
            hMap.put(s, value + 1);
        }
        return hMap;
    }



    private static void fillDocument(Document doc, Map<String, Integer> map) {
        Element root = doc.getDocumentElement();
        for (String s : map.keySet()) {
            Element entry = doc.createElement("entry");
            Element key = doc.createElement("key");
            key.appendChild(doc.createTextNode(s));// short way
            Element value = doc.createElement("value");
            value.appendChild(doc.createTextNode(map.get(s).toString()));// short way
            entry.appendChild(key);
            entry.appendChild(value);
            root.appendChild(entry);
        }
    }

    private static void writeDocument(Document document, String fileName) {
        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");  // ВНИМАНИЕ добавляет перевод CRLF в каждую строку
            DOMSource dIn = new DOMSource(document);
            FileOutputStream fOut = new FileOutputStream(fileName);
            StreamResult sOut = new StreamResult(fOut);
            tf.transform(dIn, sOut);
            fOut.close();
        } catch (TransformerException | IOException e) {
            throw new RuntimeException(e);

        }
    }


    public static void readDocument(String fileName) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);

            Node root = document.getDocumentElement();  // получить корневой узел
            System.out.println("-----------------------------");
            NodeList items = root.getChildNodes();
            int lineCount = 1;
            for (int i = 0; i < items.getLength(); i++) {
                Node item = items.item(i);
                if (item.getNodeType() == Node.TEXT_NODE) {
                    continue;
                }

                NodeList entry = item.getChildNodes(); // получить следующий пункт
                System.out.printf("%3d ",lineCount++);
                for (int j = 0; j < entry.getLength(); j++) {
                    if (entry.item(j).getNodeType() != Node.TEXT_NODE) {
                        System.out.printf("%-5s: %-25s",entry.item(j).getNodeName(),entry.item(j).getTextContent());
                    }
                }
                System.out.println();
            }
            System.out.println("-----------------------------");
        } catch (ParserConfigurationException | SAXException |IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void makeXML(Map<String,Integer> map, String fileName) {
        if (!fileName.endsWith(".xml")) {
            return;
        }

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = documentBuilder.newDocument();
            Element root = doc.createElement("Map");
            doc.appendChild(root);

            fillDocument(doc, map);
            writeDocument(doc,fileName);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

    }
}
