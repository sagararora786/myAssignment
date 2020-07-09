package myassiment;
import java.io.File;
import java.util.Scanner;

public class fileNameDisplay {

	 public void getCreateFileName(){
	        Scanner scanner = new Scanner( System.in );
	        System.out.println("Enter the file name");
	        String fileName=scanner.nextLine();
	        while(fileName.isEmpty()) {
	            System.out.println(fileName);
	            if(fileName.isEmpty()) {
	                System.out.println("Enter Key Pressed Please enter the valid file name");
	            }

	            if(scanner.hasNextLine()) {
	                fileName=scanner.nextLine();

	            }

	        }
	        String saveFileNameInDirectory="/home/ubuntu/eclipse-workspace/stockdir/"+fileName;
	            try {
	                File myObj = new File(saveFileNameInDirectory);
	                if (myObj.createNewFile()) {
	                    System.out.println("File created susccussfully :" + myObj.getName());
	                } else {
	                    System.out.println("File already exists");
	                }
	            } catch (Exception e) {
	                e.getStackTrace();
	            }


	 }
}
