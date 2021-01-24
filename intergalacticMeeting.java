import java.util.Scanner;

public class intergalacticMeeting
{
   public static void main(String[]args)
   {
      System.out.println("You are a human from Earth and you are in the Annual Intergalactic Foreign Affairs Meeting. \nInteract with the other diplomats from different planets daily and learn more about them and their policies.\nWhen you get back to Earth, you will find out how your diplomatic trip affected Earth's planetary relations.");
      Scanner input=new Scanner(System.in);
      System.out.println("To begin, what is your name human?");
      String YN = input.nextLine();
      int f = 0;
      int a = 0;
      int m = 0;
      int v = 0;
      
      //Fortuna Question 1
      System.out.println("Okay " + YN + ", your mission during this meeting will be to create relationships with the other diplomats. \nWhether or not they'll be your ally or your enemy is up to you.");
      System.out.println("\nYou step off the Earth's escort pod into the massive Intergalactic spaceship. \nImmediately you are greeted by Giovanni from planet Fortuna. \nAfter your initial exchange of introductions you notice that Giovanni is sweating profusely. \n\"The temperature is just ghastly in here isn't it?\"\n 1: Yes 2: No"); //add commentary
      int answer1 = input.nextInt();
      if (answer1 == 1)
      {
         //add commentary
         f++;
      }
      
      else if (answer1 == 2)
      {
         f--;
      }
      
      else {
         while (answer1 != 1 && answer1 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer1 = input.nextInt();
         }
         if (answer1 == 1)
         {
         //add commentary
            f++;
         }
         
         else if (answer1 == 2)
         {
            f--;
         }
      }
      System.out.println(f); //add commentary
      
      
      //Agora 
      System.out.println("\nYou get hungry and decide to head to the spaceship's cafeteria.\nHeading into the cafeteria, you make a beeline towards the lunch line. \nOut of the corner of your eye, you spot Azalea of planet Agora, who's known for their agriculture. \nYou spot a steaming hot slice of cheesy pizza and a leafy refreshing salad.\nWhich do you choose? \n1: Pizza  2: Salad"); //add commentary
      int answer2 = input.nextInt();
      if (answer2 == 1)
      {
         System.out.println("\n\"Ew, why are you choosing that greasy and unhealthy piece of garbage?\"said Azalea who appeared out of nowhere.");
         a--;//add commentary
      }
      
      else if (answer2 == 2)
      {
         System.out.println("\n\"You made the right choice darling! Vegetables are always good for the soul. \nYou should join me for yoga sometime by the way.\" \nexclaimed Azalea who appeared out of nowhere.");
         a++;//add commentary
      }
      
      else {
         while (answer2 != 1 && answer2 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer2 = input.nextInt();
         }
         if (answer2 == 1)
         {
            System.out.println("\n\"Ew, why are you choosing that greasy and unhealthy piece of garbage?\"said Azalea who appeared out of nowhere.");
         //add commentary
            a--;
         }
         
         else if (answer2 == 2)
         {
            System.out.println("\n\"You made the right choice darling! Vegetables are always good for the soul. \nYou should join me for yoga sometime by the way.\" \nexclaimed Azalea who appeared out of nowhere.");
            a++;
         }
      }
      System.out.println(a); //add commentary
      
      //Minerva and Vulcan
      System.out.println("\nAfter you finish lunch, you decide to head to your room and settle into the spaceship. \nAfter a long day, you finally hunker down into your bed and fall asleep."); 
      System.out.print("However, you were suddenly awoken not long after to the sounds of people's voices coming from the hall outside. \nYou go outside to see Sophia from planet Minerva and Alexander from planet Vulcan arguing with one another."); 
      System.out.print("\n\"You creep! I can't believe you just walked in my room!\" Sophia screamed. \nAlexander stood there holding the room card and whispered \"I'm sorry, I thought it was my room,\" but Sophia did not hear him over her own voice."); 
      System.out.println("\"What are you two fighting about in the middle of the night?\" You ask them. \n\"Alexander over here walked into my room! This is a complete violation of my privacy!\"" );
      System.out.println("\"I'm so sorry. I honestly thought that it was my room.\" Alexander whispered quietly. \nWhat do you respond with? \n1: Alexander is right 2: Sophia is right 3: Don't interfere");//add commentary
      int answer3 = input.nextInt();
      if (answer3 == 1)
      {
         System.out.println("\n\"It's not Alexander's fault that they gave him your room card by accident,\" you tell Sophia after eying the number on the card clutched in his large hands. Sophia grumbles to herself and gives you a dirty look before slamming the door to her room shut.");
         v++;
         m--;//add commentary
      }
      
      else if (answer3 == 2)
      {
         System.out.println("\n\"You should be ashamed of yourself, this is extremely innapropriate,\" you scold him. Alexander dejectedly looks down at his hands and silently walks away. \"Thanks for backing me up there" + YN + ",\" Sophia smiles at me.");
         m++;
         v--;
      }
      else if (answer3 == 3)
      {
         System.out.println("\nYou were too tired to argue with either of them, so you tried your best to go back to bed.");
      }
      
      else {
         while (0 < answer3 && answer3 < 4)
         {
            System.out.println("Please choose 1, 2, or 3");
            answer3 = input.nextInt();
         }
         if (answer3 == 1)
         {
            System.out.println("\n\"It's not Alexander's fault that they gave him your room card by accident,\" you tell Sophia after eying the number on the card clutched in his large hands. Sophia grumbles to herself and gives you a dirty look before slamming the door to her room shut.");
            v++;
            m--;//add commentary
         }
         
         else if (answer3 == 2)
         {
            System.out.println("\n\"You should be ashamed of yourself, this is extremely innapropriate,\" you scold him. Alexander dejectedly looks down at his hands and silently walks away. \"Thanks for backing me up there" + YN + ",\" Sophia smiles at me.");
            m++;
            v--;
         }
         else 
         {
            System.out.println("\nYou were too tired to argue with either of them, so you tried your best to go back to bed.");
         }
      }
      System.out.println(v);
      System.out.println(m); //add commentary
      
      
      //Ending with Fortuna
      if (f < 0)
      {
         System.out.println("Your interactions with Giovanni has resulted in war between your planets."); //expand?
      }
      else if (f == 0)
      {
         System.out.println("Your interactions with Giovanni has not led to any positive or negative outcomes."); //expand?
      }
      else 
      {
         System.out.println("Your interactions with Giovanni has resulted in an alliance forming between your two planets."); //expand?
      }
      
      //Ending with Agora
      if (a < 0)
      {
         System.out.println("Your interactions with Azalea has resulted in war between your planets."); //expand?
      }
      else if (a == 0)
      {
         System.out.println("Your interactions with Azalea has not led to any positive or negative outcomes."); //expand?
      }
      else 
      {
         System.out.println("Your interactions with Azalea has resulted in an alliance forming between your two planets."); //expand?
      }
      
      //Ending with Vulcan
      if (v < 0)
      {
         System.out.println("Your interactions with Alexander has resulted in war between your planets."); //expand?
      }
      else if (v == 0)
      {
         System.out.println("Your interactions with Alexander has not led to any positive or negative outcomes."); //expand?
      }
      else 
      {
         System.out.println("Your interactions with Alexander has resulted in an alliance forming between your two planets."); //expand?
      }
      
      //Ending with Minerva
      if (m < 0)
      {
         System.out.println("Your interactions with Sophia has resulted in war between your planets."); //expand?
      }
      else if (m == 0)
      {
         System.out.println("Your interactions with Sophia has not led to any positive or negative outcomes."); //expand?
      }
      else 
      {
         System.out.println("Your interactions with Sohpia has resulted in an alliance forming between your two planets."); //expand?
      }
   
      
   }
}
