
public class Person6 {
   private String name;
   private int age;
   public - insertValue(String name ,int age){
       this.name = name ;
       this.age = age ;
   }
   public void displayValue(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

   }
    public static void main(String[] args) {
                Person6 person = new Person6();
        person.insertValue("Anmay",20);
        person.displayValue();

    }
}
