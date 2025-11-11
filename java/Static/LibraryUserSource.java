class LibraryUser {
    String name;
    int daysLate;
    static double finePerDay;

    LibraryUser(String n, int days) {
        name = n;
        daysLate = days;
    }

    static void changeFineRate(double newRate) {
        finePerDay = newRate;
    }

    
    double calculateFine() {
        return daysLate * finePerDay;
    }

        void display() {
        System.out.println("User: " + name);
        System.out.println("Days Late: " + daysLate);
        System.out.println("Fine: ₹" + calculateFine());
    }

    public static void main(String[] args) {
        
        LibraryUser.changeFineRate(5.0);  // ₹5 per day

        LibraryUser u1 = new LibraryUser("Nikita", 3);
        LibraryUser u2 = new LibraryUser("Aman", 7);

        u1.display();
        u2.display();

        LibraryUser.changeFineRate(10.0);

        System.out.println("\nAfter fine rate change:");
        u1.display();
        u2.display();
    }
}
