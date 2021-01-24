//Authors: 

import java.util.Scanner;

public class intergalacticMeeting
{ 

   public static int f;
   public static int a;
   public static int v;
   public static int m;
  
   public intergalacticMeeting(int f, int a, int v, int m){
      this.f=f;
      this.a=a;
      this.v=v;
      this.m=m;
   }
  
   public int getF(){
      return f;
   }
  
   public int getA(){
      return a;
   }
  
   public int getV(){
      return v;
   }
  
   public int getM(){
      return m;
   }
  
   public void setF(int f){
      this.f=f;
   }
  
   public void setA(int a){
      this.a=a;
   }
  
   public void setV(int v){
      this.v=v;
   }
  
   public void setM(int m){
      this.m=m;
   }
  


   public static void main(String[]args){
   
      System.out.println("You are a human from Earth and you are in the Annual Intergalactic Foreign Affairs Meeting. \nInteract with the other diplomats from different planets daily and learn more about them and their policies.\nWhen you get back to Earth, you will find out how your diplomatic trip affected Earth's planetary relations.");
      Scanner input=new Scanner(System.in);
      System.out.println(">>To begin, what is your name human?");
      String YN = input.nextLine();
      int f = -2;
      int a = 2;
      int m = 1;
      int v = 0;
      System.out.println("Okay " + YN + ", your mission during this meeting will be to create relationships with the other diplomats. \nWhether or not they'll be your ally or your enemy is up to you.");
      System.out.println("The following diplomats will be the ones in which you are to interact with:");
      System.out.println("\nGiovanni of planet Fortuna \nPlanet is Known For: Wealth and economy \nPersonality: Grandiose, snobby, proper \nCurrent Relationship with Planet:" + fortuna(f));
      System.out.println("\nAzalea of planet Agora \nPlanet is Known For: Agriculture and healthy lifestyle \nPersonality: Confident, wise, spiritual \nCurrent Relationship with Planet:" + agora(a));
      System.out.println("\nSophia of planet Minerva \nPlanet is Known For: Advanced technology and academics \nPersonality: Intelligent, authoritative, adventurous \nCurrent Relationship with Planet:" + minerva(m));
      System.out.println("\nAlexander of planet Vulcan \nPlanet is Known For: Powerful military \nPersonality: Shy, calm, stoic \nCurrent Relationship with Planet:" + vulcan(v));
      System.out.println("\nRemember this information. It may be useful. \nGood luck ambassador.");
      //Fortuna Question 1
      System.out.println("\nYou step off the Earth's escort pod into the massive Intergalactic spaceship. \nImmediately you are greeted by Giovanni from planet Fortuna. \nHis dark hair was slicked back for a very groomed appearance.\nHe was a slim, well-dressed fellow, clothed in the finest fabrics the galaxy had to offer for a suit. \nAfter your initial exchange of introductions you notice that Giovanni was sweating profusely.");
      System.out.println("\"The temperature is just ghastly in here isn't it " + YN + "?\" Giovanni asked in an exasperated manner as he wiped his damp pale forehead with a handkerchief.\n>>1: Yes 2: No");
      int answer1 = input.nextInt();
      if (answer1 == 1)
      {
         System.out.println("\"Yes, it really is!\" You responded dramatically. \nBut before he could reply, a ringing noise came from Giovanni's pocket. \nHe tucked away his handkerchief, pulled out his phone, and looked at you apologetically, \"Sorry, I must take this call, see you soon " + YN + ",\" he smiled.");
         f++;
      }
      
      else if (answer1 == 2)
      {
         System.out.println("\"Oh, stop being so overdramatic,\" You said rolling your eyes. \nThe friendly look in Giovanni's eyes suddenly went cold. \nIt appeared that your comment had bothered him. \nHe tucked away his handkerchief before a ringing came from his pocket. \nHe immediately picked up his phone and walked away from you."); 
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
            System.out.println("\"Yes, it really is!\" You responded dramatically. But before he could reply, a ringing noise came from Giovanni's pocket. He pulled out his phone and looked at you apologetically, \"Sorry, I must take this call, see you soon" + YN + ".\" ");
         
            f++;
         }
         
         else if (answer1 == 2)
         {
            System.out.println("\"Oh, stop being so overdramatic,\" You said rolling your eyes. \nThe friendly look in Giovanni's eyes suddenly went cold. \nIt appeared that your comment had bothered him. \nHe tucked away his handkerchief before a ringing came from his pocket. \nHe immediately picked it up and walked away from you."); 
            f--;
         }
      }
      System.out.println("Your relation score with Giovanni:" + fortuna(f)); 
      
      
      //Agora 
      System.out.println("\nYou got hungry and decided to head to the spaceship's cafeteria.\nArriving at the cafeteria, you made a beeline toward the lunch line. \nOut of the corner of your eye, you spotted Azalea of planet Agora chatting with some other ambassadors. \nShe wore a loose, flowy dress and her long dirty blonde hair was in a braid that was decorated in flowers.\nYou saw a steaming hot slice of cheesy pizza and a leafy refreshing salad.\nWhich do you choose? \n>>1: Pizza  2: Salad");
      int answer2 = input.nextInt();
      if (answer2 == 1)
      {
         System.out.println("After paying for your pizza, you sat down at an empty table. \nYou waved at Azalea since your planets have been on good terms for some years.\nShe smiled back and began to approach your table before noticing your pizza. "); 
         System.out.println("She frowned at the sight of it and gave you a dissapointed look before she turned back to converse with the other ambassadors. \nThat's when you remembered that her planet's culture found unhealthy food to be disgraceful.");
         a--;
      }
      
