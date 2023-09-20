import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Encapsulation
         * Getters and
         * Setters
         * private  /модификатор доступа/
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Катталуу учун томондогулорду толтурунуз: ");
//        User user = new User();
//        user.setName("Атыныз: ");
//        System.out.println(user.getName());
//        user.setName(scanner.nextLine());
//
//        user.setDateOfBrith("Туулган жылыныз: ");
//        System.out.println(user.getDateOfBrith());
//        user.setDateOfBrith(scanner.nextLine());
//        user.setPhoneNumber("Телефон номериниз: ");
//        System.out.println(user.getPhoneNumber());
//        user.setPhoneNumber(scanner.nextLine());
//        System.out.println("Сиз ийгиликтуу каттоодон оттунуз!");
//        System.out.println("Аты: " + user.getName());
//        System.out.println("Туулган жылы: " + user.getDateOfBrith());
//        System.out.println("Телефон номери: " + user.getPhoneNumber());

//        Student student = new Student();
//        student.setName("Aiperi");
//        student.setAge(13);
//        student.setEmail("Bairamova@gmail.com");
//        student.setPhoneNumber("78974567389");
//        System.out.println(student.getPhoneNumber());
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//
//        student.setName("Tolkun");
//        student.setAge(7);
//        student.setEmail("Begaliev@gmail.com");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//        student.setPhoneNumber("78974567389");
//        System.out.println(student.getPhoneNumber());
//        student.setName("Gulnura");
//        student.setAge(9);
//        student.setEmail("Asanova@gmail.com");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//        student.setPhoneNumber("7992456732");
//        System.out.println(student.getPhoneNumber());
//        student.setName("Bektur");
//        student.setAge(12);
//        student.setEmail("Kalmatov@gmail.com");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//        student.setPhoneNumber("79912347685");
//        System.out.println(student.getPhoneNumber());
//        student.setName("Munar");
//        student.setAge(11);
//        student.setEmail("Esenbaev@gmail.com");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//        student.setPhoneNumber("79256758976");
//        System.out.println(student.getPhoneNumber());
//        student.setName("Begimai");
//        student.setAge(8);
//        student.setEmail("Bolotbekova@gmail.com");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//        student.setPhoneNumber("798845678");
//        System.out.println(student.getPhoneNumber());
//        student.setName("Nurgazi");
//        student.setAge(14);
//        student.setEmail("Joroev@gmail.com");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//        student.setPhoneNumber("7965777456998");
//        System.out.println(student.getPhoneNumber());
//        student.setName("Mira");
//        student.setAge(7);
//        student.setEmail("Aidarova@gmail.com");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());
//        student.setPhoneNumber("+79823456789");
//        System.out.println(student.getPhoneNumber());
//
//        School school = new School();
//        school.setNameSchool("School number-21");
//        school.setStudents(new Student[]{student,student,student,student,student,student,student,student});
//        System.out.println(school.quantityOfStudents());

        Array array = new Array();
        array.setArray(new int[]{1,2,3,4,5,6,7});
      //  int[]array1 =array.getArray();
     //   int max =array.max(array.getArray());
        for (int i = 0; i < array.getArray().length; i++) {
            System.out.println(array.getArray()[i]+" ");

        }
        System.out.println("max san "+ array.max(array.getArray()));
        System.out.println("min san "+ array.min(array.getArray()));


        System.out.println(array.pow(2,3));
        
    }
    static int san(){
        return 5;
    }

}