import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

@SuppressWarnings("Uncheck")

public class Main extends Application {

  VBox vBox;
  Button animalButton;
  Button humanButton;
  Scene scene;
  Scene selection;
  int i;
  ImageView animalsButton;
  InputStream stream;
  Button xButton;
  Button yButton;
  Label label;
  Label xlabel;
  Label ylabel;
  boolean dataToReturn;
  VBox layout;
  //if Error upon debuging please go read README.md
  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage window) throws Exception {
    window.setTitle("Model randomizer");

    animalButton = new Button();
    animalButton.setGraphic(new buttonImage().animals());
    animalButton.setOnAction(
      e -> {
        try {
          window.setScene(new selectionScene().selectionSceneAnimals());
        } catch (FileNotFoundException e2) {
          // TODO Auto-generated catch block
          e2.printStackTrace();
        }
      }
    );

    humanButton = new Button();
    humanButton.setGraphic(new buttonImage().human());
    humanButton.setOnAction(
      e -> {
        try {
          window.setScene(new selectionScene().selectionSceneHuman());
        } catch (FileNotFoundException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
      }
    );
    
    window.setOnCloseRequest(e -> {
      new popupWindow();
      e.consume();
      if(popupWindow.display("Check", "Return to main menu or exit?")==true){
        window.setScene(scene);
      }else{
        window.close();
      }
    });
    xlabel = new Label("Animals");
    ylabel = new Label("Humans");
    xlabel.setFont(new Font("Arial",30));
    ylabel.setFont(new Font("Arial",30));

    vBox = new VBox(20);
    vBox.getChildren().addAll(xlabel,animalButton, ylabel,humanButton);
    vBox.setAlignment(Pos.CENTER);
    vBox.setPadding(new Insets(10, 10, 10, 10));

    scene = new Scene(vBox, 650, 600, Color.BLACK);
    window.setScene(scene);
    window.show();
  }
}