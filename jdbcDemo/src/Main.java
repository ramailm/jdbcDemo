//@author sumeyye karagul
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {


        System.out.println("------------------------------------");
        Base[] data = new Base[]{new UpdateData(), new InsertData(), new SelectData(), new DeleteData()};

        System.out.println("Press 0 to update data, 1 to insert data, 2 to select data and 3 to delete data");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();


        switch (choose) {
            case 0:
                System.out.println("enter the new population number and id respectively");
                int pop = sc.nextInt();
                int id = sc.nextInt();
                data[choose].updateData(pop, id);
                break;
            case 1:
                System.out.println("Enter the name,country code, district and population respectively");
                String name = sc.next();
                String cc = sc.next();
                String ds = sc.next();
                int pop2 = sc.nextInt();
                data[choose].insertData(new City(name, cc, ds, pop2));
                break;
            case 2:
                System.out.println("world.city");
                System.out.println("---------------------");
                data[choose].selectData();
                break;
            case 3:
                System.out.println("Enter the id of the row you want to delete");
                int deleteId = sc.nextInt();
                data[choose].deleteData(deleteId);
                break;
            default:
                System.out.println("wrong number");
                break;

        }
    }

}

