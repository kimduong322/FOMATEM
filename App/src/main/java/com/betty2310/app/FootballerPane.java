package com.betty2310.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FootballerPane {
    public void queryClubAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FootballerOverview.fxml"));
            Parent window = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Footballer Overview");
            stage.setScene(new Scene(window));
            stage.show();
        } catch (IOException e) {
            System.out.println("Can't load Footballer Overview window.");
        }
    }
}
