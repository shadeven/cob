package au.com.shadeven.development.template;

import au.com.shadeven.development.model.Preference;
import au.com.shadeven.development.model.PreferenceRank;
import au.com.shadeven.development.model.Qualification;

/**
 * The Class AbstractPreferenceRankGenerator.
 *
 * @author Steven
 */
abstract class AbstractPreferenceRankGenerator implements Generator {

	/**
	 * The abstract method to be implemented by subclass.
	 *
	 * @return the preference rank
	 */
	abstract PreferenceRank build();

	/**
	 * The method is created to be overridden by subclass only if it is
	 * required.
	 *
	 * @param pr
	 *            the pr
	 * @return the preference rank
	 */
	PreferenceRank hook(PreferenceRank pr) {
		return pr;
	}

	public PreferenceRank generate(Qualification qualification, Preference preference) {
		return hook(build());
	}

}
