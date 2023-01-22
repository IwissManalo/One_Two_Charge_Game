import java.util.*;

public class Main
{
    static Scanner sc = new Scanner (System.in);
    static String def = "\u001B[0m";  //default color
    static String red = "\033[1;91m"; //red text
    static String blue = "\033[1;94m"; //blue text
    static String grn = "\033[1;92m"; //green text
    static String yel = "\033[1;33m"; //yellow text
    static String cbg = "\033[46m"; //cyan BG
    static String gbg = "\033[42m"; //green BG
    static String rbg = "\u001B[41m"; //red BG
    static String skills, P2skills, p1Skills = "";
    static ArrayList<String> p1S = new  ArrayList<String>();
    static ArrayList<String> p2S = new  ArrayList<String>();

    static int p1SP, p2SP, round, i = 0,
            p1HP = 10, p2HP = 10;

    public static void main(String[] args)
    {
        System.out.print(red + " HewOo! Welcome to Irish's Charge Game🤩 ENJOY PLAYING! " + def);
        game();
    }

    public static void game()
    {
        do
        {
            round++;
            System.out.println(blue + "\n\n⚡ROUND " + round + "⚡===============⚡1, 2, CHARGE!⚡" + def);
            battleFlow();

            p1S.clear();
            p2S.clear();

        }

        while(!(p1HP <= 0 || p2HP <= 0));

        if((p1HP > 0) && (p2HP <= 0))
        {
            System.out.println(rbg + "\n\t\t\t\t🎉CONGRATULATIONS, YOU WON!🎉\t\t\t\t\t\t" + def);
        }
        else
        {
            System.out.println(rbg + "\n\t\t\t\t💀GAME OVER, YOU LOSE💀\t\t\t\t\t\t" + def);
        }
    }

    public static void battleFlow()
    {
///////////////////////-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-////////////////////////////
        while (i == 0)
        {
            i++;
            System.out.println(blue + "\n[Player 1]" + def + " gets to pick a skill...");
            System.out.println(blue + "\n[P1] Available Skill Points: ["+ p1SP + ']' + def +
                    grn + "\t\t\t\t❤️❤️❤️Player 1 Health: " + p1HP + "❤️❤️❤️" + def); //Displays the current health of player 1

            System.out.println(yel + "\n\t\t\tChoose your Skill (input code name)"
                    + "\n\n-Code- -Skills-" + def);

            ArrayList<String> p1Skills = p1Skills(p1SP, p1S);
            System.out.print(yel + p1Skills + def);
            System.out.print(blue + "\n\n\t\t\t\tPlayer 1 choose: " + def);

            while (i == 1)
            {
                i = 0;
                skills = sc.next();
                String sName = switch (skills) //Code Names for each skill

                        {
                            case "CH" -> "🔋Charge🔋";
                            case "SD" -> "🛡️Shield🛡️";
                            case "WV" -> "🌊Wave🌊";
                            case "AX" -> "🪓Ax🪓";
                            case "KKH" -> "🔮Kamekameha🔮";
                            case "AN" -> "✝️Amen✝️";
                            default -> "WRONG CODE";
                        };

                System.out.println(blue + "\nPlayer 1" + " choose: " + sName + def); //

                if (skills.equals("CH"))
                {
                    System.out.println("P1 gained (1) Skill Point");
                }
                else if (skills.equals("SD"))
                {
                    if (p1SP >= 1)
                    {
                        System.out.println("P1 lost (1) Skill Point");
                        break;
                    }
                    else
                        System.out.print(rbg + "Not enough skill points" + def + "\tChoose another skill: ");
                    i++;
                }
                else if (skills.equals("WV"))
                {
                    if (p1SP >= 1)
                    {
                        System.out.println("P1 lost (1) Skill Point");
                        break;
                    }
                    else
                        System.out.print(rbg + "Not enough skill points" + def + "\tChoose another skill: ");
                    i++;
                }
                else if (skills.equals("AX"))
                {
                    if (p1SP >= 2)
                    {
                        System.out.println("P1 lost (2) Skill Point");
                        break;
                    }
                    else
                        System.out.print(rbg + "Not enough skill points" + def + "\tChoose another skill: ");
                    i++;
                }
                else if (skills.equals("KKH"))
                {
                    if (p1SP >= 4)
                    {
                        System.out.println("P1 lost (4) Skill Point");
                        break;
                    }
                    else
                        System.out.print(rbg + "Not enough skill points" + def + "\tChoose another skill: ");
                    i++;
                }
                else if (skills.equals("AN"))
                {
                    if (p1SP >= 5)
                    {
                        System.out.println("P1 lost (5) Skill Point");
                        break;
                    }
                    else
                    {
                        System.out.print(rbg + "Not enough skill points" + def + "\tChoose another skill: ");
                        i++;
                    }
                }
                else
                {
                    System.out.print(red + "⚠️Input Valid Code⚠️ : " + def);
                    i++;
                }
            }//while (i == 1)
            break;
        }
///////////////////////-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-PLAYER 1-////////////////////////////

///////////////////////-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2////////////////////////////
        System.out.println(red + "\n[Player 2]" + def +" gets to pick a skill..." + '\n');

        System.out.println(red + "[P2] Available Skill Points: ["+ p2SP + ']' + def +
                grn + "\t\t\t\t❤️❤️❤️Player 2 Health: " + p2HP + "❤️❤️❤️" + def + yel + "\n\n-Code- -Skills-" + def);

        ArrayList<String> p2Skills = p2Skills(p2SP, p2S);
        System.out.print(yel + p2Skills + def);

        String [] Skills = {"CH","SD","WV", "AX", "KKH", "AN"}; //skills
        Random rSkill = new Random(); //for AI's random choice
        int r = rSkill.nextInt(p2Skills.size());

        P2skills = Skills[r];
        String sName = switch (P2skills)
                {
                    case "CH" -> "🔋Charge🔋";
                    case "SD" -> "🛡️Shield🛡️";
                    case "WV" -> "🌊Wave🌊";
                    case "AX" -> "🪓Ax🪓";
                    case "KKH" -> "🔮Kamekameha🔮";
                    default -> "✝️Amen✝️";
                };
        System.out.print(red + "\n\nPlayer 2 choose: " + sName + def + "‍\n");

        if (P2skills.equals("CH")) //Charge
        {
            if (p2SP >= 0)
            {
                System.out.println("P2 gained (1) Skill Point");
            }
        }
        else if (P2skills.equals("SD")) // Shield
        {
            if (p2SP >= 1)
            {
                System.out.println("P2 lost (1) Skill Point");
            }
        }
        else if (P2skills.equals("WV")) //Wave
        {
            if (p2SP >= 1)
            {
                System.out.println("P2 lost (1) Skill Point");
            }
        }
        else if (P2skills.equals("AX")) //Ax
        {
            if (p2SP >= 2)
            {
                System.out.println("P2 lost (2) Skill Points");
            }
        }
        else if (P2skills.equals("KKH")) //Kamekameha
        {
            if (p2SP >= 4)
            {
                System.out.println("P2 lost (4) Skill Points");
            }
        }
        else //Amen
        {
            if (p2SP >= 5)
            {
                System.out.println("P2 lost (5) Skill Points");
            }
        }
///////////////////////-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2-PLAYER 2////////////////////////////

///////////////////////DAMAGE CALCULATION-DAMAGE CALCULATION-DAMAGE CALCULATION-DAMAGE CALCULATION////////////////////////////
        damageCalculation();
    }

