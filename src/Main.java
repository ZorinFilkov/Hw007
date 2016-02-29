import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int a[] = new int[10];
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = a[i] + sum;
			}
		}
		System.out.println(sum);
	}

}
