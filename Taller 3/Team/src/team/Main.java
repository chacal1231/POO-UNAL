package team;

public class Main {

    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(17);

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        barcelona.addPlayer(new Player("A", 1));
        barcelona.addPlayer(new Player("B", 1));
        barcelona.addPlayer(new Player("C", 1));
        barcelona.addPlayer(new Player("D", 1));
        barcelona.addPlayer(new Player("E", 1));
        barcelona.addPlayer(new Player("F", 1));
        barcelona.addPlayer(new Player("G", 1));
        barcelona.addPlayer(new Player("H", 1));
        barcelona.addPlayer(new Player("I", 1));
        barcelona.addPlayer(new Player("J", 1));
        barcelona.addPlayer(new Player("K", 1));
        barcelona.addPlayer(new Player("L", 1));
        barcelona.addPlayer(new Player("M", 1));
        //barcelona.addPlayer(new Player("N", 1));
        //barcelona.addPlayer(new Player("O", 1));
        
        
        //System.out.println("Number of players: " + barcelona.size());
        //barcelona.printPlayers();
        System.out.println("Total goals: " + barcelona.goals());
    }
}
