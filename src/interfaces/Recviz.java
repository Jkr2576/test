package interfaces;

/**
 * Интерфейс реквизитов
 * 
 * @author DSahonchik
 * 
 */
public interface Recviz {

	/**
	 * Максимальное количество листов в пачке = {@value}
	 */
	short maxPage = 200;

	/**
	 * Максимальное количество документов в пачке = {@value}
	 */
	short maxDocNum = 200;

	/**
	 * Максимальное количество записей на 1-ом листе ПУ-2 = {@value}
	 */
	byte max1PU2 = 35;

	/**
	 * Максимальное количество записей на 2-ом и т.д. листе ПУ-2 = {@value}
	 */
	byte max2PU2 = 40;

	byte nPara = 3;
	byte nTarif6 = 4;
	byte nHour6 = 3;

	/**
	 * Формат Даты = {@value}
	 */
	String dateFormat = "dd/MM/yyyy";

	/**
	 * Даты вступления в силу изменнений по ПУ-3 = {@value}
	 */
	String dateIzmen = "01/08/2006";

	/**
	 * Год вступления в силу ПУ-6 = {@value}
	 */
	short beginPU6 = 2009;

	/**
	 * Пенсионный возраст Мужчина = {@value}
	 */
	byte yearMan = 60;
	/**
	 * Пенсионный возраст Женщина = {@value}
	 */
	byte yearWomen = 55;

	/**
	 * Языковые синонимы
	 * 
	 * @see (0) - RUS; (1) - LAT
	 */
	Character[][] synom = {
			{ 'Е', 'Т', 'О', 'Р', 'А', 'Н', 'К', 'Х', 'С', 'В', 'М' }, // RUS
			{ 'E', 'T', 'O', 'P', 'A', 'H', 'K', 'X', 'C', 'B', 'M' } }; // LAT
	/**
	 * Русские заглавные буквы
	 */
	String rusUp = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

	/**
	 * Русские строчные буквы
	 */
	String rusDown = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

	/**
	 * Латинские заглавные буквы
	 */
	String latUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	/**
	 * Латинские строчные буквы
	 */
	String latDown = "abcdefghijklmnopqrstuvwxyz";

	/**
	 * Знаки
	 */
	String sign = ",.;:!?-/\\\"";

	/**
	 * Цифры
	 */
	String numbers = "0123456789";

	/**
	 * Дата
	 */
	String dates = numbers + "/";



}
