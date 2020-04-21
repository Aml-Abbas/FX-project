import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class MyFile {
    private File file;
    private Formatter formatter;
    private Scanner scan;
    private StringBuilder sb= new StringBuilder();

    public MyFile(String fileName) throws FileNotFoundException {
        this.file= new File("C:\\Users\\Dell\\Documents\\study\\Obejktorienterad modellering\\FX-project\\src\\main\\resources\\"+fileName+".txt");
        try {
            scan= new Scanner(file);
        } catch (Exception e){
            System.out.println("scan fel");
        }
        if(file.exists()){
            System.out.println(file.getName()+" is exists");
            readFile();
        }
            try {
                // om vi inte har filen så skapas den åt oss
                formatter= new Formatter("C:\\Users\\Dell\\Documents\\study\\Obejktorienterad modellering\\FX-project\\src\\main\\resources\\"+fileName+".txt");
                this.file= new File("C:\\Users\\Dell\\Documents\\study\\Obejktorienterad modellering\\FX-project\\src\\main\\resources\\"+fileName+".txt");
            }catch (Exception e){
                System.out.println("u got an error while creating a file");
            }

    }
    public void readFile(){
            while (scan.hasNext()){
                sb.append(scan.nextLine()+"\n");
            }
    }
    public void add(String word){
        readFile();
        sb.append(word+"\n");

    }
    public void close(){
        formatter.format(sb.toString());
        formatter.close();
    }
}
