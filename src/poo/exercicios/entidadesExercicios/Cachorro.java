package poo.exercicios.entidadesExercicios;

public class Cachorro {
    private String cor;
    private int idade;
    private boolean latir;

    public Cachorro(String cor, int idade) {
        this.cor = cor;
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }
    
    public int getIdade() {
        return idade;
    }

    public boolean isLatir() {
        return latir;
    }

    public void setLatir(boolean latir) {
        this.latir = latir;
    }
    
}

/*
Crie, usando POO, um objeto Cachorro que represente um 
labrador preto de 10 anos e que lata sempre que vir um homem.
 */