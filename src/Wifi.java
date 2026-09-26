public class Wifi extends Connection{
    public Wifi(InternetPlan internet_plan) {
        super(internet_plan, "Wireless");
    }
    @Override
    public void download() {
        internet_plan.connect(connection_type);
    }
}
