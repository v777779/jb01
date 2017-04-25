package ch20.ex02m.codea.annotate;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.util.ElementFilter;
import javax.tools.JavaFileObject;
import java.io.PrintWriter;
import java.util.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@SupportedAnnotationTypes("*")  // или вписать String[]={"ch20.ex02m.codea.EIFace72","ch20.ex02m.codea.EIVace75"}
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class IFEProcC extends AbstractProcessor {  // расширение абстрактного класса с одним методом
    private List<ExecutableElement> list = new ArrayList<>();

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        for (Element element : env.getRootElements()) { //.getElementsAnnotatedWith(EIFace72.class)) { // сортировка по аннотации
            ExtractInterface annotate = element.getAnnotation(ExtractInterface.class);
//          EIFace72 dbase = element.getAnnotation(EIFace72.class); // можно несколько открутить
            if (annotate == null) {
                break; // выходим если нет связи
            }
            for (ExecutableElement method : ElementFilter.methodsIn(element.getEnclosedElements())) {  // вытащить только методы
                Set<Modifier> set = method.getModifiers();
                if (set.contains(Modifier.PUBLIC) && !set.contains(Modifier.STATIC)) {
                    list.add(method);
                }
            }

            if (list.size() > 0) {  // набрали методов
                System.out.println("javac processing started");
                try {
                    JavaFileObject jfo = processingEnv.getFiler().createSourceFile(annotate.value());
                    PrintWriter pw = new PrintWriter(jfo.openWriter());
                    PackageElement pkg = (PackageElement)element.getEnclosingElement();
                    pw.println("package "+ pkg.getQualifiedName()+";\n");
                    pw.println("public interface "+annotate.value()+" {");

                    for (ExecutableElement method : list) {
                        pw.print("    public ");
                        pw.print(method.getReturnType()+" ");
                        pw.print(method.getSimpleName()+" (");
                        int i = 0;
                        for (VariableElement param : method.getParameters()) {
                            pw.print(param.asType()+" "+param.getSimpleName());
                            if (++i < method.getParameters().size()) {
                                pw.print(", ");
                            }
                        }
                        pw.println(");");
                    }
                    pw.println("}\n");

                    pw.close();

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return true;
    }
}
