public class ServerNameGenerator {

    String[][] nameGen = {
            {"waggish", "amusing", "comical", "antic", "risible", "droll", "whimsical", "silly", "merry", "hilarious"},
            {"pillow", "monkey", "juice", "lizard", "napkin", "jelly", "plastic", "silly", "Tony", "machine"}
    };

    public void serverName() {
        int notSoRandAdj = 0;
        int randY = (int)(Math.random() * 10);
        int notSoRandNoun = 1;

       String adjFound = nameGen[notSoRandAdj][randY];
       String nounFound = nameGen[notSoRandNoun][randY];

        System.out.println("This is the adjective: " + adjFound);
        System.out.println("This is the Noun: " + nounFound);
        System.out.printf("\nServers name: %s-%s%n", adjFound, nounFound);

    }

    public static void main(String[] args) {
        ServerNameGenerator findServer = new ServerNameGenerator();
        findServer.serverName();
    }


}
