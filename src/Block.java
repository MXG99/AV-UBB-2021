public class Block {
    private int size;
    private double[][] matrix;
    private int[][] integerMatrix;
    private String colorType;

    Block(int size, String colorType) {
        this.size = size;
        this.colorType = colorType;
        matrix = new double[size][size];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public String getColorType() {
        return colorType;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                string += matrix[i][j] + " ";
            }
            string += "\n";
        }
        return string;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getIntegerMatrix() {
        return integerMatrix;
    }

    public void setIntegerMatrix(int[][] integerMatrix) {
        this.integerMatrix = integerMatrix;
    }
}
