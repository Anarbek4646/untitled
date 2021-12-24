package sample;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
//create panel
public class Wall extends Pane{
    Rectangle rect;
    public int height;
    public Wall(int height) {
        this.height = height;
        rect = new Rectangle(20, height);

        getChildren().add(rect);//add wall on the panel
    }
}
