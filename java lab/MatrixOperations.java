public class MatrixOperations {
    int a[][] = {{1,2},{3,4}};
    int b[][] = {{5,6},{7,8}};

    void addition() {
        System.out.println("Addition:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        System.out.println("Transpose of Matrix A:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    void sumRows() {
        System.out.println("Row Sum:");
        for(int i=0;i<2;i++) {
            int sum = 0;
            for(int j=0;j<2;j++) {
                sum += a[i][j];
            }
            System.out.println(sum);
        }
    }

    void sumColumns() {
        System.out.println("Column Sum:");
        for(int i=0;i<2;i++) {
            int sum = 0;
            for(int j=0;j<2;j++) {
                sum += a[j][i];
            }
            System.out.println(sum);
        }
    }

    void diagonalSum() {
        int sum = 0;
        for(int i=0;i<2;i++) {
            sum += a[i][i];
        }
        System.out.println("Diagonal Sum: " + sum);
    }

    public static void main(String[] args) {
        MatrixOperations obj = new MatrixOperations();
        obj.addition();
        obj.transpose();
        obj.sumRows();
        obj.sumColumns();
        obj.diagonalSum();
    }
}