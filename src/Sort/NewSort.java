package Sort;

public class NewSort {

	public static void main(String[] args) {
		int arr[] = {9, 6, 8, 7, 3, 5, 4, 1, 2, 0};
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();

	}

}
