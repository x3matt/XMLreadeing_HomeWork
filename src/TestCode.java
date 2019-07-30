import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCode {
    @Test
    public void makePersonListByXMLFileTest() throws Exception {
    List<Person> result = Arrays.asList(
            //"Persons.xml"
            new Person("Ivan","male",new Address(35,"Banhofstrasse")),
            new Person("Maria","female",new Address(17,"Friedrichstrasse"))
    );
    assertEquals(result,Main.makePersonListByXMLFile("Persons.xml"));
    }
}
