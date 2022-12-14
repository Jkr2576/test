package interfaces;

/**
 * Инерфейс для реквизитов ПУ-1
 * 
 * @author Сахончик Д.В.
 */
public interface IPU1 {
	/**
	 * Тип записи {@value}
	 * 
	 */
	String type = "ПУ-1";
	/**
	 * Типы форм
	 */
	String[] formType = new String[] { "Р", "И", "В" };
	/**
	 * Кол-во реквизитов {@value}
	 */
	byte count = 28;

	/**
	 * Наименование реквизитов
	 */
	public final static String[] info = new String[] {
	/* 0 */"Тип записи",
	/* 1 */"Тип формы",
	/* 2 */"Учетный номер плательщика (в органе Фонда)",
	/* 3 */"Фамилия",
	/* 4 */"Имя",
	/* 5 */"Отчество",
	/* 6 */"Пол",
	/* 7 */"Гражданство",
	/* 8 */"Дата рождения",
	/* 9 */"Место рождения: город (село,дер.)",
	/* 10 */"Место рождения: район",
	/* 11 */"Место рождения: область (край,республика)",
	/* 12 */"Место рождения: страна",
	/* 13 */"Паспорт: серия",
	/* 14 */"Паспорт: номер",
	/* 15 */"Паспорт: дата выдачи",
	/* 16 */"Паспорт: кем выдан",
	/* 17 */"Паспорт: Идентификационный номер",
	/* 18 */"Место постоянного жительства: индекс",
	/* 19 */"Место постоянного жительства: адрес",
	/* 20 */"Телефон служебный",
	/* 21 */"Телефон домашний",
	/* 22 */"Дата заполнения",
	/* 23 */"Страховой номер",
	/* 24 */"Фамилия",
	/* 25 */"Имя",
	/* 26 */"Отчество",
	/* 27 */"Дата рождения" };

	/**
	 * Реквизиты которые обязательны к заполнению Граждане РБ Регистрация
	 */
	final String[] enterRecvDefault = new String[] {
	/* 0 */"+",// Тип записи
			/* 1 */"+", // Тип формы
			/* 2 */"+",// Учетный номер плательщика (в органе Фонда)
			/* 3 */null,// Фамилия
			/* 4 */null,// Имя
			/* 5 */null,// Отчество
			/* 6 */null,// Пол
			/* 7 */"+",// Гражданство
			/* 8 */null,// Дата рождения
			/* 9 */null,// Место рождения: город (село,дер.)
			/* 10 */null,// Место рождения: район
			/* 11 */null,// Место рождения: область (край,республика)
			/* 12 */null,// Место рождения: страна
			/* 13 */null,// Паспорт: серия
			/* 14 */null,// Паспорт: номер
			/* 15 */null,// Паспорт: дата выдачи
			/* 16 */null,// Паспорт: кем выдан
			/* 17 */null,// Паспорт: Идентификационный номер
			/* 18 */null,// Место постоянного жительства: индекс
			/* 19 */null,// Место постоянного жительства: адрес
			/* 20 */null,// Телефон служебный
			/* 21 */null,// Телефон домашний
			/* 22 */"+",// Дата заполнения
			/* 23 */null,// Страховой номер
			/* 24 */null,// Фамилия
			/* 25 */null,// Имя
			/* 26 */null,// Отчество
			/* 27 */null };// Дата рождения

	/**
	 * Реквизиты которые обязательны к заполнению если внесены тип формы и
	 * гражданство
	 * 
	 * @see (0) - Граждане РБ Изменение; (1) - Граждане РБ Восстановление (для
	 *      всех одинаковые);
	 */
	String[][] enterRecv = new String[][] {
	/* Граждане РБ Изменение */
	{/* 0 */"+",// Тип записи
			/* 1 */"+",// Тип формы
			/* 2 */"+",// Учетный номер плательщика (в органе Фонда)
			/* 3 */null,// Фамилия
			/* 4 */null,// Имя
			/* 5 */null,// Отчество
			/* 6 */null,// Пол
			/* 7 */"+",// Гражданство
			/* 8 */null,// Дата рождения
			/* 9 */null,// Место рождения: город (село,дер.)
			/* 10 */null,// Место рождения: район
			/* 11 */null,// Место рождения: область (край,республика)
			/* 12 */null,// Место рождения: страна
			/* 13 */"-",// Паспорт: серия
			/* 14 */null,// Паспорт: номер
			/* 15 */null,// Паспорт: дата выдачи
			/* 16 */null,// Паспорт: кем выдан
			/* 17 */null,// Паспорт: Идентификационный номер
			/* 18 */null,// Место постоянного жительства: индекс
			/* 19 */null,// Место постоянного жительства: адрес
			/* 20 */null,// Телефон служебный
			/* 21 */null,// Телефон домашний
			/* 22 */"+",// Дата заполнения
			/* 23 */"+",// Страховой номер
			/* 24 */"+",// Фамилия
			/* 25 */"+",// Имя
			/* 26 */"W",// Отчество
			/* 27 */"+" },// Дата рождения

			/* Граждане РБ Восстановление (для всех одинаковые) */
			{/* 0 */"+",// Тип записи
					/* 1 */"+",// Тип формы
					/* 2 */"+",// Учетный номер плательщика (в органе Фонда)
					/* 3 */"-",// Фамилия
					/* 4 */"-",// Имя
					/* 5 */"-",// Отчество
					/* 6 */"-",// Пол
					/* 7 */"+",// Гражданство
					/* 8 */"-",// Дата рождения
					/* 9 */"-",// Место рождения: город (село,дер.)
					/* 10 */"-",// Место рождения: район
					/* 11 */"-",// Место рождения: область (край,республика)
					/* 12 */"-",// Место рождения: страна
					/* 13 */"-",// Паспорт: серия
					/* 14 */"-",// Паспорт: номер
					/* 15 */"-",// Паспорт: дата выдачи
					/* 16 */"-",// Паспорт: кем выдан
					/* 17 */"-",// Паспорт: Идентификационный номер
					/* 18 */"-",// Место постоянного жительства: индекс
					/* 19 */"-",// Место постоянного жительства: адрес
					/* 20 */null,// Телефон служебный
					/* 21 */null,// Телефон домашний
					/* 22 */"+",// Дата заполнения
					/* 23 */"+",// Страховой номер
					/* 24 */"+",// Фамилия
					/* 25 */"+",// Имя
					/* 26 */"W",// Отчество
					/* 27 */"+" }, // Дата рождения
	};

