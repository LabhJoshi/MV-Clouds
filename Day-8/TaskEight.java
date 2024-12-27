
public class TaskEight {

    static int combination(int x, int y) {
        if (x == 0) {
            if (y == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        
        if ((y < x) || (y > 6 * x)) {
            return 0;
        }

        int result = 0;
        for (int i = 1; i <= 6; i++) {
            result += combination(x - 1, y - i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result = combination(x, y);

            System.out.println(result);
        } else {
            System.out.println("No command line arguments found !!");
        }
    }
}
