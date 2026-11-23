


public class  main {
    
    private int z, x, y; 
    
    //public void increaseZ(){
     //   z++;
    //}
    //public void resetZ(){
     //   z = 0;
    //}
    private boolean findSolution(int x, int y, int z) {
        private static final int  arr[] = {1,2,3};
        if (x > arr.length - 1) {
            findSolution()
        }
        if (y > arr.length ) {
            y = 0;
            findSolution(x + 1, y, z);
        }
        if (z > arr.length) {
            //resetZ();
            z = 0;
            findSolution(x, y + 1, z);// Borde inte X öka? nu är x och z samma värde medans y ökar?
        }
        
        else if (arr[x] + arr[y] != z){   // base case
            //increaseZ();
            findSolution(x, y, z + 1);
    
        }    
        else if(arr[x] + arr[y] == z){
            return true;
        }
            
        
    }
    public static void main(String[] args){

    }

}
