public class Checker {
    String inputString = "";
    int numberOfAlphabets = 26;

    public Checker(String inputString) {
        this.inputString = inputString;
    }

    public boolean isSmallLetter(char character) {
        if (character >= 'a' && character <= 'z') return true;
        else return false;
    }

    public boolean isCapitalLetter(char character) {
        if (character >= 'A' && character <= 'Z') return true;
        else return false;
    }

    public boolean check() {
        boolean[] alphabetsPresent = new boolean[numberOfAlphabets];
        for (int i = 0; i < inputString.length(); i++) {
            if (isSmallLetter(inputString.charAt(i))) {
                alphabetsPresent[inputString.charAt(i) - 'a'] = true;
            } else if (isCapitalLetter(inputString.charAt(i))) {
                alphabetsPresent[inputString.charAt(i) - 'a'] = true;
            }
        }
        for (int i = 0; i < numberOfAlphabets; i++) {
            if (!alphabetsPresent[i]) return false;
        }
        return true;
    }
}
