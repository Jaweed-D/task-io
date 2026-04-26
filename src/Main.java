import java.io.File;

public class Main {
    public static void main(String[] args) {

        File mainFolder = new File("C:\\Users\\user\\Documents\\io");
        mainFolder.mkdir();

        Util.createSubfolder(mainFolder,"car");
        Util.createNestedSubfolder(mainFolder,"truck\\engine\\parts");
        Util.folderHierarchy(mainFolder);
        Util.deleteFolder(mainFolder,"car");



    }
}
