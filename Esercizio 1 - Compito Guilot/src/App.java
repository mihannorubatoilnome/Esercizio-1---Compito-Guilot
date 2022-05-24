public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("|INIZIO DELLA PARTITA|");

        Giocatore g1 = new Giocatore("Guilot");
        Giocatore g2 = new Giocatore("Salvini");

        g1.start();
        g2.start();

        g1.join();
        g2.join();

        if(g1.getPunteggio() > g2.getPunteggio())
            System.out.println(g1.getNome()+" HA VINTO con punteggio : "+g1.getPunteggio());
        else if(g1.getPunteggio() < g2.getPunteggio())
            System.out.println(g2.getNome()+" HA VINTO con punteggio : "+g2.getPunteggio());            

        if(g1.getPunteggio() == g2.getPunteggio())
            System.out.println("PAREGGIO!");
        
        System.out.println("|FINE PARTITA|");
    }
}
