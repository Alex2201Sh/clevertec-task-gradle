package by.shumilov;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().register("greet", task -> {
            task.doLast(s -> System.out.println("Hello from plugin 'by.shumilov.my-plugin'"));
        });
    }
}