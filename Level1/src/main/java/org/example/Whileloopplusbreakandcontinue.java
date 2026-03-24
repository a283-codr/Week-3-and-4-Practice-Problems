public class Whileloopplusbreakandcontinue {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i++;

            if (i == 5) {
                continue; // skip 5
            }

            if (i == 8) {
                break; // stop loop at 8
            }

            System.out.println(i);
        }
    }
}