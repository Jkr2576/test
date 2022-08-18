package enums;

/**
 * Типы файлов
 * 
 * @since (TXT,VER,XML), (empty) - пустой, (error) - Ошибка;
 * @author Сахончик Д.В.
 */
public enum eTypeFile {
	/**
	 * ДПУ с личными номерами
	 */
	TXT(".txt"), //
	/**
	 * ДПУ без личных номеров
	 */
	VER(".ver"), //
	/**
	 * XML формат
	 */
	XML(".xml"), //
	/**
	 * Пустой
	 */
	empty(" "),
	/**
	 * Ошибка
	 */
	error("Ошибка");

	private String value;

	eTypeFile(String arg) {
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
	 * @return
	 * @throws Exception
	 */
	public static eTypeFile getEnum(String arg) throws Exception {
		if (arg.equals(empty.value))
			return eTypeFile.empty;
		else if (arg.equals(TXT.value.toLowerCase()))
			return eTypeFile.TXT;
		else if (arg.equals(VER.value.toLowerCase()))
			return eTypeFile.VER;
		else if (arg.equals(XML.value.toLowerCase()))
			return eTypeFile.XML;
		else
			return eTypeFile.error;
	}
}
