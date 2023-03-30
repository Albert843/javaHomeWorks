// ====================================== Домашнее задание =======================================

//                          Семинар 1. Знакомство с языком программирования Java

//                                          Задача 1.
// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

//                      Variant 1 (iterative):

// public class Program {
//     public static void main(String[] args) {
//         int a = 5;
//         System.out.println(triangleNumber(a));
//     }
//     public static int triangleNumber(int a){
//         int sum = 0;
//         for (int i = 0; i < a; i++) {
//             sum = (a*(a+1))/2;
//         }
//         return sum;  
//     }
// }

//                      Variant 2 (recursion):

// public class Program {
//         public static void main(String[] args) {
//             int n = 5;
//             System.out.println(triangleNumber(n));
//         }
//         public static int triangleNumber(int n){
//             int sum = 0;
//             if(n == 1){
//                 sum += 1;
//             }
//             else{
//                 sum += n + triangleNumber(n - 1); 
//             }
//             return sum;
//         }
//     }
// -----------------------------------------------------------------------------------------------
//                                          Задача 2.
// Вычислить n! (произведение чисел от 1 до n)

// public class Program {
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(factorial(n));
//     }
//     public static int factorial(int n){
//         if(n == 0 || n ==1){
//             return 1;
//         }
//         int result = n*factorial(n - 1);
//         return result;
//     }
// }
// -------------------------------------------------------------------------------------------------
//                                          Задача 3.
// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

// public class Program {
//     public static void main(String[] args){
//         int n = 1000;
//         isSimple(n);
//         for(int i = 1; i <= n; i++){
//             if(isSimple(i)){
//                 System.out.print(i + " ");
//             }
//         }
//     }
//     static boolean isSimple(int n){
//         if(n==1||n==0){
//             return false;
//         }
//         for(int i=2; i<n; i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }  
// }
// ---------------------------------------------------------------------------------------------------------------
//                                          Задача 4.
// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ).

// import java.util.Scanner;
// public class Program {
//     public static void main(String[] args) {
//         calculator();
//     }
//     static void calculator(){
//         double result = 0;

//         System.out.println("Простой калькулятор.\nВведите первое число: ");
//         Scanner scanner1 = new Scanner(System.in);
//         double firstNumber = scanner1.nextInt(); 

//         System.out.println("Введите знак: ");
//         Scanner scanner2 = new Scanner(System.in);
//         String sign = scanner2.nextLine();

//         System.out.println("Введите второе число: ");
//         Scanner scanner3 = new Scanner(System.in);
//         double secondNumber = scanner3.nextInt(); 

//         switch (sign) {
//             case "+":
//                 result = firstNumber + secondNumber;
//                 break;
//             case "-":
//                 result = firstNumber - secondNumber;
//                 break;
//             case "*":
//                 result = firstNumber * secondNumber;
//                 break;
//             case "/":
//                 result = firstNumber / secondNumber;
//                 break;
//             default:
//                 System.out.println("Ошибка!!! Введите корректный знак");
//                 break;
//         }
//         System.out.println("Результат: " + result);
//     }
// }
