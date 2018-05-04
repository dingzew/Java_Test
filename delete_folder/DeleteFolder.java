import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File file =  new File("/Users/dingzew/Documents/testDir");
        System.out.println(deleteDirectory(file));
    }


    public static boolean deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDirectory(children[i]);
                if (!success) {
                    return false;
                }
            }
        } // either file or an empty directory System.out.println("removing file or directory : " + dir.getName()); return dir.delete(); }
        System.out.println("removing file or directory : " + dir.getName());
        return dir.delete();
    }
}
