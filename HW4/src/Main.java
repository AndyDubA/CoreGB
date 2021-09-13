import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Phone_book phones = new Phone_book();
        phones.add("Сергеев", "894556602");
        phones.add("Петров", "894551502");
        phones.add("Иванов", "894565502");
        phones.add("Сидоров", "894351282");
        phones.add("Попов", "894999583");
        phones.add("Сидоров", "894225423");
        phones.add("Петров", "895826435");

        for (String phone : Phone_book.get("Сергеев")){
            System.out.println("Сергеев " + phone);
        }
        for (String phone : Phone_book.get("Петров")){
            System.out.println("Петров " + phone);
        }
        for (String phone : Phone_book.get("Иванов")){
            System.out.println("Иванов " + phone);
        }
        for (String phone : Phone_book.get("Сидоров")){
            System.out.println("Сидоров " + phone);
        }
        for (String phone : Phone_book.get("Попов")){
            System.out.println("Попов " + phone);
        }
    }
}
