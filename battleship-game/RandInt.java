public class RandInt {
    public static int getWithinRange(int min, int max) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
}