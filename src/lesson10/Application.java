package lesson10;

public class Application {
    public static void main(String[] args) {
        /**
         * ���� �������:
         * ����� - �������� ����, ������������ � ������
         * ����������� �����
         * - ����� �� ��� ������� �����, �� �� �� ����� ������� ��� ������.
         - ����� ���� ����������� ������ ����� �� ����
         * ���������
         * - ����� �� ��� ������� �����, �� �� �� ����� ������� ��� ������
         - ��� ������ ������ �����������
         - ��� ���� public static final. static - �����, final - �� ����������
         ��������� - ��� ��� ����������, ��������
                            ? Samsung?
         ����������			�������� ��������		            ����������


         - ������� ����			    - ������� ����
         - ������� �����			-������������� ����
                                    - ����������� ����

         ���� ����� - ��� ��� ����������� ������������ � �������� �������. �� ��������� - ��� ���.
         ������� � ������������ ������� (������������)
         * Interface - �������� ����� ��� �������� ���������� � Java
         * ������� ��������� ���������� � Java ������
         * * ��������� ������������ ���������� ����������
         * ���������� �� ����� ����� �������������, ������ ��� �� �� ����� ������� ��������� ����������
         * �� ��������� ����� ������� ���������� �������� public, static � final, ��� ��� ��� �� �����
         ���������� ����������� �������
         * �� ��������� ������ ���������� ������ abstract � public
         * ��������� � Java �� ����� ���� ���������� � ������� ������, �� �� ����� ����������� ������ ���������
         * * �������� ����� implements ������������ �������� ��� ���������� ����������
         * �����, ����������� ���������, ������ ���������� ���������� ���� ��� ������, ���� ������ ��� �� ����������
         * Enum
         * ���������� ���������� �����
         * ��������� �����
         * */
        String s1 = "Hello World";
        s1 = "Goodbye";


        /**
         * 1. ������� ��������� �e�pl� � ����������� ������ ������� ������ ���� � �������� ������
         2. ������� ��������� Employer � ����������� ������ ������� ������ ���� � �������� ������ Object
         ? People?

         Employer
         *3. ��������� Employer extends People. ��� ��� ����� ������������� ��������� Employer �������
         ������������� ������ �� Employer u �� People
         Object
         People?
         Employer
         PythonDeveloper JavaDeveloper
         * 4. �������� ����� JavaDeveloper � ������ implements Employer, �� ������� ����� ������ implements methods
         5. ��������� ����� doWork() � JavaDeveloper
         6. ��������� ����� keepSalary() � JavaDeveloper
         *7. �� ������ String getFullNome() � getAge() ����� ��������� ��� ���� ���������� ����� ������ ����������� ����� AbstrEmployer
         Object
            People? (2 ������)
                ?Employer ? (2 ������)
                         |
                AbstrEmployer (+2 ������)
         JavaDevelaper (-2 ������)  PythonDeveloper (-2 ������)
         * */

        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.setName("JavaDev");
        javaDeveloper.setAge(30);
        javaDeveloper.doWork();
        javaDeveloper.keepSalary();
        System.out.println(javaDeveloper.getFullName());
        System.out.println(javaDeveloper.getAge());

        PythonDeveloper pythonDeveloper = new PythonDeveloper();
        pythonDeveloper.setAge(35);
        pythonDeveloper.setName("PythonDev");
        pythonDeveloper.doWork();
        pythonDeveloper.keepSalary();


    }
}
