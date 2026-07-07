package string;

public class Main {
    public static void main(String[] args){

        String a1 = new String("Max");
        String a2 = new String("Max");

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        String letters = "";
        for(int i = 65; i<=90; i++) {
            char letter = (char) i;
            letters += letter;
        }
        System.out.println(letters);


        StringBuilder letters2 = new StringBuilder();

        for (int i = 65; i <= 90; i++) {
            char letter = (char) i;
            letters2.append(letter);
        }

        System.out.println(letters2);
    }
}