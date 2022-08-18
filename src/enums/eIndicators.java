package enums;

import java.util.EnumSet;

/**
 * Типы показателей
 * 
 * @since (K01..K16, K20, K21), (empty) - пустой, (error) - Ошибка;
 * @author Сахончик Д.В.
 */
public enum eIndicators {
	/**
	 * НЗ
	 */
	H3("НЗ"),
	/**
	 * Налет часы
	 */
	H4("НЧ"),
	/**
	 * Дни недели
	 */
	DN("ДН"),
	/**
	 * Другой
	 */
	over("Другой");

	private String value;

	eIndicators(String arg) {
		value = arg;
	};

	@Override
	public String toString() {
		return value;
	}

	/**
	 * Получение массива реквизитов
	 * 
	 * @param okpd - ОКПД
	 * @param vidd - Вид деятельности
	 * @return eIndicators
	 */
	public static eIndicators getEnum(String okpd, eVIDD vidd) {
		if (includeH3(okpd, vidd))
			return eIndicators.H3;
		else if (includeH4(okpd, vidd))
			return eIndicators.H4;
		else if (includeDN(vidd))
			return eIndicators.DN;
		else
			return eIndicators.over;
	}

	// ==============================================================================
	/**
	 * Входит ли вид деятельности в НЗ
	 * 
	 * @param staj
	 *            - запись стажа;
	 */
	// ==============================================================================
	public static boolean includeH3(String okpd, eVIDD vidd) {
		// [2..7,10..12,31..39,41,54..58], //НЗ - [1] (11465) {8,33}
		EnumSet<eVIDD> set = EnumSet.of(eVIDD.VD2, eVIDD.VD3, eVIDD.VD4,
				eVIDD.VD5, eVIDD.VD6, eVIDD.VD7, eVIDD.VD10, eVIDD.VD11,
				eVIDD.VD12, eVIDD.VD31, eVIDD.VD32, eVIDD.VD33, eVIDD.VD34,
				eVIDD.VD35, eVIDD.VD36, eVIDD.VD37, eVIDD.VD38, eVIDD.VD39,
				eVIDD.VD41, eVIDD.VD54, eVIDD.VD55, eVIDD.VD56, eVIDD.VD57,
				eVIDD.VD58);
		if (!okpd.equals("11465"))
			set.add(eVIDD.VD1);
		return set.contains(vidd);
	}

	// ==============================================================================
	/**
	 * Входит ли вид деятельности в НЧ
	 * 
	 * @param staj
	 *            - запись стажа;
	 */
	// ==============================================================================
	public static boolean includeH4(String okpd, eVIDD vidd) {
		// [14,16..18,20,22,23,9,33], //НЧ + [1] (11465)
		EnumSet<eVIDD> set = EnumSet.of(eVIDD.VD9, eVIDD.VD14, eVIDD.VD16,
				eVIDD.VD17, eVIDD.VD18, eVIDD.VD20, eVIDD.VD22, eVIDD.VD23,
				eVIDD.VD33);
		if (okpd.equals("11465"))
			set.add(eVIDD.VD1);
		return set.contains(vidd);
	}

	// ==============================================================================
	/**
	 * Входит ли вид деятельности в ДН
	 * 
	 * @param staj
	 *            - запись стажа;
	 */
	// ==============================================================================
	public static boolean includeDN(eVIDD vidd) {
		// [8,43,45,47,52,53]); //ДН
		EnumSet<eVIDD> set = EnumSet.of(eVIDD.VD8, eVIDD.VD45, eVIDD.VD47,
				eVIDD.VD52, eVIDD.VD53);
		return set.contains(vidd);
	}

}
