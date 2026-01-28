public class Rectangle implements Resizable {
    private int width;
    private int weight;

    public Rectangle(int width, int weight) {
        this.width = width;
        this.weight = weight;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override 
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}