public class Formula {
    float x;
    float y;
    float z;

    public Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void displayFormula() {
        double l = Math.sqrt(x * x + y * y + z * z);
        System.out.println(l);
    }
}