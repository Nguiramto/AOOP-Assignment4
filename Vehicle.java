


public abstract class Vehicle {

    protected double cif;
    protected int seatingCapacity;
    protected double grossWeight;
    protected int engineCapacity;
    protected int yearOfProduction;
    protected String plateTypeNumber;
    protected double ageOfTheCar;
    protected double TotalTax;
    protected String transportMode;
    protected int bondParkingFees;


    public Vehicle(double cif, int seatingCapacity, double grossWeight, int engineCapacity, int yearOfProduction, String plateTypeNumber, double ageOfTheCar, double TotalTax, String transportMode, int bondParkingFees) {
        this.cif = cif;
        this.seatingCapacity = seatingCapacity;
        this.grossWeight = grossWeight;
        this.ageOfTheCar = 2024-yearOfProduction;
        this.plateTypeNumber = plateTypeNumber;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
        this.TotalTax = 0.0;
        this.transportMode = transportMode;
        this.bondParkingFees = bondParkingFees;

    }

    public void calculateTotalTax() {
        TotalTax +=0.25*cif;
        TotalTax +=0.18*cif;
        TotalTax +=0.06*cif;
        TotalTax +=150000;
        TotalTax +=35000;
        TotalTax +=20000;
        TotalTax +=200000;

        if (plateTypeNumber.equals("APS")) {
            TotalTax +=300000;
        } else if (plateTypeNumber.equals("DPS")) {
            TotalTax +=700000;
        }
    }

    public void calculateTransportModeFee() {
        if (transportMode.equals("Carrier")) {
            TotalTax += 0.005*cif;
        } else if (transportMode.equals("Driven")) {
            TotalTax += 0.015*cif;
        }
    }

    public void printTotalTax() {
        System.out.println("The Total Tax payable is :" + TotalTax + "UGX");
    }

    public void calculateBondParkingFees() {
        TotalTax += 15000*bondParkingFees;
    }


    public abstract void calculateTax();
}
