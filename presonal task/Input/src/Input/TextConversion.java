package Input;

class TextConversion {
    private Input input;

    public TextConversion(final Input input) {
        this.input = input;
    }

    public void showInputInUpperCase() {
        String inputText = input.fetch();

        String upperCase = inputText.toUpperCase();

        System.out.println(upperCase);
    }
}
