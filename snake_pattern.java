class SnakePattern{

    public static void printSnakePattern(int left_index,int right_index,int[][] given_arr){
      int left_temp=0,right_temp=0;

      while(left_temp<left_index){
      
       for(int i=right_temp;i<right_index;i++)	System.out.print(given_arr[left_temp][i]+" ");
       left_temp++;
      
       for(int i=right_index-1;i>=right_temp;i--)	System.out.print(given_arr[left_temp][i]+" ");
       left_temp++;         	
      
      }

    }

	public static void main(String[] args) {
		int[][] given_arr={{1,2,3,4,5},
		         {6,7,8,9,10},
		         {11,12,13,14,15},
		         {16,17,18,19,20}};

		 printSnakePattern(4,5,given_arr);        
	}
}