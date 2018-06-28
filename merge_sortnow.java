class MergeSort{
	
	public static void merge(int[] arr,int l,int middle,int r){
        int left_arr_size=middle-l+1;
        int right_arr_size= r-middle;

        int[] left_arr=new int[left_arr_size];
        int[] right_arr=new int[right_arr_size];

        for(int i=0;i<left_arr_size;i++)	left_arr[i]=arr[l+i];
        for(int i=0;i<right_arr_size;i++)	right_arr[i]=arr[middle+1+i];
          
        int i=0,j=0,k=l;  
        while(i<left_arr_size && j<right_arr_size){
           if(left_arr[i]<=right_arr[j]){
           	arr[k]=left_arr[i];
           	i++;
           }
           else{
           	arr[k]=right_arr[j];
           	j++;
           }
           k++;
        }  

        while(i<left_arr_size)
        {
        	arr[k]=left_arr[i];
        	i++;
        	k++;
        }  

        while(j<right_arr_size)
        {
        	arr[k]=right_arr[j];
        	j++;
        	k++;
        }  

	}

	public static void printArr(int[] arr){
		for(int temp:arr) System.out.println(temp);
	}

    public static void mergeSort(int[] arr,int l,int r){
    	if(l<r){
	    	int middle=(l+r)/2;
	    	mergeSort(arr,l,middle);
	    	mergeSort(arr,middle+1,r);
	        merge(arr,l,middle,r);
         }
     }

	public static void main(String[] args) {
		int[] arr=new int[]{2,5,1,0,-4};
        int l=0,r=arr.length-1;
        mergeSort(arr,l,r); 
        printArr(arr); 

	}
}
