import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

@SuppressWarnings("uncheck")

class selectionScene {
  private static int valueSelect;
  private static Label labelx;
  private static Label labely;
  private static Button xButton;
  private static Button yButton;
  private static VBox layout;
  public Scene selectionSceneAnimals() throws FileNotFoundException {
    labelx = new Label("Live animals");
    labely = new Label("Skeletons");
    labelx.setFont(new Font("Arial",30));
    labely.setFont(new Font("Arial",30));

    xButton = new Button();
    yButton = new Button();
    xButton.setGraphic(new buttonImage().popupAnimalsLive());
    xButton.setOnAction(
      e -> {
        valueSelect = 1;
        new popupWindow().confirmTime(valueSelect);
      }
    );
    yButton.setGraphic(new buttonImage().popupAnimalsSkeleton());
    yButton.setOnAction(
      e -> {
        valueSelect = 2;
        new popupWindow().confirmTime(valueSelect);
      }
    );

    layout = new VBox(20);
    layout.getChildren().addAll(labelx, xButton, labely ,yButton);
    layout.setAlignment(Pos.CENTER);
    layout.setPadding(new Insets(10,10,10,10));

    return new Scene(layout,650,600);
  }

  public Scene selectionSceneHuman() throws FileNotFoundException {
    labelx = new Label("Male");
    labely = new Label("Female");
    labelx.setFont(new Font("Arial",30));
    labely.setFont(new Font("Arial",30));
    xButton = new Button();
    yButton = new Button();
    xButton.setGraphic(new buttonImage().popupHumanMen());
    xButton.setOnAction(
      e -> {
        valueSelect = 3;
        new popupWindow().confirmTime(valueSelect);
      }
    );
    yButton.setGraphic(new buttonImage().popupHumanWoman());
    yButton.setOnAction(
      e -> {
        valueSelect = 4;
        new popupWindow().confirmTime(valueSelect);
      }
    );

    layout = new VBox(20);
    layout.getChildren().addAll(labelx, xButton, labely ,yButton);
    layout.setAlignment(Pos.CENTER);
    layout.setPadding(new Insets(10,10,10,10));


    return new Scene(layout,650,600);
  }
}