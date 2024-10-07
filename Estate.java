


public class Estate extends Vehicle {


    public Estate(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        super(cif, seatingCapacity, grossWeight, engineCapacity, yearOfProduction, plateTypeNumber, ageOfTheCar, TotalTax, transportMode, bondParkingFees);
    }

    @Override
    public void calculateTax() {
        super.calculateTotalTax();

        if (seatingCapacity > 5) {
            int extraSeatingCapacity = seatingCapacity - 5;
            TotalTax += extraSeatingCapacity*250000;
        }

        if (grossWeight > 2000) {
            TotalTax +=0.10*cif;
        } else if (grossWeight >=1500) {
            TotalTax +=0.05*cif;
        } else {
            TotalTax +=0.02*cif;
        }

        if (ageOfTheCar > 10) {
            TotalTax += 0.15*cif;
        } else if (ageOfTheCar >=5) {
            TotalTax += 0.05*cif;
        } else {
            TotalTax += 0.01*cif;
        }
    }
}

