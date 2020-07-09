package myassiment;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class serachFile {

	 public static void getSerach(File stockdirName, String fileNameSe) {

	        File[] children=stockdirName.listFiles();
	        Arrays.sort(children, new Comparator()
	        {
	            @Override
	            public int compare(Object f1, Object f2) {
	                return ((File) f1).getName().compareTo(((File) f2).getName());
	            }

	        });
	        String[] name= new String[children.length];
	        int flag=-1;

	        for(int i=0;i<children.length;i++) {
	            name[i]=children[i].getName().toString();
	            System.out.println(i+1+" "+name[i]);
	        }
	        for (int i=0;i<name.length;i++) {
	            if (name[i].equals(fileNameSe)) {
	                flag = i+1;
	                break;
	            }
	        }

	        if(flag==-1) {
	            System.out.println("File not found");
	        }
	        else {
	            System.out.println("File found at location :"+flag);
	        }
	    }
}
