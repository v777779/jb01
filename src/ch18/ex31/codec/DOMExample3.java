package ch18.ex31.codec;

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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class DOMExample3 {
    private static String fileIn = "./src/ch18/ex31/codec/BookCatEx.xml";


    private static void writeDocument(Document document) {
        try {
            Transformer tf = TransformerFactory.newInstance().newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");  // ВНИМАНИЕ добавляет перевод CRLF в каждую строку
            DOMSource dIn = new DOMSource(document);
            FileOutputStream fOut = new FileOutputStream(fileIn);
            StreamResult sOut = new StreamResult(fOut);
            tf.transform(dIn, sOut);
            fOut.close();
        } catch (TransformerException | IOException e) {
            throw new RuntimeException(e);

        }
    }

    public static void readBooks(Document document) {
        Node root = document.getDocumentElement();  // получить корневой узел
        System.out.println("List of books:");
        System.out.println("=============================");
        NodeList books = root.getChildNodes();
        for (int i = 0; i < books.getLength(); i++) {
            Node book = books.item(i); // получить следующий пункт
            if (book.getNodeType() != Node.TEXT_NODE) {
                NodeList bookProps = book.getChildNodes(); // свойства книжки
                for (int j = 0; j < bookProps.getLength(); j++) {
                    Node bookProp = bookProps.item(j);
                    if (bookProp.getNodeType() != Node.TEXT_NODE) {  // это не текст
                        System.out.println(bookProp.getNodeName() + ":" +
                                bookProp.getChildNodes().item(0).getTextContent());
                    }
                }  // properties
                System.out.println("=============================");
            }
        }
    }

    private static boolean getBook(String fileName, String author) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);

            Node root = document.getDocumentElement();  // получить корневой узел
            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() != Node.TEXT_NODE) {  // прогнать все книжки, если уже есть не добавлять
                    NodeList props = book.getChildNodes();
                    for (int j = 0; j < props.getLength(); j++) {
                        if (props.item(j).getTextContent().contains("Subaru")) {
                            return true;
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    private static boolean getBook(Document document, String author) {
            Node root = document.getDocumentElement();  // получить корневой узел
            if (root == null) {
                return false;
            }

            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() != Node.TEXT_NODE) {  // прогнать все книжки, если уже есть не добавлять
                    NodeList props = book.getChildNodes();
                    for (int j = 0; j < props.getLength(); j++) {
                        if (props.item(j).getTextContent().contains("Subaru")) {
                            return true;
                        }
                    }
                }
            }
        return false;
    }
    private static void addNewBook(Document document) {

        if (getBook(document, "Subaru")) {
            System.out.println("Book already added");
            return;
        }

        Node root = document.getDocumentElement();  // получить корневой узел}
        if (root == null) {
            root = document.createElement("BookCatalogue");
            document.appendChild(root);
        }

        Element book = document.createElement("Book");
        Element title = document.createElement("Title");
        title.setTextContent("Incredible book about weather");
        Element author = document.createElement("Author");
        author.setTextContent("Subaru Nikkey");
        Element date = document.createElement("Date");
        date.setTextContent("2017");
        Element isbn = document.createElement("ISBN");
        isbn.setTextContent("0-07-123654-8");
        Element publisher = document.createElement("Publisher");
        publisher.setTextContent("Willey and Sons Publisher");
        Element cost = document.createElement("Cost");
        cost.setTextContent("500");
        cost.setAttribute("currency", "RUB");

        book.appendChild(title);  // добавить компоненты в элемент book
        book.appendChild(author);
        book.appendChild(date);
        book.appendChild(isbn);
        book.appendChild(publisher);
        book.appendChild(cost);

        root.appendChild(book);  // добавить компоненты в элемент root
        writeDocument(document);
    }


    public static void check() {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document;
            if(new File(fileIn).exists()) {
                document = documentBuilder.parse(fileIn);   // если файл есть, то используем его
            }else {
                document = documentBuilder.newDocument();   // если файла нет, то создается новый
            }
            addNewBook(document);
            readBooks(document);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
