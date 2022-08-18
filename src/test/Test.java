package test;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import enums.eVIDD;
import utils.Utils;

public class Test {

	// ==============================================================================
	public static <T> boolean isInSet(T arg, T... args) {
		boolean result = false;
		if (args.getClass().equals(byte[].class)) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> "
					+ arg.getClass().getName() + "\n"
					+ arg.getClass().toString());
			for (int i = 0; i < args.length; i++)
				if (args[i].equals(arg)) {
					result = true;
					break;
				}
		} else {
			List<T> list = Arrays.asList(args);
			System.out.println("\n\nlength = " + list.size() + "/"
					+ args.length);
			result = list.contains(arg);
		}
		return result;
	}

	public static void main(String[] args) {

		String str = "300085751";
		System.out.println(str.charAt(4));

		if (!Utils.checkUNN(str))
			System.out.println("Ошибочный : " + str);
		else
			System.out.println("Без ошибок : " + str);

		byte[] byteset = str.getBytes();
		Byte[] byteset1 = new Byte[3];
		//isInSet((byte) '2', byteset1);
		System.out.println("\nisInSet(2) = " + isInSet((byte) '2', byteset));
		System.out
				.println("---------------------------------------------------------------------------");
		System.out.println("\nisInSet(2) = "
				+ isInSet(1, 2, 5, 8, 8, 8, 9, 6, 9, 4, 1));

		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n"
				+ byteset.getClass().toString() + "\n"
				+ byteset1.getClass().toString());
		System.out.println("=======> ");

		//Byte[] recv = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
		List<Byte> list = Arrays.asList(new  Byte[] {0,1,2,3,4,6,7,8,9,10,19,20,21,22,23,24,25,26,27,28});
		System.out.println(list);
		System.out.println((char)39);
		
		EnumSet<eVIDD> set = null;
		if (set == null) set = EnumSet.of(eVIDD.VD1);
		set.add(eVIDD.VD2);
		System.out.println(set);
		
	}

}
