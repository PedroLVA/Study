package practice.generics;

public class ServicePagamento<T extends Pagavel> {

    public void realizarPagamento(T metodoPagamento){

    }

    public static void main(String[] args) {
        // 1. Criar instâncias das formas de pagamento
        PagamentoPix pix = new PagamentoPix();
        PagamentoBoleto boleto = new PagamentoBoleto();

        // 2. Criar um serviço de pagamento para Pix
        ServicePagamento<PagamentoPix> servicoParaPix = new ServicePagamento<>();
        servicoParaPix.realizarPagamento(pix);

        // 3. Criar um serviço de pagamento para Boleto
        ServicePagamento<PagamentoBoleto> servicoParaBoleto = new ServicePagamento<>();
        servicoParaBoleto.realizarPagamento(boleto);

        // 4. Exemplo do que NÃO funciona (garantia de tipo em tempo de compilação)
        // A linha abaixo causará um erro de compilação porque String não implementa Pagavel.
        // ServicePagamento<String> servicoInvalido = new ServicePagamento<>();
    }
}


