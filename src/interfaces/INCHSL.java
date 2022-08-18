package interfaces;

public interface INCHSL {
	/**
	 *  Тип записи = {@value}
	 */
	String type = "НЧСЛ";
	
	/**
	 *  Кол-во реквизитов = {@value}
	 */
	byte count = 6;
	
	/**
	 * Реквизиты которые обязательны к заполнению
	 */
	 final String[] enterRecvDefault = new String[] {
	/* 0 */"+", // Тип записи
			/* 1 */"+", // Номер месяца
			/* 2 */null, // Выплаты
			/* 3 */null, // Взносов
			/* 4 */null, // Уплачено взносов
			/* 5 */"+"}; // Тариф
}
