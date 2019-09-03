package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    Gender gender = GenderFactory.buildGender("Amphibious");
    Race race = RaceFactory.buildRace("Trump Orange");
    User user = UserFactory.buildUser("123@abc.com","John","Connor");
    Date date = new Date(1990,12,29);

    UserDemography userDemography = UserDemographyFactory.buildUserDemography(user.getUserEmail(),user.getFirstName(),gender.getGenderId(),race.getRaceId(),date);
    @Test
    public void buildUserDemography() {
        Assert.assertNotNull(userDemography);
        Assert.assertNotNull(userDemography.getUserEmail());
        Assert.assertNotNull(userDemography.getUserTitle());
        Assert.assertNotNull(userDemography.getDateOfBirth());
        Assert.assertNotEquals(new Date(),userDemography.getDateOfBirth());

    }
}