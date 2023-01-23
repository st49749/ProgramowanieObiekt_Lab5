package Lab10;

public class Command {
    String text;

    public Command(String text) {
        this.text = text;
    }

    public void operation() {
        System.out.println(text);
    }
}
