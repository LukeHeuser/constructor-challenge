public class Main {
    public static void main(String[] args) {

        Customer luke = new Customer();
        System.out.println("Hello, my name is " + luke.getName() + "! I have a credit limit of " +
                luke.getCreditLimit() + " and my email is, " + luke.getEmailAddress());

        Customer preston = new Customer("Preston", "preston@emailaddress.com");
        System.out.println("Hello, my name is " + preston.getName() + "! I have a credit limit of " +
                preston.getCreditLimit() + " and my email is, " + preston.getEmailAddress());

        Customer chevy = new Customer("Chevy", 25000, "chevy@emailaddress.com");
        System.out.println("Hello, my name is " + chevy.getName() + "! I have a credit limit of " +
                chevy.getCreditLimit() + " and my email is, " + chevy.getEmailAddress());

    }
}
