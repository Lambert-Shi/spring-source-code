package org.example.importselector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyImportSelector.class)
@Configuration
public class ImportSelectorConfig {
}
