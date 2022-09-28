package arrays;

public class Arrays {

    public static void main(String[] args) {

        //First option
        String[] students1 = new String[4];
        students1[0] = "Alex";
        students1[1] = "Drogba";
        students1[2] = "Ben";
        students1[3] = "Ryan";

        for (int i = 0; i < students1.length; i++) {
            System.out.println(students1[i]);
        }

        System.out.println("---------------------");

        //Second option
        String[] students2 = new String[]{"Alex", "Drogba", "Ben", "Ryan"};

        for (String student : students2) {
            System.out.println(student);
        }

    }

}
