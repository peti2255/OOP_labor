package lab_5;

public class Matrix {

    private double[][] data;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = new double[this.rows][this.columns];

        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                this.data[i][j] = data[i][j];
    }

    public Matrix(Matrix data) {
        this.rows = data.getRows();
        this.columns = data.getColumns();
        this.data = new double[this.rows][this.columns];

        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                this.data[i][j] = data.getData()[i][j];
    }

    public double[][] getData() {
        return data;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void fillRandom(double min, double max) {
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                this.data[i][j] = Math.random() * (max - min + 1) + max;
    }

    public void printMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.printf("%.2f ", getData()[i][j]);
            }

            System.out.println();
        }

    }

    public static Matrix add(Matrix a, Matrix b) throws MatrixException {
        if (a.rows != b.rows || a.columns != b.columns)
        {
            throw new MatrixException("Nem lehet osszeadni");
        }
        for (int i = 0; i < a.rows; i++)
            for (int j = 0; j < b.columns; j++)
                a.getData()[i][j] += b.getData()[i][j];
        return a;
    }

    public static Matrix multiply(Matrix a, Matrix b) throws MatrixException {
        if (a.columns != b.rows) {
            throw new MatrixException("Nem lehet szorozni");
        }
        Matrix c = new Matrix(a.rows, b.columns);
        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < a.columns; j++) {
                for (int k = 0; k < a.columns; k++) {
                    c.getData()[i][j] += a.getData()[i][k] * b.getData()[k][j];
                }
            }
        }
        return c;
    }

    public static Matrix transpose(Matrix a) {
        Matrix b = new Matrix(a.columns, a.rows);
        for (int i = 0; i < b.rows; i++) {
            for (int j = 0; j < b.columns; j++)
                b.getData()[i][j] = a.getData()[j][i];
        }
        return b;
    }
}
