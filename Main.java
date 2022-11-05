public class Main {
    public static void main(String[] args) {
        int[] sales ={1, 15, 7, 22};
        SalesManager vassal = new SalesManager(sales);

        Sistem.out.println("Вассал: " + vassal.max());

        Sistem.out.println("Обрезанная средняя: " + trimmedAvd());

    }
}