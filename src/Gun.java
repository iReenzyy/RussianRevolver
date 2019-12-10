import java.util.Random;
import java.util.Scanner;

public class Gun {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int scan;
        int rand = random.nextInt(7);
        Boolean win = false;

        for (int i = 1; i < 7; i++) {

            if (i == 1)
                System.out.println("Револьвер заряжен одной пулей, у вас 6 попыток. Вы готовы стрелять? 1 - да / 0 - нет ");
            scan = sc.nextInt();
            if (scan == 1) {
                win = false;
            } else if (scan == 0) {
                System.out.println("Да вы просто трус! Но живой.");
                break;
            }

            if (i != rand) {
                System.out.println("Поздравляю, Вы проживёте еще не много!");
            } else if (i == rand) {
                System.out.println("ПОТРАЧЕНО, вы продержались " + (i - 1) + " попыток(ки), слабо больше?");
                System.out.println("Новая игра 1 - да / 0 - нет.");

                win = true;
                scan = sc.nextInt();

                if (scan == 1) {
                    i = 0;
                    win = false;
                    rand = random.nextInt(6);
                } else if (scan == 0) {
                    System.out.println("Бросая начатое - вы ничего не добьетесь! Но будете жить :)");
                    break;
                }
            }

            if (i == 6) {
                System.out.println("А вы везунчик, произошла осечка. Перезарядим!");
                System.out.println("Новая игра 1 - да / 0 - нет.");
                win = true;
                scan = sc.nextInt();
            } else if (scan == 0) {
                System.out.println("Да вы просто трус! Но живой.");
                break;


            }

        }

    }
}
