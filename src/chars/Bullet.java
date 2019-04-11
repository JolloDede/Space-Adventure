package chars;

/**
 * This class describes the bullets which get fired out of my rocat
 * @author Dennis
 * @since
 * @version
 */
public class Bullet {

    private int x, y, width, height, speed;

    /**
     * The Bullets get created  with a place
     * @param x
     * @param y
     * a width and a hight
     * @param width
     * @param height
     * and a speed
     * @param speed
     */
    public Bullet(int x, int y, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
