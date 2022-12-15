import java.util.ArrayList;
import java.util.Scanner;

public class No5 {
	public static void main(String[] args){
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<Owner> owners = new ArrayList<Owner>();
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0; i<count; i++){
			int id = sc.nextInt();
			String fn = sc.next();
			String ln = sc.next();
			String gender = sc.next();
			owners.add(new Owner(id, fn, ln, gender));
			int cid = sc.nextInt();
			String brand = sc.next();
			String color = sc.next();
			cars.add(new Car(cid, brand, color, owners.get(i)));
		}

		System.out.println("--- Car Owner List ---");
		for(int i=0; i<count; i++){
			Car c = cars.get(i);
			System.out.println("id: "+c.getId()+ 
					" brand: "+ c.getBrand() +
					" color: "+ c.getColor() + 
					" owner: "+ c.getOwner().getFirstName() + " " + c.getOwner().getLastName());
		}

	}
}

abstract class Person{
    private int id;
    private String firstname;
    private String lastname;
    private String gender;
    
    public Person (int id, String fn, String ln, String gender){
        this.id = id;
        this.firstname = fn;
        this.lastname = ln;
        this.gender = gender;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public String getFirstName(){
        return firstname;
    }
    
    public void setFirstName(String fn){
        this.firstname = fn;
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public void setLastName(String ln){
        this.lastname = ln;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
}

class Owner extends Person{
    public Owner(int id,String fn, String ln, String gender){
        super(id,fn,ln,gender);
    }
    

}

class Car{
    private int id;
    private String brand;
    private String color;
    private Owner owner;
    
    public Car(int id, String brand,String color,Owner owner){
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.owner = owner;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public Owner getOwner(){
        return owner;
    }
    
    public void setOwner(Owner owner){
        this.owner = owner;
    }
}
