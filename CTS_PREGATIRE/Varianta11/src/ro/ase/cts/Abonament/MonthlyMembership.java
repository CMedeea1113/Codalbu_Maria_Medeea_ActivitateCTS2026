package ro.ase.cts.Abonament;

public class MonthlyMembership implements AbstractMembership{
    private static volatile MonthlyMembership instance;
    private String planName;
    private double price;

    private MonthlyMembership(){
        this.planName = "Monthly Family Subscription";
        this.price = 49.99;

    }
    public static MonthlyMembership getInstance(){
        if(instance == null){
            synchronized(MonthlyMembership.class){
                if(instance == null)
                    instance = new MonthlyMembership();
            }
        }
        return instance;
    }

    @Override
    public String getPlanName() {
        return planName;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
