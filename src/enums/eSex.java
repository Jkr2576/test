package enums;

/**
 * ПОЛ
 * 
 * @since (Men) - Мужчина, (Women) - Женщина, (empty) - пустой, (error) -
 *        Ошибка;
 * @author Сахончик Д.В.
 */
public enum eSex {
	/**
	 * Мужчина
	 */
	Men("М"),
	/**
	 * Женщина
	 */
	Women("Ж"),
	/**
	 * Пустой
	 */
	empty(" "),
	/**
	 * Ошибочный
	 */
	error("Ошибка");

	private String value;

	private eSex(String arg) {
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
	 * @return eSex
	 * @throws Exception
	 */

	public static eSex getEnum(String arg) throws Exception {
		if (arg.equals(empty.value))
			return eSex.empty;
		else if (arg.equals(Men.value))
			return eSex.Men;
		else if (arg.equals(Women.value))
			return eSex.Women;
		else
			return eSex.error;
	}
}
