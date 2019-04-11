package data;

/**
 * This class maths something
 * @author Dennis
 * @since
 * @version
 */
public class CustomMath {

    /**
     *
     * @param x
     * @param min
     * @param max
     * @return
     */
    public static int limit(int x, int min, int max){
        return (x > max) ? max : (x < min ? min : x);
    }
}
