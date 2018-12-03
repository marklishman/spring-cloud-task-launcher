package io.lishman.tasklauncher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class TaskLauncherApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskLauncherApplication.class, args);
    }
}
