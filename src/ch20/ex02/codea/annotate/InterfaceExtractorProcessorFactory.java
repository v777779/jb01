package ch20.ex02.codea.annotate;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * Copyright (c) 2017 Vadim Voronov
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
        return Collections.singleton("ch20.ex02.codea.annotate.ExtractInterface"); // путь до класса аннотации
    }

    @Override
    public AnnotationProcessor getProcessorFor(             // метод вызывается apt
                                                            Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment env) {
       return new InterfaceExtractorProcessor(env);
    }
}
