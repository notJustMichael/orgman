package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    Organisation org = OrganisationFactory.buildOrganisation("Radnom Ogre");
    User user = UserFactory.buildUser("abc@123.com","Michael","Thomas");
    OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser(org.getOrgCode(),user.getUserEmail());
    @Test
    public void buildOrganisationUser() {
        Assert.assertNotNull(user);
        Assert.assertNotNull(org);
        Assert.assertNotNull(orgUser);
        Assert.assertEquals(org.getOrgCode(),orgUser.getOrgCode());
    }
}