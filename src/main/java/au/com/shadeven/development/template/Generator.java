package au.com.shadeven.development.template;

import au.com.shadeven.development.model.Preference;
import au.com.shadeven.development.model.PreferenceRank;
import au.com.shadeven.development.model.Qualification;

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
