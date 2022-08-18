package enums;

/**
 * Типы форм
 * 
 * @since (Base) - Исходная /Регистрация, (Correction) - Корректирующая /
 *        Изменение, (Cancel) - Отменяющая, (Pension) - Начисление пенсии,
 *        (Recovery) - Восстановление, (empty) - пустой, (error) - Ошибка;
 * @author Сахончик Д.В.
 */
public enum eFormType {
	/**
	 * Исходная /Регистрация
	 */
	Base,
	/**
	 * Корректирующая / Изменение
	 */
	Correction,
	/**
	 * Отменяющая
	 */
	Cancel,
	/**
	 * Начисление пенсии
	 */
	Pension,
	/**
	 * Восстановление
	 */
	Recovery,
	/**
	 * Пустой
	 */
	empty,
	/**
	 * Ошибочный
	 */
	error;

	private static eTypeDoc type;

	@Override
	public String toString() {
		switch (this) {
		case Base:
			switch (type) {
			case PU1:
				return "Регистрация";
			default:
				return "Исходная";
			}
		case Correction:
			switch (type) {
			case PU1:
				return "Изменение";
			default:
				return "Корректирующая";
			}
		case Cancel:
			return "Отменяющая";
		case Pension:
			return "Начисление пенсии";
		case Recovery:
			return "Восстановление";
		case empty:
			return "Пустой";
		case error:
			return "Ошибочный";
		default:
			return null;
		}
	}

	/**
	 * Получение массива реквизитов
	 * 
	 * @param arg
	 * @param typeDoc
	 * @return eFormType
	 */
	public static eFormType getEnum(String arg, eTypeDoc typeDoc)
			throws Exception {
		type = typeDoc;
		if (arg.equals(" "))
			return eFormType.empty;
		else
			switch (typeDoc) {
			case PU1: // { "Р", "И", "В" }
				if (arg.equals("Р"))
					return eFormType.Base;
				else if (arg.equals("И"))
					return eFormType.Correction;
				else if (arg.equals("В"))
					return eFormType.Recovery;
				else
					return eFormType.error;

			case PU2: // { "И", "К", "О" }
				if (arg.equals("И"))
					return eFormType.Base;
				else if (arg.equals("К"))
					return eFormType.Correction;
				else if (arg.equals("О"))
					return eFormType.Cancel;
				else
					return eFormType.error;
			case PU3: // { "И", "К", "О", "П" }
			case PU6:
				if (arg.equals("И"))
					return eFormType.Base;
				else if (arg.equals("К"))
					return eFormType.Correction;
				else if (arg.equals("О"))
					return eFormType.Cancel;
				else if (arg.equals("П"))
					return eFormType.Pension;
				else
					return eFormType.error;
			default:
				return eFormType.error;
			}
	}

}
