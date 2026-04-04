import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixZeroesTest {

    private final MatrixZeroes solution = new MatrixZeroes();

    private void assertMatrixEquals(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length, "numero de linhas diferente");

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i], "erro na linha " + i);
        }
    }

    @Test
    void basicCase() {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {1,0,1},
                {0,0,0},
                {1,0,1}
        };

        assertMatrixEquals(expected, matrix);
    }

    @Test
    void zeroInFirstRow() {
        int[][] matrix = {
                {0,1},
                {1,1}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {0,0},
                {0,1}
        };

        assertMatrixEquals(expected, matrix);
    }

    @Test
    void zeroInFirstColumn() {
        int[][] matrix = {
                {1,1},
                {0,1}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {0,1},
                {0,0}
        };

        assertMatrixEquals(expected, matrix);
    }

    @Test
    void multipleZeros() {
        int[][] matrix = {
                {1,0,1},
                {1,1,1},
                {1,1,0}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {0,0,0},
                {1,0,0},
                {0,0,0}
        };

        assertMatrixEquals(expected, matrix);
    }

    @Test
    void noZeros() {
        int[][] matrix = {
                {1,1},
                {1,1}
        };

        int[][] expected = {
                {1,1},
                {1,1}
        };

        solution.setZeroes(matrix);

        assertMatrixEquals(expected, matrix);
    }

    @Test
    void allZeros() {
        int[][] matrix = {
                {0,0},
                {0,0}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {0,0},
                {0,0}
        };

        assertMatrixEquals(expected, matrix);
    }

    @Test
    void singleRow() {
        int[][] matrix = {
                {1,0,1}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {0,0,0}
        };

        assertMatrixEquals(expected, matrix);
    }

    @Test
    void singleColumn() {
        int[][] matrix = {
                {1},
                {0},
                {1}
        };

        solution.setZeroes(matrix);

        int[][] expected = {
                {0},
                {0},
                {0}
        };

        assertMatrixEquals(expected, matrix);
    }
}