	String[][] enterRecvForBase = new String[][] {
	/* Граждане РБ */
	{/* 0 */"+",// Тип записи
			/* 1 */"+",// Тип формы
			/* 2 */"+",// Учетный номер плательщика (в органе Фонда)
			/* 3 */"+",// Фамилия
			/* 4 */"+",// Имя
			/* 5 */"W",// Отчество
			/* 6 */null,// Пол
			/* 7 */"+",// Гражданство
			/* 8 */null,// Дата рождения
			/* 9 */null,// Место рождения: город (село,дер.)
			/* 10 */null,// Место рождения: район
			/* 11 */null,// Место рождения: область (край,республика)
			/* 12 */null,// Место рождения: страна
			/* 13 */"-",// Паспорт: серия
			/* 14 */null,// Паспорт: номер
			/* 15 */null,// Паспорт: дата выдачи
			/* 16 */null,// Паспорт: кем выдан
			/* 17 */"+",// Паспорт: Идентификационный номер
			/* 18 */null,// Место постоянного жительства: индекс
			/* 19 */null,// Место постоянного жительства: адрес
			/* 20 */null,// Телефон служебный
			/* 21 */null,// Телефон домашний
			/* 22 */"+",// Дата заполнения
			/* 23 */"-",// Страховой номер
			/* 24 */"-",// Фамилия
			/* 25 */"-",// Имя
			/* 26 */"-",// Отчество
			/* 27 */"-" },// Дата рождения

			/* Не Граждане РБ (без вида на жительства) */
			{/* 0 */"+",// Тип записи
					/* 1 */"+",// Тип формы
					/* 2 */"+",// Учетный номер плательщика (в органе Фонда)
					/* 3 */"+",// Фамилия
					/* 4 */"+",// Имя
					/* 5 */"W",// Отчество
					/* 6 */"+",// Пол
					/* 7 */"+",// Гражданство
					/* 8 */"+",// Дата рождения
					/* 9 */"+",// Место рождения: город (село,дер.)
					/* 10 */null,// Место рождения: район
					/* 11 */null,// Место рождения: область (край,республика)
					/* 12 */"+",// Место рождения: страна
					/* 13 */null,// Паспорт: серия
					/* 14 */"+",// Паспорт: номер
					/* 15 */"+",// Паспорт: дата выдачи
					/* 16 */"+",// Паспорт: кем выдан
					/* 17 */null,// Паспорт: Идентификационный номер
					/* 18 */"W",// Место постоянного жительства: индекс
					/* 19 */"+",// Место постоянного жительства: адрес
					/* 20 */null,// Телефон служебный
					/* 21 */null,// Телефон домашний
					/* 22 */"+",// Дата заполнения
					/* 23 */"-",// Страховой номер
					/* 24 */"-",// Фамилия
					/* 25 */"-",// Имя
					/* 26 */"-",// Отчество
					/* 27 */"-" },// Дата рождения

			/* Верующие */
			{/* 0 */"+",// Тип записи
					/* 1 */"+",// Тип формы
					/* 2 */"+",// Учетный номер плательщика (в органе Фонда)
					/* 3 */"+",// Фамилия
					/* 4 */"+",// Имя
					/* 5 */"W",// Отчество
					/* 6 */"+",// Пол
					/* 7 */"+",// Гражданство
					/* 8 */"+",// Дата рождения
					/* 9 */"+",// Место рождения: город (село,дер.)
					/* 10 */null,// Место рождения: район
					/* 11 */null,// Место рождения: область (край,республика)
					/* 12 */"+",// Место рождения: страна
					/* 13 */null,// Паспорт: серия
					/* 14 */"+",// Паспорт: номер
					/* 15 */"+",// Паспорт: дата выдачи
					/* 16 */"+",// Паспорт: кем выдан
					/* 17 */"+",// Паспорт: Идентификационный номер
					/* 18 */"W",// Место постоянного жительства: индекс
					/* 19 */"+",// Место постоянного жительства: адрес
					/* 20 */null,// Телефон служебный
					/* 21 */null,// Телефон домашний
					/* 22 */"+",// Дата заполнения
					/* 23 */"-",// Страховой номер
					/* 24 */"-",// Фамилия
					/* 25 */"-",// Имя
					/* 26 */"-",// Отчество
					/* 27 */"-" },// Дата рождения
	};
}
