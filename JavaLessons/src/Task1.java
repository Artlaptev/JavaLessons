import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task1 {
    public static void main(String[] args) {
        File[] f=getContentByDirectoryPath("C:\\");
        System.out.println(writeArrayInFile(f));
    }

    public static File[] getContentByDirectoryPath(String path) {
        try {
            File file = new File(path);
            return file.listFiles();
        } catch (NullPointerException e) {
            return new File[0];
        }
    }



    public static boolean writeArrayInFile(File[] array) {
        Logger logger= Logger.getLogger(Main.class.getName());
        FileHandler fh=null;
        try {
            fh=new FileHandler("log.txt");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        SimpleFormatter simpleFormatter=new SimpleFormatter();
        fh.setLevel(Level.INFO);
        fh.setFormatter(simpleFormatter);
        logger.addHandler(fh);

        StringBuilder sb=new StringBuilder();
        for (File item:array) {
            sb.append(item.toString()).append("\n");
        }
        File file = new File("out.txt");
        FileWriter fileWriter=null;
        if (!file.exists()) {
            try {
                file.createNewFile();
                fileWriter=new FileWriter(file);
                fileWriter.write(sb.toString());
                fileWriter.flush();

            } catch (Exception e) {
                e.printStackTrace();
                return  false;
            }finally {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    return  false;
                }
            }
        }
        return true;
    }

}
