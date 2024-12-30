import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String grade;
    private String[] subjects = { "Math", "Science", "English" };
    private int[] scores = { 90, 85, 95 };
    private int totalScore = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public Student(String string, int l, String string2, String string3, String string4, String string5, int i, int j,
            int k) {
    }

    public Student(String name, int age, String grade, String[] subjects) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.subjects = subjects;
        this.scores = scores;
        this.totalScore = totalScore;
    }

    public Student(String string, int i, String string2, String[] strings, int[] js, int j) {
        //TODO Auto-generated constructor stub
    }

    public Student() {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + ", subjects=" + Arrays.toString(subjects)
                + ", scores=" + Arrays.toString(scores) + ", totalScore=" + totalScore + "]";
    }

}
