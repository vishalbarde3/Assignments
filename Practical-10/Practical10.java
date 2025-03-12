public class Practical10
   {
   	public static void main(String[] args) {
      	printGrid(Integer.parseInt(args[0]));
    	}
    public static void printGrid(int size) {
    int[][] ans = sudokoGenerator(size);
    int[][] ansgen = quetionGenerater(ans, size);

    for (int row = 0; row < 2 * size + 1; row++) {
        if (row % 2 == 0) {
           
            for (int col = 0; col < size; col++) {
                System.out.print(" ---- ");
            }
        } else {
           
            int i = row / 2;
            for (int col = 0; col < size; col++) {
                if (col == 0) System.out.print("|");

                if (ansgen[i][col] == 0) {
                    System.out.print("     |");
                } else {
                    System.out.printf("  %d  |", ansgen[i][col]);
                }
            }
        }
        System.out.println(); 
    }
}

    public  static int[][] sudokoGenerator(int size) {
        int[][] ansBox = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                ansBox[row][col] = (row + col) % size + 1;    //generates the number like cycle grid
            }
        }
        return ansBox;
    }
    public static int[][]quetionGenerater(int [][]arr,int size){
        int [][]ans=sudokoGenerator(size);
        int [][] que= setZero(arr);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(que[i][j]==0){
                    que[i][j]=ans[i][j];
                }
                else{
                    que[i][j]=0;
                }
            }
        }
        return que;
    }

   public static int [][] setZero(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int totalElements = rows * cols;
        int elementsToZero = totalElements/3;
        while(elementsToZero>0){
            for(int i=0;i<rows;i++ ){
                for(int j=0; j<cols;j++){
                    int var1=(int)(System.nanoTime()%(rows+rows+1));
                    int var2=(int)(System.currentTimeMillis()%(rows+rows+1));
                    if(i==var1||j==var2) {
                        if(elementsToZero<=0){
                            break;
                        }
                        array[i][j] = 0;
                        elementsToZero--;
                    }
                }
            }

        }
        return array;
    }

}
