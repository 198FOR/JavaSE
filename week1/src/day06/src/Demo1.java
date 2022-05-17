public class Demo1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("张三", 18, "男", "1");
        Teacher t2 = new Teacher("李四", 25, "女", "2");
        t1.print();
        t2.print();

    }
}

class Teacher {
    String name;
    int age;
    String gender;
    String teacherld;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String  teacherld) {
        this.name = name;
        this.teacherld = teacherld;
    }

    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Teacher(String name, int age, String gender, String teacherld) {
        this(name, age, gender);
        this.teacherld = teacherld;
    }

    public void print() {
        System.out.println(name + " " + age + " " + gender + " " + teacherld);
    }
    public void changeGender(String men){
        gender = men;
    }
}





