package leetcode;

public class Convert1DArrayto2D {// completed
    public static void main(String[] args) {
        int[] num={1,2};//{1,2,3,4};
        int m=1,n=1;
        int[][]  b=construct2DArray(num,m,n);
        //System.out.println(b);

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(b[i][j]+" ");
            System.out.println();
        }
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] k = new int[m][n];
        int index=0;
              if(m*n==original.length){
                    for(int i=0;i<m;i++){
                        for (int j=0;j<n;j++,index++){
                               k[i][j]=original[index];
                        }
                    }
                    return k;
              }

              else
                  return new int[0][];
    }
}
