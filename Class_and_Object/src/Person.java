class Person {
    String name;
    int age;
    Person(String n, int a) {
        name = n;
        age = a;
    }
    Person(Person p) {
        name = p.name;
        age = p.age;
    }
    void result() {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person(p1);
        p1.result();
        p2.result();
    }
}
