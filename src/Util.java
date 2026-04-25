import java.io.File;

public class Util {

    public static void createSubfolder( String folderName){
        String directory="C:\\Users\\user\\Documents\\io\\"+folderName;
        File subFolder = new File(directory);
        if(!subFolder.exists()){
            subFolder.mkdir();
        }
    }

    public static void createNestedSubfolder( String folderNames){
        String directory="C:\\Users\\user\\Documents\\io\\"+folderNames;
        File subFolders = new File(directory);
        if(!subFolders.exists()){
            subFolders.mkdirs();
        }
    }

    public static void folderHierarchy() {
        File files = new File("C:\\Users\\user\\Documents\\io");
        File[] file = files.listFiles();
        for (File f : file) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
            }
        }
    }

    public static void deleteFolder(String folderName){
        String directory="C:\\Users\\user\\Documents\\io\\"+folderName;
        File subFolders = new File(directory);
        subFolders.delete();
    }



}