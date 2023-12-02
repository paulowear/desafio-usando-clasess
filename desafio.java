package heroi;

public class Heroi {
    private String nome;
    private int idade;
    private String[] tipo;
    private String[] ataque;

    public Heroi(String nome, int idade, String[] tipo, String[] ataque) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    public Heroi(String nome, int idade) {
        this(nome, idade, new String[]{"guerreiro", "mago", "monge", "ninja"},
                new String[]{"espada", "magia", "usou artes marciais", "usou shuriken"});
    }

    public void atacar() {
        String[] tipo = {"guerreiro", "mago", "monge", "ninja"};
        String[] ataque = {"espada", "magia", "usou artes marciais", "usou shuriken"};

        if (tipo[0].equals("guerreiro") && ataque[0].equals("espada")) {
            System.out.println("O " + tipo[0] + " atacou usando " + ataque[0]);
        }

        if (tipo[1].equals("mago") && ataque[1].equals("magia")) {
            System.out.println("O " + tipo[1] + " atacou usando " + ataque[1]);
        }

        if (tipo[2].equals("monge") && ataque[2].equals("usou artes marciais")) {
            System.out.println("O " + tipo[2] + " atacou usando " + ataque[2]);
        }

        if (tipo[3].equals("ninja") && ataque[3].equals("usou shuriken")) {
            System.out.println("O " + tipo[3] + " atacou usando " + ataque[3]);
        }

    }
        public static void main(String[] args) {
            Heroi heroi = new Heroi("Nome do Herói", 25);
        heroi.atacar();
    }

}



