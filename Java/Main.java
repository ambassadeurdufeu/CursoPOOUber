class Main {
    public static void main(String[] args) {
        System.out.println("\nHola Mundo");

        UberX uberX = new UberX("AND123", new Account("Phil", "AND123"), "Nissan", "Versa");
        uberX.setPassenger(4);
        uberX.printDataCar();

       /* UberVan uberVan = new UberVan("JES123", new Account("Jesus", "JES123"), "Ford", "Lobo");
        uberVan.setPassenger(6);
        uberVan.printDataCar();*/

        /*
         * Car car2 = new Car("JOE123", new Account("Joey", "JOE123")); car2.passenger =
         * 4; car2.printDataCar();
         */
    }
}