      else if (answer2 == 2)
      {
         System.out.println("\"You made the right choice darling! Vegetables are great for the soul, along with yoga. You should join me sometime!\" exclaimed Azalea who appeared out of nowhere. \n\"Why yes, that would be wonderful,\" you agreed.");
         System.out.println("You and Azalea continued chatting about the affairs of your planets for what felt like ages");
         a++;
      }
      
      else {
         while (answer2 != 1 && answer2 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer2 = input.nextInt();
         }
         if (answer2 == 1)
         {
            System.out.println("After paying for your pizza, you sat down at an empty table. \nYou waved at Azalea since your planets have been on good terms for some years.\nShe smiled back and began to approach your table before noticing your pizza. "); 
            System.out.println("She frowned at the sight of it and gave you a dissapointed look before she turned back to converse with the other ambassadors. \nThat's when you remembered that her planet's culture found unhealthy food to be disgraceful.");
            a--;
         }
         
         else if (answer2 == 2)
         {
            System.out.println("\"You made the right choice darling! Vegetables are great for the soul, along with yoga. You should join me sometime!\" exclaimed Azalea who appeared out of nowhere. \n\"Why yes, that would be wonderful,\" you agreed.");
            System.out.println("You and Azalea continued chatting about the affairs of your planets for what felt like ages");
            a++;
         }
      }
      System.out.println("Your relation score with Azalea:" + agora(a));
      
      //Minerva and Vulcan
      System.out.println("\nAfter you finished lunch, you decide to head to your room and settle into the spaceship. \nAfter a long day, you finally hunkered down into your bed and fell asleep."); 
      System.out.print("However, you were suddenly awoken not long after to the sounds of people's voices coming from the hall outside. \nYou go outside to see Sophia from planet Minerva and Alexander from planet Vulcan arguing with one another. \nSophia's hair was dyed bright red and she sported a edgy punk rock outfit comprised of much leather. \nAlexander, on the other hand, wore a thick sweater with jeans and boots despite the warm temperature."); 
      System.out.print("\nYou didn't blame him though, you heard that temperatures on Vulcan often went as high as 90 degrees celsius. \n\"You creep! I can't believe you just walked in my room!\" Sophia screamed. \nAlexander's large figure stood still while holding the room card and I heard him whisper \n\"I'm sorry, I thought it was my room,\" but Sophia did not hear him over her own voice."); 
      System.out.println("\n\"What are you two fighting about in the middle of the night?\" You ask them. \n\"Alexander over here walked into my room! This is a complete violation of my privacy!\"" );
      System.out.println("\"I'm so sorry. I honestly thought that it was my room.\" Alexander whispered quietly. \nWhat do you respond with? \n>>1: Alexander is right 2: Sophia is right 3: Don't interfere");
      int answer3 = input.nextInt();
      if (answer3 == 1)
      {
         System.out.println("\"It's not Alexander's fault that they gave him your room card by accident,\" you tell Sophia after eyeing the number on the card clutched in his hands. \nSophia grumbled to herself and gives you a dirty look before slamming the door to her room shut.");
         v++;
         m--;
      }
      
