public class calculadora {

    public static void main(String[] args) {

    int valorDoCarro = 10000;
    int duracaoEmprestimo = 3;
    int taxaDeJuro = 5;
    int valorDeEntrada = 2000;
    if( duracaoEmprestimo <=0 || taxaDeJuro <=0){
    System.out.println ("erro, faca um emprestimo valido");

    }

    else if(valorDeEntrada >= valorDoCarro){
        System.out.println("voce pode comprar o carro a vista");
    } else{
        int saldoRestante = valorDoCarro - valorDeEntrada;
        int numeroDeMeses = duracaoEmprestimo * 12;
        int saldoMensal = saldoRestante/numeroDeMeses;
        int juros = saldoMensal*taxaDeJuro/100;
        int pagamentoMensal = saldoMensal+juros;
        System.out.println(pagamentoMensal); 
    }

    }
}
    