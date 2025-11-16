package poo.exercicios;

import poo.exercicios.entidadesExercicios.Cachorro;
import poo.exercicios.entidadesExercicios.PresencaHomem;

public class CaoLatindo {
    public static void main(String[] args) {
        Cachorro labrador = new Cachorro("Preto", 10);
        PresencaHomem presenca = new PresencaHomem();

        boolean latido = labrador.isLatir();
        boolean homemPresente = presenca.isPresenca();
        
        if(latido && homemPresente == true) {
            System.out.println("Latir");
        }
        else {
            System.out.println("Não latir");
        }
    }
}

/*
Crie, usando POO, um objeto Cachorro que represente um 
labrador preto de 10 anos e que lata sempre que vir um homem.

Exemplo em JavaScript

var cachorro = {
    raca: 'labrador',
    cor: 'preto', 
    idade: 10,
    latir (olhar, presenca){
        if(olhar == presenca){
            console.log('AUAUAUAUAU');
        } else{
            console.log('Paz e tranquilidade')
        }
    }
}

console.log(cachorro.latir(0,1))
 */