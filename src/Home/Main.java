package Home;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", 700, 100);
        try{
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Error");
        }
        try{
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Error");
        }
        try{
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Error");
        }
    }
}
