import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ReadFile {
    private Formatter file;
    private Scanner scan;

    public ReadFile(String file) throws FileNotFoundException {
        this.file= new Formatter("C:\\Users\\Dell\\Documents\\study\\Obejktorienterad modellering\\FX-project\\src\\main\\resources\\"+file+".txt");
        scan= new Scanner(file);
    }
    public void readFile(){
        while (scan.hasNext()){
            String nbr= scan.next();
            String firstName= scan.next();
            String secondName= scan.next();
            String doing= scan.next();
            System.out.println(nbr+firstName+secondName+doing);
        }
    }
}
