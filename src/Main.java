public class Main {
    public static void main(String[] args) {
        //Task1
        int number = 1;
        int i = 10;

        String result = "";
        while (number <= 10) {
            result += number + " ";
            number++;
        }
        System.out.println(result);

        String result2 = "";
        for (; i >= 1; i--) {
            result2 += i + " ";
        }
        System.out.println(result2);


        //Task2
        int Friday = 1;
        while (Friday <= 31) {
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет.");
            Friday += 7;
        }


        //Task3
        int period200Years = 1822;
        int YearTheCometLastFlewBy = 1975;
        int nextYearTheCometWillArrive = YearTheCometLastFlewBy;

        nextYearTheCometWillArrive += 79;
        System.out.println("Комета прилетит в " + nextYearTheCometWillArrive + " году.");
        while (YearTheCometLastFlewBy >= period200Years) {
            System.out.println("Комета прилетала в " + YearTheCometLastFlewBy + " году.");
            YearTheCometLastFlewBy -= 79;

        }

    }
}