// 1. Написать метод принимающий строку, ищущий в ней основание и степень 
//После этого расчитывающий результат и выводящий в консоль в консоль строку параметра + ответ. 
//Пример строки: "Основание -12б степень 7, результат". Попробовать с разными входящими строками.

public class hw2 {
    public static void main(String[] args) {

        print_string("Основание -12, стапень 7, результат равен");
        print_string("Основание 15, стапень 2, результат равен");
        print_string("Основание 30, стапень 15, результат равен");
        
        
        // 2. померить время между String и StringBuilder
        //в online JAVA IDEA, в String время 1, StringBuilder 0. в VSC везде 0.
        // класса String            
        long begin = System.currentTimeMillis();
        print_any_string();
        long end = System.currentTimeMillis();
        long result = end - begin;
        System.out.println(result);

        // класса StringBuilder
        begin = System.currentTimeMillis();
        print_any_stringbuilder();
        end = System.currentTimeMillis();
        result = end - begin;
        System.out.println(result);

    }

    private static void print_any_string() {
        String s = "С первых дней жизни рождения ребёнок становиться первооткрывателем, исследователем окружающего мира. Для него всё впервые: свет, тепло, движение, страх и радость. Достигнув пятилетнего возраста, наши маленькие исследователи становятся «почемучками».\n" +
                    "Вопросов возникает слишком много, а найти на них ответ или решить проблему ребёнку в этом возрасте не всегда доступно. На помощь приходят взрослые: родители и педагоги.";
        System.out.println(s.replace("почемучками", "вопросозадователями"));

    }

    private static void print_any_stringbuilder() {
        StringBuilder s = new StringBuilder("С первых дней жизни рождения ребёнок становиться первооткрывателем, исследователем окружающего мира. Для него всё впервые: свет, тепло, движение, страх и радость. Достигнув пятилетнего возраста, наши маленькие исследователи становятся «почемучками».\n" +
                    "Вопросов возникает слишком много, а найти на них ответ или решить проблему ребёнку в этом возрасте не всегда доступно. На помощь приходят взрослые: родители и педагоги.");
        for (int i = 0; i < s.length(); i++) {
            int j = s.indexOf("почемучками");
            if (j < 0) break;
            s.replace(j, j + 11, "вопросозадователями");
        }
        System.out.println(s);


    }

    private static void print_string(String s) {

        String[] m1 = s.split(", ");
        String[] m1_1 = m1[0].split(" ");
        String[] m1_2 = m1[1].split(" ");

        String a = m1_1[1];
        int a_int = Integer.parseInt(a);
        String b = m1_2[1];
        int b_int = Integer.parseInt(b);
        double result = Math.pow(a_int, b_int);
        System.out.println("Основание " + a + ", стапень " + b + ", результат равен " + Math.round(result));


    }

}
