package fifth;
import java.util.Scanner;
import java.io.*;

public class Test {
    public static void main(String args[]) {
        Student xuesheng = new Student();
        System.out.println("�����������Ա����䣬ѧ��");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String sex = s.nextLine();
        int age = s.nextInt();
        int number = s.nextInt();
        xuesheng.setGraduate(name, sex, age, number);

        try {
            FileReader fileReader = new FileReader("D:\\���޸�.txt");//��ȡD���ļ�
            BufferedReader bufferedReader = new BufferedReader(fileReader);//���ļ��浽������
            Writer writer = new FileWriter(new File("D:\\A.txt"));//���������ļ�д��A�ļ���
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            str = str.replaceAll(regex, "$1��");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "��\n");
            }
            System.out.println(x);
            writer.write(String.valueOf(xuesheng));
            writer.write("\n");
            writer.write(String.valueOf(x));
            bufferedReader.close();//�رջ�����
            fileReader.close();//�ر��ļ���ȡ
            writer.close();//�ر�д��

            a:
            while (true) {
                System.out.println("����1����2ѡ���ѯ�ֺʹʻ����˳�");
                Scanner in = new Scanner(System.in);
                int z = in.nextInt();
                switch (z) {
                    case 1:
                        Scanner y = new Scanner(System.in);
                        System.out.println("��������Ҫ��ѯ����:");
                        String c = y.nextLine();
                        int count = (str.length() - str.replace(c, "").length()) / c.length(); //ʹ��replace�������ַ����滻Ϊ�գ�Ȼ���󳤶�
                        System.out.println(count);
                        break;
                    case 2:
                        System.out.println("�˳�");
                        break a;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("���ִ���!");
        }
    }
}