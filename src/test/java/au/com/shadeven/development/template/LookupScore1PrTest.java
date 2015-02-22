package au.com.shadeven.development.template;

import static org.junit.Assert.*;

import org.junit.Test;

public class LookupScore1PrTest {

	@Test
	public final void testGenerate() {
		// Arrange
		LookupScore1Pr generator = new LookupScore1Pr();
		
		// Act
		PreferenceRank pr = generator.generate(null, null);
		
		// Assert
		assertNotNull("Error: pr should be not null.", pr);
	}

}
