
public class Animal {
    private String name;
    private String dog;

    // Overload Contstructors
    public Animal(String name, String dog) {
        this.name = name;
        this.dog= dog;
    }

    public Animal(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }

    public String getDog(){
        return dog;
    }

    @Override
    public String toString (){ 
        if (this.dog.equals("no")){
            return this.name + " is a dog = " +  "false";
        } else{
            return this.name + " is a dog = " +  "true";
        }
}
}





