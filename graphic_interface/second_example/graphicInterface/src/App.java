import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        createFile("prueba1.java");
    }

    //function that creates a new file
    public static void createFile(String fileName) throws Exception {
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }
    }
}
