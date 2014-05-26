package tmethoddemo3;
public class TMethodDemo3 {
    public static void main(String[] args) {
        int A[][] = {{51,39,77,65,22,44,61},{32,26,79,55,75,64}};
        int B[][] = new int[2][];
        B[0] = new int[5];
        B[1] = new int[4];
        B = aMethod(A);
        for (int i = 0; i < B.length; i++) 
            for (int j = 0; j < B[i].length; j++) 
                System.out.println(B[i][j] + " ");
        System.out.println();
    }
    public static int[][] aMethod(int[][] A) {
        for (int k = 0; k < A.length; k++) 
            for (int l = 0; l < A[k].length; l++) 
                A[k][l] += 10;
        return A;
    }
}
