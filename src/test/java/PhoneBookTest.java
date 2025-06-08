import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {
    @Test
    public void addTest(){
        PhoneBook phoneBook = new PhoneBook();
        Assert.assertEquals(1, phoneBook.add("Joe", "89541233456"));
        Assert.assertEquals(2, phoneBook.add("Rob", "89541233457"));
        Assert.assertEquals(2, phoneBook.add("Joe", "89541233456"));
        Assert.assertEquals(3, phoneBook.add("Remo", "89541233450"));
    }
}
