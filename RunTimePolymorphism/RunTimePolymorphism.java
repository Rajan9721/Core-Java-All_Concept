package RunTimePolymorphism;


class Bank2 {
    float getRateOfInterest(){
        return 0;
    }
}
class AXIS extends Bank2{
    @Override
    float getRateOfInterest() {
        return 8.5f;
    }
}
class ICICI extends Bank2{
    @Override
    float getRateOfInterest() {
        return 9.1f;
    }
}
class SBI extends Bank2{
    @Override
    float getRateOfInterest() {
        return 7.8f;
    }
}
public class RunTimePolymorphism{
    public static void main(String[] args) {
        Bank2 b;
        b = new AXIS();
        System.out.println("Axis bank interest: "+b.getRateOfInterest());

        b = new ICICI();
        System.out.println("ICICI bank interest: "+b.getRateOfInterest());

        b = new SBI();
        System.out.println("SBI bank interest: "+b.getRateOfInterest());







    }
}