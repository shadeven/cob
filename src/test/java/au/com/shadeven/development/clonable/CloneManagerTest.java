//package au.com.shadeven.development.clonable;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//import java.math.BigDecimal;
//import java.util.Arrays;
//import java.util.Date;
//
//import org.junit.Test;
//
//import au.com.shadeven.development.model.Applicant;
//import au.com.shadeven.development.model.Preference;
//import au.com.shadeven.development.model.Qualification;
//
//public class CloneManagerTest {
//
//	@Test
//	public final void testDeepClone() {
//		// Arrange
//		Applicant applicant = setup();
//
//		// Act
//		Applicant clonedApplicant = CloneManager.deepClone(applicant);
//
//		// Assert
//		assertFalse("Error: the clone object and original object should be two differnt objects.",
//				applicant.equals(clonedApplicant));
//		assertFalse("Error!", applicant.getPreferences().get(0).equals(clonedApplicant.getPreferences().get(0)));
//		assertFalse("Error!", applicant.getQualifications().get(0).equals(clonedApplicant.getQualifications().get(0)));
//	}
//
//	@Test
//	public final void testShallowClone() {
//		// Arrange
//		Applicant applicant = setup();
//
//		// Act
//		Applicant clonedApplicant = CloneManager.shallowClone(applicant);
//
//		// Assert
//		assertFalse("Error: the clone object and original object should be two differnt objects.",
//				applicant.equals(clonedApplicant));
//		assertTrue("Error", applicant.getPreferences().get(0).equals(clonedApplicant.getPreferences().get(0)));
//		assertTrue("Error", applicant.getQualifications().get(0).equals(clonedApplicant.getQualifications().get(0)));
//	}
//
//	private Applicant setup() {
//		Preference preference = new Preference();
//		Qualification qualification = new Qualification.QualificationBuilder()
//				.name("Bachelor of arts").startDate(new Date())
//				.scores(Arrays.asList(BigDecimal.ZERO, BigDecimal.ONE)).build();
//
//		qualification.getScores().add(BigDecimal.TEN);
//
//		Applicant applicant = new Applicant();
//		applicant.addPreference(preference);
//		applicant.addQualification(qualification);
//		return applicant;
//	}
//
//}
