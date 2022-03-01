import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

@SuppressWarnings("uncheck")

public class buttonImage{
    private InputStream animalsStream;
    private InputStream humanStream;
    private ImageView animalsIcon;
    private ImageView humanIcon;
    
    public ImageView animals() throws FileNotFoundException{
        animalsStream = new FileInputStream("buttonIcon/bear.png");
        Image animalsIcons = new Image(animalsStream);
        animalsIcon =new ImageView(animalsIcons);
        animalsIcon.setFitHeight(225);
        animalsIcon.setFitWidth(225);
        return animalsIcon;
    }
    public ImageView human() throws FileNotFoundException{
        humanStream = new FileInputStream("buttonIcon/human.png");
        Image humanIcons = new Image(humanStream);
        humanIcon = new ImageView(humanIcons);
        humanIcon.setFitHeight(225);
        humanIcon.setFitWidth(225);
        return humanIcon;
    }
    public ImageView popupAnimalsLive() throws FileNotFoundException{
        animalsStream = new FileInputStream("buttonIcon/liveAnimals.png");
        Image animalsIcons = new Image(animalsStream);
        animalsIcon =new ImageView(animalsIcons);
        animalsIcon.setFitHeight(225);
        animalsIcon.setFitWidth(225);
        return animalsIcon;
    }
    public ImageView popupAnimalsSkeleton() throws FileNotFoundException{
         animalsStream = new FileInputStream("buttonIcon/skeleton.png");
        Image animalsIcons = new Image(animalsStream);
        animalsIcon =new ImageView(animalsIcons);
        animalsIcon.setFitHeight(225);
        animalsIcon.setFitWidth(225);
        return animalsIcon;

    }
    public ImageView popupHumanMen() throws FileNotFoundException{
        humanStream = new FileInputStream("buttonIcon/men.png");
        Image humanIcons = new Image(humanStream);
        humanIcon = new ImageView(humanIcons);
        humanIcon.setFitHeight(225);
        humanIcon.setFitWidth(225);
        return humanIcon;
    }
    public ImageView popupHumanWoman() throws FileNotFoundException{
        humanStream = new FileInputStream("buttonIcon/woman.png");
        Image humanIcons = new Image(humanStream);
        humanIcon = new ImageView(humanIcons);
        humanIcon.setFitHeight(225);
        humanIcon.setFitWidth(225);
        return humanIcon;
    }
}