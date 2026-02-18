# Day-8
Exception Handling

Error:
-------
  *Error is a serious problem caused by JVM or system failuer.
  *It cannot be recovered or handled.
  *Errors are not caused by coding mistkes like divide by zero.

  Example:
  
      class Student{
      void test(){
      test();
      }
      
If this method keeps calling itself without stopping,it causes error.


Exception:
-----------
    *Exception is a problem that occurs during program execution(runtime).
    *Exception is caused by the programmer,invalid input,wrong logic.

Example:
  
   int a=10;
   int b=0;
   System.out.println(a/b);    //It shows ArithmeticException during runtime.

so this can be handled using try-catch ,

   try
   {
   int result=a/b;
   }
   catch(ArithmeticException d)
   {
   System.out.println("Cannot divisible by zero");
   }


   






   
   
