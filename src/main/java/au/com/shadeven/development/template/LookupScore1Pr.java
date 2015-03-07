package au.com.shadeven.development.template;

import java.math.BigDecimal;

import au.com.shadeven.development.business.object.PreferenceRank;

/**
 * @author Steven
 *
 */
final class LookupScore1Pr extends AbstractPreferenceRankGenerator {

	@Override
	PreferenceRank build() {
		PreferenceRank pr = new PreferenceRank();
		pr.setRank(BigDecimal.ONE);
		return pr;
	}

	@Override
	PreferenceRank hook(PreferenceRank pr) {
		if (pr != null && pr.getRank() != null) {
			if (pr.getRank().compareTo(BigDecimal.ZERO) > 0) {
				pr.setRank(BigDecimal.TEN);
			}
		}
		return pr;
	}

}
