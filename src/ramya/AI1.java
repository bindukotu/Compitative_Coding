package ramya;

public class AI1 {
    public static void main(String[] args) {
        System.out.println("From Main Method");
        int m = m1();
        System.out.println(m);
        System.out.println("End of Main Method");
    }
    public static int m1() {
        try {
            return 1;
        } catch (Exception e) {
            return 0;
        } finally {
            System.out.println("In Side of finally");
            return -1;
        }
        //Exam_CoreJava Questions 1,2,3,9,11
        //Questions_Document 6,7,
    }
}
