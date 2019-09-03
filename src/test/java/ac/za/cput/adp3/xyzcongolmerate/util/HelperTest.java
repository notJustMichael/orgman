package ac.za.cput.adp3.xyzcongolmerate.util;


import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class HelperTest {


    @Test
    public void getSuffixFromClassName() {
        Assert.assertEquals("GF",Helper.getSuffixFromClassName(GenderFactory.class));
    }
}
