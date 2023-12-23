package lr5;

 class Task5 {
    private int int1;

    public void Set(int n) {
        System.out.println("Метод c аргументом");
        int1 = n;
        if (n >= 100) {
            int1 = 100;
        }
        if (n <= 0) {
            int1 = 0;
        }
    }
    public void Set() {
        System.out.println("Метод без аргумента");
        int1 = 0;
    }
    public int PrintInt() {
        return int1;
    }

    Task5(int int1) {
        System.out.println("Конструктор");
        this.Set(int1);
    }
}