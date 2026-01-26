public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        try {
            service.register("juan", "123456789");

            //service.register("juana", "123");

            //service.register("juan", "987654321");

            service.register("", "123456789");

        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
