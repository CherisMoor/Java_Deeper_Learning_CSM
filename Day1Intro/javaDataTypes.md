JAVA DATA TYPES

EX:
String var = "George"
-reference type

int number = 20
-primitive type

**_All data types, except boolean and char, are assigned numeric values_**

char, byte, short, long, int- considered whole number variabes(cannot contain decimals)
float & double- considered decimal variable types(contains decimals)

int num1, num2, num3
num1=1;
num2=2;
num3=3;
//Syntactically viable, but not convention! AVOID THIS^^

int num1=1;
int num2=2;
int n um3=3;
// Correct way

int num1=0;

---

## BYTE

byte errorNumber = 1298;
byte correctNum = (byte)1298

-Will work, but counts 128 then starts at -128 and keeps going

int smallInt = 120;
int biggerInt = 550;

byte b1 = (byte)smallInt; //120
byte b2 = (byte)biggerInt; //38?????????

---

## CHAR

char answer = "Y" //declared as explicit character
char middleInitialC = 0x0043; //'C'
char lowerCaseA = \u0061; //'a' as a unicode
char capitalK = 75; //'K' as an interger value

---

## DOUBLE

double wishfulSalary = 123_000_100_325.0; //underscores are not stored in the variable

---

## OPERATERS

+, -, \*, /, %, ++, --

~ pre-increment = when you write your increment or decrement before your variable.
~ post-increment = when you write your increment or decrement after your variable.

    Examples:

    int x = 5;

    System.out.println(x++); //prints 5
    ***Post-increment***
    System.out.println(x); //prints 5
    System.out.println(++x); //prints 6
    ***Pre-increment***


    int x=5;
    int y = (double)x/2; //won't work because integers cannot take decimals

    int x=5;
    double y = (int)x/2; // will work because does math before conversion

---

## AND/OR/NOT

    && - Both sides true
    || - One side true
    ! (bang) - not true

x+=10; // x = x+10
x-=10; // x = x-10
x*=10; // x = x*10
x/=10; // x = x/10
x%=10; // x = x%10

int x= 50; //binary 0011 0010
int y= 19; //binary 0001 0011
int q= 0; //0
