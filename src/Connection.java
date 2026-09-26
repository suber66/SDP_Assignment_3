public abstract class Connection {
    protected String connection_type;
    protected InternetPlan internet_plan;
    public Connection(InternetPlan internet_plan, String connection_type) {
        this.internet_plan = internet_plan;
        this.connection_type = connection_type;
    }
    public void download() {}
}
