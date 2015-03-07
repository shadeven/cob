package au.com.shadeven.development.template;

import au.com.shadeven.development.business.object.Preference;
import au.com.shadeven.development.business.object.PreferenceRank;
import au.com.shadeven.development.business.object.Qualification;

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
