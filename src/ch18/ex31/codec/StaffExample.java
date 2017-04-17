package ch18.ex31.codec;

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

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class StaffExample {
    private static String fileName = "./src/ch18/ex31/codec/Company.xml";

    private static void fillDocument(Document document, String[] args) {

        Element root = document.getDocumentElement();

        Element staff = document.createElement("staff");
        Attr attr = document.createAttribute("id");
        attr.setValue(args[0]);                             // long way
        staff.setAttributeNode(attr);
        staff.setAttribute("limit", args[1]);           // short way

        Element firstName = document.createElement("firstname");
        Node nodeName = document.createTextNode(args[2]);  // long way
        firstName.appendChild(nodeName);

        Element lastName = document.createElement("lastname");
        lastName.appendChild(document.createTextNode(args[3]));// short way

        Element nickName = document.createElement("nickname");
        nickName.appendChild(document.createTextNode(args[4]));

        Element age = document.createElement("age");
        age.appendChild(document.createTextNode(args[5]));

        Element salary = document.createElement("salary");
        salary.appendChild(document.createTextNode(args[6]));

        staff.appendChild(firstName);
        staff.appendChild(lastName);
        staff.appendChild(nickName);
        staff.appendChild(age);
        staff.appendChild(salary);

        root.appendChild(staff);
    }




    private static void writeDocument(Document document) {
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


    public static void readDocument() {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);

            Node root = document.getDocumentElement();  // получить корневой узел
            System.out.println("=============================");
            NodeList staff = root.getChildNodes();
            for (int i = 0; i < staff.getLength(); i++) {
                Node person = staff.item(i); // получить следующий пункт
                if (person.getNodeType() != Node.TEXT_NODE) {
                    NodeList props = person.getChildNodes(); // свойства книжки
                    for (int j = 0; j < props.getLength(); j++) {
                        Node bookProp = props.item(j);
                        if (bookProp.getNodeType() != Node.TEXT_NODE) {  // это не текст
                            System.out.println(bookProp.getNodeName() + ":" +
                                    bookProp.getChildNodes().item(0).getTextContent());
                        }
                    }  // properties
                    System.out.println("=============================");
                }
            }
        } catch (ParserConfigurationException | SAXException |IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void makeDocument() {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element root = document.createElement("company");
            document.appendChild(root);
            String[][] strings  =   {
                    {"1","100","Yong", "Mook Kim", "mkyong", "25","10000"},
                    {"2","120","Chen", "Lin Shu",  "lschen","27", "12000"}
            };

            fillDocument(document,strings[0]);
            fillDocument(document,strings[1]);


            writeDocument(document);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

    }

    public static void check() {
        makeDocument();
        System.out.println("\nRead XML Stuff Company");
        readDocument(); // прочитать из файла
    }



}
