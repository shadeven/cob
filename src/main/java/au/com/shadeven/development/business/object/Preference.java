package au.com.shadeven.development.business.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Steven
 *
 */
public final class Preference implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7162791391249227440L;
	
	private List<PreferenceRank> preferenceRanks = new ArrayList<PreferenceRank>();
	
	public Preference() {
	}

	/**
	 * @return the preferenceRanks
	 */
	public List<PreferenceRank> getPreferenceRanks() {
		return preferenceRanks;
	}

	public void addPreferenceRank(PreferenceRank rank) {
		if (rank != null) {
			preferenceRanks.add(rank);
		}
	}

	/**
	 * @param preferenceRanks the preferenceRanks to set
	 */
	public void setPreferenceRanks(List<PreferenceRank> preferenceRanks) {
		this.preferenceRanks = preferenceRanks;
	}
	
}
