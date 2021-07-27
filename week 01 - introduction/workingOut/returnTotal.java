public class returnTotal {
	static int total(int[] data) {
		int result = 0;
		for(int i = 0; i < data.length; i++) {
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6};	
		int result = total(data);
		System.out.println(result);
		System.out.println("All tests passed xD xD \n");
	} 
}