      else if (answer3 == 2)
      {
         System.out.println("\"You should be ashamed of yourself, this is extremely innapropriate,\" you scold him. Alexander dejectedly looks down at his hands and silently walks away. \n\"Thanks for backing me up there " + YN + ",\" Sophia smiles at me.");
         m++;
         v--;
      }
      else if (answer3 == 3)
      {
         System.out.println("You were too tired to argue with either of them, so you tried your best to go back to bed.");
      }
      
      else {
         while (answer3 != 1 && answer3 != 2 && answer3!=3)
         {
            System.out.println("Please choose 1, 2, or 3");
            answer3 = input.nextInt();
         }
         if (answer3 == 1)
         {
            System.out.println("\"It's not Alexander's fault that they gave him your room card by accident,\" you tell Sophia after eying the number on the card clutched in his large hands. \nSophia grumbled to herself and gives you a dirty look before slamming the door to her room shut.");
            v++;
            m--;
         }
         
         else if (answer3 == 2)
         {
            System.out.println("\"You should be ashamed of yourself, this is extremely innapropriate,\" you scold him. Alexander dejectedly looks down at his hands and silently walks away. \n\"Thanks for backing me up there " + YN + ",\" Sophia smiles at me.");
            m++;
            v--;
         }
         else 
         {
            System.out.println("You were too tired to argue with either of them, so you tried your best to go back to bed.");
         }
      }
      System.out.println("Your relation score with Alexander:" + vulcan(v));
      System.out.println("Your relation score with Sophia:" + minerva(m)); 
      
      
      //Day 2
      System.out.println("You woke up the next day and grabbed a quick breakfast before heading straight to the foreign affairs meeting.");
      System.out.println("The meeting started with Azalea asking you about your economic stance on foreign trade. \n>>1: Improve luxury trade 2: Improve militaristic trade 3: Improve technological trade");
      int answer4 = input.nextInt();
      if (answer4 == 1)
      {
         System.out.println("\"I believe that Earth's luxury trade relations should be strengthened\" you said aloud. \nGiovanni gave you a look of approval.");
         f++;
      }
      
      else if (answer4 == 2)
      {
         System.out.println("\"I believe that Earth's militaristic trade relations should be strengthened\" you said aloud. \nAlexander gave you a small smile.");
         v++;
      }
        
      else if (answer4 == 3)
      {
         System.out.println("\"I believe that Earth's technological trade relations should be strengthened\" you said aloud. \nSophia raised her eyebrow and and gave you a smirk.");
         m++;
      }
      
      else {
         while (answer4 != 1 && answer4 != 2 && answer4 != 3)
         {
            System.out.println("Please choose 1, 2, or 3");
            answer4 = input.nextInt();
         }
         if (answer4 == 1)
         {
            System.out.println("\"I believe that Earth's luxury trade relations should be strengthened\" you said aloud. \nGiovanni gave you a look of approval.");
         f++;
         }
         
         else if (answer4 == 2)
         {
            System.out.println("\"I believe that Earth's militaristic trade relations should be strengthened\" you said aloud. \nAlexander gave you a small smile.");
         v++;
         }
         
         else if (answer4 == 3)
         {
            System.out.println("\"I believe that Earth's technological trade relations should be strengthened\" you said aloud. \nSophia raised her eyebrow and and gave you a smirk.");
         m++;
         }
         
      }
      System.out.println("Your relation score with Azalea:" + agora(a)); 
      System.out.println("Your relation score with Alexander:" + vulcan(v));
      System.out.println("Your relation score with Giovanni:" + fortuna(f));
      System.out.println("Your relation score with Sophia:" + minerva(m));
      
      
      
      //Alexander
      System.out.println("The meeting continued and, a while later, the group noticed that Alexander had not spoke a single word. \n\"Alexander old chap, is there anything that you would like to add?\" Giovanni asked politely.");
      System.out.println("\"Why is he even here if doesn't even possess any diplomatic skills?\" Sophia interjected. \nWhat do you do? \n>>1: Agree with Sophia  2:Let Alexander speak"); 
      int answer5 = input.nextInt();
      if (answer5 == 1)
      {
         System.out.println("\"Sophia is right. Alexander, you need to speak up more.\" you tell him. \n\"Alexander, don't get me wrong hon, but they're correct. Your trip to this meeting will be in vain if you don't do what's best for your planet.\" Azalea added.");
         v--;
         a++;
         m++;
         f--;
      }
      
