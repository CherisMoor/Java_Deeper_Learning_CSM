Decisions statements - if/else

Looping statements - for loop

Branching statements - continue/break inside of loops

---

## DECISIONS

if(condition){
//block complete this code if true... or move to next
}else if(condition){
//block complete this code if true... or move to next
}else

---

## FOR LOOP

for(initial; end check; increment)
{
statement(s);
}

for(int i=0; i<10; i++){
System.out.print(i)
} //0,1,2,3,4,5,6,7,8,9 And breaks at 10

---

## BOOLEAN VALUES

(i != null)
^Correct way to find boolean values

unlike Javascript, 0=0, null=null, undefined=undefined, in JAVA

---

## BRANCHING STATEMENTS

BREAK - break out of the Block

CONTINUE - Skips any statements after itself, takes you back up to the top of the loop and continues back through the loop

RETURN - blank return is going to pop out (works with void, so you do not have to declare a type)

// generate a random number between 0 and 100

Random cat = new Random();
int breakAt = cat.nextInt(100);

// print a 'list' of random length

for(int i=0; i<100; i++)
{
if ( i==breakAt)
{
System.out.println("Random number was: " + breakAt);
break;
}

    System.println("Index: " + i);

}

System.out.println("After the loop");
