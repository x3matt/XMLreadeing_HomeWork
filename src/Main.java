import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println(makePersonListByXMLFile("Persons.xml"));
    }
    public static List<Person> makePersonListByXMLFile(String fileName) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(fileName));
        doc.getDocumentElement().normalize();
        NodeList list = doc.getElementsByTagName("person");
        List<Person> personList = new ArrayList<>();
        for (int i=0;i < list.getLength();i++){
            Element element = (Element)list.item(i);
            personList.add(new Person(
                     element.getElementsByTagName("name").item(0).getTextContent()
                    ,element.getElementsByTagName("gender").item(0).getTextContent()
                    ,new Address(
                           Integer.valueOf( element.getElementsByTagName("house_number").item(0).getTextContent()),
                            element.getElementsByTagName("street").item(0).getTextContent())));
        }
        return personList;
    }
}
