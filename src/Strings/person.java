package Strings;

    public class person {

        private String name;
        private int age;

        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + "]";
        }

    public static void main(String[] args) {
    person p = new person("John", 30);
    System.out.println(p); // prints "Person[name=John, age=30]"
    }
}
