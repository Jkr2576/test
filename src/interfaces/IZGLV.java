package interfaces;


/**
 * Реквизиты ЗАГОЛОВКА
 * 
 * @author Сахончик Д.В.
 */

public interface IZGLV {
	/**
	 * Тип реквизита = {@value}
	 */
	public final static String type = "ЗГЛВ";
	/**
	 * Версия
	 */
	public final static String[] current_version = {"1.3", "1.4"};
	/**
	 * Кол-во реквизитов = {@value}
	 */
	public final static byte count = 2;
	/**
	 * Наименование реквизитов
	 */
	public final static String[] info = new String[] { "Тип записи", "Версия" };


}
