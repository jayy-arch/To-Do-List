package to.pkgdo.list;

import java.util.Scanner;


public class ToDoList {
static int option;

static void Monday(){
    System.out.println("gym day");
}
     
    static void Tuesday(){
    System.out.println("study for 5 hours");
}
    static void Wednesday(){
    System.out.println("have lunch with friends");
}
    static void Thursday(){
    System.out.println("learn a new skill");
}
    static void Friday(){
    System.out.println("develop a website");
}
    static void Saturday(){
    System.out.println("eat a healthy meal");
}
    static void Sunday(){
    System.out.println("spend day with family");
}
    static void result(){
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter 1-7");
        option =scanner.nextInt();
        
        switch (option){
            
            case 1 -> Monday();
            
            case 2 -> Tuesday();
            
            case 3 -> Wednesday();
            
            case 4 -> Thursday();
            
            case 5 -> Friday();
            
            case 6 -> Saturday();
            
            case 7 -> Sunday();
            default -> System.out.println("invalid input");
        }
            
            
            
    }  
    
    public static void main(String[] args) {
        result();
    }
    
}
