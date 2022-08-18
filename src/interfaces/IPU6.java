package interfaces;

public interface IPU6 {
	
	/**
	 *  Тип записи
	 */
	String type = "ПУ-6";
	
	/**
	 *  Типы форм
	 */
	String[] formType = new String[] { "И", "К", "О", "П" };
	
	/**
	 *  Кол-во реквизитов
	 */
	byte count = 21;
	
	/**
	 * Наименование реквизитов
	 */
	public final static String[] info = new String[] { "Тип записи",
			"Тип формы", "Учетный номер плательщика (в органе Фонда)",
			"Страховой номер", "Фамилия", "Инициалы: Имя",
			"Инициалы: Отчество", "Отчетный период: Начало",
			"Отчетный период: Окончание", "Итого: Выплат", "Итого: Взносов",
			"Итого: Уплачено взносов", "Число записей о начислениях",
			"Число записей о стаже", "Дата заполнения", "Кварталы", "Год",
			"Телефон бухгалтерии" };
}