import java.io.FileNotFoundException;
//https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
public class Main {

    public static void main(String[] args) {
        try {
            Matrix obj = new Matrix("C:\\teste\\input.txt");
            int searched = 32;
            System.out.println(obj);
            System.out.println("Searched number: " + searched);
            System.out.println("Search result: " + obj.search(32));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
