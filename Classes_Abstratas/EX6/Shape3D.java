public abstract class Shape3D {
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();

    public void print() {
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface area: " + calculateSurfaceArea());
    }
}