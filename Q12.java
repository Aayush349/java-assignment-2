
class Distance {
    protected double disInMiles;

    Distance(double disInMiles) {
        this.disInMiles = disInMiles;
    }

    public void travelTime() {
        double speed = 60; 
        double timeinhr = disInMiles / speed; 
        System.out.println("Time to cover " + disInMiles + " miles : " + timeinhr + " hours.");
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double disInKm) {
        super(disInKm * 0.609); 
    }

    @Override
    public void travelTime() {
        
        double speed = 100; 
        double timeInS = (disInMiles / 0.609) / speed; 
        System.out.println("Time " + (disInMiles / 0.609) + " km at 100 km/second: " + timeInS + " seconds.");
    }
}

public class Q12 {
    public static void main(String[] args) {
        
        Distance DM = new Distance(120); 
        DM.travelTime();
        
        DistanceMKS DK = new DistanceMKS(200); 
        DK.travelTime();
    }
}

