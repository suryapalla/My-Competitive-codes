class QuickSort{

	public static int partition(int[] arr,int l,int r){
		int pivot=arr[r];
        int i=l-1;
        for(int j=l;j<r;j++){
        	if(arr[j]<=pivot){
        		i++;
    			int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
        	}
        } 
			int temp=arr[i+1];
			arr[i+1]=arr[r];
			arr[r]=temp;
        return i+1;
	}

    public static void quickSort(int[] arr,int l,int r){
    	if(l<r){
    		int partn_index=partition(arr,l,r);
            quickSort(arr,l,partn_index-1);
            quickSort(arr,partn_index+1,r);
    	}
    }

    public static void printArray(int[] arr){
    	for(int temp:arr) System.out.print(temp+" ");
    }

	public static void main(String[] args) {
		int[] arr={5,1,-1,0,7,1234,-123};
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}

}