import java.io.File;

public class Util {

    public static void createSubfolder(File mainFolder, String folderName) {
        File subFolder = new File(mainFolder, folderName);
        if (!subFolder.exists()) {
            subFolder.mkdir();
        }
    }

    public static void createNestedSubfolder(File mainFolder, String folderNames) {
        File subFolders = new File(mainFolder, folderNames);
        if (!subFolders.exists()) {
            subFolders.mkdirs();
        }
    }

    public static void folderHierarchy(File mainFolder) {
        File[] file = mainFolder.listFiles();
        if (file != null) {
            for (File f : file) {
                if (f.isDirectory()) {
                    System.out.println("Qovluq: " + f.getName());
                }
            }
        } else {
            System.out.println("Göstərilən qovluq tapılmadı");
        }
    }

    public static void deleteFolder(File mainFolder, String folderName) {
        File subFolders = new File(mainFolder, folderName);
        if (subFolders.exists()) {
            boolean flag = subFolders.delete();
            if (flag) {
                System.out.println("Qovluq silindi");
            } else {
                System.out.println("Qovluq silinmədi. Daxilində fayl ola bilər.");
            }
        }else{
            System.out.println("Qovluq mövcud deyil.");
        }
    }
}


