import java.util.Scanner;

public class UserInterfaceScanner {
    Scanner scanner = new Scanner(System.in);

    public String getCommand() {
        System.out.println("Type in your next command in #### format!");
        System.out.println(Colors.BLUE.getCodeOfColor() + "B" + Colors.NONE.getCodeOfColor() + "-lue, " +
                Colors.PURPLE.getCodeOfColor() + "P" + Colors.NONE.getCodeOfColor() + "-urple, " +
                Colors.RED.getCodeOfColor() + "R" + Colors.NONE.getCodeOfColor() + "-ed, " +
                Colors.GREEN.getCodeOfColor() + "G" + Colors.NONE.getCodeOfColor() + "-reen, " +
                Colors.YELLOW.getCodeOfColor() + "Y" + Colors.NONE.getCodeOfColor() + "-ellow, " +
                Colors.CYAN.getCodeOfColor() + "C" + Colors.NONE.getCodeOfColor() + "-yan" +
                Colors.NONE.getCodeOfColor() + "\n");
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
