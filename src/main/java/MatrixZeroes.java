public class MatrixZeroes {
    /**
     * Modifica a matriz in-place: zerando toda a linha e coluna
     * que contenha ao menos um elemento zero.
     *
     * Complexidade: O(M*N) tempo, O(1) espaço.
     *
     * @param matrix matriz MxN de inteiros, modificada diretamente
     */
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowHasZero = hasZeroInFirstRow(matrix, cols);
        boolean firstColumnHasZero = hasZeroInFirstColumn(matrix, rows);

        //usa a primeira linha e coluna como marcadores para evitar alocação de espaço extra
        markZero(matrix, rows, cols);
        applyZero(matrix, rows, cols);

        //a primeira linha e coluna so devem ser zeradas no final, após applyZero consumir os marcadores
        if(firstRowHasZero){zeroFirstRow(matrix, cols);}
        if(firstColumnHasZero){zeroFirstColumn(matrix, rows);}
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