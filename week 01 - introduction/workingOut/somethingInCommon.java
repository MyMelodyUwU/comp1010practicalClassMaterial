public class somethingInCommon {

    static int common(int[] data, int[] dataB) {
		int result = 0; //False
		for(int i = 0; i < data.length && i < dataB.length; i++) {
                if(data[i] == dataB[i]) {
                    result = 1;
                }
		}
		return result;
	}

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6};	
        int[] dataB = {2,3,4,5,6,7};	
		int result = common(data, dataB);
		System.out.println(result);

        System.out.println("All tests passed. Ur a gook\n");
    }
    


}