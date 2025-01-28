package leetcode;

public class RotateImage {
    public static void main(String[] args) {
        int[][] n={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        RotateImage ri=new RotateImage();
        int n1=n.length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
        }
        ri.rotate(n);
        System.out.println();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void rotate(int[][] matrix) {
       int n=matrix.length;//(a,b) -> (a, s-b-1) -> (s-b-1, a)
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++)
           {
               int t=matrix[i][j];
               matrix[i][j]=matrix[i][n-i-1];
               matrix[i][n-i-1]=matrix[n-i-1][j];
               matrix[n-i-1][j]=t;
           }
       }
    }
}
