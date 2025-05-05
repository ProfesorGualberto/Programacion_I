import java.util.Random;

    public class DadoSimulado {
        public static void main(String[] args) {
            Random rand = new Random();
            int dado = rand.nextInt(6) + 1;

            System.out.println("Lanzamiento del dado: " + dado);
            System.out.println("Figura del dado:\n");

            switch (dado) {
                case 1:
                    System.out.println("-----");
                    System.out.println("|   |");
                    System.out.println("| * |");
                    System.out.println("|   |");
                    System.out.println("-----");
                    break;
                case 2:
                    System.out.println("-----");
                    System.out.println("|*  |");
                    System.out.println("|   |");
                    System.out.println("|  *|");
                    System.out.println("-----");
                    break;
                case 3:
                    System.out.println("-----");
                    System.out.println("|*  |");
                    System.out.println("| * |");
                    System.out.println("|  *|");
                    System.out.println("-----");
                    break;
                case 4:
                    System.out.println("-----");
                    System.out.println("|* *|");
                    System.out.println("|   |");
                    System.out.println("|* *|");
                    System.out.println("-----");
                    break;
                case 5:
                    System.out.println("-----");
                    System.out.println("|* *|");
                    System.out.println("| * |");
                    System.out.println("|* *|");
                    System.out.println("-----");
                    break;
                case 6:
                    System.out.println("-----");
                    System.out.println("|* *|");
                    System.out.println("|* *|");
                    System.out.println("|* *|");
                    System.out.println("-----");
                    break;
            }
        }
    }

