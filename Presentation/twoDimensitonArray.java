class MultidimensionalArray {
    public static void main(String[] args) {

    //  create a 2d array
        
    //  dataType[] arrayName 
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        // calculate the length array 
        System.out.println("Length of row 1: " + a[0].length);

        
        
        // specific value print 
          System.out.println(a[0][0]); // 1
          System.out.println(a[0][1]); // 2
          System.out.println(a[1][0]); // 4
          System.out.println(a[1][1]); // 4

          a[1][1] = 9;
            
            
        // Change Element Values
          System.out.println(a[1][1]); // Outputs 9 instead of 4
        
        
        
        
    }
}
