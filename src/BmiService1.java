public class BmiService1 {
    public double calculate(double meter, double kg) {
        double growth = meter;
        double weight = kg;
        double imt1 = kg / (meter * meter);
        double imt = imt1 * 10_000;
        System.out.println(imt1 * 10_000);
        return imt;
    }
}
