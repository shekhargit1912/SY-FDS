import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) throws IOException {
        String sname;
        File file = new File("a.txt");

        FileWriter writer = new FileWriter(file);
        Scanner sc = new Scanner(file);
        try {
            if (file.createNewFile()) {
                System.out.println("File is created");

            } else {
                System.out.println("file alredy exists");
                System.out.println("name of that file is:- " + file.getName());
            }

            Scanner scanner = new Scanner(System.in);
            sname = scanner.nextLine();
            int rollno = scanner.nextInt();
            int marks = scanner.nextInt();
            writer.write("NAme:-" + sname + "  rollno _:" + rollno + " marks:-" + marks);
            writer.close();
            System.out.println("updated");
            while (sc.hasNextLine()) {
                String sc1 = sc.nextLine();
                System.out.println(" " + sc1);

            }
            sc.close();

        } catch (IOException e) {
        }

    }

}

