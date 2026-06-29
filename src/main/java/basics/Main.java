package basics;
class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("I love Java");

        // primitive data types

        byte a = 127; // 1-byte (8 bit)
        System.out.println(a);

        short b = 32767; // 2-byte (16 bit)
        System.out.println(b);

        int c = 2_147_483_647; // 4-byte (32 bit)
        System.out.println(c);

        long d = 32_948_092_384_832L; // 8-byte (64 bit)
        System.out.println(d);

        float e = 9.15F; // 4-byte
        System.out.println(e);

        double f = 8.2345; // 8-byte
        System.out.println(f);

        char letter = 'A'; // 1-byte
        System.out.println(letter);

        boolean isPass = true;
        System.out.println(isPass);

        // objects

        String name = "Max Verstappen";
        System.out.println(name);

    }
}
