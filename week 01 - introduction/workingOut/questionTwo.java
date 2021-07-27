public class questionTwo {

    static int totalEven(int[] data) {
		int result = 0;
		for(int i = 0; i < data.length; i++) {
                if(data[i] % 2 == 0) {
			        result++;
                }
		}
		return result;
	}

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6};	
		int result = totalEven(data);
		System.out.println(result);

        System.out.println("All tests passed. Ur a gook\n");
    }
    


}