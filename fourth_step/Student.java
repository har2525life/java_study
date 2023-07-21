public class Student extends Person {
    private int stuNo; // ← ここをstnNoからstuNoに変更

    public Student(String name) {
        this(name, 999); // Studentを参照している
    }

    public Student(String name,int stuNo) {
        super(name); // 
        this.stuNo = stuNo;
    }
    // public void setStuNo(int s) {
    //     this.stuNo = s;
    // }
    public void display() {
        // System.out.println("学籍番号: " + stuNo); // ← ここをstnNoからstuNoに変更
        // System.out.println("名前: " + getName()); // ← ここをstnNoからstuNoに変更
        super.display();
        System.out.println("学籍番号" + stuNo);    
    }
}