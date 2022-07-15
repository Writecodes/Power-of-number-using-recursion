//.......................calculate the power of a number using recursion............................

import java.util.Scanner;
public class Main
{
    public static int power(int base,int pow){
        if(pow!=0)
            return(base*power(base,pow-1));
        else
            return 1;
    }
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int b = sc.nextInt();
        System.out.print("Enter the power : ");
        int p = sc.nextInt();
	    System.out.println("Output : "+b+"^"+p+"="+power(b,p));
	}
}
	

//....................Calculate the power of a Number...............................
// import java.util.Scanner;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the base : ");
//         int base = sc.nextInt();
//         System.out.print("Enter the power : ");
//         int pow = sc.nextInt();
//         // int num = (int)Math.pow(3, 2);  //also calculate directly by pre-defined function
// //        System.out.println(num);//
//         int prod=1,i;
//         for (i=1;i<=pow;i++){
//             prod=prod*base;
//         }
//         System.out.println("Output : "+base+"^"+pow+"="+prod);

//.......................calculate the power of a number using recursion............................




