public class allPositives {

    static int allPos(int[] data) {
		int result = 0;
		for(int i = 0; i < data.length; i++) {
                if(data[i] >= 0) {
			        result++;
                }
		}
		return result;
	}

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,-1,-2,-3};	
		int result = allPos(data);
		System.out.println(result);

        System.out.println("All tests passed. Ur a gook\n");
    }
    


}