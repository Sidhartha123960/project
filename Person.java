class Person
 {
     int id;
     String name;
     String gender;
     String location;
     public Person(int id, String name, String gender, String location)
     {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.location = location;
     }  
     public void display()
     {
        System.out.println("id"+" "+this.id);
        System.out.println("name"+" "+this.name);
        System.out.println("gender"+"  "+this.gender);
        System.out.println("location"+"  "+this.location);
     }
    public static void main(String[] args)
    {
           Person p = new Person(2,"ram","male","bengalore");
           p.display();
    } 
}   
