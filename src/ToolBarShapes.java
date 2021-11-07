public class ToolBarShapes implements ToolBarColor, ToolBarCreator{
    public <T> void createShape(T shape) {
        try {
            T newShape = new Shape();
        } catch (Exception e) {
            throw new IllegalArgumentException("El argumento no puede ser nulo.");
        }
    }
    public void changeBackgroundColorShape(){}
    public void changeBorderColorShape(){}

}
