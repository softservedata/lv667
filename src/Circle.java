
public class Circle {

    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    public void setRadius(int radius) {
        if (validate(radius)) {
            this.radius = radius;
        }
    }

    double calculateArea() {
        if(this.radius==0){
            throw new IllegalArgumentException("System couldn't calculate AREA, when radius less than 0");
        }
        return Math.PI * Math.pow(radius, 2);

    }

    double calculatePerimeter() {
        if(this.radius==0){
            throw new IllegalArgumentException("System couldn't calculate PERIMETER, when radius less than 0");
        }
        return 2 * Math.PI * radius;
    }

    private boolean validate(int radius) {
        return radius > 0;
    }
}




