package InterfacesAndAbstractionExercises.Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>(numbers);
        this.urls = new ArrayList<>(urls);
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : this.urls) {
            boolean isDigit = false;
            char[] chars = url.toCharArray();
            for (char aChar : chars) {
                if (Character.isDigit(aChar)){
                    isDigit = true;
                }
            }
            if (!isDigit){
                stringBuilder.append("Browsing: ").append(url).append("!");
            }else {
                stringBuilder.append("Invalid URL!");
            }
            stringBuilder.append(System.lineSeparator());
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        for (String number : numbers) {
            boolean isDigit = true;
            char[] chars = number.toCharArray();
            for (char aChar : chars) {
                if (!Character.isDigit(aChar)){
                    isDigit = false;
                }
            }
            if (isDigit){
                builder.append(String.format("Calling... %s", number));
            }else {
                builder.append("Invalid number!");
            }
            builder.append(System.lineSeparator());
        }
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }
}
