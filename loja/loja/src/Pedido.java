/**
 * o pedido antes da venda
 */
public class Pedido {

    private Cliente cliente;
    private Vendedor vendedor;
    private ItemVenda[] itens;

    public Pedido(Cliente cliente, Vendedor vendedor, ItemVenda[] itens) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ItemVenda[] getItens() {
        return itens;
    }

    public void setItens(ItemVenda[] itens) {
        this.itens = itens;
    }


}