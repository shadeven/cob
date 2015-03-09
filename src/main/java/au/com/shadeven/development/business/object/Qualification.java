/**
 * 
 */
package au.com.shadeven.development.business.object;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Steven
 *
 */
public final class Qualification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6338329389630032377L;

	/* Immutable */
	private final String name;
	/* Mutable */
	private final Date startDate; 
	/* Mutable */
	private List<BigDecimal> scores = new ArrayList<BigDecimal>();
	
	private Qualification(QualificationBuilder builder) {
		this.name = builder.name;
		this.startDate = builder.startDate;
		this.scores = builder.scores; // TODO: Make defensive copy
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Since Date is mutable, make defensive copy then return the date object. 
	 * 
	 * @return the startDate
	 */
	public Date getStartDate() {
		return new Date(startDate.getTime());
	}

	/**
	 * Since List is mutable, make defensive copy then return the list. 
	 * 
	 * @return the scores
	 */
	public List<BigDecimal> getScores() {
		return Collections.unmodifiableList(scores);
	}

	public static class QualificationBuilder {
		private String name;
		private Date startDate;
		private List<BigDecimal> scores;
		
		public QualificationBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public QualificationBuilder startDate(Date date) {
			this.startDate = date;
			return this;
		}
		
		public QualificationBuilder scores(List<BigDecimal> scores) {
			this.scores = scores == null ? new ArrayList<BigDecimal>() : scores;
			return this;
		}
		
		public Qualification build() {
			return new Qualification(this);
		}
	}
	
}
