package fifth;

public class Student {
    int number;
    String sex;
    String name;
    int age;

    public void setGraduate(String name, String sex,int age,int number) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.number = number;
    }


    public String toString () {
        return "����:  "  +  name  +  "  �Ա�:  "  +  sex  +  "  ����:  "  +  age  +  "  ѧ��:  "  +  number + "\n";
    }
}
