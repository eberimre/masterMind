public enum Colors {
    NONE("none", "\u001B[0m", "n"),
    RED("red", "\u001B[31m", "r"),
    BLUE("blue", "\u001B[34m", "b"),
    GREEN("green", "\u001B[32m", "g"),
    CYAN("cyan", "\u001B[36m", "c"),
    PURPLE("purple", "\u001B[35m", "p"),
    YELLOW("yellow", "\u001B[33m", "y");

    private final String nameOfColor;
    private final String codeOfColor;
    private final String letterOfColor;

    Colors(String nameOfColor, String codeOfColor, String letterOfColor) {
        this.nameOfColor = nameOfColor;
        this.codeOfColor = codeOfColor;
        this.letterOfColor = letterOfColor;
    }

    public String getNameOfColor() {
        return nameOfColor;
    }

    public String getCodeOfColor() {
        return codeOfColor;
    }

    public String getLetterOfColor() {
        return letterOfColor;
    }
}
