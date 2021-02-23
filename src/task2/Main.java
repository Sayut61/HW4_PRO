package task2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String str = "Ребенку, научившемуся складывать звуки в слоги, \n" +
                "слоги в слова, а слова в предложения, необходимо совершенствовать\n" +
                " навык чтения путем систематических тренировок. Но чтение — довольно\n" +
                " трудоемкое и монотонное занятие, и многие дети теряют интерес к \n" +
                "нему. Поэтому мы предлагаем тексты небольшого размера, слова в них\n" +
                " разделены на слоги.";
        Pattern p = Pattern.compile(" в ");
        Matcher m = p.matcher(str);
        while (m.find()){
            int start = m.start();
            int end = m.end();
        }
        System.out.println(m.replaceAll(" JAVA "));
    }
}
