package ch20.ex02.codea;


import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
public class InterfaceExtractorProcessor implements AnnotationProcessor {  // расширение абстрактного класса с одним методом
    private final AnnotationProcessorEnvironment env;
    private ArrayList<MethodDeclaration> listInterfaceMethods = new ArrayList<>();

    public InterfaceExtractorProcessor(AnnotationProcessorEnvironment env) {
        this.env = env;
    }

    @Override
    public void process() {

        for (TypeDeclaration type : env.getSpecifiedTypeDeclarations()) {
            System.out.println("class:"+type.getSimpleName());
            ExtractInterface annotation = type.getAnnotation(ExtractInterface.class);
            if (annotation == null) {
                break;  // выскочить наружу  из for
            }
            for (MethodDeclaration method : type.getMethods()) {
                Collection<Modifier> cMd = method.getModifiers();
                if (cMd.contains(Modifier.PUBLIC) && !cMd.contains(Modifier.STATIC)) {
                    listInterfaceMethods.add(method);  // набирает методы public not static
                }
            }

            if (listInterfaceMethods.size() > 0) {
                try {
                    PrintWriter pw = env.getFiler().createSourceFile(annotation.value()); // открыть файл по имени аннотации
// строим файл
                    pw.println("package " + type.getPackage().getQualifiedName() + ";");    // package...
                    pw.println();
                    pw.println("public interface " + annotation.value() + " {");            // public interface ...
                    for (MethodDeclaration method : listInterfaceMethods) {
                        pw.print("    public ");                                        // public void name(...
                        pw.print(method.getReturnType() + "    ");
                        pw.print(method.getSimpleName() + " (");
                        int i = 0;
                        for (ParameterDeclaration param : method.getParameters()) {
                            pw.print(param.getType() + " " + param.getSimpleName());
                            if (++i < method.getParameters().size()) {                   // Int i, ...
                                pw.print(" ,");
                            }
                        }
                        pw.println(");");                                         //  ..);
                    }
                    pw.println("}");                                            // }
                    pw.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
