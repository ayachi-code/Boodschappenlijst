import java.util.*;
 
/**
 * boodschappen
 */

 
 public class boodschappen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int boodschappenlijst[] = new int[3];

        int total = 0;
        
        System.out.print("Hoeveel appels ? ");
        int appels = input.nextInt();
        boodschappenlijst[0] = appels;
        System.out.print("Hoeveel bananen ? ");
        int bananen = input.nextInt();
        boodschappenlijst[1] = bananen;
        System.out.print("Hoeveel sinasappels ? ");
        int sinasappels = input.nextInt();
        boodschappenlijst[2] = sinasappels;

        total = boodschappenlijst[0] + boodschappenlijst[1] + boodschappenlijst[2];
        for (int i=0; i <boodschappenlijst.length; i++) {
            System.out.println(boodschappenlijst[i]);
        }
        System.out.println("-------------- +");
        System.out.println(total);

    }
}