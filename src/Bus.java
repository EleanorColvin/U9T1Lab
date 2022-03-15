public class Bus extends Vehicle
{
    private int seats;
    public Bus(String name, int wheels, int seats)
    {
        super(name,wheels);
        this.seats = seats;
    }
    public int getSeats()
    {
        return seats;
    }
    public void openDoors()
    {
        System.out.println("All doors are open!");
    }
}
