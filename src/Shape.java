public abstract class Shape {
    protected String backgroundColor;
    protected String borderColor;
    protected IRectangle circumscribedRectangle;
    public Shape(){
        this.backgroundColor = "white";
        this.borderColor = "black";
        this.circumscribedRectangle = new Rectangle();
    }
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    public boolean isSelected(int coordinateX, int coordinateY){
        boolean coordinateXInside = coordinateX > this.circumscribedRectangle.getCoordinateLeft() && coordinateX < this.circumscribedRectangle.getCoordinateRight();
        boolean coordinateYInside = coordinateY > this.circumscribedRectangle.getCoordinateBottom() && coordinateY < this.circumscribedRectangle.getCoordinateTop();
        boolean isSelected = coordinateXInside && coordinateYInside;
        return isSelected;
    }
    public abstract String toString();
}