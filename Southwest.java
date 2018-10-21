import java.util.Scanner;
import java.util.ArrayList;
public class Southwest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letters referring to the feelings "
            + "that most apply to you when riding an aircraft. Feel free to "
            + "choose multiple:"
            + "\n A: Fear of Heights"
            + "\n B: Motion Sickness/Nausea"
            + "\n C: Claustrophobia");

        String input = sc.nextLine();
        input = input.toUpperCase();

        if (!(input.contains("A") || input.contains("B")
                                                || input.contains("C"))) {
            System.out.println("Invalid input!");
        } else {
            ArrayList<String> videos = new ArrayList<String>();
            videos.add("1");
            videos.add("2");
            videos.add("3");
            videos.add("4");
            videos.add("5");
            videos.add("6");

            if (input.contains("A") && videos.contains("6")) {
                videos.remove("6");
            }

            if (input.contains("B") && videos.contains("1")) {
                videos.remove("1");

            }

            if (input.contains("C") && videos.contains("2")
                                        && videos.contains("4")
                                         && videos.contains("5")) {
                videos.remove("2");
                videos.remove("4");
                videos.remove("5");

            }

            if (videos.size() > 1) {
                System.out.println("Your recommended videos are: ");
                for (String a: videos) {
                    System.out.println("Video " + a + " ");
                }
                System.out.println("\nLet's start with Video " + videos.get(0)
                                    + "!");
            } else {
                System.out.println("Your recommended video is: " + videos);
                System.out.println("Let's start Video " + videos.get(0) + "!");
            }

        }
    }

}
