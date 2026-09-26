public class ArchivedPlanAdapter implements InternetPlan{
    private ArchivedPlan archived_plan = new ArchivedPlan();
    @Override
    public void connect(String connection_type) {
        System.out.print("Connection is " + connection_type + " ");
        archived_plan.transfer_packages();
    }
}
