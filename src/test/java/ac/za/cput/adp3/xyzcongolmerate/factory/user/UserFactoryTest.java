package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    User user = UserFactory.buildUser("abc@123.com","Michael","Thomas");
    @Test
    public void buildUser() {
        Assert.assertNotNull(user);
        Assert.assertEquals("Michael",user.getFirstName());
    }
}