package au.com.shadeven.development.model;

import java.io.Serializable;

/**
 * @author Steven Wu
 *
 */
public final class ApplicantSummary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 983586355307216897L;
	private String name;
	private String referenceNumber;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}
	
	/**
	 * @param referenceNumber the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
}
