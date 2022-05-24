public class Giocatore extends Thread{
    private String nome;
    private int dado;
    private int punteggio;

    public Giocatore(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDado(){
        return this.dado;
    }

    public int getPunteggio(){
        return punteggio;
    }

    public void run(){
        System.out.println("Il giocatore "+this.nome+" sta giocando");
        for (int i = 0; i < 2; i++) {
            this.dado = (int)(Math.random()*6) + 1;
            System.out.println(this.nome+" ha tirato : "+this.dado);
            this.punteggio += this.dado;
        }

        if(this.dado == getDado()){
            System.out.println("|LANCIO BONUS "+this.nome+"|");
            this.dado = (int)(Math.random()*6) + 1;
            System.out.println(this.nome+" ha tirato : "+this.dado);
            this.punteggio += this.dado;
        }
    }
}