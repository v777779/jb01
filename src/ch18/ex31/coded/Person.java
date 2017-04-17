package ch18.ex31.coded;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class Person {
    private String first, last;
    private static Document doc;  // документ для всего класса

    static {
        getDoc(); // создать пустой документ
    }

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Person(Element person) {  // восстановить из XML файла
        Node pFirst = person.getElementsByTagName("first").item(0);
        Node pLast = person.getElementsByTagName("first").item(0);
        this.first = pFirst.getTextContent();
        this.last = pLast.getTextContent();
    }

    public Element getXML() {
        Element person = doc.createElement("person");
        Element firstName = doc.createElement("first");
        firstName.appendChild(doc.createTextNode(first));
        Element lastName = doc.createElement("last");
        lastName.appendChild(doc.createTextNode(last));

        person.appendChild(firstName);
        person.appendChild(lastName);
        return person;
    }

    public void addPerson() {
        Element root = doc.getDocumentElement();
        root.appendChild(getXML());
    }

    public static void format(String fileName) {  // запись XML файла
        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");  // ВНИМАНИЕ добавляет перевод CRLF в каждую строку
            DOMSource dIn = new DOMSource(doc);
            FileOutputStream fOut = new FileOutputStream(fileName);
            StreamResult sOut = new StreamResult(fOut);
            tf.transform(dIn, sOut);
            fOut.close();
        } catch (TransformerException | IOException e) {
            throw new RuntimeException(e);

        }
    }

    public static void readXML(String fileName) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);   // если файла нет, то создается новый

            Element root = document.getDocumentElement();
            NodeList people = root.getChildNodes();
            System.out.println("-----------------------");
            for (int i = 0; i < people.getLength(); i++) {
                Node person = people.item(i); // получить следующий пункт
                if (person.getNodeType() != Node.TEXT_NODE) {
                    NodeList props = person.getChildNodes(); // свойства книжки
                    for (int j = 0; j < props.getLength(); j++) {
                        Node prop = props.item(j);
                        if (prop.getNodeType() != Node.TEXT_NODE) {  // это не текст
                            System.out.println(prop.getNodeName() + ":" +
                                    prop.getChildNodes().item(0).getTextContent());
                        }
                    }  // properties
                    System.out.println("-----------------------");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getDoc() {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document;
            document = documentBuilder.newDocument();   // если файла нет, то создается новый
            Element root = document.createElement("people");
            document.appendChild(root);
            doc = document;

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getDoc(String fileName) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);   // если файла нет, то создается новый
            doc = document;

        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static List<Person> restore(String fileName) {
        List<Person> list = new ArrayList<>();
        getDoc(fileName); //  активировать документ
        Element root = doc.getDocumentElement();
//        NodeList people = root.getChildNodes();
//                System.out.println(j + " n:" + p.getNodeName() + " v:" + p.getNodeValue() + " t:" +
//                        p.getTextContent() + " f:" + p.getFirstChild() + " l:" + p.getLastChild());
//            }
        NodeList people = root.getElementsByTagName("person");
        for (int i = 0; i < people.getLength(); i++) {
//            NodeList pFirst = ((Element) people.item(i)).getElementsByTagName("first");
//            NodeList pLast = ((Element) people.item(i)).getElementsByTagName("last");
//            list.add(new Person(pFirst.item(0).getTextContent(),pLast.item(0).getTextContent()));
            list.add(new Person((Element) people.item(i)));

        }
        return list;
    }


    @Override
    public String toString() {
        return first + " " + last;
    }
}



//    public static List<Person> restore(String fileName) {
//        List<Person> list = new ArrayList<>();
//
//        getDoc(fileName); //  активировать документ
//        Element root = doc.getDocumentElement();
//
////        NodeList people = root.getChildNodes();
//
//        NodeList people = root.getElementsByTagName("person");
//        for (int i = 0; i < people.getLength(); i++) {
//            NodeList p2 = ((Element) people.item(i)).getElementsByTagName("first");
//            NodeList p3 = ((Element) people.item(i)).getElementsByTagName("last");
//            list.add(new Person(p2.item(0).getTextContent(),p3.item(0).getTextContent()));
//
////            String firstName = p2.item(0).getFirstChild().getNodeValue();
////            String lastName = p3.item(0).getFirstChild().getNodeValue();
////            list.add(new Person(firstName, lastName));
//
////            NodeList person = people.item(i).getChildNodes();
////            for (int j = 0; j < person.getLength(); j++) {
////                Node p = person.item(j);
////                String first, last;
////                if (p.getNodeName().equals("first")) {
////                    first = p.getNodeValue();
////                }
////                if (p.getNodeName().equals("last")) {
////                    last = p.getNodeValue();
////                }
////                System.out.println(j + " n:" + p.getNodeName() + " v:" + p.getNodeValue() + " t:" +
////                        p.getTextContent() + " f:" + p.getFirstChild() + " l:" + p.getLastChild());
////            }
//
//
//        }
//
//        return list;
//    }
