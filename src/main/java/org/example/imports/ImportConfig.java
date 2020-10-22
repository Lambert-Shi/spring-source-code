package org.example.imports;

import org.example.importselector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Dog.class,RegisterConfig.class, MyImportSelector.class})
@Configuration
public class ImportConfig {
}
