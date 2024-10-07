


public class Ambulance extends Vehicle {

    public Ambulance(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfProduction, plateTypeNumber, ageOfTheCar, TotalTax, transportMode, bondParkingFees);
    }

    @Override
    public void calculateTax() {

        //Ambulance is exempted from ID, VAT, WHT
        TotalTax +=0;
        TotalTax +=0;
        TotalTax +=0;

        //Mandatory payments
        TotalTax +=35000;
        TotalTax +=20000;
        TotalTax +=200000;

        //Checking IL
        if (ageOfTheCar > 10) {
            TotalTax += 0.15*cif;
        } else {
            TotalTax += 150000;
        }
    }
}
