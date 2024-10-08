public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance says hello!");
    }

    // Main method to run the Singleton pattern
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.showMessage();  // Output: Singleton instance says hello!
    }
}
