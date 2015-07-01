package au.com.shadeven.development.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class Applicant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8161155948703391553L;

	private List<Preference> preferences = new ArrayList<Preference>();

	private List<Qualification> qualifications = new ArrayList<Qualification>();
	
	public Applicant() {}

	/**
	 * @return the preferences
	 */
	public List<Preference> getPreferences() {
		return preferences;
	}

	public void addPreference(Preference preference) {
		if (preference != null) {
			preferences.add(preference);
		}
	}
	
	/**
	 * @return the qualifications
	 */
	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void addQualification(Qualification qual) {
		if (qual != null) {
			qualifications.add(qual);
		}
	}

	/**
	 * @param preferences the preferences to set
	 */
	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}

	/**
	 * @param qualifications the qualifications to set
	 */
	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	
}
