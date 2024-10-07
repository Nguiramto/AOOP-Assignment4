public class AnyVehicle extends Vehicle {


    public AnyVehicle(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfProduction, plateTypeNumber, ageOfTheCar, TotalTax, transportMode, bondParkingFees);
    }

    @Override
    public void calculateTax() {
        super.calculateTotalTax();

        if (transportMode == "carrier") {
            TotalTax = 0.005 * cif;
        } else if (transportMode == "driven") {
            TotalTax = 0.015 * cif;
        } else {
            TotalTax = 0;
        }



        if (plateTypeNumber == "APS"){
            return ;
        } else if (plateTypeNumber == "DPS") {
            return;
        }
    else {
            TotalTax = 0;
        }

    if (bondParkingFees==24);{
        TotalTax=15000;
        }
    }
}
