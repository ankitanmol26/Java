
// sum of two numbers
// import java.util.Scanner;


// public class first {
//     public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter number1 :");
//         int num1 = sc.nextInt();
//         System.out.print("Enter number2 :");
//         int num2 = sc.nextInt();
//         int sum = num1 + num2 ;
//         System.out.println("Sum of two numbers is :" + sum);

       
//     }
// }


// finding the area of rectangle
// import java.util.Scanner;

// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter length of the rectangle :");
//         int length = sc.nextInt();
//         System.out.print("Enter breadth of the rectangle :");
//         int breadth = sc.nextInt();
//         int area = length * breadth;
//         System.out.println("Area of rectangle is :" + area);
//     }
// }


// finding the simple interest
// import java.util.Scanner;
// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the principal amount :");
//         double principal = sc.nextDouble();
//         System.out.print("Enter the rate of interest :");
//         double rate = sc.nextDouble();
//         System.out.print("Enter the time in years :");
//         double time = sc.nextDouble();
//         double simpleInterest = (principal * rate * time) / 100;
//         System.out.println("Simple Interest is :" + simpleInterest);
//     }
// }

// swapping of two numbers using a temporary variable
// public class first{
//     public static void main (String[] args){
//         int a = 10;
//         int b = 20;
//         int c = a;
//         a = b;
//         b = c;
//         System.out.println("After swapping :");
//         System.out.println("Value of a :" + a);
//         System.out.println("Value of b :" + b);
//     }
// }

// swapping of two numbers without using a temporary variable
// public class first{
//     public static void main(String[] args){
//         int a =10;
//         int b =20;
//         a = a + b; // a becomes 30
//         b = a - b; // b becomes 10 (30 - 20)
//         a = a - b; // a becomes 20 (30 - 10)
//         System.out.println("After swapping :");
//         System.out.println("Value of a :" + a);
//         System.out.println("Value of b :" + b);
//     }
// }

// claculating quotient and remainder
// public class first{
//     public static void main(String[] args){
//         int a = 17;
//         int b = 5;
//         int quotient = a / b;
//         int remainder = a % b;
//         System.out.println("Quotient :" + quotient);
//         System.out.println("Remainder :" + remainder);
//     }
// }

// converting temperature from Celsius to Fahrenheit
// public class first{
//     public static void main(String[] args){
//         double celsius = 25.0;
//         double farenheit = (celsius * 9/5) + 32;
//         System.out.println(celsius + " degree Celsius is equal to " + farenheit + " degree Farenheit.");

//     }
// }
// calculating total marks and percentage of a student
// import java.util.Scanner;
// public class first{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the marks obtained in subject 1 :");
//         double subject1 = sc.nextDouble();
//         System.out.print("Enter the marks obtained in subject 2 :");
//         double subject2 = sc.nextDouble();  
//         System.out.print("Enter the marks obtained in subject 3 :");
//         double subject3 = sc.nextDouble();
//         double totalMarks = subject1 + subject2 + subject3;
//         double percentage = (totalMarks / 300) * 100;
//         System.out.println("Total Marks :" + totalMarks);
//         System.out.println("Percentage :" + percentage + "%");
//     }
// }


// average of three numbers
// public class first{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         int average = (a + b + c) / 3;
//         System.out.println("Average :" + average);
//     }
// }

// public class first{
//     public static void main(String[] args){
//         int a = 10;
//         System.out.println(++ a);
//         System.out.println(a++);
//         System.out.println(--a);
//         System.out.println(a--);    
//     }
// }

// finding the number is even or odd
// public class first{
//     public static void main(String[] args){
//         int n = 17;
//         if(n % 2 ==0){
//             System.out.println("The number is even");
//         }else{
//             System.out.println("The number is odd");

//         }
//         }
//     }
// }

// public class first{
//     public static void main(String[] args){
//         int n = -5;
//         if(n > 0){
//             System.out.println("The number is positive");
//         }else if(n < 0){
//             System.out.println("The number is negative");
//         }else{
//             System.out.println("The number is zero");}
//         }
//         }

// finding the greatest of two numbers
//   public class first{
//     public static void main(String[] args){
//         int a = 25;
//         int b = 17;
//         if (a > b){
//             System.out.println("The greatest number is :" + a);
//         }else{
//             System.out.println("The greatest number is : " + b);
//         }
//     }
//   }      
    
