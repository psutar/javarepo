package algorithm;

public class Sorting {

	public static void main(String[] args) {
		int[] a = { 5, 7, 4, 6, 8, 9, 3, 1, 2 };
		System.out.println("array b4 sorting :" + java.util.Arrays.toString(a));
		bubbleSort(a);
	}

	public static void bubbleSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j >= i; j--) {
				System.out.println(i + " " + j);
				if (j != 0) {
					if (a[j] < a[j - 1]) {
						a[j] = a[j] + a[j - 1];
						a[j - 1] = a[j] - a[j - 1];
						a[j] = a[j] - a[j - 1];
					}
				}
			}
		}
		System.out.println("After Bubble sorting :" + java.util.Arrays.toString(a));
	}
}
