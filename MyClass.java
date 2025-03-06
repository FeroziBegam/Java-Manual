public class MyClass {
    static int count = 0;       
    final double pi = 3.14;    

    // Constructor with proper declaration
    public MyClass() {          
        count = count + 1;
    }    
    
    public void display() {
        System.out.println("Count is: " + count);
        System.out.println("Double is: " + pi);
        System.out.println();
    } 
    
    public static void main(String[] args) {
        MyClass Asec = new MyClass();
        Asec.display();
        
        MyClass Bsec = new MyClass();
        Bsec.display();
        
        System.out.println("The final count is: " + count);
        System.out.println("Double is: " + Bsec.pi);
    }
}
