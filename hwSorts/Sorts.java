public class Sorts{
   public static void printArray(int[]data){
       String s = "";
       int i = 0;
       if (data.length ==0){
	   s += "[]";
       }
       while(i < data.length){
	   if(i == 0){
	       s +="[ " + data[i] + ",";
	   }
	   else if (i == data.length - 1){
	       s += " " + data[i] + "]";
	   }
	   else{s += " " + data[i] + ",";
	   }
	   i ++;
       }
       if (data.length == 1){
	   s = "[" + data[0] + "]";
       }
       System.out.print(s);
	   
   }
   public static void insertionSort(int[]data){
       int i = 1;
       //int [] new = int[] data.length;
       while (i < data.length){
	   int w = i;
	   while(w > 0 && data[w] < data[w - 1]){
	       int r = data[w -1];
	       data[w - 1] = data[w];
	       data[w] = r;
	       w --;
	       
	   }
	   i ++;
       }

	       
	   
      //your code here to make data re-order its elements
      //from least to greatest just like we did in class
      //same algorithm as the way you created your OrderedSuperArray
   }


    public static void selectionSort(int [] data){
	int q = 0;
	int ctr = 0;
	while(q < data.length){    
	int i = ctr;
	int n = data[i];
	int rem = 0;
	while(i < data.length){
	    if(n >= data[i]){
		n = data[i];
	        rem = i;}
	    if(i == data.length - 1){
		data[rem] = data[ctr];
		data[ctr] = n;
		ctr ++;}
	    i ++;
	}
	q ++;}
    }
		
		
	    
	


     public static void main(String[]args){
	 int[] arrayName = {1000, -43, -42, -42, 8, 6, 7, 7, 5, 3, 1000, -54, 0, 7, 9, -329239, -329239};
	 // int[] arrayName = {4, 1, 3};
	Sorts.printArray( arrayName);
	System.out.println();
	Sorts.selectionSort( arrayName);
	Sorts.printArray( arrayName);
	}
}
