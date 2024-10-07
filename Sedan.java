


public class Sedan extends Vehicle {
    public Sedan(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfProduction, plateTypeNumber, ageOfTheCar, TotalTax, transportMode, bondParkingFees);
    }

    @Override
    public void calculateTax() {
        super.calculateTotalTax();

        if (grossWeight > 2000) {
            TotalTax += 0.15*cif;
        } else if (grossWeight >= 1500) {
            TotalTax += 0.10*cif;
        } else {
            TotalTax += 0.02*cif;
        }

        if (ageOfTheCar > 15) {
            System.out.println("Sedans older than 15 years cannot be imported ");
            return;
        } else if (ageOfTheCar > 10) {
            TotalTax += 0.10*cif;
        } else if (ageOfTheCar > 5) {
            TotalTax += 0.05*cif;
        } else {
            TotalTax += 0.01*cif;
        }
    }
}
