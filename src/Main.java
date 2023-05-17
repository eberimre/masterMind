public class Main {
    public static void main(String[] args) {

        UserInterfaceScanner scanner = new UserInterfaceScanner();
        Board board = new Board();
        board.initialiseBoard();
        board.printBoard();
        String command = "";

        while (!command.equals("exit")) {
            command = scanner.getCommand().toLowerCase();
            String[] commandList = command.split("");
            boolean isWin = board.isWin(commandList);
            if (isWin){
                System.exit(0);
                scanner.close();
            }
        }
    }
}