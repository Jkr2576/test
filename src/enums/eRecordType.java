package enums;

import interfaces.IDPCH;
import interfaces.IDVIG;
import interfaces.INCHSL;
import interfaces.IPACH;
import interfaces.IPU1;
import interfaces.IPU2;
import interfaces.IPU3;
import interfaces.IPU6;
import interfaces.ISTAJ;
import interfaces.ITYPD;
import interfaces.IZGLV;

/**
 * Типы записей
 * 
 * @since (ZGLV) - Заголовок, (PACH) - Пачка, (TYPD) - Тип данных, (PU1) - ПУ-1,
 *        (PU2) - ПУ-2, (PU3) - ПУ-3, (PU6) - ПУ-6, (DVIG) - Движение, (NCHSL) -
 *        Начисление, (STAJ) - Стаж, (DPCH) - ДПЧ, (PZ3) - ПЗ-3, (PZ6) - ПЗ-6,
 *        (empty) - пустой, (error) - Ошибка;
 * @author Сахончик Д.В.
 */
public enum eRecordType {
	/**
	 * Заголовок
	 */
	ZGLV(IZGLV.type),
	/**
	 * Пачка
	 */
	PACH(IPACH.type),
	/**
	 * Тип данных
	 */
	TYPD(ITYPD.type),
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
	 * Движение
	 */
	DVIG(IDVIG.type),
	/**
	 * Начисление
	 */
	NCHSL(INCHSL.type),
	/**
	 * Стаж
	 */
	STAJ(ISTAJ.type),
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
	 * Любой другой
	 */
	error("Ошибка");

	private String value;

	eRecordType(String arg) {
		value = arg;
	};

	@Override
	public String toString() {
		return value;
	}

	/**
	 * Получение массива реквизитов из файла
	 * 
	 * @param arg
	 * @return eRecordType
	 * @throws Exception
	 */
	public static eRecordType getEnum(String arg) throws Exception {
		if (arg.equals(ZGLV.value))
			return eRecordType.ZGLV;
		else if (arg.equals(PACH.value))
			return eRecordType.PACH;
		else if (arg.equals(TYPD.value))
			return eRecordType.TYPD;
		else if (arg.equals(PU1.value))
			return eRecordType.PU1;
		else if (arg.equals(PU2.value))
			return eRecordType.PU2;
		else if (arg.equals(PU3.value))
			return eRecordType.PU3;
		else if (arg.equals(PU6.value))
			return eRecordType.PU6;
		else if (arg.equals(DVIG.value))
			return eRecordType.DVIG;
		else if (arg.equals(NCHSL.value))
			return eRecordType.NCHSL;
		else if (arg.equals(STAJ.value))
			return eRecordType.STAJ;
		else if (arg.equals(DPCH.value))
			return eRecordType.DPCH;
		else if (arg.equals("ПЗ-3"))
			return eRecordType.PZ3;
		else if (arg.equals("ПЗ-6"))
			return eRecordType.PZ6;
		else
			return eRecordType.error;
	}

}
