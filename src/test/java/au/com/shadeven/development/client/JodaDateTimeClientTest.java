package au.com.shadeven.development.client;

import static org.junit.Assert.*;

import org.junit.Test;

public class JodaDateTimeClientTest {

	@Test
	public void testGetDate() {
		JodaDateTimeClient client = new JodaDateTimeClient();
		assertNotNull(client.getDate());
		System.out.printf("date: %s", client.getDate());
	}

}
