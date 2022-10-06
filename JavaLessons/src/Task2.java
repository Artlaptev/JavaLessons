import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getFormates(getFilesInCurrentDirectory()).toString());
    }

    public static File[] getFilesInCurrentDirectory(){
        String path=System.getProperty("user.dir");
        return  Task1.getContentByDirectoryPath(path);        
    }
    public static String getFileFormat(String fileName){
        try {
            return  fileName.substring(fileName.indexOf("."));
        }
        catch(Exception e) {
            return "is Folder";
        }
    }
    public static StringBuilder getFormates (File[] fArray) {
        StringBuilder sb=new StringBuilder();
        int num=0;
        for (File f:fArray
             ) {
            num++;
            sb.append(num).append(" расширение файла: ").append(getFileFormat(f.getName())).append("\n");
        }
        return sb;
    }
}
