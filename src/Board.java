import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.String.valueOf;

public class Board {

    List<Bullet> bullets = new ArrayList<>();
    int round =0;

    public void initialiseBoard() {
        for (int i = 0; i < 4; i++) {
            Colors color = getRandomColor();
            Bullet newbullet = new Bullet(color);
            bullets.add(newbullet);
        }

    }

    private Colors getRandomColor() {
        Random random = new Random();
        int numberOfColor = random.nextInt(6);

        return switch (numberOfColor) {
            case 1 -> Colors.RED;
            case 2 -> Colors.GREEN;
            case 3 -> Colors.CYAN;
            case 4 -> Colors.YELLOW;
            case 5 -> Colors.BLUE;
            case 0 -> Colors.PURPLE;
            default -> Colors.NONE;
        };
    }

    public void printBoard() {
        for (Bullet bullet : bullets) {
            System.out.print(bullet.getColorOfBullet().getCodeOfColor() + bullet.getColorOfBullet().getNameOfColor() + "\u25A9" + Colors.NONE.getCodeOfColor());
        }
        System.out.println();
    }

    public boolean checkTheSetup(String[] commandList) {
        int countBulletInTheBoard = 0;
        int countBulletInAGoodPosition = 0;

        for (int i = 0; i < commandList.length; i++) {
            for (Bullet bullet : bullets) {
                if (commandList[i].equals(bullet.getColorOfBullet().getLetterOfColor())) {
                    countBulletInTheBoard++;

                    //TODO: duplikálja a mennyiségeket, amennyiben egy szín többször is szerepel
                }
            }
            if (commandList[i].equals(bullets.get(i).getColorOfBullet().getLetterOfColor())) {
                countBulletInAGoodPosition++;
            }
        }
        System.out.println("Bullet In The Board: " + (countBulletInTheBoard - countBulletInAGoodPosition) +
                "\nBullet In A Good Position: " + countBulletInAGoodPosition + "\n");

        round++;
        return countBulletInAGoodPosition == 4;
    }

    public boolean isWin(String[] commandList){
        boolean isWin = checkTheSetup(commandList);

        if (isWin){
            System.out.println("Congratulation!\nYou have won the game in " + round + " rounds.");
        }
return isWin;
    }
}
