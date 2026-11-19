package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list        Liste der Codes im Long-Format
	 * @param searchValue Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] list, long searchValue) {
		long time = System.currentTimeMillis();
		int start = 0;
		int ende = list.length;
		while (start <= ende) {
			int i = (start + ende) / 2;
			if (searchValue == list[i]) {
				System.out.println(System.currentTimeMillis() + "ms");
				return i;
			} else {
				if (searchValue < list[i]) {
					ende = i - 1;
				} else {
					start = i + 1;
				}
			}
		}
		System.out.println(System.currentTimeMillis() + "ms");
		return NOT_FOUND;
	}
}