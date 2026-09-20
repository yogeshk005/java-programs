import java.util.*;
class CampusUtilityBilling {
    public static String breakdown(int units, boolean commercial) {
        if (units < 0) {
            return "Invalid units";
        }
        double energyCharge;
        double fixedCharge;

        if (!commercial) {
            fixedCharge = 75.0;
            if (units <= 100) {
                energyCharge = units * 1.50;
            }
            else if (units <= 200) {
                energyCharge = (100 * 1.50) + ((units - 100) * 2.50);
            } 
            else {
                energyCharge = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.00);
            }
        } 
        else {
            fixedCharge = 150.0;
            if (units <= 100) {
                energyCharge = units * 2.50;
            } 
            else if (units <= 300) {
                energyCharge = (100 * 2.50) + ((units - 100) * 4.00);
            } 
            else {
                energyCharge = (100 * 2.50) + (200 * 4.00) + ((units - 300) * 6.00);
            }
        }
        double subtotal = energyCharge + fixedCharge;
        double surcharge=0.0;
        if (subtotal > 1000.0) {
            surcharge = subtotal * 0.05;
        }
        double total = subtotal + surcharge;
        return "ENERGY=" + energyCharge + ", FIXED=" + fixedCharge + ", SURCHARGE=" + surcharge + ", TOTAL=" + total;
    }

    public static void main(String[] sss) {
        int units;
        boolean commercial;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units :");
        units = sc.nextInt();
        System.out.println("Enter true if domestic or false for commercial :");
        commercial = sc.nextBoolean();
        String result = breakdown(units, commercial);
        System.out.println(result);
    }
}