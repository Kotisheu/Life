::::::::::::::::::::::
::::::::BETA::::::::::
::::v.VERYEARLY:::::::
::::::::::::::::::::::

//import keyboard/cs1/java.util/swing/???
public class beginLife{
// MODIFY TEXT, NEATIFY THIS
\\\\\\\\\\\\\\\\\\\
 \\\\\PREGAME\\\\\\\
  \\\\\\\\\\\\\\\\\\\
  Player person;
  String s;
  s=" Welcome to the beginning of your new life! Let's see how sucessful you are this time.\n";
  s+="What would you like your name to be?";
  System.out.print(s);
  String n= in.readLine();
  s=" Hmm, interesting. Now, would you like to be male or female?";
  System.out.print(s);
  String g= in.readLine();
  boolean m;
  if (g== "male"){
    m=true;}
  person= Player( n, m); //<- CREATE THIS CONSTRU.
  s="Now for the final question:\n";
  s+="Would you like to attend college or begin work?";
  System.out.print(s);
  String r= in.readLine();
  if(r==" college"){
    person.setRoute("A");
    }
  else{
    person.setRoute("B");
    }
  s="Thank you for your input, we shall begin creating your new life immediately.";
  System.out.print(s);
  
  
// insert gui board stuff images (...)
  //////////////
 //CHARACTERS//
//////////////
  Buffy buffOne= new Buffy(person);
  //repeat^ for other characters
|||||||||||||  
||LIFEBEGIN||
|||||||||||||
  boolean gameOn = true;
  
  while(gameOn==true){
    //TURNS- CREATE DICE,MOVE, MINIEVENT TRIGGER,
    //(if (person.getHp()>3){AFTERHOURS(PLACESSS!! esp DATE( list of  other characters, 
    named only if met/ interest over x, accept only if interest >??));}, MEETCHARACTER
    //CREATE (and note tiles/routes of)MAJOR EVENT "SPLITS", DIALOUGUES, CHOICES, GUI, AHHH
    endlife();
    //repeat until cond is met.
  public void endLife(){  
  if (person.getTile()==250(???)){
    gameOn=false;}
  else if (person.getHp()<1){
    gameOn=false;}
  else if (person.getHappi()<1){
    gameOn=false;}//EACH SHOULD RETURN TEXT THAT CORRESPONDS TO HOW GAME ENDED ( IE, " Congrats ~~~" or " You couldn't take the pressure and suicided"
                    or "You fell ill and died"
  calcScore();// CREATE THIS,PRINTS OUT THE CALCULATIONS AS WELL.
::::::::::::::::::
:::::SCORING::::::
::::::::::::::::::
 public ___ calcScore(){
 }
  //SCOREBOARD???????
  
    }
    