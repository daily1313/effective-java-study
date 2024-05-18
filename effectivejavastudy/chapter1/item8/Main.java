package effectivejavastudy.chapter1.item8;

public class Main {

    public static void main(String[] args) {
        try (Room room = new Room(10)){
            System.out.println("using room object");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
