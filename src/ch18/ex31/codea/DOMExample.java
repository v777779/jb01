package ch18.ex31.codea;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class DOMExample {
    public static void check() {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("./src/ch18/ex31/codea/BookCat.xml");
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
                            System.out.println(bookProp.getNodeName()+":"+
                                    bookProp.getChildNodes().item(0).getTextContent());
                        }
                    }  // properties
                    System.out.println("=============================");
                }
            }

        } catch (ParserConfigurationException e) {
            //throw new RuntimeException(e);
        } catch (SAXException e) {
            //throw new RuntimeException(e);
        } catch (IOException e) {
            //throw new RuntimeException(e);
        }
    }
}
