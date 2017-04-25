package lib.files;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 24-Apr-17.
 */
public class JComp {
//    private static List<File> getFile(File tempDir, String ext) {
//        File[] aFiles = new File[]{new File("src/ex03/codeb/Mult.java")};
//        List<File> files = new ArrayList<>(Arrays.asList(aFiles));
//        return files;
//    }

    private static List<File> getAllFiles(String tempDir, String regex) {
        List<File> files = Catalog.walk(tempDir, regex).getListFiles();
        return files;
    }

    private static String getMyClasspath() {
        return "out/production/jb01";
    }

    private static String getMyClassOutPath() {
        return "out/production/jb01";
    }



    public static void compileJava(String sourcePath, String fileProc, String... regex) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            throw new RuntimeException("JDK required (running inside of JRE)");
        }

        DiagnosticCollector<JavaFileObject> diagnostics =
                new DiagnosticCollector<>();
        StandardJavaFileManager fileManager =
                compiler.getStandardFileManager(diagnostics, null, null);

        try {
            Iterable<? extends JavaFileObject> compilationUnits =
                    fileManager.getJavaFileObjectsFromFiles(getAllFiles(sourcePath, (regex.length > 0)?regex[0]:".*.java"));

            ArrayList<String> options = new ArrayList<>();
            String classPath = getMyClasspath();
            if (classPath != null) {
                options.add("-classpath");
                options.add(classPath);
            }
            String classOutPath = getMyClassOutPath();
            if (classOutPath != null) {
                options.add("-d");
                options.add(classOutPath);
            }

            String sourceOutPath = sourcePath;
            if (sourceOutPath != null) {
                options.add("-s");
                options.add(sourceOutPath);
            }
            String processorPath = fileProc;
            if (processorPath != null) {
                options.add("-processor");
                options.add(processorPath);
            }
//            System.out.println("Working Directory = " + System.getProperty("user.dir"));
            JavaCompiler.CompilationTask task = compiler.getTask(
                    null,
                    fileManager,
                    diagnostics,
                    options,
                    null,
                    compilationUnits);
            if (!task.call()) {
                Locale myLocale = Locale.getDefault();
                StringBuilder msg = new StringBuilder();
                msg.append("Cannot compile to Java bytecode:");
                for (Diagnostic<? extends JavaFileObject> err : diagnostics.getDiagnostics()) {
                    msg.append('\n');
                    msg.append(err.getKind());
                    msg.append(": ");
                    if (err.getSource() != null) {
                        msg.append(err.getSource().getName());
                    }
                    msg.append(':');
                    msg.append(err.getLineNumber());
                    msg.append(": ");
                    msg.append(err.getMessage(myLocale));
                }
                throw new RuntimeException(msg.toString());
            }

        } finally {
            try {
                fileManager.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
