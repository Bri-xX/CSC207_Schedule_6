module com.example.project6maven {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    //requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens main to javafx.fxml;
    exports main;
    exports entity;
    opens entity to javafx.fxml;
    exports controller.Schedule;
    opens controller.Schedule to javafx.fxml;
    exports controller.Task;
    opens controller.Task to javafx.fxml;
    exports controller.Category;
    opens controller.Category to javafx.fxml;
    exports controller.User;
    opens controller.User to javafx.fxml;
    exports controller.Import;
    opens controller.Import to javafx.fxml;
    exports entity.Category;
    opens entity.Category to javafx.fxml;
    exports entity.Schedule;
    opens entity.Schedule to javafx.fxml;
    exports entity.Task;
    opens entity.Task to javafx.fxml;
    exports entity.User;
    opens entity.User to javafx.fxml;
    requires javafx.graphics;
    //requires mysql.connector.j;
    requires com.calendarfx.view;
    requires mongo.java.driver;
    requires org.mnode.ical4j.core;
}