public class TaskEight {

    static String encryption(String s) {
        String message = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int index = (int) c[i];
            index += 3;
            c[i] = (char) index;
            message += c[i];
        }
        return message;
    }

    static String decryption(String s) {
        String message = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int index = (int) c[i];
            index -= 3;
            c[i] = (char) index;
            message += c[i];
        }
        return message;
    }

    public static void main(String[] args) {
        String messege = "This is some message";

        String encrypted_message = encryption(messege);
        String decrypted_message = decryption(encrypted_message);

        System.out.println("Encrypted Message: " + encrypted_message);
        System.out.println("Decrypted Message: " + decrypted_message);
    }
}
