package collection.compare;

public class MyUser implements Comparable<MyUser>{

    private String Id;
    private int age;

    public MyUser(String Id, int age) {
        this.Id = Id;
        this.age = age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + Id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(MyUser o) {
        System.out.println(this + " vs " + o);
        return  this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }
}
