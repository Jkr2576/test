package types;

import enums.eIndicators;
import enums.eVIDD;

public class Indicators {
	/**
	 * Доп. свед.: Показатель / Часы
	 */
	public String indicator1;
	/**
	 * Доп. свед.: Раб. неделя (в днях) / Минуты
	 */
	public String indicator2;
	/**
	 * Тип показателя
	 */
	public eIndicators type;

	// ==============================================================================
	/**
	 * Конструктор Класса для Показателей СТАЖА
	 * 
	 * @param arg1
	 *            - показатель 1
	 * @param arg2
	 *            - показатель 1
	 * @param okpd
	 *            - ОКПД
	 * @param vidd
	 *            - Вид деятельности
	 */
	public Indicators(String arg1, String arg2, String okpd, eVIDD vidd) {
		this.indicator1 = arg1;
		this.indicator2 = arg2;
		this.type = eIndicators.getEnum(okpd, vidd);
	}

}
