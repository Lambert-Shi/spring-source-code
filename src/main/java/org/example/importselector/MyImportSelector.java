package org.example.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"org.example.importselector.Dog", "org.example.importselector.User"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return className -> className.contains("Dog");
    }
}
