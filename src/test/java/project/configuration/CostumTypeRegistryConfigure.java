package project.configuration;

import cucumber.api.TypeRegistry;
import cucumber.runtime.DefaultTypeRegistryConfiguration;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import project.data.LogOnAutomationPracticePageData;

import java.util.Locale;

public class CostumTypeRegistryConfigure extends DefaultTypeRegistryConfiguration {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(defineLogOnAutomationPracticeForm());
    }


    public DataTableType defineLogOnAutomationPracticeForm() {
        return new DataTableType(LogOnAutomationPracticePageData.class,
                (TableEntryTransformer<LogOnAutomationPracticePageData>) dataRow -> {

                    LogOnAutomationPracticePageData logAutomationPracticePageData = new LogOnAutomationPracticePageData();

                    logAutomationPracticePageData.setEmailAddress(dataRow.get("emailAddress"));
                    logAutomationPracticePageData.setPassword(dataRow.get("password"));

                    return logAutomationPracticePageData;
                });


    }

}
