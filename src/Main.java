//University, School, Car жана Person деген класс тузунуз
//Алардын свойстваларын ойлоп табыныз
//Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Jibek");
        person.setSurName("Tabaldieva");
        person.setAge(28);
        person.setTall((long)166.5);

        Person person1 = new Person("Aidar","Bakytov",16,(long)176.8);
        Person person2 = new Person("Aibek","Turatbekov",34,(long)178.9);
        Person person3 = new Person("Erkai","Mamytova",25,(long)167.4);

        School school = new School();

        school.setName("Chyngyz Aitmatov");
        school.setAdress("Gagarina 45");
        school.setNumber(33);

        School school1 = new School("Saiakbai Karalaev",56,"Fuchika 67");
        School school2 = new School("Baitik Baatyr",34,"Togolok Moldo 13");

        Car car = new Car();

        car.setBrand("Mercedes-Benz");
        car.setModel("S Class");
        car.setIssue(2000);
        car.setVolume((long)2.2);

        Car car1 = new Car("BMW","39",1999,(long) 2.2);
        Car car2 = new Car("Kia","Sonata",2015,(long)2.4);



        University university = new University();
        university.setName("Togolok Moldo");
        university.setAdrees("Alykulova 29");
        university.setProf("Orcestr");

        University university1 = new University("Baidylda Sarnogoev","Jazuuchu","Kievskyi 15");
        University university2 = new University("Orzubek Nazarov","Boks","Kant 12/9");


        University[] univer ={university,university1,university2};
        Person[] pers = {person,person1,person2,person3};
        Car[] cars = {car,car1,car2};
        School[] schools = {school,school1,school2};
        myUniver(univer);
        myPerson(pers);
        myCar(cars);
        mySchool(schools);

    }
    public static void myUniver(University[] univer){
        for (University university : univer) {
            System.out.println(university.getInfo());
            System.out.println();
        }
    }
    public static void myPerson(Person[] pers){
        for (Person per : pers) {
            System.out.println(per.getInfo());
            System.out.println();
        }
    }
    public static void myCar(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.getInfo());
            System.out.println();
        }
        }
        public static void mySchool (School[] school) {
            for (School school1 : school) {
                System.out.println(school1.getInfo());
                System.out.println();
            }
    }
}