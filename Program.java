public class Program {
    public static void main(String[] args) {
        try {
            VirtualPicnicBasket basket = new VirtualPicnicBasket("input.txt", " ");
            System.out.println("Количество слов " + basket.getNumWords());
            System.out.println("Самое длинное слово " + basket.getMostLongWord());
            System.out.println("Количество использований слов: " + basket.countNumEachWord());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так, что конкретно - ответ в Stacktrace");
            e.printStackTrace();
        }
    }
}