// finding the greatest of three numbers
// public class first{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 25;
//         int c = 18;
//         if (a > b && a > c){
//             System.out.println("The greatest number is :" + a);
//         }else if (b > a && b > c){
//             System.out.println("The greatest number is :" + b);
//         }else{
//             System.out.println("The greatest number is :" + c);
//     }
// }
// }




// for checking the number is divisible by 3 and 5
// public class first{
//     public static void main(String[] args){
//         int n = 15;
//         if (n % 3 == 0 && n % 5 == 0){
//             System.out.println("The number is divisible by both 3 and 5");
//         }else if (n % 3 == 0){
//             System.out.println("The number is divisible by 3");
//         }else if (n % 5 == 0){
//             System.out.println("The number is divisible by 5");
//         }else{
//             System.out.println("The number is not divisible by 3 or 5");
//         }
//     }
// }


// printing numbers from 1 to n
// public class first{
//     public static void main(String[] args){
//         int n = 5 ;
//         for (int i = 1; i <= n; i++){
//             System.out.println(i);
//         }
//     }
// }

// printing numbers from n to 1
// public class first{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = n; i >= 1; i--){
//             System.out.println(i); 
//         }
//     }
// }

// printing the sum of first n natural numbers
// public class first{
//     public static void main(String[] args){
//         int n = 5;
//         int sum = 0;
//         for(int i = 1; i <= n; i++){
//             sum = sum +i;

//         }
//         System.out.println("The sum of first " + n + " natural numbers is :" + sum);
//     }
// }

// printing the multiplication table of a number
// public class first{
//     public static void main(String[] args){
//         int n = 7;
//         for(int i = 1; i <= 10; i++){
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
// }

// counting the number of digits in an integer
// public class first{
//     public static void main(String[] args){
//         int n = 12345;
//         int count = 0;
//         while (n != 0){
//             n = n / 10;
//             count++;
//         }
//         System.out.println("The number of digits in the integer is: " + count);

//     }
// }

// sum of digits in an integer
// public class first{
//     public static void main(String[] args){
//         int n = 1234;
//         int sum = 0;
//         while (n!= 0){
//             int digit = n % 10;
//             sum += digit;
//             n = n / 10;
//         }
//         System.out.println("The sum of digits in the integer is: " + sum);
//     }
// }

//reversing an integer
// public class first{
//     public static void main(String[] args){
//         int n = 1234;
//         int reversed = 0;
//         while (n !=0){
//             int digit = n % 10 ;
//             reversed = reversed * 10 + digit;
//             n = n/10;
//             
//         }
//               System.out.println("The reversed integer is: " + reversed);
//     }
// }

//check palindrome number
// public class first{
//     public static void main(String[] args){
//         int n = 122;
//         int original = n;
//         int reversed = 0;
//         while(n != 0 ){
//             int digit = n % 10;
//             reversed = reversed * 10 + digit;
//             n = n/10;

//         }
//         if (original == reversed){
//             System.out.println(original + " is a palindrome number.");
//         }
//         else{
//             System.out.println(original + " is not a palindrome number.");
//         }
//     }
// }

// finding largest digit in an integer
// public class first{
//     public static void main(String[] args){
//         int n = 58324;
//         int largest = 0;
//         while ( n != 0){
//             int digit = n % 10;
//             if (digit > largest ){
//                 largest = digit;
                
//             }
//             n = n/10;
           
//         }
//          System.out.println("The largest digit in the integer is: " + largest);
//     }
// }

// count even and odd digits in an integer
// public class first{
//     public static void main(String[] args){
//         int n = 123456;
//         int evencount = 0;
//         int oddcount = 0;
//         while (n != 0){
//             int digit = n % 10;
//             if (digit % 2 ==0){
//                 evencount++;
//             }else{
//                 oddcount++;
//             }
//             n = n/10;
//         }
//         System.out.println("The number of even digits is: " + evencount);
//         System.out.println("The number of odd digits is: " + oddcount);
//     }
// }

//factorial
// public class first
// {
//     public static void main(String[] args){
//         int n = 5;
//         int factorial = 1;
//         for (int i = 1; i <= n; i++){
//             factorial *= i;


//         }
//         System.out.println("The factorial of " + n + " is: " + factorial);
//     }
// } 