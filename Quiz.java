import java.io.*;   //package is called
import java.util.*; //package is called  
public class QUIZ   //class name of QUIZ
{
   static String ans="y";//String variable of ans is created
   static int score=0;  //integer variables of score is created 
   static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//For assigning the answer
   static QUIZ o1=new QUIZ();//object of QUIZ is created
   public static void main(String []args) throws IOException      //main method/function
   {
    try
    {
     do
     {      System.out.println("\f ********   *      *  *********  *******");
            for(double a=1;a<=100000000;a++){}
            System.out.println(" *      *   *      *      *           * ");
            for(double b=1;b<=100000000;b++){}
            System.out.println(" *      *   *      *      *         *   ");
            for(double c=1;c<=100000000;c++){}
            System.out.println(" *     ***  *      *      *       *     ");
            for(double d=1;d<=100000000;d++){}
            System.out.println(" ******** * ********  *********  *******");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("READY TO TAKE QUIZ('1'-Yes or Any other number-No):");
            int s=Integer.parseInt(br.readLine());
        if(s==1)
        {
          System.out.println("\f@@@@@@@@@@@@@@@@@ QUIZ TIME @@@@@@@@@@@@@@@@ ");//prompting the user to enter the choice
          System.out.println("++++++TEST YOUR KNOWLEDGE HERE++++++");
          System.out.println("============================================");
          System.out.println("1.$$ SPORTS $$\n2.$$ IQ TEST $$\n3.$$ BRAIN CHALLENGES $$\n4.$$ SCIENCE & NATURE $$\n5.$$ MENTAL_ABILITY $$\n6.$$ Exit $$");
          System.out.println("============================================");
          System.out.println("Enter your choice by entering the Serial no.:");
          System.out.println("READY*TO*ROCK*IT*HAVE FUN THRILLING ENJOYMENT");
          int x=Integer.parseInt(br.readLine());
          switch(x)//calling the functions of the choice of the user

          
          {
           case 1:o1.SPORTS();     //call of function SPORT
           break;
           case 2:o1.IQ_TESTS();    //call of function IQ_TEST
           break;
           case 3:o1.BRAIN_CHALLENGE();     //call of function BRAIN_CHALLENGE
           break;
           case 4:o1.SCIENCE_NATURE();       //call of function SCIENCE_NATURE
           break;
           case 5:o1.MENTAL_ABILITY();       //call of function MENTAL_ABILITY
           break;
           case 6:System.out.println("\f:):):):):)THANK YOU:):):):):)");System.exit(0); //to exit
           break;
           default:System.out.println("Invalid choice\nPlese check your input");
          }
          System.out.println("\fHope you enjoyed!\nDo you want to continue:( 'Y'-Yes or Any thing else-No)");
          ans=br.readLine();
        }else{System.out.println("\n:):):):):)THANK YOU:):):):):)");System.exit(0);}
     }while(ans.equalsIgnoreCase("Y"));
  }
    catch(Exception e)
    {
        System.out.println("\f:):):):):)THANK YOU:):):):):)"); 
        System.out.println("Invaild answer:"+e.getMessage());
    }
    if(ans!="y")
    {
     System.out.println("\n:):):):):)THANK YOU:):):):):)\nYour score is"+score);
     System.out.println(":):)Please do try again:):)");
    }
}
void SPORTS() throws IOException       //start of function SPORT
{
        System.out.println(" \f^^^GET READY FOR FUN^^^"+"                 000Each Question carries 10 marks000");score=0;
        System.out.println("-----------------------");
        System.out.println("QUESTION 1");//prompting the user to enter the choice
        System.out.println("%% What is the name of the person that controls a football match ? %%");
        System.out.println("@@@@1.A referee @@@");
        System.out.println("@@@@2.An umpire @@@");
        System.out.println("@@@@3.A spectator @@@");
        System.out.println("@@@@4.A Goalkeeper @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s1=Integer.parseInt(br.readLine());
        if(s1>4||s1<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s1==1)
        {
            System.out.println("_______:0 YOU ARE RIGHT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Referee +++");
            System.out.println("Your Score is:"+score);
        } 
        }
        System.out.println("QUESTION 2");
        System.out.println("%% Where did first ODI match was played in India ? %%");//prompting the user to enter the choice
        System.out.println("@@@@1.New Delhi @@@");
        System.out.println("@@@@2.Ahmedabad @@@");
        System.out.println("@@@@3.Kolkata @@@");
        System.out.println("@@@@4.Mumbai @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s2=Integer.parseInt(br.readLine());
        if(s2>4||s2<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s2==2)
        {
            System.out.println("_______:0 YOU ARE RIGHT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Ahmedabad +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 3");
        System.out.println("%% In which Indian state did the game of POLO originate ? %%");//prompting the user to enter the choice
        System.out.println("@@@@1.Meghalaya @@@");
        System.out.println("@@@@2.Rajathan @@@");
        System.out.println("@@@@3.Manipur @@@");
        System.out.println("@@@@4.West Bengal @@@");
        System.out.println("!!!!!!! ENTER YOUR CHOICE !!!!!!!");
        int s3=Integer.parseInt(br.readLine());
        if(s3>4||s3<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s3==3)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println ("+++The correct answer is Manipur +++");
            System.out.println ("Your Score is:"+score);
        }}
        System.out.println("QUESTION 4");
        System.out.println("%% India won its first Olympic hockey gold in ? %%");//prompting the user to enter the choice
        System.out.println("@@@@1. 1928 @@@");
        System.out.println("@@@@2. 1932 @@@");
        System.out.println("@@@@3. 1936 @@@");
        System.out.println("@@@@4. 1948 @@@");
        System.out.println("!!!!!!! PLEASE TYPE YOUR CHOICE !!!!!!!");
        int s4=Integer.parseInt(br.readLine());
        if(s4>4||s4<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s4==4)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 1948 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 5");
        System.out.println("%% Which was the first non test playing country to beat ");//prompting the user to enter the choice
        System.out.println("India in an International match ? %%");
        System.out.println("@@@@1.England @@@");
        System.out.println("@@@@2.West Indies @@@");
        System.out.println("@@@@3.Australia @@@");
        System.out.println("@@@@4.Sri Lanka @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK !!!!!!!");
        int s5=Integer.parseInt(br.readLine());
        if(s5>4||s5<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s5==4)
        {
            System.out.println("_______:0 YOU HAVE GOOD GK :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Sri Lanka +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("######## TRY THESE BRAINY #######");
        System.out.println("QUESTION 6");
        System.out.println("%% Indian Sports Research Institue is located at ? %%");//prompting the user to enter the choice
        System.out.println("@@@@1.Chennai @@@");
        System.out.println("@@@@2.Delhi @@@");
        System.out.println("@@@@3.Mumbai @@@");
        System.out.println("@@@@4.Datiala @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s6=Integer.parseInt(br.readLine());
        if(s6>4||s6<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s6==4)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is Datiala +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 7");
        System.out.println("%% Where is the headquarte of FIFA governing body ? %%");//prompting the user to enter the choice
        System.out.println("@@@@1.Zurich @@@");
        System.out.println("@@@@2.Brazil @@@");
        System.out.println("@@@@3.Argentina @@@");
        System.out.println("@@@@4.Spain @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s7=Integer.parseInt(br.readLine());
        if(s7>4||s7<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s7==1)
        {
            System.out.println("_______:0 YOU ARE AWESOME :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Zurich +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 8");
        System.out.println("%% Who won the most Balondor Cup(till dated 2016) ? %%");//prompting the user to enter the choice
        System.out.println("@@@@1.Leonel Messi @@@");
        System.out.println("@@@@2.Christiano Ronaldo @@@");
        System.out.println("@@@@3.Neymar @@@");
        System.out.println("@@@@4.Pele @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s8=Integer.parseInt(br.readLine());
        if(s8>4||s8<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s8==1)
        {
            System.out.println("_______:0 YOU ARE REALLY INSANE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Leonel Messi +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 9");
        System.out.println("%% National game of Japan ? %%");//prompting the user to enter the choice
        System.out.println("@@@@1.Rugby @@@");
        System.out.println("@@@@2.Ice hockey @@@");
        System.out.println("@@@@3.Tujutsu @@@");
        System.out.println("@@@@4.Tennis @@@");
        System.out.println("!!!!!!!!ENTER YOUR CHOICE!!!!!!!");
        int s9=Integer.parseInt(br.readLine());
        if(s9>4||s9<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s9==2)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Ice hockey +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 10");
        System.out.println("%% Who is the Winner of first FIFA World Cup Tournament 2016? %%");//prompting the user to enter the choice
        System.out.println("@@@@1.Brazil @@@");
        System.out.println("@@@@2.Argentina @@@");
        System.out.println("@@@@3.Portigo @@@");
        System.out.println("@@@@4.Uruguay @@@");
        System.out.println("!!!!!!!!ENTER YOUR CHOICE!!!!!!!");
        int s10=Integer.parseInt(br.readLine());
        if(s10>4||s10<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s10==4)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Uruguay +++");
            System.out.println("Your Score is:"+score);
        }}o1.Score();
  }//end of function SPORT
    void IQ_TESTS() throws IOException          //start of function IQ_TEST
    {
        System.out.println("\f^^^GET READY FOR FUN^^^"+"                 000Each Question carries 10 marks000");score=0;
        System.out.println("-----------------------");
        System.out.println("QUESTION 1");//prompting the user to enter the choice
        System.out.println("%% A bat and a ball together cost $1.00.The bat cost $1 more than the ball. How much does the ball cost ? %%");
        System.out.println("@@@@1.$0.10 @@@");
        System.out.println("@@@@2.$0.05 @@@");
        System.out.println("@@@@3.$0.01 @@@");
        System.out.println("@@@@4.$0.5  @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s1=Integer.parseInt(br.readLine());
        if(s1>4||s1<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s1==2)
        {
            System.out.println("_______:0 YOU ARE ON THE RIGHT TRACK :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        {
            System.out.println("+++The correct answer is 0.05 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 2");//prompting the user to enter the choice
        System.out.println("%% If there are 327 apples and you take 42, how many do you have ? %%");
        System.out.println("@@@@1.285 @@@");
        System.out.println("@@@@2.42 @@@");
        System.out.println("@@@@3.24 @@@");
        System.out.println("@@@@4.327 @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK ENTER !!!!!!!");
        int s2=Integer.parseInt(br.readLine());
        if(s2>4||s2<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s2==2)
        {
            System.out.println("_______:0 YOU ARE AMAZING! :):P_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 42 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 3");//prompting the user to enter the choice
        System.out.println("%% Which one of the five is least like the other four ? %%");
        System.out.println("@@@@1.Dog @@@");
        System.out.println("@@@@2.Lion @@@");
        System.out.println("@@@@3.Mouse @@@");
        System.out.println("@@@@4.Snake @@@");
        System.out.println("@@@@5.Elephant @@@");
        System.out.println("!!!!!!! ENTER YOUR CHOICE !!!!!!!");
        int s3=Integer.parseInt(br.readLine());
        if(s3>4||s3<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s3==4)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Snake +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 4");//prompting the user to enter the choice
        System.out.println("%% Mary, who is 16 yrs old, is four times as old as her brother .How old will Mary be when she is twice as old as her brother ? %%");
        System.out.println("@@@@1. 20 @@@");
        System.out.println("@@@@2. 28 @@@");
        System.out.println("@@@@3. 24 @@@");
        System.out.println("@@@@4. 25 @@@");
        System.out.println("!!!!!!! PLEASE TYPE YOUR CHOICE !!!!!!!");
        int s4=Integer.parseInt(br.readLine());
        if(s4>4||s4<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s4==3)
        {
            System.out.println("_______:0 YOU ARE FANTASTIC :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 24 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 5");//prompting the user to enter the choice//prompting the user to enter the choice
        System.out.println("%% Which one of these four choices makes the bestcomparision ? ");
        System.out.println("Finger is to hand as leaf is to:");
        System.out.println("@@@@1.tree @@@");
        System.out.println("@@@@2.bark @@@");
        System.out.println("@@@@3.twig @@@");
        System.out.println("@@@@4.stem  @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK !!!!!!!");
        int s5=Integer.parseInt(br.readLine());
        if(s5>4||s5<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s5==3)
        {
            System.out.println("_______:0 YOU HAVE GOOD KNOWLEDGE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is twig +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("######## TRY THESE KNOW BRAINY #######");
        System.out.println("QUESTION 6");//prompting the user to enter the choice
        System.out.println("%% If you rearrange the letters CIFAIPC, you would have the name of a (n) ? %%\t\tTRY IN 10 SEC");
        System.out.println("@@@@1.Ocean @@@");
        System.out.println("@@@@2.Animal @@@");
        System.out.println("@@@@3.Country @@@");
        System.out.println("@@@@4.City @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s6=Integer.parseInt(br.readLine());
        if(s6>4||s6<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s6==1)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Ocean +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 7");//prompting the user to enter the choice
        System.out.println("%% John needs 13 bottles  of water from the store.John can carry 3 at a time.");
        System.out.println("What is the minimum number of trips John needs to make to? %%");
        System.out.println("@@@@1.3 @@@");
        System.out.println("@@@@2.4 1/2 @@@");
        System.out.println("@@@@3.5 @@@");
        System.out.println("@@@@4.6 @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s7=Integer.parseInt(br.readLine());
        if(s7>4||s7<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s7==3)
        {
            System.out.println("_______:0 YOU ARE OWESOME :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 5 times +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 8");//prompting the user to enter the choice
        System.out.println("%% Which one of the following things is least like the others: ? %%");
        System.out.println("@@@@1.Poem @@@");
        System.out.println("@@@@2.Flower @@@");
        System.out.println("@@@@3.Statue @@@");
        System.out.println("@@@@4.Painting @@@");
        System.out.println("@@@@5.Novel @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s8=Integer.parseInt(br.readLine());
        if(s8>4||s8<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s8==2)
        {
            System.out.println("_______:0 YOU ARE REALLY INSANE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Flower +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 9");//prompting the user to enter the choice
        System.out.println("%% Ralph likes 25 but not 24;he likes 400 but not 300;he likes 144 but not 145.Which does he like: ? %%");
        System.out.println("@@@@1.200 @@@");
        System.out.println("@@@@2.1600 @@@");
        System.out.println("@@@@3.50 @@@");
        System.out.println("@@@@4.124 @@@");
        System.out.println("!!!!!!! JUST DO IT!!!!!!!!");
        int s9=Integer.parseInt(br.readLine());
        if(s9>4||s9<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s9==2)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 1600 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 10");//prompting the user to enter the choice
        System.out.println("%% Jhonny's mother had 3 children.The first child was called April,the second child was may,What was the third child's name called ? %%");
        System.out.println("@@@@1.June @@@");
        System.out.println("@@@@2.July @@@");
        System.out.println("@@@@3.Mary @@@");
        System.out.println("@@@@4.Jhonny @@@");
        System.out.println("!!!!!!!!JUST MAKE IT!!!!!!!");
        int s10=Integer.parseInt(br.readLine());
        if(s10>4||s10<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s10==4)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Jhonny+++");
            System.out.println("Your Score is:"+score);
        }}o1.Score();
}//end of function IQ_TEST
    void BRAIN_CHALLENGE() throws IOException          //start of function BRAIN_CHALLENGE
    {
        System.out.println("\f^^^GET READY FOR BRAIN STORM ^^^"+"                 000 Each Question carries 10 marks 000");score=0;
        System.out.println("-----------------------");
        System.out.println("QUESTION 1");//prompting the user to enter the choice
        System.out.println("%% Divide 50 by half and add 20 ? %%");
        System.out.println("@@@@1. 45 @@@");
        System.out.println("@@@@2. 120 @@@");
        System.out.println("@@@@3. 35 @@@");
        System.out.println("@@@@4. 100 @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s1=Integer.parseInt(br.readLine());
        if(s1>4||s1<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s1==2)
        {
            System.out.println("_______:0 YOU ARE ON THE RIGHT TRACK :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 120+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 2");//prompting the user to enter the choice
        System.out.println("%% If 1=5; %%");
        System.out.println("      2=25;");
        System.out.println("      3=325;");
        System.out.println("      4=4325;");
        System.out.println("      5=?");
        System.out.println("@@@@1.5555 @@@");
        System.out.println("@@@@2.1 @@@");
        System.out.println("@@@@3.52345 @@@");
        System.out.println("@@@@4.54325 @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s2=Integer.parseInt(br.readLine());
        if(s2>4||s2<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s2==2)
        {
            System.out.println("_______:0 YOU ARE AMAZING! :):P_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 1 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 3");//prompting the user to enter the choice
        System.out.println("%% Which number should come next in the series:1-1-2-3-5-8-13 ? %%");
        System.out.println("@@@@1.31 @@@");
        System.out.println("@@@@2.21 @@@");
        System.out.println("@@@@3.13 @@@");
        System.out.println("@@@@4.26 @@@");
        System.out.println("!!!!!!! ENTER YOUR CHOICE !!!!!!!");
        int s3=Integer.parseInt(br.readLine());
        if(s3>4||s3<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s3==2)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++ The correct answer is 21 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 4");//prompting the user to enter the choice
        System.out.println("%% Which one of these four choices makes the best comparision?PEACH to HCAEP as 46251 is to %%");
        System.out.println("@@@@1. 12654 @@@");
        System.out.println("@@@@2. 51462 @@@");
        System.out.println("@@@@3. 26451 @@@");
        System.out.println("@@@@4. 15264 @@@");
        System.out.println("!!!!!!! PLEASE TYPE YOUR CHOICE !!!!!!!");
        String a4=br.readLine();
        int s4=Integer.parseInt(a4);
        if(s4>4||s4<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s4==4)
        {
            System.out.println("_______:0 YOU ARE FANTASTIC :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++ The correct answer is 15264 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 5");//prompting the user to enter the choice
        System.out.println("%% Which one of the numbers does not belong in the series: ? ");
        System.out.println("2-3-6-7-8-14-15-30:");
        System.out.println("@@@@1.Seven @@@");
        System.out.println("@@@@2.Eight @@@");
        System.out.println("@@@@3.Thirty @@@");
        System.out.println("@@@@4.Fifteen @@@");
        System.out.println("!!!!!!! JUST KILL IT <ENTER> !!!!!!!");
        int s5=Integer.parseInt(br.readLine());
        if(s5>4||s5<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s5==2)
        {
            System.out.println("_______:0 YOU HAVE GOOD KNOWLEDGE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is eight +++");
            System.out.println("Your Score is:"+score);;
        }}
        System.out.println("######## TRY THESE KNOW BRAINY #######");
        System.out.println("QUESTION 6");//prompting the user to enter the choice
        System.out.println("%% Choose the number that is 1/4 of 1/2 of 1/5 of 200: ? %%"+"           TRY IN 10 SEC");
        System.out.println("@@@@1. 50 @@@");
        System.out.println("@@@@2. 25 @@@");
        System.out.println("@@@@3. 5 @@@");
        System.out.println("@@@@4. 40 @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s6=Integer.parseInt(br.readLine());
        if(s6>4||s6<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s6==3)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 5 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 7");//prompting the user to enter the choice
        System.out.println("%% Which one of the numbers does not belong in the series: ");
        System.out.println("1-2-5-10-13-26-29-48%%");
        System.out.println("@@@@1.48 @@@");
        System.out.println("@@@@2.1 @@@");
        System.out.println("@@@@3.29 @@@");
        System.out.println("@@@@4.5 @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s7=Integer.parseInt(br.readLine());
        if(s7>4||s7<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s7==4)
        {
            System.out.println("_______:0 YOU ARE OWESOME :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 5 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 8");//prompting the user to enter the choice
        System.out.println("%% A Clerk at a butcher shop stands 5 foot & 10 inches tall.He wears size 13 shoes.What does he weigh? %%");
        System.out.println("@@@@1.56 @@@");
        System.out.println("@@@@2.73 @@@");
        System.out.println("@@@@3.60 @@@");
        System.out.println("@@@@4.None of the above @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s8=Integer.parseInt(br.readLine());
        if(s8>4||s8<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s8==4)
        {
            System.out.println("_______:0 YOU ARE REALLY INSANE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Meat +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 9");//prompting the user to enter the choice
        System.out.println("%% Before Mount Everest was discovered. What was the highest mountain in the world ? %%");
        System.out.println("@@@@1.Everest @@@");
        System.out.println("@@@@2.Mt. Fuji @@@");
        System.out.println("@@@@3.Himalayas @@@");
        System.out.println("@@@@4.Mt. Kilimanjaro @@@");
        System.out.println("!!!!!!! JUST DO IT!!!!!!!!");
        int s9=Integer.parseInt(br.readLine());
        if(s9>4||s9<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s9==1)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Everest +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 10");//prompting the user to enter the choice
        System.out.println("%% How much dirt is there in a hole which measures 2 feet by 5 feet by 4 feet ? %%");
        System.out.println("@@@@1. 3 @@@");
        System.out.println("@@@@2. 2 @@@");
        System.out.println("@@@@3. 4 @@@");
        System.out.println("@@@@4. None of the above @@@");
        System.out.println("!!!!!!!!JUST MAKE IT!!!!!!!");
        int s10=Integer.parseInt(br.readLine());
        if(s10>4||s10<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s10==4)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is None of the above +++");
            System.out.println("Your Score is:"+score);
        }}o1.Score();
}//end of function BRAIN_CHALLENGE
    void SCIENCE_NATURE() throws IOException           //start of function SCIENCE_NATURE
    {
        System.out.println("\fQUESTION 1");//prompting the user to enter the choice
        System.out.println("%% Choose the words most similar to 'trustworthy' ? %%");score=0;
        System.out.println("@@@@1.Resolute @@@");
        System.out.println("@@@@2.Insolent  @@@");
        System.out.println("@@@@3.Reliable @@@");
        System.out.println("@@@@4.Relevent  @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s1=Integer.parseInt(br.readLine());
        if(s1>4||s1<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s1==3)
        {
            System.out.println("_______:0 YOU ARE ON THE RIGHT TRACK :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Reliable+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 2");//prompting the user to enter the choice
        System.out.println("%% If all Bloops are Razzies and all Razzies are Lazzies,all Bloops are definitely lazzies %%");
        System.out.println("@@@@1.True @@@");
        System.out.println("@@@@2.False @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s2=Integer.parseInt(br.readLine());
        if(s2>2||s2<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s2==1)
        {
            System.out.println("_______:0 YOU ARE AMAZING! :):P_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is True+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 3");//prompting the user to enter the choice
        System.out.println("%% How many moons do Jupiter have ? %%");
        System.out.println("@@@@1.63 @@@");
        System.out.println("@@@@2.64 @@@");
        System.out.println("@@@@3.2 @@@");
        System.out.println("@@@@4.1 @@@");
        System.out.println("!!!!!!! <ENTER> YOUR CHOICE !!!!!!!");
        int s3=Integer.parseInt(br.readLine());
        if(s3>4||s3<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s3==1)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 63 ++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 4");//prompting the user to enter the choice
        System.out.println("%% What is the name of the biggest volcano in the Solar System %%");
        System.out.println("@@@@1.The Giant @@@");
        System.out.println("@@@@2.Mt. Fuji @@@");
        System.out.println("@@@@3.Pacific Ring of Fire @@@");
        System.out.println("@@@@4.Olympus Mons @@@");
        System.out.println("!!!!!!! PLEASE TYPE YOUR CHOICE !!!!!!!");
        int s4=Integer.parseInt(br.readLine());
        if(s4>4||s4<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s4==4)
        {
            System.out.println("_______:0 YOU ARE FANTASTIC :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Olympus Mons+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 5");//prompting the user to enter the choice
        System.out.println("%% Who were caled as the Math wizards ? ");
        System.out.println("@@@@1.Babylonians @@@");
        System.out.println("@@@@2.Egyptians @@@");
        System.out.println("@@@@3.Greek @@@");
        System.out.println("@@@@4.Arabians @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK !!!!!!!");
        int s5=Integer.parseInt(br.readLine());
        if(s5>4||s5<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s5==1)
        {
            System.out.println("_______:0 YOU HAVE GOOD KNOWLEDGE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is Babylonians+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("######## TRY THESE SCI_FIE #######");
        System.out.println("QUESTION 6");//prompting the user to enter the choice
        System.out.println("%% Do Elephant use skin cares? %%"+"           TRY IN 10 SEC");
        System.out.println("@@@@1.True @@@");
        System.out.println("@@@@2.False @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s6=Integer.parseInt(br.readLine());
        if(s6>2||s6<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s6==1)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is True ;) Its the mud which is used as the skin care from the hot sun+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 7");//prompting the user to enter the choice
        System.out.println("%% Largest Undiscovered fish living in 0% light ");
        System.out.println("@@@@1.Megalin @@@");
        System.out.println("@@@@2.Bloop @@@");
        System.out.println("@@@@3.Great White @@@");
        System.out.println("@@@@4.Ichthyostega @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s7=Integer.parseInt(br.readLine());
        if(s7>4||s7<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s7==2)
        {
            System.out.println("_______:0 YOU ARE AWESOME :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Bloop+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 8");//prompting the user to enter the choice
        System.out.println("%%Which is the largest living lizard in the worlds. It is also called Giant Monitor Lizard? %%");
        System.out.println("@@@@1.Megalin @@@");
        System.out.println("@@@@2.Flamingoes @@@");
        System.out.println("@@@@3.Komodo Dragon @@@");
        System.out.println("@@@@4.Terminous @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s8=Integer.parseInt(br.readLine());
        if(s8>4||s8<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s8==3)
        {
            System.out.println("_______:0 YOU ARE REALLY INSANE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Komodo Dragon+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 9");//prompting the user to enter the choice
        System.out.println("%% Which non-metal remains as liquid at room temperature ? %%");
        System.out.println("@@@@1.Phosphorous @@@");
        System.out.println("@@@@2.Bromine @@@");
        System.out.println("@@@@3.Chlorine @@@");
        System.out.println("@@@@4.Mercury @@@");
        System.out.println("!!!!!!! JUST DO IT!!!!!!!!");
        int s9=Integer.parseInt(br.readLine());
        if(s9>4||s9<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s9==2)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Bromine+++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 10");//prompting the user to enter the choice
        System.out.println("%% Which waves are used in cellphones ? %%");
        System.out.println("@@@@1.Radio Waves @@@");
        System.out.println("@@@@2.Gamma rays @@@");
        System.out.println("@@@@3.Sound Waves @@@");
        System.out.println("@@@@4.X-Waves @@@");
        System.out.println("!!!!!!!!JUST MAKE IT!!!!!!!");
        int s10=Integer.parseInt(br.readLine());
        if(s10>4||s10<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s10==1)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is Radio Waves +++");
            System.out.println("Your Score is:"+score);
        }}o1.Score();
}//end of function SCIENCE_NATURE
    void MENTAL_ABILITY() throws IOException          //start of function MENTAL_ABILITY
    {
        System.out.println("\f^^^GET READY FOR FUN^^^"+"                 000Each Question carries 10 marks000");score=0;
        System.out.println("-----------------------");
        System.out.println("QUESTION 1");//prompting the user to enter the choice
        System.out.println("%% Series-Find the missing number ? %%");
        System.out.println("12, 25, 49, 99, 197,395,__");
        System.out.println("@@@@1.789 @@@");
        System.out.println("@@@@2.1579 @@@");
        System.out.println("@@@@3.722 @@@");
        System.out.println("@@@@4.812 @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK <ENTER> !!!!!!!");
        int s1=Integer.parseInt(br.readLine());
        if(s1>4||s1<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s1==1)
        {
            System.out.println("_______:0 YOU ARE RIGHT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
            else
        {
            System.out.println("+++The correct answer is 789 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 2");
        System.out.println("%% Today is Monday. After 61 days, it will be _____? %%");
        System.out.println("@@@@1.Wednesday @@@");
        System.out.println("@@@@2.Saturday@@@");
        System.out.println("@@@@3.Tuesday @@@");
        System.out.println("@@@@4.Thursday @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s2=Integer.parseInt(br.readLine());
        if(s2>4||s2<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s2==3)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is Tuesday +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 3");//prompting the user to enter the choice
        System.out.println("%% It was Sunday on 1st January 2006. What was the day of the week on 1st January,2010?%%");
        System.out.println("@@@@1.Sunday@@@");
        System.out.println("@@@@2.Saturday@@@");
        System.out.println("@@@@3.Wednesday @@@");
        System.out.println("@@@@4.Friday @@@");
        System.out.println("!!!!!!! TRY YOUR LUCK !!!!!!!");
        int s5=Integer.parseInt(br.readLine());
        if(s5>4||s5<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s5==4)
        {
            System.out.println("_______:0 YOU HAVE GOOD GK :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is Friday +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("######## TRY THESE BRAINY #######");
        System.out.println("QUESTION 4");//prompting the user to enter the choice
        System.out.println("%% Rosy says that father of Ravi's father is my father %%");
        System.out.println("How is Rosy related to Ravi?");
        System.out.println("@@@@1.Mother @@@");
        System.out.println("@@@@2.Sister @@@");
        System.out.println("@@@@3.Aunt @@@");
        System.out.println("@@@@4.GrandMother @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s6=Integer.parseInt(br.readLine());
        if(s6>4||s6<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s6==3)
        {
            System.out.println("_______:0 YOU ARE GREAT :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is Aunt +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 5");//prompting the user to enter the choice
        System.out.println("%% How many days are there in x weeks and x days? %%");
        System.out.println("@@@@1.7x2 @@@");
        System.out.println("@@@@2.8x @@@");
        System.out.println("@@@@3.14x @@@");
        System.out.println("@@@@4.7 @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s7=Integer.parseInt(br.readLine());
        if(s7>4||s7<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s7==3)
        {
            System.out.println("_______:0 YOU ARE OWESOME :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is 14x +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 6");//prompting the user to enter the choice
        System.out.println("%% Which of the following is not a leap year ? %%");
        System.out.println("@@@@1.700 @@@");
        System.out.println("@@@@2.1200 @@@");
        System.out.println("@@@@3.800 @@@");
        System.out.println("@@@@4.2000 @@@");
        System.out.println("!!!!!!!THINK AND GIVE A CHOICE!!!!!!!!");
        int s8=Integer.parseInt(br.readLine());
        if(s8>4||s8<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s8==1)
        {
            System.out.println("_______:0 YOU ARE REALLY INSANE :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is 700 +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 7");//prompting the user to enter the choice
        System.out.println("%% 1111=R %%");
        System.out.println("   2222=T");
        System.out.println("   3333=E");
        System.out.println("   4444=N");
        System.out.println("   5555=?");
        System.out.println("@@@@1.Y @@@");
        System.out.println("@@@@2.F @@@");
        System.out.println("@@@@3.P @@@");
        System.out.println("@@@@4.H @@@");
        System.out.println("!!!!!!!ENTER YOUR CHOICE!!!!!!!!");
        int s9=Integer.parseInt(br.readLine());
        if(s9>4||s9<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s9==1)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is Y +++");
            System.out.println("Your Score is:"+score);
        }}
        System.out.println("QUESTION 8"); //prompting the user to enter the choice
        System.out.println("%% How much smoke is produced in an electric train which is in the speed of 110 km/hr. The wind's direction is from North-East at a speed of 10 km/hr and the speed of the smoke is 35 km/hr? %%");
        System.out.println("@@@@1.75 km/hr @@@");
        System.out.println("@@@@2.60 km/hr @@@");
        System.out.println("@@@@3.120 km/hr @@@");
        System.out.println("@@@@4.None of the above @@@");
        System.out.println("!!!!!!!ENTER YOUR CHOICE!!!!!!!!");
        int s10=Integer.parseInt(br.readLine());
        if(s10>4||s10<1){System.out.println("/////Wrong Choice////");}
        else
        {
            if(s10==4)
        {
            System.out.println("_______:0 YOU ARE REALLY EXTRAORDINARY :)_______");
            score=score+10;
            System.out.println("Your Score is:"+score);
        }
           else
        {
            System.out.println("+++The correct answer is None of the above because there is no smoke produced in an electric train +++");
            System.out.println("Your Score is:"+score);
        }}o1.Score();
 }//end of function MENTAL_ABILITY
 void Score()   //start function Score to display the score of the user
 {
     System.out.println("\f########YOUR TOTAL SCORE IS:"+score+" #########\n:):):):)THANK YOU FOR YOUR PARTICIPATION:):):):)");
    if(score>=80)
    System.out.println("\n@@@$$$###---YOU WIN A GIFT VOUCHER OF Rs.1000 FROM SAPNA BOOK STORE PVT LTD---###$$$@@@\n^^^GET READY TO HUNT^^^");
    if(score>=70&&score<80)
    {System.out.println("\n!!!^^^===YOU GET FREE MOVIE TICKET FOR ANY MOVIE IN INOX===^^^!!!\n^^^GET THE THRILL^^^");}
 }//end function Score
}//end of class QUIZ

