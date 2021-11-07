public class Star extends Shape {
    public String toString() {
        return "La estrella tiene un color de borde " + this.borderColor + " y un color de fondo " 
        + this.backgroundColor + this.circumscribedRectangle.toString();
    }
}
