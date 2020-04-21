import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class MainFile {
    public static void main(String [] args) throws FileNotFoundException {

        //har redan filen
        File file= new File("C:\\Users\\Dell\\Documents\\study\\Obejktorienterad modellering\\FX-project\\src\\main\\resources\\file.txt");
        if(file.exists()){
            System.out.println(file.getName()+" is exists");
        }else {
            System.out.println("is not exists but we created the file");
        }

        //create a file
        Formatter createFile;
        try {
            // om vi inte har filen så skapas den åt oss
            createFile= new Formatter("C:\\Users\\Dell\\Documents\\study\\Obejktorienterad modellering\\FX-project\\src\\main\\resources\\createFile.txt");
            System.out.println("u created a file");
        }catch (Exception e){
            System.out.println("u got an error");
        }

        //skapa om den är inte skapats och ändra eller bara ändra
       MyFile myFile= new MyFile("myFile");
       myFile.add("first");
        myFile.add("second");

        myFile.close();
    }
}
