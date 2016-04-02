package commands;

public class Commands {

    public static void main(String[] args) {
        System.out.printf("How are you?: %s", "OK"); //This line was fine
        System.out.println("Nice to \"meet\", you"); //Moved the comma and make the word "meet" in qoutes(I was not shure what to repair else comma sign, because after that code work well)
        System.out.println("\\\"////"); //Remove one of the '\' sign to make line working again not shure if this was the only problem to repair.
        System.out.println("\"public\" is a reserved word in Java"); //Replaic '/' with '\'
        System.out.println("\n" + "2 / 2 = " + "1\n"); //This line works well
    }
    
}
