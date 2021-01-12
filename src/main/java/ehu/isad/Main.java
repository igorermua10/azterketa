package ehu.isad;

import ehu.isad.controllers.ui.ProbaController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  private Parent root;
  private Stage stage;
  private ProbaController probaController;

  @Override
  public void start(Stage primaryStage) throws Exception {
    stage= primaryStage;
    this.pantailakKargatu();
    stage.setTitle("Azterketa");
    stage.setScene(new Scene(root));
    stage.show();
  }

  private void pantailakKargatu() throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/proba.fxml"));
    root = (Parent) loader.load();
    probaController= loader.getController();
    probaController.setMainApp(this);
  }


  public static void main(String[] args) {
    launch(args);
  }
}
