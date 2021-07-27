public class twoArrays {

    static int common(int[] data, int[] dataB) {
		int result = 0; //False
		for(int i = 0; i < data.length; i++) {
                for(int j = 0; j < dataB.length; j++)  {
                    if(data[i] == dataB[j]) {
                         result = 1;
                    }
                }
	}
		return result;
	}

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6};	
        int[] dataB = {7,8,9,10,11,6};	
		int result = common(data, dataB);
		System.out.println(result);

        System.out.println("All tests passed. Ur a gook\n");
    }
    


}