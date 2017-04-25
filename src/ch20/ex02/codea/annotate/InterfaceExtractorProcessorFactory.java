package ch20.ex02.codea.annotate;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 22-Apr-17.
 */
public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptySet();  // пустой набор опций
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {
        return Collections.singleton("ch20.ex02.codea.dbase.ExtractInterface"); // путь до класса аннотации
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set,         // метод вызывается apt
                                               AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }
}
