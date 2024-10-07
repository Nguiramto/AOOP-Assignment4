

public class SUV extends Vehicle{

    public SUV (double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfProduction, plateTypeNumber, ageOfTheCar, TotalTax, transportMode, bondParkingFees);
    }

    @Override
    public void calculateTax() {
        super.calculateTotalTax();

        if (grossWeight > 5) {
            TotalTax = 350000;
        } else if (grossWeight > 5000) {
            TotalTax = 0.15*cif;
        } else {
            TotalTax = 0;
        }

        if (ageOfTheCar >= 1 && ageOfTheCar < 5) {
            TotalTax = 0.01 * cif;
        } else if (ageOfTheCar >= 5 && ageOfTheCar < 10) {
            TotalTax = 0.15 * cif;
        } else {
            ageOfTheCar = 0.25 * cif;
        }
    }

}
