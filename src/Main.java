/*Завдання(1, 2) робити через RegEx
1. Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.
2. Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com

3. Вхідним параметром є стрічка :
String str = "I love Java more than my friend. Java is so beautiful.";
перевірити чи є в стрічці слово “Java”;
замінити слово “Java” на “C#”;
замінити всі слова “Java” на “C#”;
 */

public class Main {

    public static void main(String[] args) {

        String str = "I love Java more than my friend. Java is so beautiful.";
        System.out.println("перевірити чи є в стрічці слово 'Java':");
        String result = (str.matches(".*Java.*")) ? "yes" : "no";
        System.out.println(result);

        String result1 = str.replaceFirst("\\.*Java\\.*", "C#");
        System.out.println("замінити слово 'Java' на 'C#':\n" + result1);

        String result2 = str.replaceAll("\\.*Java\\.*", "C#");
        System.out.println("замінити всі слова 'Java' на 'C#':\n" + result2);
    }
}
