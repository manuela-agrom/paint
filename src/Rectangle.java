public class Rectangle implements IRectangle {
    private int coordinateTop;
    private int coordinateBottom;
    private int coordinateLeft;
    private int coordinateRight;
    public Rectangle(){
        this.coordinateTop = 400;
        this.coordinateBottom = 0;
        this.coordinateRight = 400;
        this.coordinateLeft = 0;
    }
    public String toString(){
        return "La altura es " + this.getHeight() + " y el ancho es " + this.getWidth();
    }
    public int getHeight() {
        return this.coordinateTop - this.coordinateBottom;
    }
    public int getWidth() {
        return this.coordinateRight - this.coordinateLeft;
    }
    public int getCoordinateTop(){
        return this.coordinateTop;
    }
    public int getCoordinateBottom(){
        return this.coordinateBottom;
    }
    public int getCoordinateLeft(){
        return this.coordinateLeft;
    }
    public int getCoordinateRight(){
        return this.coordinateRight;
    }
}
