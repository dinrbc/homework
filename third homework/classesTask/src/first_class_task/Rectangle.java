package first_class_task;

public class Rectangle extends Figure implements Drawable {
    private int length;
    private int width;

    public boolean isSquare(int width, int length) {
        boolean result = false;
        if (length==width) result = true;
        return result;
    }

    @Override
    int getSqrt(int width, int length) {
        return width*length;
    }

    @Override
    int getPerimeter(int width, int length) {
        return width*2+length*2;
    }

    @Override
    public void draw(int width, int length) {
        System.out.println(getSqrt(width, length));
        System.out.println(getPerimeter(width, length));
        System.out.println(this.color);
        if (this.isSquare(width, length)) {
            System.out.println("Квадрат");
        } else System.out.println("Прямоугольник");
    }
}
