import java.util.Arrays;
import java.util.Scanner;

public class SecondSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int[] arr = new int[3];
		String[] inputarr = input.split(" ");
		arr[0] = Integer.parseInt(inputarr[0]);
		arr[1] = Integer.parseInt(inputarr[1]);
		arr[2] = Integer.parseInt(inputarr[2]);
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
