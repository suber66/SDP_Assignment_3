public class ArchivedPlanAdapter implements InternetPlan{
    private ArchivedPlan archived_plan;
    public ArchivedPlanAdapter() {
        archived_plan = new ArchivedPlan();
    }
    //For Testing
    public ArchivedPlanAdapter(ArchivedPlan archived_plan) {
        this.archived_plan = archived_plan;
    }

    @Override
    public void connect(String connection_type) {
        try {
            System.out.print("Connection is " + connection_type + " ");
            archived_plan.transfer_packages();
        } catch (Exception e) {
            throw new RuntimeException("Failed connection to archived plan" + e);
        }
    }
}
