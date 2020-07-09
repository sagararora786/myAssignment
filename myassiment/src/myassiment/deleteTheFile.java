package myassiment;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class deleteTheFile {

	public void getDeleteTheFile(File stockdir) {
        File[] children = stockdir.listFiles();
        String[] name = new String[children.length];
        for (int i = 0; i < children.length; i++) {
            name[i] = children[i].getName().toString();
            System.out.println(i + 1 + " " + name[i]);
        }
        System.out.println("Enter the Filename to be deleted");
        Scanner scanner = new Scanner(System.in);
        String deleteFileName1 = scanner.nextLine();
        String deleteFileName="";
        while (deleteFileName1.isEmpty()) {
            System.out.println(deleteFileName1);
            if (deleteFileName1.isEmpty()) {
                System.out.println("Enter key is Pressed");
                System.out.println("Please don't press ENTER key please enter it again");
            }

            if (scanner.hasNextLine()) {
                deleteFileName1 = scanner.nextLine();
            }

        }
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(deleteFileName1)) {

                deleteFileName = deleteFileName1;
            }
        }
            Path pathOfFile = Paths.get("/home/ubuntu/eclipse-workspace/stockdir/" + deleteFileName);


        // boolean name= fileExistsCaseInsensitive("D:/UnLookedMe/stockdir/"+deleteFileName)
        try {

            boolean results = Files.deleteIfExists(pathOfFile);
            if (results) {
                System.out.println("File is deleted");
            }else {
                System.out.println("File Not Found");
            }

        } catch (Exception e) {

                System.out.println("File Not Found");

        }

    }

}
