public class Ethernet extends Connection{
    public Ethernet(InternetPlan internet_plan) {
        super(internet_plan, "Wired");
    }
    @Override
    public void download() {
        internet_plan.connect(connection_type);
    }
}
