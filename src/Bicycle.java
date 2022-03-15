public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String name, int wheels, int gc)
    {
        super(name, wheels);
        gearCount = gc;
    }

    public void ringBell()
    {
        System.out.println("Ring ring!");
    }

    public int getGearCount()
    {
        return gearCount;
    }

}
