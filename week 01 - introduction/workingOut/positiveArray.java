public class positiveArray {

    static int common(int[] data, int[] dataB) {
		int result = 1;  

		for(int i = 0; i < data.length; i++) {
            if(data[i] < 0) {
                result = 0;
                break;
            }        
	    }

        if(result == 0){
            for(int i = 0; i < dataB.length; i++) {
                result = 2;
                if(dataB[i] < 0) {
                    result = 0;
                    break;
                }
            }           
	    }

		return result;
	}

    public static void main(String[] args) {
        int[] data = {-1,-2,-3,-4,-5,-6};	
        int[] dataB = {7,8,9,10,11,6};	
		int result = common(data, dataB);

        if(result == 0) {
            System.out.println("none of the arrays fit criteia.");    
        }else if(result == 1) {
            for(int i = 0; i < data.length; i++){
                System.out.println(data[i]);
            }
        }else if(result == 2) {
            for(int i = 0; i < dataB.length; i++){
                System.out.println(dataB[i]);
            }
        }

        System.out.println("All tests passed. Ur a gook\n");
    }
    


}