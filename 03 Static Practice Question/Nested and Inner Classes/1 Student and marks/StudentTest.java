

class Student{

    static class Marks{
        String subject;
        int score;

        Marks(String subject, int score){
            this.subject = subject;
            this.score = score;
        }

        void dispaly(){
            System.out.println("Subject: " + subject);
            System.out.println("Score: " + score);
        }
    }
}

public class StudentTest{
    public static void main(String[] args) {
        Student.Marks m1 = new Student.Marks("Maths", 96);
        Student.Marks m2 = new Student.Marks("Physics", 95);
        m1.dispaly();
        m2.dispaly();
    }
}