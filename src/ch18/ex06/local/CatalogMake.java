package ch18.ex06.local;

import java.io.File;

/**
 * Created by V1 on 06-Apr-17.
 */
public class CatalogMake {
    private static void fileUsage() {
        System.err.println(
                "Usage: CatalogMake path1...\n" +
                        "Creates each path\n" +
                        "Usage: CatalogMake -d path1...\n" +
                        "Deletes each path\n" +
                        "Usage: CatalogMake -r path1 path2\n" +
                        "Renames from path1 to path2\n"
        );
    }

    private static void fileInfo(File file) {
        System.out.println(
                "Absolute path:" + file.getAbsolutePath() +
                        "\nCan read :" + file.canRead() +
                        "\nCan write:" + file.canWrite() +
                        "\ngetName  :" + file.getName() +
                        "\ngetParent:" + file.getParent() +
                        "\ngetPath  :" + file.getPath() +
                        "\nlength   :" + file.length() +
                        "\nmodified :" + file.lastModified());
        if (file.isFile()) {
            System.out.println("It's a file");
        }
        if (file.isDirectory()) {
            System.out.println("It's a directory");
        }
    }

    public static void fileManage(String[] args) {
        if (args == null || args.length < 1) {
            fileUsage();
            return;
        }
        switch (args[0]) {
            case "-r":
                if (args.length == 3) {
                    fileRename(args);
                } else {
                    fileUsage();
                }
                break;
            case "-d":
                if (args.length >= 2) {
                    fileDelete(args);
                } else {
                    fileUsage();
                }
                break;
            default:
                fileCreate(args);
                break;
        }

    }

    public static void fileRename(String[] args) {
// catalog or file rename
        File fileOld = new File(args[1]);
        File fileNew = new File(args[2]);
        if (!fileOld.exists()) {
            System.out.println("File old not found:" + fileOld);
            return;
        }
        if (fileNew.exists()) {
            System.out.println("File new exists:" + fileNew);
            return;
        }

        fileOld.renameTo(fileNew);
        if (fileNew.exists()) {
            System.out.println("File renamed:" + fileNew);
        } else {
            System.out.println("File not renamed");

        }
//            fileInfo(oldName);
//            fileInfo(newName);

    } // fileRename

    public static void fileDelete(String[] args) {
// catalog or file rename
        int index = 1;
        while (index < args.length) {
            File file = new File(args[index++]);
            if (file.exists()) {
                file.delete();
                System.out.println("File deleted:" + file);
            } else {
                System.out.println("File not found:" + file);
            }
        }
    }

    public static void fileCreate(String[] args) {
// catalog or file rename
        int index = 0;
        while (index < args.length) {
            File file = new File(args[index++]);
            if (file.exists()) {
                System.out.println("File exists:" + file);
            } else {
                file.mkdirs(); // make all directory structure up to this one
                System.out.println("File created:" + file);
            }
        }
    }


}
