class Student {
	// Implement your Student class here
    private int Id;
    private String Name;
    private char Gender;  
    private int Score;
    private char GPA;
 

    public Student(int id,String name,char gender,int score){
        this.Id = id;
        this.Name = name;
        this.Gender = gender;
        this.Score = score;
    }

    //SEtTER-----------
    public void setName(String name){
        this.Name = name;
    }
    public void setScore(int score){
        this.Score = score;
    }
    public void setId(int id){
        this.Id = id;
    }
    public void setGender(char gender){
        this.Gender = gender;
    }

    //GETTER------------------
    public String getName(){
        return Name;
    }
    public char getGender(){
        return Gender;
    }
    public int getId(){
        return Id;
    }
    public int getScore(){
        return Score;
    }

    public char calGPA(){
       if(Score>=80 && Score<=100){
         GPA = 'A'; 
       }
       else if(Score>=70 && Score<=79){
         GPA = 'B';
       }
       else if(Score>=60 && Score<=69){
         GPA = 'C';
       }
        else if(Score>=50 && Score<=59){
         GPA = 'D';
       }
       else if(Score>=0 && Score<=49){
         GPA = 'F';
      }
        return GPA;
    
    }

}

public class J130_Student{
    public static void main(String[] args) {
       	// DO NOT MODIFY THE DRIVER CLASS
        Student boy = new Student(1133,"Thanaphon",'M',73);
        Student c = new Student(1130, "Sethanant", 'M', 60);
        boy.setName("Thanaphon Sombunkaeo");

        System.out.println(boy.getName());
        System.out.println(boy.getGender());
        System.out.println(boy.calGPA());

        boy.setScore(53);
        System.out.println("After change score : ");
        System.out.println(boy.calGPA());

        System.out.println("----C-----");
        System.out.println(c.getGender());
        System.out.println(c.getId());
        c.setId(230);
        c.setGender('F');
        System.out.println(c.getId());
        System.out.println(c.getScore());
        System.out.println(c.calGPA());
        System.out.println(c.getGender());
    }
}


