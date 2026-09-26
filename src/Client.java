import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        InternetPlan internet_plan = new CheapPlan();
        Connection connection = new Ethernet(internet_plan);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Internet Plan:\n1.Cheap Plan\n2.Expensive Plan\n3.Archived Plan");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                internet_plan = new CheapPlan();
                break;
            case 2:
                internet_plan = new ExpensivePlan();
                break;
            case 3:
                internet_plan = new ArchivedPlanAdapter();
        }
        System.out.println("Choose connection:\n1.Ethernet\n2.Wifi");
        input = sc.nextInt();
        switch (input) {
            case 1:
                connection = new Ethernet(internet_plan);
                break;
            case 2:
                connection = new Wifi(internet_plan);
                break;

        }
        connection.download();
    }
}
