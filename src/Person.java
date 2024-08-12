public class Person {
    private String name;
    private String surName;
    private int age;
    private Long tall;

    public Person(String name,String surName,int age,Long tall){
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.tall = tall;
    }
    public Person(){
        String name = this.name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Long getTall(){
        return tall;
    }
    public void setTall(Long tall){
        this.tall = tall;
    }

    public String getInfo(){
        return String.format("""
                Person
                name: %s
                surname: %s
                age: %d
                tall: %s""",name,surName,age,tall);
    }
}
