import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

@SuppressWarnings("uncheck")
public class imageRandomizer {
  int prev;
  Stack prevStack;
  ImageView imageView;

  public Image randImageLiveAnimals() throws FileNotFoundException {
    prevStack = new Stack();
    int min = 1;
    int max = 10;
    int i = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (i == prevStack.peek()) {
      if(i == 10){
          i = 1;
      }else i++;
    }
    prev = i;
    prevStack.add(prev);
    InputStream stream = new FileInputStream(
      "imageSetAnimals/liveAnimals/" + i + ".png"
    );
    Image image = new Image(stream);
    return image;
  }

  public Image randImageSkeletonAnimals() throws FileNotFoundException {
    prevStack = new Stack();
    int min = 1;
    int max = 10;
    int i = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (i == prevStack.peek()) {
        if(i == 10){
            i = 1;
        }else i++;
      }
    prev = i;
    prevStack.add(prev);
    InputStream stream = new FileInputStream(
      "imageSetAnimals/skeletons/" + i + ".png"
    );
    Image image = new Image(stream);
    return image;
  }

  public Image randImageMaleHuman() throws FileNotFoundException {
    prevStack = new Stack();
    int min = 1;
    int max = 10;
    int i = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (i == prevStack.peek()) {
        if(i == 10){
            i = 1;
        }else i++;
      }
    prev = i;
    prevStack.add(prev);
    InputStream stream = new FileInputStream(
      "imageSetFigure/men/" + i + ".png"
    );
    Image image = new Image(stream);
    return image;
  }

  public Image randImageFemale() throws FileNotFoundException {
    prevStack = new Stack();
    int min = 1;
    int max = 10;
    int i = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (i == prevStack.peek()) {
        if(i == 10){
            i = 1;
        }else i++;
    }
    prev = i;
    prevStack.add(prev);
    InputStream stream = new FileInputStream(
      "imageSetFigure/women/" + i + ".png"
    );
    Image image = new Image(stream);
    return image;
  }
}