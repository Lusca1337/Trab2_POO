public class Conversor {
    
    private double moedaConvertida;

    public double converterMoeda(double valor, Moedas valorOrigem, Moedas valorDestino){
        if (valor < 0) {
            System.out.println("Erro: O valor a ser convertido não pode ser negativo.");
            return 0;
        }
        moedaConvertida = valor * (valorDestino.getValor() / valorOrigem.getValor());
        return moedaConvertida;
    }
}