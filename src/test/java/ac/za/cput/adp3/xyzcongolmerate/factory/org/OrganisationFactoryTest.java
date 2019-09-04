package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    Organisation organisation = OrganisationFactory.buildOrganisation("XYZ Conglomerate");
    @Test
    public void buildOrganisation() {
        Assert.assertNotNull(organisation);
        Assert.assertNotNull(gender.getOrgCode());
        Assert.assertNotEquals("ABC Group", organisation.getOrgName());
    }
}
