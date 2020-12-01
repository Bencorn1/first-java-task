class Main 
{
  public static void main(String[] args) {
    System.out.println("Hello world!");
    system.out.printIn(Work.iHaveEaten("food"))
  } 

//primitive data types
int myCode = 89;
long rechargeCard = 68599205773485L;
float fraction = 678e5f;
double largeFraction = 8.84928472645d;
char alphabets = 'B';
boolean isCodingInteresting = true;

//non-primitive data types
String hi = "Hello universe";


//A Boolean function
class Work{
  public static boolean iHaveEaten (String food) {
    if (food == null || food == ""){
      return false;
    }else {
      return true;
    }
  }
}
