package au.com.shadeven.development.template;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import au.com.shadeven.development.model.PreferenceRank;

public class LookupScore1PrTest {

	@Test
	public final void testGenerate() {
		// Arrange
		LookupScore1Pr generator = new LookupScore1Pr();
		
		// Act
		PreferenceRank pr = generator.generate(null, null);
		boolean outcome = NumberUtils.isNumber("4.5");
		
		// Assert
		assertThat(pr, notNullValue());
		assertThat(outcome, equalTo(true));
	}
	
	@Test
	public final void testCollectionWithAssertThat() {
		// Arrange
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		String beforeSerialization = "343435wfsdfdsfdt2343";
		byte[] byteArray = SerializationUtils.serialize(beforeSerialization);
		Object afterSerialization = SerializationUtils.deserialize(byteArray);
		
		// Assert
		assertThat(beforeSerialization, equalTo(afterSerialization));
		assertThat(list.isEmpty(), equalTo(false));
		assertThat(list, hasItem("a"));
		assertThat(list, not(hasItem("d")));
	}

}
