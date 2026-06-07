public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        // Test Case 1 - KidUsers

        System.out.println("----- Kid User Test 1 -----");
        KidUsers kid1 = new KidUsers(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        System.out.println("\n----- Kid User Test 2 -----");
        KidUsers kid2 = new KidUsers(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();


        // Test Case 2 - AdultUser

        System.out.println("\n----- Adult User Test 1 -----");
        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        System.out.println("\n----- Adult User Test 2 -----");
        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}