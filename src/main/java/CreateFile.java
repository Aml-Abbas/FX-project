import java.io.FileNotFoundException;
import java.util.Formatter;

public class CreateFile {
    private Formatter  file;

    public CreateFile(String file) throws FileNotFoundException {
        this.file= new Formatter("C:\\Users\\Dell\\Documents\\study\\Obejktorienterad modellering\\FX-project\\src\\main\\resources\\"+file+".txt");
    }
    public void openFile(){
        try {
            System.out.println("u opened the file");
        }catch (Exception e){
            System.out.println("error while opening the file");
        }
    }
    public void addRecorde(){
        file.format("%s%s%s","Aml ","Abbas ","writing.");
    }
    public void closeFile(){
        file.close();
    }
}
