import java.util.ArrayList;
public class Canva {
    private ArrayList<Shape> shapeList;
    private Shape selectedShape;
    public Canva() {
        this.shapeList = new ArrayList<Shape>();
        this.selectedShape = null;
    }
    public void selectShape(int coordinateX, int coordinateY){
        boolean isSelectedShape = false;
        for (Shape shape:this.shapeList){
            isSelectedShape = shape.isSelected(coordinateX, coordinateY);
            if (isSelectedShape) {
                this.selectedShape = shape;
            }
        }
    }
}
