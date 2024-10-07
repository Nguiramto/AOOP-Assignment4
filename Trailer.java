

public class Trailer extends Vehicle {


    public Trailer(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfProduction, plateTypeNumber, ageOfTheCar, TotalTax, transportMode, bondParkingFees);
    }

    @Override
    public void calculateTax() {
        super.calculateTotalTax();

        if (grossWeight >= 15000 && grossWeight <= 20000) {
            TotalTax = 0.15*cif;
        } else if (grossWeight > 20000) {
            TotalTax = 0.25*cif;
        } else {
            TotalTax = 0.05*cif;
        }

        if (engineCapacity > 20000) {
            TotalTax = 0.10*cif;
        } else if (engineCapacity >=15000 && engineCapacity <= 20000) {
            TotalTax = 0.05*cif;
        } else {
            TotalTax = 0.025*cif;
        }


        if (yearOfProduction >= 10 && yearOfProduction <= 15) {
            TotalTax = 0.10*cif;
        } else if (yearOfProduction >= 5 && yearOfProduction <= 10) {
            TotalTax = 0.05*cif;
        } else {
            TotalTax = 0.015*cif;
        }

    }
}
