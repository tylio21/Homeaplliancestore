

public class HomeApplianceStore {
    static String c_name;

    static String c_address;
    static int c_staff;
    public static String getC_name() {

        return c_name;
    }

    public static void setC_name(String c_name) {
        HomeApplianceStore.c_name = c_name;
    }

    public static String getC_address() {
        return c_address;
    }

    public static void setC_address(String c_address) {
        HomeApplianceStore.c_address = c_address;
    }

    public static int getC_staff() {
        return c_staff;
    }

    public static void setC_staff(int c_staff) {
        HomeApplianceStore.c_staff = c_staff;
    }



    public static void main(String[] args) {
        HomeApplianceStore.setC_name(args[0]);
        HomeApplianceStore.setC_address(args[1]);

        try{
            HomeApplianceStore.setC_staff(Integer.parseInt(args[2]));
            if (c_name == null || c_address == null) {

                System.out.println("error");
            } else {



                System.out.println("Company staff: " + HomeApplianceStore.getC_staff());
                System.out.println("Company name: " + HomeApplianceStore.getC_name());
                System.out.println("Company adress: " + HomeApplianceStore.getC_address());

            }
        }catch (NumberFormatException notint){
            System.out.println("error, not a valid staff number");

        }

    }
}