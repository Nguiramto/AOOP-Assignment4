

public class Main {

    public static void main(String[] args) {

        Sedan sedan = new Sedan(200.50,20,2500,1700,2008,"DPS",30, 10000.36,"Carrier",25000);
        sedan.calculateTax();
        sedan.calculateTax();
        sedan.calculateBondParkingFees();
        sedan.calculateBondParkingFees();

        Ambulance ambulance = new Ambulance(25000.50,10,1500.25,2500,2000,"APS",15,5000000,"Driven",30000);
        ambulance.calculateTax();
        ambulance.calculateTotalTax();
        ambulance.calculateBondParkingFees();
        ambulance.calculateBondParkingFees();
        ambulance.calculateTransportModeFee();

        Estate estate = new Estate(15000.50,100,1500,400,2010,"DPS",2010,5000000,"Carrier",2300);
        estate.calculateTax();
        estate.calculateTotalTax();
        estate.calculateTransportModeFee();
        estate.calculateBondParkingFees();
        estate.calculateBondParkingFees();

        SUV suv = new SUV(10000.50,50,5000,2000,2018,"APS",10,15000,"Carrier",10000);
        suv.calculateTax();
        suv.calculateTotalTax();
        suv.calculateTransportModeFee();
        suv.calculateBondParkingFees();
        suv.calculateBondParkingFees();

        Trailer trailer = new Trailer(1500.50,25,1600,1700,2020,"DPS",2018,10000,"APS",5000);
        trailer.calculateTax();
        trailer.calculateTotalTax();
        trailer.calculateTransportModeFee();
        trailer.calculateBondParkingFees();
        trailer.calculateBondParkingFees();

        AnyVehicle anyVehicle = new AnyVehicle(1000.50,10,4000,25000,2012,"DPS",10,100000,"Carrier",15000);
        anyVehicle.calculateTax();
        anyVehicle.calculateBondParkingFees();
        anyVehicle.calculateTransportModeFee();
        anyVehicle.calculateTax();





    }
}
