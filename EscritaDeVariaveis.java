import java.time.LocalDate;

public class EscritaDeVariaveis {
    public static void main(String[] args) {
        String nome = "José";
        String endereco = "Rua Javari, Nº 235";
        double salario = 1621.35;
        LocalDate data = LocalDate.now();
        System.out.println(
        "Eu " 
        + nome 
        + ", morando no endereço " 
        + endereco 
        + ", confirmo que recebi o salário R$ " 
        + salario 
        + ", na data " 
        + data
        );
    }
}

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte
mensagem: 

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>,
na data de <data>.
*/