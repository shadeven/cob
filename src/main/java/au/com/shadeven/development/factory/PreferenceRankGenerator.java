package au.com.shadeven.development.factory;

public final class PreferenceRankGenerator {

	private String name;
	private String status;

	/**
	 * Private constructor to prevent instantiation.
	 */
	private PreferenceRankGenerator(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	public static PreferenceRankGenerator newInstanceWithName(String name) {
		return new PreferenceRankGenerator(name, "");
	}

	public static PreferenceRankGenerator newInstanceWithStatus(String status) {
		return new PreferenceRankGenerator("", status);
	}
	
}
