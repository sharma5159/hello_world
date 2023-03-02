public class FirstCode {
//Class is like a template or blueprint where we define properties /methods/variables while creating objects.
// Variables are used to store the data and we can change the data
    public static void main(String args[]){
    //main() is the method where execution starts
    int a = 5 ;
    a =1; ; // once define the value , can also change the variable name
    float f =1.5f;
    double d = 1; //implicit conversion , as double supports the int value
    int  i = (int) 5.0;
    System.out.println(i);//explicit conversion , Type casting where we casted double value to int

    char c = 'A';
    c = 69; //69 is the ASCII value for E , as all the keyboard represents its own unique value
    System.out.println(c);
    // byte ->short,char->int ->long->float->double
    }

}
