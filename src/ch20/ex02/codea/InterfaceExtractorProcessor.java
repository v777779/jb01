package ch20.ex02.codea;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.ArrayList;
import java.util.Set;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
public class InterfaceExtractorProcessor extends AbstractProcessor{  // расширение абстрактного класса с одним методом
private final ProcessingEnvironment env;
private ArrayList<ExecutableElement>  interfaceMethods = new ArrayList<>();

    public InterfaceExtractorProcessor(ProcessingEnvironment env) {
        this.env = env;
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {


        return false;
    }



}
