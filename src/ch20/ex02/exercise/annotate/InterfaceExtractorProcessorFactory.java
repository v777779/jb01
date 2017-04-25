package ch20.ex02.exercise.annotate;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

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
        return Collections.singleton("ch20.ex02.exercise.dbase.ExtractInterface"); // путь до класса аннотации
    }

    @Override
    public AnnotationProcessor getProcessorFor(             // метод вызывается apt
                                                            Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment env) {
       return new InterfaceExtractorProcessor(env);
    }
}
