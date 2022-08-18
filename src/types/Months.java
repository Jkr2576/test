package types;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Месяцы начислений
 * 
 * @author Сахончик Д.В.
 */
public class Months {
	/**
	 * Выплаты
	 */
	public TreeSet<Byte> vpl;
	/**
	 * Пособия
	 */
	public TreeSet<Byte> bln;
	/**
	 * Взносы
	 */
	public TreeSet<Byte> vzn;
	/**
	 * Выплаты со значением = 0
	 */
	public TreeSet<Byte> vplZero;
	/**
	 * Пособия со значением = 0
	 */
	public TreeSet<Byte> blnZero;
	/**
	 * Взносы со значением = 0
	 */
	public TreeSet<Byte> vznZero;
	/**
	 * Массив месяцев начислений
	 */
	public TreeSet<Byte> nchsl;
	/**
	 * Массив месяцев стажа
	 */
	public TreeSet<Byte> staj;

	public Months() {
		vpl = new TreeSet<Byte>();
		bln = new TreeSet<Byte>();
		vzn = new TreeSet<Byte>();
		vplZero = new TreeSet<Byte>();
		blnZero = new TreeSet<Byte>();
		vznZero = new TreeSet<Byte>();
		nchsl = new TreeSet<Byte>();
		staj = new TreeSet<Byte>();
	}

	// ==============================================================================
	/**
	 * Вычитание месяцев
	 * 
	 * @param arg1
	 *            - множество месяцев
	 * @param arg2
	 *            - множество месяцев
	 * @return множество месяцев
	 */
	// ==============================================================================
	public static TreeSet<Byte> difference(TreeSet<Byte> arg1,
			TreeSet<Byte> arg2) {
		if ((arg1 == null) || (arg2 == null))
			return null;
		TreeSet<Byte> result = new TreeSet<Byte>(arg1);
		Iterator<Byte> it = arg2.iterator();
		while (it.hasNext()) {
			result.remove(it.next());
		}
		return result;
	}

	// ==============================================================================
	/**
	 * Вычитание месяцев
	 * 
	 * @param arg1
	 *            - множество месяцев
	 * @param arg2
	 *            - множество месяцев
	 * @return множество месяцев
	 */
	// ==============================================================================
	public static boolean isDifference(TreeSet<Byte> arg1,
			TreeSet<Byte> arg2) {
		if ((arg1 == null) || (arg2 == null))
			return false;
		TreeSet<Byte> result = new TreeSet<Byte>(arg1);
		Iterator<Byte> it = arg2.iterator();
		while (it.hasNext()) {
			result.remove(it.next());
		}
		return (!result.isEmpty());
	}

	// ==============================================================================
	/**
	 * Пересечение месяцев
	 * 
	 * @param arg1
	 *            - множество месяцев
	 * @param arg2
	 *            - множество месяцев
	 * @return множество месяцев
	 */
	// ==============================================================================
	public static TreeSet<Byte> crossing(TreeSet<Byte> arg1, TreeSet<Byte> arg2) {
		if ((arg1 == null) || (arg2 == null))
			return null;
		TreeSet<Byte> result = new TreeSet<Byte>();
		Iterator<Byte> it = arg1.iterator();
		while (it.hasNext()) {
			Byte i = it.next();
			if (arg2.contains(i))
				result.add(i);
		}
		it = arg2.iterator();
		while (it.hasNext()) {
			Byte i = it.next();
			if (arg1.contains(i))
				result.add(i);
		}
		return result;
	}

	// ==============================================================================
	/**
	 * Пересечение месяцев
	 * 
	 * @param arg1
	 *            - множество месяцев
	 * @param arg2
	 *            - множество месяцев
	 * @return множество месяцев
	 */
	// ==============================================================================
	public static boolean isCrossing(TreeSet<Byte> arg1, TreeSet<Byte> arg2) {
		if ((arg1 == null) || (arg2 == null))
			return false;
		Iterator<Byte> it = arg1.iterator();
		while (it.hasNext()) {
			Byte i = it.next();
			if (!arg2.contains(i))
				return false;
		}
		it = arg2.iterator();
		while (it.hasNext()) {
			Byte i = it.next();
			if (!arg1.contains(i))
				return false;
		}
		return true;
	}

	// ==============================================================================
	/**
	 * Сложение месяцев
	 * 
	 * @param arg1
	 *            - множество месяцев
	 * @param arg2
	 *            - множество месяцев
	 * @return множество месяцев
	 */
	// ==============================================================================
	public static TreeSet<Byte> concat(TreeSet<Byte>... args) {
		TreeSet<Byte> result = new TreeSet<Byte>();
		for (int i = 0; i < args.length; i++)
			result.addAll(args[i]);
		return result;
	}

}
