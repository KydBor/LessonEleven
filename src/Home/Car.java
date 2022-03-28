package Home;


import java.util.Random;

public class Car {
    private String carmodel;
    private int maxspeed;
    private int price;

    public Car() {
    }

    public Car(String carmodel, int maxspeed, int price) {
        this.carmodel = carmodel;
        this.maxspeed = maxspeed;
        this.price = price;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void turnOnCar() {

    }

    public void generateRandomValue() throws MyOwnException {
        Random random = new Random();
        int randomValue = random.nextInt(21);
        isHonest(randomValue);
    }


        private void isHonest(int value) throws MyOwnException {
        if (value % 2 == 0) {
            throw new MyOwnException();
        } else {
            System.out.println(this);
        }
    }

        @Override
        public String toString () {
            return "Car{" +
                    "carmodel='" + carmodel + '\'' +
                    ", maxspeed=" + maxspeed +
                    ", price=" + price +
                    '}';
        }
}