      else if (answer5 == 2)
      {
         System.out.println("\"Sophia, just let him speak. It's possible that he's waiting for the right moment,\" you tell her pointedly. \n\"Yes indeed, allow for the gentleman to get his word in,\" Giovanni said looking at Alexander.");
         v++;
         a--;
         m--;
         f++;
      }
      
      else {
         while (answer5 != 1 && answer5 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer5 = input.nextInt();
         }
         if (answer5 == 1)
         {
            System.out.println("\"Sophia is right. Alexander, you need to speak up more.\" you tell him. \n\"Alexander, don't get me wrong hon, but they're correct. Your trip to this meeting will be in vain if you don't do what's best for your planet.\" Azalea added.");
            v--;
            a++;
            m++;
            f--;
         }
         
         else if (answer5 == 2)
         {
            System.out.println("\"Sophia, just let him speak. It's possible that he's waiting for the right moment,\" you tell her pointedly. \n\"Yes indeed, allow for the gentleman to get his word in,\" Giovanni said looking at Alexander.");
            v++;
            a--;
            m--;
            f++;
         }
      }
      System.out.println("Your relation score with Azalea:" + agora(a)); 
      System.out.println("Your relation score with Alexander:" + vulcan(v));
      System.out.println("Your relation score with Giovanni:" + fortuna(f));
      System.out.println("Your relation score with Sophia:" + minerva(m));
      
      
      
      
      
      //Giovanni
      System.out.println("\nAfter the meeting, Giovanni asked you to stay after to address some matters. \n\"Sorry to keep you after, but I wanted to ask for some advice regarding some policies with other planets.\"");
      System.out.print("Giovanni continued,\"I have recently received an offer from Minerva and Agora regarding the use of medicine.\n Would it be wise to establish the use the of natural remedies or Minerva's advanced prescriptions?\" \n>>1: Natural remedies 2: Advanced prescriptions\n");
      int answer6 = input.nextInt();
      if (answer6 == 1)
      {
         System.out.println("\"Giovanni, I believe that natural remedies may be the less risky investment,\" you tell him.");
         a++;
         m--;
         f++;
      }
      
      else if (answer6 == 2)
      {
         System.out.println("\"Giovanni, it's time to evolve with the advancement of science and medicine,\" you respond.");
         a--;
         m++;
         f++;
      }
      
      else {
         while (answer6 != 1 && answer6 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer6 = input.nextInt();
         }
         if (answer6 == 1)
         {
            System.out.println("\"Giovanni, I believe that natural remedies may be the less risky investment,\" you tell him.");
            f++;
         }
         
         else if (answer6 == 2)
         {
            System.out.println("\"Giovanni, it's time to evolve with the advancement of science and medicine,\" you respond.");
            f--;
         }
      }
      System.out.println("\"Hm, thank you " + YN + " I will take that advice into consideration,\" Giovanni said in a pleased fashion.");
      System.out.println("Your relation score with Giovanni:" + fortuna(f));
      System.out.println("Your relation score with Azalea:" + agora(a));
      System.out.println("Your relation score with Sophia:" + minerva(m));
   
      //Azalea
      System.out.println("As the week of meetings went on, you found yourself having a cup of tea with Azalea one evening. \n\"How are you liking your tea, " + YN + "?\" Azalea asked as she scooped more cubes of sugar into her cup.");
      System.out.println(">>1: \"It's a tad bitter for my liking\" 2: \"It's perfectly sweetened to my liking\"");
      int answer7 = input.nextInt();
      
      if (answer7 == 1)
      {
         System.out.println("\"I completely agree with you! Here, have some sugar cubes,\" she said pushing the bowl of sugar cubes towards you.");
         a++;
      }
      
      else if (answer7 ==2)
      {
         System.out.println("\"Oh, interesting, I found this to be bitter. You must have some strange taste,\" she said downwardly.");
         a--;
      }
      
      else{
         while (answer7 != 1 && answer7 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer7 = input.nextInt();
         }
         if (answer7 == 1)
         {
            System.out.println("\"I completely agree with you! Here, have some sugar cubes,\" she said pushing the bowl of sugar cubes towards you.");
            a++;
         }
         
         else if (answer7 == 2)
         {
            System.out.println("\"Oh, interesting, I found this to be bitter. You must have some strange taste,\" she said downwardly.");
            a--;
         }
      }
      System.out.println("After your cup of tea with Azalea, you two exchanged farewells,\"It was pleasant talking with you. We should meet again sometime,\" she smiled.");
      System.out.println("Your relation score with Azalea:" + agora(a));
   
