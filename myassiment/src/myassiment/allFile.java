package myassiment;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class allFile {

	public void getFileName(File stockdir){


        if(stockdir.list().length <=0) {
            System.out.println("Directory is Empty");
        }

        //File directory = new File(saveFileNameInDirectory);
        File[] contentsOfDirectory=stockdir.listFiles();
        Arrays.sort(contentsOfDirectory, new Comparator()
        {
            @Override
            public int compare(Object f1, Object f2) {
                return ((File) f1).getName().compareTo(((File) f2).getName());
            }

        });



        for(File file:contentsOfDirectory)
        {
            System.out.println(file.getName());
        }
}
}
