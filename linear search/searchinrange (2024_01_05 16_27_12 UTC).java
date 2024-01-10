class searchinrange{
       public static void main(String args[]){
        int arr[]={1,2,3,4,54,67};
        int target=2;
        System.out.println(LinearSearch(arr,target,1,6));
       }
       static int LinearSearch(int []arr,int target,int start,int end){
		for (int i = start; i < end; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}
}