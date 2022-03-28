public class LessonEleven {
    //Ошибки
    public static void main (String[] args) {
/*        int[] array = new int[3];
        array[0] = 4;
        array[1] = 4;
        array[2] = 4;
        System.out.println(array[3]);// вызвали несуществующий массив
    }*/

/*    int[] array = new int[3];
    array[0] = 4;
    array[1] = 4;
    array[2] = 4;
    print();
}
    public static void print() {
        int [] array = new int[1];
        System.out.println(array[5]);//вызов соседнего метода
    }*/

/*        try {
// при условии появляется ошибка
        } catch (IndexOutOfBoundsException e) {
// а тут другая
        } catch (NullPointerException e){

        }// И так пишем пока ошибки не закончатся*/

/*        try {
            int[] array = new int[1];
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработка ошибки");
        }
        System.out.println("Ошибка пройдена");*/

/*        try {
            int[] array = new int[1];
            System.out.println(array[5]);
        } catch (Exception e) {//Лучше использовать наш класс
            System.out.println("Обработка ошибки");
        }
        System.out.println("Ошибка пройдена");*/

/*        try {
            int[] array = new int[1];
            System.out.println(array[5]);
        } catch (Exception e) {
            e.printStackTrace();//информация об ошибке которая произошла
            System.out.println (e.getCause());//причина ошибки
            System.out.println (e.getMessage());//описание ошибки
            System.out.println("Обработка ошибки");
        } finally {
            System.out.println("Блок finally");
        }
        System.out.println("Ошибка пройдена");*/

/*        try {
            int[] array = new int[1];
            System.out.println(array[5]);
        } finally {
            System.out.println("Блок finally");
        }
        System.out.println("Ошибка пройдена");//Советуют избегать такие написания ошибок*/

/*        try {
            int a = 5;
            int b = 5;
            if (true) {
                throw new ArithmeticException(); // создаём объект нашй ошибки
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }        */

    }
}
