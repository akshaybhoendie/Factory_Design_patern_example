import com.qualogy.shape.Circle;
import com.qualogy.shape.Rectangle;
import com.qualogy.shape.Square;
import com.qualogy.shape.impl.Shape;

/**
 * Created by abhoendie on 9/14/2017.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
         if(shapeType == null){
             return null;
         }

         if(shapeType.equalsIgnoreCase("CIRCLE")){
             return new Circle();
         }
         else if(shapeType.equalsIgnoreCase("SQUARE")){
             return new Square();
         }
         else if(shapeType.equalsIgnoreCase("RECTANGLE")){
             return new Rectangle();
         }

        return null;
    }
}
