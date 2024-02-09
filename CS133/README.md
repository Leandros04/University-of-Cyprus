ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
ΕΡΓΑΣΤΗΡΙΟ 
1. Τι συμβαίνει με τον παρακάτω κώδικα;  
class MyStringClass extends String { 
String name; 
} 
2. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
public static void main(String[] args) { 
String s = "1".repeat(5); 
System.out.println(s); 
} 
} 
3. Με ποια/ποιες από τις παρακάτω κλάσεις, μπορείτε να δημιουργήσετε αντικείμενα 
χωρίς να χρησιμοποιήσετε τον τελεστή new; 
a. String 
b. StringBuffer 
c. StringBuilder 
4. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
public static void main(String[] args) { 
System.out.println("Java" == new String("Java")); 
} 
} 
5. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
public static void main(String[] args) { 
String str1 = "Java"; 
String str2 = "Java"; 
System.out.println(str1 == str2); 
System.out.println(str1.equals(str2)); 
System.out.println(str1.hashCode() == str2.hashCode()); 
} 
} 
6. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
public static void main(String[] args) { 
String str1 = "Java"; 
String str2 = new String("Java"); 
System.out.println(str1 == str2); 
System.out.println(str1.equals(str2)); 
System.out.println(str1.hashCode() == str2.hashCode()); 
} 
} 
1 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 2 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
 7. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
    public static void main(String[] args) { 
        System.out.println("Java"+1000+2000+3000);   
    } 
} 
8. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
    public static void main(String[] args) { 
        System.out.println(1000+2000+3000+"Java");   
    } 
} 
9. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
    public static void main(String[] args) { 
        System.out.println(7.7+3.3+"Java"+3.3+7.7);  
    } 
} 
10. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class JavaStringsQuiz { 
    public static void main(String[] args) { 
        System.out.println("ONE"+2+3+4+"FIVE");  
    } 
} 
11. Τι συμβαίνει όταν μεταγλωττίζετε και εκτελείτε αυτό το πρόγραμμα; 
public class ArraysInJava{ 
    public static void main(String[] args)    { 
        int[] i = new int[0]; 
         System.out.println(i[0]); 
    } 
} 
12. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class ArraysInJava { 
    public static void main(String[] args) { 
        int[] a = new int[3]; 
         a[1] = 50; 
         Object o = a; 
         int[] b = (int[])o; 
         b[1] = 100; 
         System.out.println(a[1]); 
        ((int[])o)[1] = 500; 
         System.out.println(a[1]); 
    } 
} 
 
 
 
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 3 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
 13. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class ArraysInJava { 
    static final int[] a; 
  
    static { 
        a = new int[] {1, 2, 3}; 
    } 
  
    public static void main(String[] args) { 
        a = new int[5]; 
    } 
} 
14. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class ArraysInJava { 
    static void methodOne(int[] a) { 
        int[] b = new int[5]; 
         a = b; 
         System.out.print(a.length); 
         System.out.print(b.length); 
    } 
  
    public static void main(String[] args) { 
        int[] a = new int[10]; 
        methodOne(a); 
         System.out.print(a.length); 
    } 
} 
15. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class A { 
    static int i; 
  
    static { 
        System.out.println(1); 
         i = 100; 
    } 
} 
  
public class StaticInitializationBlock { 
    static { 
        System.out.println(2); 
    } 
  
    public static void main(String[] args) { 
        System.out.println(3); 
         System.out.println(A.i); 
    } 
} 
 
 
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 4 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
 16. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class A { 
    static int first; 
     static String second; 
  
    static { 
        System.out.println(1); 
         first = 100; 
    } 
  
    static { 
        System.out.println(2); 
         second = "SECOND"; 
    } 
} 
public class StaticInitializationBlock { 
    static { 
        System.out.println(3); 
    } 
  
