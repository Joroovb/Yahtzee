import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class YahtzeeSpel {
    ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
    YahtzeeSpel(int i) {
        while (dobbelstenen.size() < i) {
            dobbelstenen.add(new Dobbelsteen());
        }
    }



    void Spelen() {
        boolean go = true;
        int aantalWorpen = 0;

        while (go) {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            input = input.toLowerCase();

            if (input.equals("q")) {
                System.out.println("The program exits!");
                break;
            } else if (aantalWorpen > 1) {
                int[] array = vasthouden();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == 0) {
                        for (Dobbelsteen a : dobbelstenen) {
                            int t = a.werpen();
                            aantalWorpen++;
                            System.out.println("werkt");
                            a.setLaatsteWorp(t);
                            System.out.println(a.laatsteWorp);
                        }
                    }
                }
            } else {
                for (Dobbelsteen a : dobbelstenen) {
                    int i = a.werpen();
                    aantalWorpen++;
                    System.out.println("werkt");
                    a.setLaatsteWorp(i);
                    System.out.println(a.laatsteWorp);
                }
                continue;
            }
        }
    }

    int[] vasthouden() {
        int[] vast = {0, 0, 0, 0, 0};
        Scanner two = new Scanner(System.in);
        String input = two.nextLine();
        ArrayList<Integer> lala = new ArrayList<>();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int temp = Character.getNumericValue(ch);
            lala.add(temp);
        }

        for (int i = 0; i < lala.size(); i++)
            if (lala.get(i) != 0)
                vast[lala.get(i)-1] = 1;
                System.out.println(Arrays.toString(vast));
                return vast;
    }
}