      //Going home
      //Alexander
      System.out.println("\nWhen the last day of the Annual Intergalactic Foreign Affairs Meeting finally came, you packed up your belongings. \nYou said a silent farewell to the room that you stayed in for a week. \nYou made your way down the hall with your suitcase and run into Alexander.");
      System.out.println(">>1: Say a meaningful goodbye 2: Say a curt goodbye");
      int answer8 = input.nextInt();
      if (answer8 == 1)
      {
         System.out.println("\"Alexander, it's been so nice to see you! I hope we'll get to see each other again,\" you said shaking his hand. \n\"It was great seeing you too,\" he smiled. \nThat may have been the loudest you've heard him spoke the entire affair.");
         v+=2;
      }
      
      else if (answer8 ==2)
      {
         System.out.println("\"Until we meet again,\" you say shaking his hand. \nHe gives a nod in response.");
         v-=2;
      }
      else{
         while (answer8 != 1 && answer8 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer8 = input.nextInt();
         }
         if (answer8 == 1)
         {
            System.out.println("\"Alexander, it's been so nice to see you! I hope we'll get to see each other again,\" you said shaking his hand. \n\"It was great seeing you too,\" he smiled. \nThat may have been the loudest you've heard him spoke the entire affair.");
            v+=2;
         }
         
         else if (answer8 == 2)
         {
            System.out.println("\"Until we meet again,\" you say shaking his hand. \nHe gives a nod in response.");
            v-=2;
         }
      }
      
      //Azalea
      System.out.println("\nIt wasn't long after your goodbyes with Alexander that Azalea came up from behind and hugged you. \n>>1: Stand there awkwardly 2: Turn around and hug her back");
      int answer9 = input.nextInt();
      
      if (answer9 == 1)
      {
         System.out.println("You stood frozen in place, unsure of what to do. \n\"It was nice seeing you again,\" you finally blurted out after she released you from her hug. \n\"Yea...\" she responded back awkwardly.");
         a-=2;      
      }
      
      else if (answer9 ==2)
      {
         System.out.println("You turned around and gave her a tight hug back. \nYou two embraced for a moment before letting go. \n\"I'll really miss seeing you everyday,\" she said sadly. \n\"Me too,\"You said as you took one last glance at her before continuing on your way out.");
         a+=2;
      }
      else{
         while (answer9 != 1 && answer9 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer9 = input.nextInt();
         }
         if (answer9 == 1)
         {
            System.out.println("You stood frozen in place, unsure of what to do. \n\"It was nice seeing you again,\" you finally blurted out after she released you from her hug. \n\"Yea...\" she responded back awkwardly.");
            a-=2;
         }
         
         else if (answer9 == 2)
         {
            System.out.println("You turned around and gave her a tight hug back. \nYou two embraced for a moment before letting go. \n\"I'll really miss seeing you everyday,\" she said sadly. \n\"Me too,\"You said as you took one last glance at her before continuing on your way out.");
            a+=2;
         }
      }
      
      //Sophia
      System.out.println("Making your way down the hall, you turn a corner and see Sophia walking toward you. \n>>1: Say you really enjoyed her meeting presentations 2: Shoot her a quick smile and keep walking");
      int answer10 = input.nextInt();
      
      if (answer10 == 1)
      {
         System.out.println("\"I really enjoyed your presentations at the meetings,\" you said stopping in front of Sophia, \"they were very informative.\" \nSophia eyed you approvingly and finally responded, \"Thanks, I really appreciate it. See ya around kid.\" She gave you a wink before walking past you.");
         m+=2;
      } 
      
      else if (answer10 == 2)
      {
         System.out.println("You shot Sophia a brief smile and nod in which she returned before you went your separate ways.");
         m-=2;
      }
      
      else{
         while (answer10 != 1 && answer10 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer10 = input.nextInt();
         }
         if (answer10 == 1)
         {
            System.out.println("\"I really enjoyed your presentations at the meetings,\" you said stopping in front of Sophia, \"they were very informative.\" \nSophia eyed you approvingly and finally responded, \"Thanks, I really appreciate it. See ya around kid.\" She gave you a wink before walking past you.");
            m+=2;
         }
         
         else if (answer10 == 2)
         {
            System.out.println("You shot Sophia a brief smile and nod in which she returned before you went your separate ways.");
            m-=2;
         }
      }
      
