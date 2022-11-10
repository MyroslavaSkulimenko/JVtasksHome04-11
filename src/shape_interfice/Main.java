package shape_interfice;
/*создать классы,
    // содержащие методы для подсчета площади и периметра rectangle and circle,
    //используя интерфейсы. Создать несколько обьектов этих типов и вывести  на экран их площадь и периметр*/

public class Main {
    public static void main(String[] args) {
Square11 square= (Square11) new Circle11("Сircle",4);
Square11 square1= (Square11) new Rectangle11("Rectangle",12,5);

        System.out.println(square);
        System.out.println(square1);
    }

}
