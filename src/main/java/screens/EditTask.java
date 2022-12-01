package screens;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.TodoPage;

public class EditTask {
    public static void newForm() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(TodoPage.class.getClassLoader().getResource("TaskEdit.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 450);
            Stage taskStage = new Stage();
            taskStage.initStyle(StageStyle.DECORATED);
            taskStage.setScene(scene);
            taskStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}