public class Main {
    public static void main(String[] args) {

        Transport bicycle = new Bicycle("Bicycle", 2);
        Transport bicycle2 = new Bicycle("Bicycle2", 2);

        Transport car = new Car("Car", 4);
        Transport car2 = new Car("Car2", 4);

        Transport truck = new Truck("Truck", 8);
        Transport truck2 = new Truck("Truck2", 8);

        Transport[] transports = {bicycle, bicycle2, car, car2, truck, truck2};

        ServiceStation station = new ServiceStation();

        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}
