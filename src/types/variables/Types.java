package types.variables;

/**
 * Created by Yuriy on 07.02.2016.
 */
public class Types {
    public static void main(String[] args) {
        byte a = 10; // тип число від -128 до 127
        short b = 12; // тип число від -32 768 до 32 767
        int c = 10; // тип число від -2 в 31 степені до 2 в 31 -1 (від -2,147,483,648 до 2,147,483,647)
        long d = 99L; // тип число від -2 в 63 степені до 2 в 63 -1 ( від -9,223,372,036,854,780,000 до % -1)
        float e = 3; // 32-bit IEEE 754 floating point
        double f = 5.464648487987000; // 64-bit IEEE 754 floating point
        char g = '2'; // The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
        // якщо значення числове, то конвертується при розрахунках і компілюється
        boolean h=true;
        boolean i=true; // може мати лише значення true or false
        // 1-4-1 Declare and initialize local variables of primitive data types
        System.out.println("1-4-1 Declare and initialize local variables of primitive data types");
        System.out.println(a); // Питання 1: float не розумію в чому справа?
        System.out.println(b); // Питання 2: char виходить одна будь-яка буква або цифра в діапазоні?
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println("1-4-2 Using arithmetic operators");
        // 1-4-2 Using arithmetic operators
        System.out.println(a + b); //сума
        System.out.println(a - b); //різниця
        System.out.println(a * b); //множення
        System.out.println(b / a); //ділення
        System.out.println(a % b);//залишок від ділення
        System.out.println("c" + b); // можна додавати до числа текст
        System.out.println("1-4-3 Using logical operators");
        // 1-4-3 Using logical operators
        System.out.println(h & i); // AND оператор "і"
        System.out.println(h | i); // OR оператор "чи"
        System.out.println(h ^ i); // XOR оператор який є вірним якщо лише одне значення true
        System.out.println(!h & !i); // NOT оператор який є вірним якщо лише обидва значення false
        System.out.println("1-4-4 Using increment and decrement");
        // 1-4-4 Using increment and decrement
        System.out.println(a++); // відображається без змін, але переписується збільшене на одиницю
        System.out.println(++a);// відображається збільшене на одиницю + збільшення від попередньої операції
        System.out.println(--a);// одразу зменшується на одиницю
        System.out.println(a--);// відображається без змін, але записується зменшене на одиницю
        System.out.println("1-4-5 Using Bit shift operators");
        // 1-4-5 Using Bit shift operators
        System.out.println(a << 4); // змішення відповідає операції 3*2(в степені розрядів зміщення) тобто 3*2^4
        System.out.println(b << 4);//змішення відповідає операції 3*2(в степені розрядів зміщення) тобто 3*2^4
        System.out.println("1-4-6 Using Bitwise operators");
        // 1-4-6 Using Bitwise operators
        System.out.println(a&b); // and відбувається переведення в двійковий код
        System.out.println(a|b); // or відбувається переведення в двійковий код
        System.out.println(a^b); // xor відбувається переведення в двійковий код
        System.out.println(~a); // not відбувається переведення в двійковий код
        System.out.println("1-4-7 Using Ternary operator");
        // 1-4-7 Using Ternary operator
        System.out.println(a>b?a:b);// по суті той же "іф", але простіше
        System.out.println("1-4-8 Using Type casting");
        // 1-4-8 Using Type casting
        int x1=(int)d; //приведення типів
        char x2=(char)d;
        byte x3=(byte)d;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
