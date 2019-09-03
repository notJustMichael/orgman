package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    Role role = RoleFactory.buildRole("Manager");
    Organisation organisation = OrganisationFactory.buildOrganisation("Professional");
    UserRole userRole = UserRoleFactory.buildUserRole(organisation.getOrgCode(),"123@abc.com",role.getRoleId());
    @Test
    public void buildUserRole() {
        Assert.assertNotNull(role);
        Assert.assertNotNull(organisation);
        Assert.assertNotNull(userRole);
        Assert.assertNotEquals("OF-6b429e6e-237c-4ea9-8399-9b25feb70aed",userRole.getRoleId());
        Assert.assertNotEquals("RF-6b429e6e-237c-4ea9-8399-9b25feb70aed",userRole.getOrgCode());
    }
}