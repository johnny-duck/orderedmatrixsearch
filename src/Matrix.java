import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matrix {
    private int[][] m;

    Matrix(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        m = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                output.append(m[i][j]);
                output.append(" ");
            }
            output.append("\n");
        }
        return output.toString();
    }

    public boolean search(int number) {
        boolean found = false;
        int auxLine = 0;
        int auxCol = m[0].length - 1;
        int counter = 0;
        while(auxCol>=0 && auxLine <= m.length - 1) {
            if (number < m[auxLine][auxCol]) {
                auxCol--;
                counter++;
            } else if (number > m[auxLine][auxCol]){
                auxLine++;
                counter++;
            } else {
                found = true;
                break;
            }
        }
        System.out.println("(Counter (test): " + counter + ")");
        return found;
    }
}
