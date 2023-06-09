package org.example.menu;

public class CaesarEncoderMenu implements Menu {
    @SuppressWarnings("unused")
    public enum Options implements TextDescription {
        EncodeString("Encode a string"),
        EncodeTextFile("Encode a text file"),
        BackToEncodeMenu("Back to encode menu");

        private final String optionText;

        Options(String optionText) {
            this.optionText = optionText;
        }

        public String getText() {
            return this.optionText;
        }
    }

    @Override
    public boolean run() {
        printHeader();
        printOptions(CaesarEncoderMenu.Options.class);
        var usersChoice = getIntChoice();
        switch (usersChoice) {
            case 1 -> {
                // TODO: Caesar Encoder - encode user string in the console
                System.out.println("Encode string - done");
                return MenuManager.getMenu(MainMenu.class).run();
            }
            case 2 -> {
                // TODO: Caesar Encoder - encode user txt file
                System.out.println("Encode text file - done");
                return MenuManager.getMenu(MainMenu.class).run();
            }
            case 3 -> {
                return MenuManager.getMenu(EncodeMenu.class).run();
            }
            default -> {
                printInvalidOptionTip();
                return this.run();
            }
        }
    }

    @Override
    public void printHeader() {
        System.out.println();
        System.out.println("< Caesar encoder menu >");
    }
}
