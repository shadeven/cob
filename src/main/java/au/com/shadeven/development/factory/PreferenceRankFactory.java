package au.com.shadeven.development.factory;

import java.math.BigDecimal;

import au.com.shadeven.development.model.PreferenceRank;

public class PreferenceRankFactory {

	private PreferenceRankFactory() {}
	
	public static PreferenceRank newInstance() {
		PreferenceRank preferenceRank = new PreferenceRank();
		preferenceRank.setRank(BigDecimal.ONE);
		return preferenceRank;
	}
}