    public static void main(String[] args) { 
        System.out.println(4); 
         System.out.println(A.first); 
         System.out.println(A.second); 
    } 
} 
17. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class A { 
    static int i; 
  
    static { 
        i = 100; 
         System.out.println(1); 
    } 
  
    static void staticMethod(){ 
        System.out.println(i); 
         System.out.println(2); 
    } 
} 
public class B { 
    static { 
        System.out.println(3); 
    } 
     public static void main(String[] args) { 
        System.out.println(4); 
         System.out.println(A.i); 
         A.staticMethod(); 
    } 
} 
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 5 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
 18. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class A { 
    { 
        System.out.println(1); 
    } 
  
    public A(){ 
        System.out.println(2); 
    } 
  
    public static void main(String[] args){ 
        System.out.println(3); 
  
        A a = new A(); 
    } 
} 
19. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class A { 
    static int i = 10; 
     int j = 100; 
  
    { 
        methodOne(); 
         i = 100; 
         j = 10; 
    } 
  
    void methodOne() { 
        System.out.println("i = "+i); 
         System.out.println("j = "+j); 
    } 
    public static void main(String[] args) { 
        A a = new A(); 
         a.methodOne(); 
    } 
} 
20. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class A { 
    static { 
        i = 30; 
    } 
     static int i = 20; 
     static { 
        i = 10; 
    } 
     public static void main(String[] args) { 
        System.out.println(A.i); 
    } 
} 
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 6 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
 21. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class ClassOne { 
    static int i = 10; 
  
    static { 
        i = 20; 
    } 
  
    public ClassOne(int i)    { 
        System.out.println(i); 
         this.i = i; 
    } 
  
    { 
        i = 30; 
    } 
} 
public class ClassTwo { 
    public static void main(String[] args){ 
        System.out.println(ClassOne.i); 
    } 
} 
22. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class ClassOne { 
    { 
        System.out.println(1); 
    } 
  
    static { 
        System.out.println(2); 
    } 
  
    public ClassOne(int i){ 
        System.out.println(3); 
    } 
  
    public ClassOne(){ 
        System.out.println(4); 
    } 
} 
public class ClassTwo { 
    { 
        System.out.println(5); 
    } 
  
    public static void main(String[] args){ 
        System.out.println(6); 
         ClassOne one = new ClassOne(); 
         ClassOne two = new ClassOne(10); 
    } 
} 
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 7 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
 23. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class ClassOne { 
    String s; 
  
    { 
        s = "FIRST"; 
    } 
  
    { 
        s = "SECOND"; 
    } 
  
    public ClassOne(){ 
        s = "THIRD"; 
    } 
  
    public ClassOne(String s) { 
        this(); 
  
        System.out.println(this.s); 
    } 
} 
  
public class ClassTwo{ 
    public static void main(String[] args) { 
        ClassOne one = new ClassOne("LAST"); 
    } 
} 
24. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class ClassOne { 
    static    { 
        System.out.println('A'); 
    } 
  
    static char c = 'Z'; 
  
    static char getC()    { 
        return c; 
    } 
} 
public class ClassTwo{ 
    { 
        System.out.println('B'); 
    } 
  
    public static void main(String[] args)    { 
        char c; 
         c = ClassOne.getC(); 
         System.out.println(c); 
    } 
} 
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 8 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
 25. Μπορούμε να αναφερθούμε στα στατικά πεδία σε μη στατικές μεθόδους. True or 
false? 
 
26. Ποιο από τα παρακάτω είναι κοινό για όλα τα στιγμιότυπα μιας κλάσης; 
A) Static fields 
B) Non-static methods 
C) Static Methods 
D) A & C 
 
27. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class A { 
    String s; 
  
    public A()    { 
        this("It's not me"); 
         System.out.println('A'); 
         System.out.println(s); 
    } 
  
    A(String  s)    { 
        System.out.println('B'); 
         System.out.println(this.s); 
         this.s = s; 
    } 
  
    { 
        System.out.println('C'); 
         System.out.println(s); 
         this.s = "ABCD"; 
    } 
  
    public static void main(String[] args)    { 
        A a1 = new A(); 
         A a2 = new A("It's me"); 
    } 
} 
 
 
 
  
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 9 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
  
28. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
class X{ 
    int i = 50; 
} 
  
class Y{ 
    int i = 100; 
    X x; 
} 
  
public class MainClass{ 
    public static void main(String[] args)    { 
        X x = new X(); 
         Y y = new Y(); 
         y.x = x; 
         System.out.println(x.i); 
         System.out.println(y.i); 
         System.out.println(y.x.i); 
    } 
} 
29. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class A{ 
    static void test()    { 
        System.out.println("Tested...."); 
    } 
  
    static { 
        test(); 
    } 
  
    public static void main(String[] args)    { 
        test(); 
    } 
} 
  
 
ΕΠΛ133 – Εργαστήριο. Υπεύθυνος Εργαστηρίων: Πύρρος Μπράτσκας 10 
 
ΠΑΝΕΠΙΣΤΗΜΙΟ ΚΥΠΡΟΥ - ΤΜΗΜΑ ΠΛΗΡΟΦΟΡΙΚΗΣ 
 
 ΕΠΛ 133: ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ 
  
30. Ποιο είναι το αποτέλεσμα της εκτέλεσης του παρακάτω κώδικα; 
public class A{ 
    int m; 
     double n; 
  
    public A(int i)    { 
        m = i; 
    } 
  
    public A(double d)    { 
        n = d; 
    } 
  
    { 
        System.out.println(m); 
         System.out.println(n); 
    } 
  
    public static void main(String[] args)    { 
        A a1 = new A(500); 
         A a2 = new A(50.0); 
  
        System.out.println(a1.m+" : "+a1.n); 
         System.out.println(a2.m+" : "+a2.n); 
    } 
} 
 
