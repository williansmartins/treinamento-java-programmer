package br.com.impacta.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SorveteriaFXML extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/resources/Sorveteria.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }
}

//        scene.setFill(LinearGradient.valueOf("from 0% 0% to 100% 100%, yellow  0% , black 30%,  green 100%"));
//        scene.setFill(RadialGradient.valueOf("center 100px 100px, radius 200px, red  0%, blue 30%, black 100%"));
//        scene.setFill(new ImagePattern(new Image(getClass().getResourceAsStream("/resources/background.jpg"))));
//        scene.setFill(Color.FIREBRICK);
