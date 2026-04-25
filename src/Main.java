import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\Documents\\io");
        file.mkdir();

        Util.createSubfolder("cavid2");
        Util.createNestedSubfolder("cavid4\\cavid\\cavidddd");
        Util.folderHierarchy();
        Util.deleteFolder("cavid1");



    }
}
