package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    Role role = RoleFactory.buildRole("Scrub");
    @Test
    public void buildRole() {
        Assert.assertNotNull(role.getRoleId());
        Assert.assertEquals("Scrub",role.getRoleName());
    }
}