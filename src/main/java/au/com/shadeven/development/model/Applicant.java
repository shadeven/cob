package au.com.shadeven.development.model;

import java.util.ArrayList;
import java.util.List;

public class Applicant {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8161155948703391553L;

	private String id;

	private List<Preference> pref = new ArrayList<Preference>();

	private List<Qualification> qualifications = new ArrayList<Qualification>();
	
	public Applicant() {}

	/**
	 * @return the preferences
	 */
	public List<Preference> getPreferences() {
		return pref;
	}

	public void addPreference(Preference preference) {
		if (preference != null) {
			pref.add(preference);
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
		this.pref = preferences;
	}

	/**
	 * @param qualifications the qualifications to set
	 */
	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
