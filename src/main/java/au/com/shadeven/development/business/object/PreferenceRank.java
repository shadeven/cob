/**
 * 
 */
package au.com.shadeven.development.business.object;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Steven
 *
 */
public final class PreferenceRank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8553980409123767376L;
	
	private BigDecimal rank;

	/**
	 * @return the rank
	 */
	public BigDecimal getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}
}