      //Giovanni
      System.out.println("When you finally arrive back at the gates to your earth pod, Giovanni greets you in a rather saddening manner. \n\"It's going to be hard seeing you go comrade,\" he said shaking your hand.");
      System.out.println(">>1: \"I guess you won't have to deal with the spaceship's heat anymore\" 2: \"We'll stay in touch, don't you worry\"");
      int answer11 = input.nextInt();
      
      if (answer11 == 1)
      {
         System.out.println("\"You haven't forgotten about that now have you?\" he said embarrassingly.");
         f-=2;
      } 
      
      else if (answer11 == 2)
      {
         System.out.println("\"That would be quite delightful! I look forward to your companionship.\" he beamed.");
         f+=2;
      }
      
      else{
         while (answer11 != 1 && answer11 !=2)
         {
            System.out.println("Please choose 1 or 2");
            answer11 = input.nextInt();
         }
         if (answer11 == 1)
         {
            System.out.println("\"You haven't forgotten about that now have you?\" he said embarrassingly.");
            f-=2;
         }
         
         else if (answer11 == 2)
         {
            System.out.println("\"That would be quite delightful! I look forward to your companionship.\" he beamed.");
            f+=2;
         }
      }
      
      //Back home
      System.out.println("You gave Giovanni one last goodbye and boarded your earth pod. \nWhen the earth pod finally reached back home, you were given your status report on your relationships with the other planets.");
                  
      //Ending with Fortuna
      if (f < 0)
      {
         System.out.println("\nYour interactions with Giovanni has resulted in war between your planets."); 
      }
      else if (f == 0)
      {
         System.out.println("\nYour interactions with Giovanni has not led to any positive or negative outcomes."); 
      }
      else 
      {
         System.out.println("\nYour interactions with Giovanni has resulted in an alliance forming between your two planets."); 
      }
      
      //Ending with Agora
      if (a < 0)
      {
         System.out.println("Your interactions with Azalea has resulted in war between your planets."); 
      }
      else if (a == 0)
      {
         System.out.println("Your interactions with Azalea has not led to any positive or negative outcomes."); 
      }
      else 
      {
         System.out.println("Your interactions with Azalea has resulted in an alliance forming between your two planets."); 
      }
      
      //Ending with Vulcan
      if (v < 0)
      {
         System.out.println("Your interactions with Alexander has resulted in war between your planets."); 
      }
      else if (v == 0)
      {
         System.out.println("Your interactions with Alexander has not led to any positive or negative outcomes."); 
      }
      else 
      {
         System.out.println("Your interactions with Alexander has resulted in an alliance forming between your two planets."); 
      }
      
      //Ending with Minerva
      if (m < 0)
      {
         System.out.println("Your interactions with Sophia has resulted in war between your planets."); 
      }
      else if (m == 0)
      {
         System.out.println("Your interactions with Sophia has not led to any positive or negative outcomes."); 
      }
      else 
      {
         System.out.println("Your interactions with Sohpia has resulted in an alliance forming between your two planets."); 
      }
      if (f<0 && a<0 && v<0 && m<0)
      {
         System.out.println("You unlocked the War Lord achievement! \nYou ended up on bad terms with every diplomat");
      }
      
      else if (f==0 && a==0 && v==0 && m==0)
      {
         System.out.println("You unlocked the Plain Jane achievement! \nYou were on neutral terms with every diplomat");
      }
      
      else if (f>0 && a>0 && v>0 && m>0)
      {
         System.out.println("You unlocked the People Pleaser achievement! \nYou were on good terms with every diplomat");
      }
   }
   
   public static String fortuna(int f){
      String message;
      if (f < 0) {
         message = " not good";
      } else if (f == 0) {
         message = " neutral";
      } else {
         message = " good";
      }
      return message;
   }
   
   public static String agora(int a){
      String message;
      if (a < 0) {
         message = " not good";
      } else if (a == 0) {
         message = " neutral";
      } else {
         message = " good";
      }
      return message;
   }
   
   public static String minerva(int m){
      String message;
      if (m < 0) {
         message = "not good";
      } else if (m == 0) {
         message = " neutral";
      } else {
         message = " good";
      }
      return message;
   }
   
   public static String vulcan(int v){
      String message;
      if (v < 0) {
         message = " not good";
      } else if (v == 0) {
         message = " neutral";
      } else {
         message = " good";
      }
      return message;
   }
}