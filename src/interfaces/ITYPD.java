package interfaces;

public interface ITYPD {
	/**
	 * Тип записи = {@value}
	 */
	String type = "ТИПД";

	/**
	 * Типы документов = "ПУ-1", "ПУ-2", "ПУ-3", "ПУ-6", "ДПЧ"
	 */
	String[] typeDoc = new String[] { "ПУ-1", "ПУ-2", "ПУ-3", "ПУ-6", "ДПЧ" };

	/**
	 * Кол-во реквизитов = {@value}
	 */
	byte count = 6;

	/**
	 * Реквизиты которые обязательны к заполнению
	 */
	final String[] enterRecvDefault = new String[] {
			/* 0 */"+", // Тип записи
			/* 1 */"+", // Код формы (тип ЭД)
			/* 2 */"+", // Число док. данного типа в пачке
			/* 3 */"-", // Сумма выплат по пачке
			/* 4 */"-", // Сумма пособий/взносов по пачке
			/* 5 */"+"}; //Сумма страховых/уплаченых взносов по пачке 

}