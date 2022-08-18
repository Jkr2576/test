package enums;

/**
 * Гражданство
 * 
 * @since (citizen) - Гражданин РБ, (NOTcitizen) - Не гражданин РБ, (empty) -
 *        пустой, (error) - Ошибка;
 * @author Сахончик Д.В.
 */
public enum eNational {
	/**
	 * Гражданин РБ
	 */
	citizen("Гражданин РБ"),
	/**
	 * Не гражданин РБ
	 */
	NOTcitizen("Не гражданин РБ"),
	/**
	 * Пустой
	 */
	empty(" "),
	/**
	 * Ошибочный
	 */
	error("Ошибка");

	private String value;

	private eNational(String arg) {
		value = arg;
	};

	@Override
	public String toString() {
		return value;
	}

	/**
	 * Получение массива реквизитов
	 * 
	 * @param arg
	 * @return eNational
	 * @throws Exception
	 */
	public static eNational getEnum(String arg) throws Exception {
		if (arg.equals(empty.value))
			return eNational.empty;
		else if (arg.equals("1"))
			return eNational.citizen;
		else if (arg.equals("0"))
			return eNational.NOTcitizen;
		else
			return eNational.error;
	}
}
