package enums;

import interfaces.IDPCH;
import interfaces.IPU1;
import interfaces.IPU2;
import interfaces.IPU3;
import interfaces.IPU6;

/**
 * Типы документов
 * 
 * @since (PU1) - ПУ-1, (PU2) - ПУ-2, (PU3) - ПУ-3, (PU6) - ПУ-6, (DPCH) - ДПЧ,
 *        (PZ3) - ПЗ-3, (PZ6) - ПЗ-6, (empty) - пустой, (error) - Ошибка;
 * @author Сахончик Д.В.
 */
public enum eTypeDoc {
	/**
	 * Анкета
	 */
	PU1(IPU1.type),
	/**
	 * Сведения о приёме увольнении
	 */
	PU2(IPU2.type),
	/**
	 * Индивидуальные сведения
	 */
	PU3(IPU3.type),
	/**
	 * Профессиональные пенсии
	 */
	PU6(IPU6.type),
	/**
	 * ДПЧ
	 */
	DPCH(IDPCH.type),
	/**
	 * Пояснительная записка к ПУ-3
	 */
	PZ3("ПЗ-3"),
	/**
	 * Пояснительная записка к ПУ-6
	 */
	PZ6("ПЗ-6"),
	/**
	 * Пустой
	 */
	empty(" "),
	/**
	 * Ошибочный
	 */
	error("Ошибка");

	private String value;

	private eTypeDoc(String arg) {
		value = arg;
	}

	@Override
	public String toString() {
		return value;
	}

	/**
	 * Получения массива реквизитов из файла
	 * 
	 * @param arg
	 * @return
	 * @throws Exception
	 */
	public static eTypeDoc getEnum(String arg) throws Exception {
		if (arg.equals(empty.value))
			return eTypeDoc.empty;
		else if (arg.equals(PU1.value))
			return eTypeDoc.PU1;
		else if (arg.equals(PU2.value))
			return eTypeDoc.PU2;
		else if (arg.equals(PU3.value))
			return eTypeDoc.PU3;
		else if (arg.equals(PU6.value))
			return eTypeDoc.PU6;
		else if (arg.equals(DPCH.value))
			return eTypeDoc.DPCH;
		else if (arg.equals(PZ3.value))
			return eTypeDoc.PZ3;
		else if (arg.equals(PZ6.value))
			return eTypeDoc.PZ6;
		else
			return eTypeDoc.error;
	}

}
