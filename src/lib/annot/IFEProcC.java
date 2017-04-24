package lib.annot;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.ElementFilter;
import javax.xml.ws.Action;
import java.util.Set;


/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@SupportedAnnotationTypes("*")  // или вписать String[]={"ch20.ex02m.codea.EIFace72","ch20.ex02m.codea.EIVace75"}
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class IFEProcC extends AbstractProcessor {  // расширение абстрактного класса с одним методом
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {

        System.out.println("javac ***");
        System.out.println("check:***");
        for (Element element : env.getElementsAnnotatedWith(EIFace72.class)) {             // сортировка по аннотации
            for (ExecutableElement method : ElementFilter.methodsIn(element.getEnclosedElements())) { // по методам
                Action action = method.getAnnotation(Action.class);
                System.out.println(element.getSimpleName() + "." + method.getSimpleName());
                if (action == null) {
                    System.out.println("value:null");
                } else {
                    System.out.println("value:" + action.output());
                }

            }
            for (TypeElement annotation : annotations) {
                for (ExecutableElement method : ElementFilter.methodsIn(annotation.getEnclosedElements())) {
                    Action action = method.getAnnotation(Action.class);
                    System.out.println(annotation.getSimpleName() + "." + method.getSimpleName());
                    if (action == null) {
                        System.out.println("value:null");
                    } else {
                        System.out.println("value:" + action.output());
                    }

                }

            }
            EIFace75 an75 = element.getAnnotation(EIFace75.class);
            EIFace72 an72 = element.getAnnotation(EIFace72.class);
            if (an75 != null) {
                System.out.println(an75.value());
            }
            if (an72 != null) {
                System.out.println(an72.value());
            }

        }


        System.out.println("annotation:***");
        for (TypeElement annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println("environment:***");
        for (Element e : env.getRootElements()) {
            System.out.println(e.getSimpleName());
            for (Element element : e.getEnclosedElements()) {
                System.out.println("element:" + element.getKind().name().toLowerCase() + " " +
                        element.getModifiers().iterator().next() + " " +
                        element.asType() + " " + element.getSimpleName());
                ElementKind k = element.getKind();
                System.out.println("kind: if." + k.isInterface() + " fd." + k.isField() + " cs." + k.isClass() + " " + k.name());

            }
        }


        for (TypeElement an : annotations) {
            System.out.println("class:" + an.getSimpleName());
        }

        return true;
    }
}
//    private ArrayList<MethodDeclaration> listInterfaceMethods = new ArrayList<>();
//
//    public InterfaceExtractorProcessor(AnnotationProcessorEnvironment env) {
//        this.env = env;
//    }
//
//    @Override
//    public void process() {
//
//        for (TypeDeclaration type : env.getSpecifiedTypeDeclarations()) {
//            System.out.println("class:"+type.getSimpleName());
//
//            ExtractInterface annotation = type.getAnnotation(ExtractInterface.class);
//            if (annotation == null) {
//                break;  // выскочить наружу  из for
//            }
//            for (MethodDeclaration method : type.getMethods()) {
//                Collection<Modifier> cMd = method.getModifiers();
//                if (cMd.contains(Modifier.PUBLIC) && !cMd.contains(Modifier.STATIC)) {
//                    listInterfaceMethods.add(method);  // набирает методы public not static
//                }
//            }
//
//            if (listInterfaceMethods.size() > 0) {
//                try {
//                    PrintWriter pw = env.getFiler().createSourceFile(annotation.value()); // открыть файл по имени аннотации
//// строим файл
//                    pw.println("package " + type.getPackage().getQualifiedName() + ";");    // package...
//                    pw.println();
//                    pw.println("public interface " + annotation.value() + " {");            // public interface ...
//                    for (MethodDeclaration method : listInterfaceMethods) {
//                        pw.print("    public ");                                        // public void name(...
//                        pw.print(method.getReturnType() + "    ");
//                        pw.print(method.getSimpleName() + " (");
//                        int i = 0;
//                        for (ParameterDeclaration param : method.getParameters()) {
//                            pw.print(param.getType() + " " + param.getSimpleName());
//                            if (++i < method.getParameters().size()) {                   // Int i, ...
//                                pw.print(" ,");
//                            }
//                        }
//                        pw.println(");");                                         //  ..);
//                    }
//                    pw.println("}");                                            // }
//                    pw.close();
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//            }
