public class ExpensivePlan implements InternetPlan{
    @Override
    public void connect(String connection_type) {
        System.out.println("Connection is " + connection_type + " with 1000Mbps");
    }
}
