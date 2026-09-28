class scooter{
    int fare = 50;
    void myFare(){
        System.out.println("Scooter fare: "+fare);
    }
}
class Bus{
    int fare = 20;
    void myFare(){
        System.out.println("Bus fare: "+fare);
    }
}
class metro{
    int fare = 40;
    void myFare(){
        System.out.println("Metro fare: "+fare);
    }
}
class Auto{
    int fare = 100;
    void myFare(){
        System.out.println("Auto fare: "+fare);
    }
}

public class farecheck {
    public static void main(String[] args) {
        scooter scoooter_fare = new scooter();
        scoooter_fare.myFare();
        Bus bus_fare = new Bus();
        bus_fare.myFare();
        metro metro_fare = new metro();
        metro_fare.myFare();
        Auto auto_fare = new Auto();
        auto_fare.myFare();
    }
}
