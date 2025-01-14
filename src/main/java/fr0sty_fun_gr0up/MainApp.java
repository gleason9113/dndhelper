package fr0sty_fun_gr0up;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox layout = new VBox(10);
        Button createButton = new Button("New");
        Button editButton = new Button("Edit");
        Button exportButton = new Button("Export to PDF");

        layout.getChildren().addAll(createButton, editButton, exportButton);

        stage.setScene(new Scene(layout, 400, 300));
        stage.setTitle("DnD Helper");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}