    public static void damageCalculation()
    {
        if (skills.equals("CH"))
        {
            switch(P2skills)
            {
                case "CH":
                    p1SP +=1;
                    p2SP +=1;
                    break;
                case "WV":
                    p1SP +=1; p1HP -=2;
                    p2SP -=1;
                    break;
                case "SD":
                    p1SP +=1;
                    p2SP -=1;
                    break;
                case "AX":
                    p1SP +=1; p1HP -=3;
                    p2SP -=2;
                    break;
                case "KKH":
                    p1SP +=1; p1HP -=6;
                    p2SP -=4;
                    break;
                case "AN":
                    p1SP +=1;
                    p2SP -=5; p2HP +=5;
                    break;
            }
        }

        if (skills.equals("WV"))
        {
            switch(P2skills)
            {
                case "CH":
                    p1SP -=1;
                    p2SP +=1; p2HP -=2;
                    break;
                case "WV":
                    p1SP -=1;
                    p2SP -=1;
                    break;
                case "SD":
                    p1SP -=1;
                    p2SP -=1;
                    break;
                case "AX":
                    p1SP -=1; p1HP -=1;
                    p2SP -=2;
                    break;
                case "KKH":
                    p1SP -=1; p1HP -=4;
                    p2SP -=4;
                    break;
                case "AN":
                    p1SP -=1;
                    p2SP -=5; p2HP +=5;
                    break;
            }
        }

        if (skills.equals("SD"))
        {
            switch(P2skills)
            {
                case "CH":
                    p1SP -=1;
                    p2SP +=1;
                    break;
                case "WV":
                    p1SP -=1;
                    p2SP -=1;
                    break;
                case "SD":
                    p1SP -=1;
                    p2SP -=1;
                    break;
                case "AX":
                    p1SP -=1;
                    p2SP -=2;
                    break;
                case "KKH":
                    p1SP -=1; p1HP -=6;
                    p2SP -=4;
                    break;
                case "AN":
                    p1SP -=1;
                    p2SP -=5; p2HP +=5;
                    break;
            }
        }

        if (skills.equals("AX"))
        {
            switch(P2skills)
            {
                case "CH":
                    p1SP -=2;
                    p2SP +=1; p2HP -=3;
                    break;
                case "WV":
                    p1SP -=2;
                    p2SP -=1; p2HP -=1;
                    break;
                case "SD":
                    p1SP -=2;
                    p2SP -=1;
                    break;
                case "AX":
                    p1SP -=2;
                    p2SP -=2;
                    break;
                case "KKH":
                    p1SP -=2; p1HP -=3;
                    p2SP -=4;
                    break;
                case "AN":
                    p1SP -=2;
                    p2SP -=5; p2HP +=5;
                    break;
            }
        }

        if (skills.equals("KKH"))
        {
            switch(P2skills)
            {
                case "CH":
                    p1SP -=4;
                    p2SP +=1; p2HP -=6;
                    break;
                case "WV":
                    p1SP -=4;
                    p2SP -=1; p2HP -=4;
                    break;
                case "SD":
                    p1SP -=4;
                    p2SP -=1; p2HP -=6;
                    break;
                case "AX":
                    p1SP -=4;
                    p2SP -=2; p2HP -=3;
                    break;
                case "KKH":
                    p1SP -=4;
                    p2SP -=4;
                    break;
                case "AN":
                    p1SP -=4;
                    p2SP -=5; p2HP +=5;
                    break;
            }
        }

        if (skills.equals("AN"))
        {
            switch(P2skills)
            {
                case "CH":
                    p1SP -=5; p1HP +=5;
                    p2SP +=1;
                    break;
                case "WV":
                    p1SP -=5; p1HP +=5;
                    p2SP -=1;
                    break;
                case "SD":
                    p1SP -=5; p1HP +=5;
                    p2SP -=1;
                    break;
                case "AX":
                    p1SP -=5; p1HP +=5;
                    p2SP -=2;
                    break;
                case "KKH":
                    p1SP -=5; p1HP +=5;
                    p2SP -=2;
                    break;
                case "AN":
                    p1SP -=5; p1HP +=5;
                    p2SP -=5; p2HP +=5;
                    break;
            }
        }

        if (p1HP < 0)
        {
            p1HP = 0;
        }
        if (p2HP < 0)
        {
            p2HP = 0;
        }

        //Result per Round
        System.out.println("\n\t\t\t\t\t" + gbg + " ROUND [" + round + "] RESULTS " + def + grn + "\n\t\t\tPlayer 1 Health: [" + p1HP + ']'
                + "\tPlayer 1 Skill Points: ["+ p1SP + ']'
                + "\n\t\t\tPlayer 2 Health: [" + p2HP + ']' + "\tPlayer 2 Skill Points: [" + p2SP + ']' + def);
    }

