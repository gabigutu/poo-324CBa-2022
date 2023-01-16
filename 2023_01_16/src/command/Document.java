package command;

import java.util.ArrayList;
import java.util.Arrays;

public class Document {

    private String nume;
    private char[] chars;
    private int index;
    private ArrayList<String> textStyles;

    public Document(String nume) {
        this.nume = nume;
        chars = new char[1000];
        index = 0;
        textStyles = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void writeChar(char c) {
        chars[index++] = c;
    }

    public void removeLastChar() {
        chars[index-1] = '\0';
        index--;
    }

    public void addTextStyle(String textStyle) {
        if (!this.textStyles.contains(textStyle)) {
            this.textStyles.add(textStyle);
        }
    }

    public void removeTextStyle(String textStyle){
        if (this.textStyles.contains(textStyle)) {
            this.textStyles.remove(textStyle);
        }
    }

    @Override
    public String toString() {
        return "Document{" +
                "nume='" + nume + '\'' +
                ", textStyles=" + textStyles +
                ", chars=" + Arrays.toString(chars) +
                ", index=" + index +
                '}';
    }
}
