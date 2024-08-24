package util;

public class Convert {
    private Double minSalary;
    private Double kilowatt;

    public Convert(Double minSalary, Double kilowatt) {
        this.minSalary = minSalary;
        this.kilowatt = kilowatt;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    public Double getKilowatt() {
        return kilowatt;
    }

    public void setKilowatt(Double kilowatt) {
        this.kilowatt = kilowatt;
    }

    public static Double convertAll(double kilowatt, double minSalary){
        return minSalary*0.01*kilowatt;
    }
    public static Double convertUn(double kilowatt, double minSalary){
        return minSalary*0.01;
    }
}
