package javaPractices;

public class printonetonnumber {
	public static void main(String args[]) {

		int arr[] = { 20, 10, 34, 19 };
		int sum = 14;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {

					System.out.println(arr[i] + " " + arr[j]);

					
				} 
				else {
					System.out.println("value is not available");
				}
			}

		}

	}
}
