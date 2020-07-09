package myassiment;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {	
		

		    public static void main(String[] args) {
		        boolean dirflag = false;
		        allFile f1 = new allFile();
		        fileNameDisplay fName= new fileNameDisplay();
		        deleteTheFile  dName= new deleteTheFile();
		        serachFile sName= new serachFile();

		        File stockdir = new File("/home/ubuntu/eclipse-workspace/stockdir/");
		        try {

		            dirflag = stockdir.mkdir();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        System.out.println("----------------------------------------------------------------------------------------------");
		        System.out.println("Welcome to LockedMe.com of Company Lockers Pvt. Ltd");
		        System.out.println("LoockedMe.com");
		        System.out.print("SAGAR ARORA");
		        System.out.println("\n2 Year Java Developer");
		        System.out.println("\n------------------------------------------------------------------------------------------------");
		        System.out.println("This are the features of this Application:");
		        while (true) {
		            int count = 0;
		            int flag = 0;

		            System.out.println("1.Current File names in directory\n2.Bussines level operation\n3.Close the application");
		            System.out.println("Enter Your Option listed above :");
		            Scanner in = new Scanner(System.in);
		            try {
		                flag = in.nextInt();
		            } catch (Exception e) {
		                System.out.println("Enter the Incorrect input please try again");
		                continue;
		            }

		            switch (flag) {

		                case 1:
		                    f1.getFileName(stockdir);
		                    break;

		                case 2:
		                    while (true && count!=4) {
		                        System.out.println("1.Create a file \n2.Deleted the file \n3.Searched a file \n4.Go Back to main menu");
		                        Scanner input=new Scanner(System.in);
		                         try {
		                             count = input.nextInt();
		                         }catch(Exception e) {
		                             System.out.println("Try somethink else");
		                           continue;
		                         }
		                        switch (count) {

		                            case 1:
		                                fName.getCreateFileName();
		                                break;
		                            case 2:
		                               dName.getDeleteTheFile(stockdir);
		                                break;
		                            case 3:
		                                System.out.println("Enter the file that need to serached");
		                                Scanner scanner= new Scanner(System.in);
		                                String fileNameSerached = scanner.nextLine();
		                                while(fileNameSerached.isEmpty()) {
		                                    System.out.println("Enter Key is Pressed");
		                                    if(scanner.hasNextLine()) {
		                                        fileNameSerached=scanner.nextLine();
		                                    }

		                                }


		                                sName.getSerach(stockdir,fileNameSerached);
		                                break;

		                            case 4:
		                                System.out.println("Going back to Previous Menu");
		                                break;
		                            default:
		                                System.out.println("Wrong input");
		                                continue;

		                        }
		                    }
		                    break;
		                case 3:
		                    System.out.println("Enter to exist the program");
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Wrong option try to enter a valid option");
		                    continue;

		            }

		        }
		    }

		}
