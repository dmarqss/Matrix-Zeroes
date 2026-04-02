public class MatrixZeroes {
    public void setZeroes(int[][] matrix) {
        // verifica se a matrix é valida
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // roda a primeira linha verificando se tem 0
        boolean firstRowHasZero = hasZeroInFirstRow(matrix, cols);

        // roda a primeira coluna verificando se tem 0
        boolean firstColumnHasZero = hasZeroInFirstColumn(matrix, rows);

        // roda toda a matrix e marca na primeira linha e coluna onde tem 0
        markZero(matrix, rows, cols);

        // roda toda a matrix aplicando os 0 com base na primeira linha e coluna
        applyZero(matrix, rows, cols);

        // zera a primeira linha caso tenha 0
        if(firstRowHasZero){zeroFirstRow(matrix, cols);}

        // zera a primeira coluna caso tenha 0
        if(firstColumnHasZero){
            zeroFirstColumn(matrix, rows);}
    }

    private boolean hasZeroInFirstRow(int[][] matrix, int cols) {
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasZeroInFirstColumn(int[][] matrix, int rows){
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                return true;
            }
        }
        return false;
    }

    private void markZero(int[][] matrix, int rows, int cols){
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
    }

    private void applyZero(int[][] matrix, int rows, int cols){
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void zeroFirstRow(int[][] matrix, int cols){
        for (int j = 0; j < cols; j++) {
            matrix[0][j] = 0;
        }
    }

    private void zeroFirstColumn(int[][] matrix, int rows){
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 0;
        }
    }

}