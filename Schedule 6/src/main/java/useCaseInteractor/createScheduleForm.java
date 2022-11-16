package useCaseInteractor;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.LoginPage;
import useCaseInteractor.userCollection;
public class createScheduleForm {

    public static void newForm() {
        try {
            Label label = new Label("My Label");
            Group root = new Group();
            root.getChildren().add(label);

            FXMLLoader fxmlLoader = new FXMLLoader(LoginPage.class.getClassLoader().getResource("userTimeTable.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1099, 700);
            Stage loginStage = new Stage();
            loginStage.initStyle(StageStyle.DECORATED);
            loginStage.setScene(scene);
            loginStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
