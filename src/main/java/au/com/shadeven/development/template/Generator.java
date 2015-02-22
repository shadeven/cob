package au.com.shadeven.development.template;

public interface Generator {

	/**
	 * 
	 * 
	 * @param qualification
	 * @param preference
	 * @return
	 */
	PreferenceRank generate(Qualification qualification, Preference preference);

}
