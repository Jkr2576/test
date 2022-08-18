package utils;

import interfaces.Recviz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import enums.eVIDD;

public class Utils implements Recviz {

	// ==============================================================================
	/**
	 * Преобразование строки в дату
	 * 
	 * @param arg
	 *            - Входная строка c Датой
	 * @return Класс Календарь
	 */
	// ==============================================================================
	public static Calendar getDateFromString(String arg) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(sdf.parse(arg));
			return calendar;
		} catch (ParseException e) {
			return null;
		}
	}

	// ==============================================================================
	/**
	 * Преобразование строки в дату
	 * 
	 * @param arg
	 *            - Входная строка c Датой
	 * @param format
	 *            - Формат даты
	 * @return Класс Календарь
	 */
	// ==============================================================================

	public static Calendar getDateFromString(String arg, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(sdf.parse(arg));
			return calendar;
		} catch (ParseException e) {
			return null;
		}
	}

	// ==============================================================================
	/**
	 * Преобразование строки в дату
	 * 
	 * @param arg
	 *            - Календарь
	 * @return строка с датой в формате по умолчанию
	 */
	// ==============================================================================

	public static String getStringFromDate(Calendar arg) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			return sdf.format(arg.getTime());
		} catch (Exception e) {
			return "";
		}
	}

	// ==============================================================================
	/**
	 * Преобразование строки в дату
	 * 
	 * @param arg
	 *            - Календарь
	 * @param format
	 *            - Формат даты
	 * @return строка с датой в формате по умолчанию
	 */
	// ==============================================================================

	public static String getStringFromDate(Calendar arg, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.format(arg.getTime());
		} catch (Exception e) {
			return "";
		}
	}

	// ==============================================================================
	/**
	 * Сравнение двух дат
	 * 
	 * @param arg1
	 *            - Дата начало
	 * @param arg2
	 *            - Дата конец
	 */
	// ==============================================================================
	public static boolean compareDate(Calendar arg1, Calendar arg2) {
		return (arg2.getTimeInMillis() > arg1.getTimeInMillis());
	}

	// ==============================================================================
	public static <T> boolean isInSet(T arg, T... args) {
		List<T> list = Arrays.asList(args);
		return list.contains(arg);
	}

	// ==============================================================================
	/**
	 * Преобразование латинской буквы, имеющих одинаковое начертание с русской в
	 * русскую
	 * 
	 * @param arg
	 *            - Код символа на латинском
	 * @return Символ на русском
	 */
	public char LATtoRUS(int arg) {
		short[][] arSYNOM = { { 81, 201 }, { 87, 214 }, { 69, 211 },
				{ 82, 202 }, { 84, 197 }, { 89, 205 }, { 85, 195 },
				{ 73, 216 }, { 79, 217 }, { 80, 199 }, { 219, 213 },
				{ 221, 218 }, { 65, 212 }, { 83, 219 }, { 68, 194 },
				{ 70, 192 }, { 71, 207 }, { 72, 208 }, { 74, 206 },
				{ 75, 203 }, { 76, 196 }, { 186, 198 }, { 222, 221 },
				{ 90, 223 }, { 88, 215 }, { 67, 209 }, { 86, 204 },
				{ 66, 200 }, { 78, 210 }, { 77, 220 }, { 188, 193 },
				{ 190, 222 } };

		for (int i = 0; i < arSYNOM.length; i++)
			if (arSYNOM[i][0] == arg)
				return (char) arSYNOM[i][1];
		return 0;
	}

	// ==============================================================================
	/**
	 * Замена русских букв, имеющих одинаковое начертание с латинскими на эти
	 * латинские
	 * 
	 * @param arg
	 *            - Входная строка
	 * @return Строка содержащая только латинские буквы
	 */
	// ==============================================================================
	public static String RUStoLAT(String arg) {
		StringBuilder result = new StringBuilder();
		char[] temp = arg.toCharArray();
		char ch;

		for (char t : temp) {
			ch = (char) t;
			if (numbers.indexOf(ch) < 0)
				for (int i = 0; i < synom[0].length; i++)
					if (ch == synom[0][i])
						ch = (char) synom[1][i];
			result.append(ch);
		}
		return result.toString();

	}

	// ==============================================================================
	/**
	 * Преобразование русской буквы, имеющих одинаковое начертание с латинской
	 * на латинскую
	 * 
	 * @param arg
	 *            - Входная символ на русском
	 * @return Символ содержащий латинскую букву
	 */
	// ==============================================================================
	public static char RUStoLAT(char arg) {
		char ch = arg;

		if (numbers.indexOf(ch) < 0) {
			for (int i = 0; i < synom[0].length; i++)
				if (ch == synom[0][i]) {
					ch = synom[1][i];
					return ch;
				}
		}
		return ch;
	}

	// ==============================================================================
	/**
	 * Проверка Учетный номер плательщика (в органе Фонда)
	 * 
	 * @param arg
	 *            - Строка с регистрационным номером
	 * @return true - (плохой), false - (хороший)
	 */
	// ==============================================================================
	public static boolean checkRegNom(String arg) {
		// System.out.println("checkRegNom: "+arg
		// +" = "+arg.substring(0,1)+"/"+arg.substring(1,
		// 3)+"/"+arg.substring(3, 9));
		boolean result = false; // Хорошо
		if (arg.length() == 9) {
			if ((Integer.parseInt(arg.substring(0, 1)) < 1)
					|| (Integer.parseInt(arg.substring(0, 1)) > 7))
				result = true;
			else if (arg.substring(1, 3) == "00")
				result = true;
			else if (arg.substring(3, 9) == "000000")
				result = true;
		} else
			result = true;
		return result;
	}

	// ==============================================================================
	public static int myOrd(char ch) {
		switch (ch) {
		case 'A':
			return 0;
		case 'B':
			return 1;
		case 'C':
			return 2;
		case 'E':
			return 3;
		case 'H':
			return 4;
		case 'K':
			return 5;
		case 'M':
			return 6;
		case 'O':
			return 7;
		case 'P':
			return 8;
		case 'T':
			return 9;
		default:
			return -1;
		}
	}

	// ==============================================================================
	/**
	 * Проверка Учетный номер плательщика (в налоговом органе)
	 * 
	 * @return true - верный, false - не верный
	 */
	// ==============================================================================
	public static boolean checkUNN(String arg) {
		int i;
		boolean result = true;
		char ch1;
		char ch2;
		char[] unn = arg.toCharArray();
		try {
			// System.out.println((byte) unn[0] + ", " + (byte) unn[1]);
			if (String.valueOf("123456789").indexOf(unn[0]) >= 0)
				i = (((int) unn[0] - 48) * 29 + ((int) unn[1] - 48) * 23
						+ ((int) unn[2] - 48) * 19 + ((int) unn[3] - 48) * 17
						+ ((int) unn[4] - 48) * 13 + ((int) unn[5] - 48) * 7
						+ ((int) unn[6] - 48) * 5 + ((int) unn[7] - 48) * 3) % 11;
			else {
				// (символьной)
				ch1 = Character.toUpperCase(RUStoLAT(unn[0]));
				ch2 = Character.toUpperCase(RUStoLAT(unn[1]));
				if (String.valueOf("ABCEHKM").indexOf(ch1) < 0)
					result = false;
				if (String.valueOf("ABCEHKMOPT").indexOf(ch2) < 0)
					result = false;
				i = (((int) ch1 - 55) * 29 + myOrd(ch2) * 23
						+ ((int) unn[2] - 48) * 19 + ((int) unn[3] - 48) * 17
						+ ((int) unn[4] - 48) * 13 + ((int) unn[5] - 48) * 7
						+ ((int) unn[6] - 48) * 5 + ((int) unn[7] - 48) * 3) % 11;
			}
			if (i != (int) unn[8] - 48)
				result = false;
			return result;
		} catch (Exception e) {
			return false;
		}
	}

	// ==============================================================================
	/**
	 * Получение реквизитов несоответствия введенных и по умолчанию
	 * 
	 * @return - массив строк
	 */
	// ==============================================================================
	public static String[] markEnterRecv(String[] enterRecv,
			String[] defaultRecv) {
		String[] result = new String[enterRecv.length];
		// System.out.println("enterRecv \t" + Arrays.asList(enterRecv));
		// System.out.println("defaultRecv \t" + Arrays.asList(defaultRecv));

		for (int i = 1; i < enterRecv.length; i++) {
			if (defaultRecv[i] != null) {
				if (enterRecv[i] == null) {
					if (defaultRecv[i].equals("+"))
						result[i] = "+";
					else if (defaultRecv[i].equals("W"))
						result[i] = "W";
					else if (defaultRecv[i].equals("*"))
						result[i] = "*";
					else if (defaultRecv[i].equals("**"))
						result[i] = "**";
					else if (defaultRecv[i].equals("0"))
						result[i] = "0";
				} else if (defaultRecv[i].equals("-"))
					result[i] = "-";
			}
		}
		return result;
	}

	// ==============================================================================
	/**
	 * Получение списка видов деятельности
	 * 
	 * @param arg
	 */
	// ==============================================================================
	public static String getStringVIDD(EnumSet<eVIDD> arg) {
		StringBuilder result = new StringBuilder();
		if (arg != null) {
			Iterator<eVIDD> it = arg.iterator();
			while (it.hasNext()) {
				eVIDD i = it.next();
				result.append(", " + i.toString());
			}
			result.replace(0, 2, "");
			if (result.lastIndexOf(", ") >= 0)
				result.replace(result.lastIndexOf(", "),
						result.lastIndexOf(", ") + 2, " и ");
		}
		return result.toString();
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// System.out.println("result = " + checkUNN("102299126"));
		// System.out.println("result = " + checkUNN("200166740"));
	}

}
