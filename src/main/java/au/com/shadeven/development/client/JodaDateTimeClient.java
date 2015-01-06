package au.com.shadeven.development.client;

import java.util.Date;

import org.joda.time.DateTime;

final class JodaDateTimeClient {

	public Date getDate() {
		DateTime date = new DateTime(1980, 1, 27, 0, 0);
		return date.toDate();
	}
}
