package Sort;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {9, 6, 8, 7, 3, 5, 4, 1, 2, 0};
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 9; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
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
