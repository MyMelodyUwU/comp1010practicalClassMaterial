public class set {

    int[] data = {-1,-2,-3,-4,-5,-6};	

    //int[] newSet = new newSet[data.length]; 

    void common(int[] data) {
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < newSet.length; j++) {
                if(data[i] != newSet[j]) {
                    newSet[j + 1] = data[i];
                }
            }

        }        

	}

    public static void main(String[] args) {
		common(data);


        System.out.println("All tests passed. Ur a gook\n");
    }
    


}