class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Getset {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rajlaxmi@Codingal");
        System.out.println(s.getName());
    }
}