class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car car = new Car("AND123", new Account("Phil", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("JOE123", new Account("Joey", "JOE123"));
        car2.passenger = 4;
        car2.printDataCar();
    }
}