    public static ArrayList<String> p1Skills(int p1SP, ArrayList<String>skills) //List of available skills according to Player 1's Skill Point/s
    {
        if (p1SP >= 0)skills.add("CH]▶️▶️ Charge = gets you 1SP");
        if (p1SP >= 1)
        {
            skills.add("\n[SD]▶️▶️ Shield = costs 1SP, gives you immunity to all other skills except KKH");
            skills.add("\n[WV]▶️▶️ Wave = costs 1SP,  damages the enemy 2HP");
        }
        if (p1SP >= 2)skills.add("\n[AX]▶️▶️ Ax = costs 2SP, damages the enemy 3HP");
        if (p1SP >= 4)skills.add("\n[KKH▶️▶️ Kamekameha = costs 4SP,  damages the enemy 6HP");
        if (p1SP >= 5)skills.add("\n[AN]▶️▶️ Amen = costs 5SP, grants you immunity plus 5HP");

        ArrayList<String> p1Skills = skills;
        return p1Skills;
    }

    public static ArrayList<String> p2Skills(int p2SP, ArrayList<String>skills) //List of available skills according to Player 2's Skill Point/s
    {
        if (p2SP >= 0)skills.add("CH]▶️▶️ Charge = gets you 1SP");
        if (p2SP >= 1)
        {
            skills.add("\n[SD]▶️▶️ Shield = costs 1SP, gives you immunity to all other skills except KKH");
            skills.add("\n[WV]▶️▶️ Wave = costs 1SP,  damages the enemy 2HP");
        }
        if (p2SP >= 2)skills.add("\n[AX]▶️▶️ Ax = costs 2SP, damages the enemy 3HP");
        if (p2SP >= 4)skills.add("\n[KKH▶️▶️ Kamekameha = costs 4SP,  damages the enemy 6HP");
        if (p2SP >= 5)skills.add("\n[AN]▶️▶️ Amen = costs 5SP, grants you immunity plus 5HP");

        ArrayList<String> p2Skills = skills;
        return p2Skills;
    }
}
