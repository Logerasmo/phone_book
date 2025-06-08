import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PhoneBookTest {
    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();
        Assert.assertEquals(1, phoneBook.add("Joe", "89541233456"));
        Assert.assertEquals(2, phoneBook.add("Rob", "89541233457"));
        Assert.assertEquals(2, phoneBook.add("Joe", "89541233456"));
        Assert.assertEquals(3, phoneBook.add("Remo", "89541233450"));
    }
    @Test
    public void findByNumberTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Joe", "89541233456");
        phoneBook.add("Bob", "89541233457");
        phoneBook.add("Rob", "89541233455");
        Assert.assertEquals("Joe", phoneBook.findByNumber("89541233456"));
        Assert.assertEquals("Bob", phoneBook.findByNumber("89541233457"));
        Assert.assertEquals("Rob", phoneBook.findByNumber("89541233455"));
    }
    @Test
    public void findByNameTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Joe", "89541233456");
        phoneBook.add("Bob", "89541233457");
        phoneBook.add("Rob", "89541233455");
        Assert.assertEquals("89541233456", phoneBook.findByName("Joe"));
        Assert.assertEquals("89541233457", phoneBook.findByName("Bob"));
        Assert.assertEquals("89541233455", phoneBook.findByName("Rob"));
    }

    @Test
    public void printAllNamesTest(){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Joe", "89541233456");
        phoneBook.add("Bob", "89541233457");
        phoneBook.add("Rob", "89541233455");
        phoneBook.printAllNames();
        String expected = "Bob" + System.lineSeparator()
                + "Joe" + System.lineSeparator()
                + "Rob" + System.lineSeparator();
        Assert.assertEquals(expected, byteArrayOutputStream.toString());

    }
}
