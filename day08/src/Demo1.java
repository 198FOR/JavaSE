public class Demo1 {
    public static void main(String[] args) {
        Student stu1 = new Student("李华",1001,"男",25,96);
        Student stu2 = new Student("小明",1001,"男",25,96);
        Student stu3 = new Student("小刚",1001,"男",25,96);
        Student stu4 = new Student("小花",1001,"男",25,96);
        Student stu5 = new Student("二狗",1001,"男",25,96);
    }
}

class Student {
    String name;
    int stuId;
    String gender;
    int age;
    double score;

    public Student() {

    }

    public Student(String name, int stuId, String gender, int age, double score) {
        this.name = name;
        this.stuId = stuId;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public void print() {
        System.out.println(name + " " + stuId + " " + gender + " " + age + " " + score);
    }
}
