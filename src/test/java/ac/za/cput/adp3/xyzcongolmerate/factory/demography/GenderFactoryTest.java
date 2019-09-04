package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    Gender gender = GenderFactory.buildGender("Trans Fluid Non Binary");

    @Test
    public void buildGender() {
        Assert.assertNotNull(gender);
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertEquals("Trans Fluid Non Binary",gender.getGenderDescription());
    }
}
