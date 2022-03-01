import java.io.FileNotFoundException;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

@SuppressWarnings("uncheck")
public class popupWindow {

  private static Stage windows = new Stage();
  private static Stage windowss = new Stage();
  private static Label labeln = new Label();
  private static Label labelx = new Label();
  private static Label labely = new Label();
  private static Label labelz = new Label();
  private static Label labelu = new Label();
  private static Label labelux = new Label();
  private static Label labelui = new Label();
  private static Button ybutton = new Button("Main menu");
  private static Button nButton = new Button("Exit");
  private static Button submit = new Button("Let draw!");
  private static VBox layout;
  private static Scene scene;
  private static boolean dataToReturn;
  private static ImageView imageViewn = new ImageView();
  private static ImageView imageViewx = new ImageView();
  private static ImageView imageViewy = new ImageView();
  private static ImageView imageViewz = new ImageView();
  private static boolean firstStarting;
  private int i; 


  public static boolean display(String title, String message) {
    windows.setTitle(title);
    windows.setMinWidth(250);

    labelu.setText(message);

    ybutton.setOnAction(
      e -> {
        dataToReturn = true;
        windows.close();
      }
    );
    nButton.setOnAction(
      e -> {
        dataToReturn = false;
        windows.close();
      }
    );

    layout = new VBox(20);
    layout.getChildren().addAll(labelu, ybutton, nButton);
    layout.setAlignment(Pos.CENTER);

    scene = new Scene(layout,300,250);
    windows.setScene(scene);
    windows.showAndWait();
    return dataToReturn;
  }

  public void drawingScene(int selected, int timeInput)
    throws FileNotFoundException {
    firstStarting = true;
    windowss.setTitle("Drawing Scene");
    int resetTime = timeInput;
    i = timeInput;
    // windowss.setMinWidth(250);
    layout = new VBox(20);
    Timer timer = new Timer();
    switch (selected) {
      case 1:
        imageRandomizer n = new imageRandomizer();
        TimerTask taskn = new TimerTask() {
          @Override
          public void run() {
            if (firstStarting == true) {
              try {
                imageViewn.setImage(n.randImageLiveAnimals());
                firstStarting = false;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
            if (i != 0) {
              Platform.setImplicitExit(false);
              Platform.runLater(() -> labeln.setText("Time left: " + i));
              i--;
            } else {
              try {
                imageViewn.setImage(n.randImageLiveAnimals());
                i = resetTime;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
          }
        };
        labeln.setFont(new Font("Arial",30));
        timer.scheduleAtFixedRate(taskn, 0, 1000);
        layout.getChildren().addAll(labeln, imageViewn);
        break;
      case 2:
        imageRandomizer x = new imageRandomizer();
        TimerTask taskx = new TimerTask() {
          @Override
          public void run() {
            if (firstStarting == true) {
              try {
                imageViewx.setImage(x.randImageSkeletonAnimals());
                firstStarting = false;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
            if (i != 0) {
              Platform.setImplicitExit(false);
              Platform.runLater(() -> labelx.setText("Time left: " + i));
              i--;
            } else {
              try {
                imageViewx.setImage(x.randImageSkeletonAnimals());
                i = resetTime;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
          }
        };
        labelx.setFont(new Font("Arial",30));
        timer.scheduleAtFixedRate(taskx, 0, 1000);
        layout.getChildren().addAll(labelx, imageViewx);
        break;
      case 3:
        imageRandomizer y = new imageRandomizer();
        TimerTask tasky = new TimerTask() {
          @Override
          public void run() {
            if (firstStarting == true) {
              try {
                imageViewy.setImage(y.randImageMaleHuman());
                firstStarting = false;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
            if (i != 0) {
              Platform.setImplicitExit(false);
              Platform.runLater(() -> labely.setText("Time left: " + i));
              i--;
            } else {
              try {
                imageViewy.setImage(y.randImageMaleHuman());
                i = resetTime;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
          }
        };
        labely.setFont(new Font("Arial",30));
        timer.scheduleAtFixedRate(tasky, 0, 1000);
        layout.getChildren().addAll(labely, imageViewy);
        break;
      case 4:
        imageRandomizer z = new imageRandomizer();
        TimerTask taskz = new TimerTask() {
          @Override
          public void run() {
            if (firstStarting == true) {
              try {
                imageViewz.setImage(z.randImageFemale());
                firstStarting = false;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
            if (i != 0) {
              Platform.setImplicitExit(false);
              Platform.runLater(() -> labelz.setText("Time left: " + i));
              i--;
            } else {
              try {
                imageViewz.setImage(z.randImageFemale());
                i = resetTime;
              } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            }
          }
        };
        labelz.setFont(new Font("Arial",30));
        timer.scheduleAtFixedRate(taskz, 0, 1000);
        layout.getChildren().addAll(labelz, imageViewz);
        break;
    }

    layout.setAlignment(Pos.CENTER);
    windows.setOnCloseRequest(e -> i = 0);
    scene = new Scene(layout);
    windowss.setFullScreen(true);
    windowss.setScene(scene);
    windowss.showAndWait();
  }

  public void confirmTime(int valueSelect) {
    windows.setTitle("Setting time");
    windows.setMinWidth(250);

    labelux.setText("input minutes");
    TextField minIn = new TextField();
    labelui.setText("input seconds");
    TextField secIn = new TextField();
    submit.setOnAction(
      e -> {
        try {
          isInt(minIn.getText(), secIn.getText(), valueSelect);
          windows.close();
        } catch (FileNotFoundException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        windows.close();
      }
    );

    layout = new VBox(20);
    layout.getChildren().addAll(labelux, minIn, labelui, secIn, submit);
    layout.setPadding(new Insets(10, 10, 10, 10));
    scene = new Scene(layout);
    windows.setScene(scene);
    windows.showAndWait();
  }

  public void isInt(String minIn, String secIn, int valueSelect)
    throws FileNotFoundException {
    try {
      int totalTime;
      int convertedMin = Integer.parseInt(minIn);
      int convertedSec = Integer.parseInt(secIn);
      totalTime = (convertedMin * 60) + convertedSec;
      if(totalTime < 1){
        new popupWindow().drawingScene(valueSelect, 30);
      }else{
      new popupWindow().drawingScene(valueSelect, totalTime);
      }
    } catch (NumberFormatException e) {
      new popupWindow().drawingScene(valueSelect, 30);
    }
  }
}