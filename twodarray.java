import java.util.Scanner;

public class twodarray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of rows of matrix  :   ");
        int row = sc.nextInt();

        System.out.println("Enter the size of columns of matrix  :   ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[row][cols];
        int[][] matrix2 = new int[row][cols];
       //  int[][] matrix3 = new int[row][cols];
        input1(matrix1);
        input2(matrix2);
        // add(matrix1,matrix2,matrix3);
        // display(matrix3);
        // wave(matrix1);
        // exitpoint(matrix1);
        // spiral(matrix1);
        multiply(matrix1, matrix2);
        display(matrix3);

    }

    public static void input1(int[][] matrix1) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int cols = 0; cols < matrix1[0].length; cols++) {
                matrix1[row][cols] = sc.nextInt();
            }
        }
    }

    public static void input2(int[][] matrix2) {
        for (int row = 0; row < matrix2.length; row++) {
            for (int cols = 0; cols < matrix2[0].length; cols++) {
                matrix2[row][cols] = sc.nextInt();
            }
        }
    }

    public static void add(int[][] matrix1, int[][] matrix2, int[][] matrix3) {

        for (int row = 0; row < matrix3.length; row++) {
            for (int cols = 0; cols < matrix3[0].length; cols++) {
                matrix3[row][cols] = matrix1[row][cols] + matrix2[row][cols];
            }
        }
    }

    public static void display(int[][] matrix3) {
        for (int row = 0; row < matrix3.length; row++) {
            for (int cols = 0; cols < matrix3[0].length; cols++) {
                System.out.print(matrix3[row][cols] + "  ");
            }
            System.out.println();
        }
    }

    public static void wave(int[][] matrix1) {
        for (int row = 0; row < matrix1.length; row++) {
            if (row % 2 != 0) {
                // odd row
                for (int cols = matrix1[0].length - 1; cols >= 0; cols--) {
                    System.out.print(matrix1[row][cols] + "  ");

                }
                System.out.println();
            } else {
                // even
                for (int cols = 0; cols < matrix1[0].length; cols++) {
                    System.out.print(matrix1[row][cols] + "  ");
                }
                System.out.println();
            }
        }
    }

    public static void verticalwave(int[][] matrix1) {
        for (int cols = 0; cols < matrix1.length; cols++) {
            if (cols % 2 != 0) {
                // odd row
                for (int row = matrix1.length - 1; row >= 0; row--) {
                    System.out.print(matrix1[row][cols] + "  ");

                }
                System.out.println();
            } else {
                // even
                for (int row = 0; row < matrix1.length; row++) {
                    System.out.print(matrix1[row][cols] + "  ");
                }
                System.out.println();
            }
        }
    }

    public static void exitpoint(int[][] matrix1) {
        int dir = 0;
        int row = 0;
        int cols = 0;

        while (true) {
            dir = (dir + matrix1[row][cols]) % 4;
            if (dir == 0) {
                cols++;
                if (cols == matrix1[0].length) {
                    System.out.print(row + " , " + (cols - 1));
                    break;

                }
            } else if (dir == 1) {
                row++;
                if (row == matrix1.length) {
                    System.out.print((row - 1) + " , " + cols);
                    break;
                }
            } else if (dir == 2) {
                cols--;
                if (cols == -1) {
                    System.out.print(row + " ," + (cols + 1));
                    break;
                }
            } else if (dir == 3) {
                row--;
                if (row == -1) {
                    System.out.print((row + 1) + " , " + cols);
                }
            }
        }

    }

    public static void spiral(int[][] matrix1) {

        int rmin = 0;
        int cmin = 0;
        int rmax = matrix1.length - 1;
        int cmax = matrix1[0].length - 1;
        int tne = (matrix1.length) * (matrix1[0].length);

        while (tne > 0) {
            for (int i = cmin; i <= cmax && tne > 0; i++) {
                System.out.print(matrix1[rmin][i] + "  ");
                tne--;

            }
            rmin++;
            for (int i = rmin; i <= rmax && tne > 0; i++) {
                System.out.print(matrix1[i][cmax] + "  ");
                tne--;
            }
            cmax--;
            for (int i = cmax; i >= cmin && tne > 0; i--) {
                System.out.print(matrix1[rmax][i] + "  ");
                tne--;
            }
            rmax--;
            for (int i = rmax; i >= rmin && tne > 0; i--) {
                System.out.print(matrix1[i][cmin] + "  ");
                tne--;
            }
            cmin++;

        }

    }

    public static void multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            return;
        }
        int[][] matrix3 = new int[matrix1.length - 1][matrix2[0].length];

        for (int cols = 0; cols < matrix3.length; cols++) {
            for (int row = 0; row < matrix3.length; row++) {
                for (int k = 0; k < matrix3[0].length; k++) {
                    matrix3[row][cols] += matrix1[row][cols] * matrix2[row][cols];

                    // System.out.print(matrix3[r][c] + " ");
                }

                // System.out.print(matrix3[r][c] + " ");
                // System.out.println();
            }

            // System.out.println();
        }
    }
}
