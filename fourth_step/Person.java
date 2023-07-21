public class Person {
    private String name;
    // public void setName(String n) {
    //     name = n;
    // }

    public Person(String name) {
        this.name = name;  // 2行目を参照している
    }

    // public String getName() {
    //     return name;
    // }

    public void display() {
        System.out.println("名前" + name);
    }
}
