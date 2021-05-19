package lab_5;

public class Main {
    public static void main(String[] args) {
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }};
        Matrix m0 = new Matrix(d);
        double[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix m1 = new Matrix(a);

        Matrix c;
        try {
            c = Matrix.add(m0, m1);
            c.printMatrix();
            System.out.println("\n\n");
        } catch (MatrixException m) {
            m.printStackTrace();
        }
        try {
            c = Matrix.multiply(m0, m1);
            c.printMatrix();
        } catch (MatrixException m) {
            m.printStackTrace();
        }


    }
}
