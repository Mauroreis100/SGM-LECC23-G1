package vendas;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

import clientes.Cliente;

public class Venda_Dinheiro implements Serializable{
	private int id_venda;
private Cliente cliente;//Informação do cliente que fez a compra
private Vector itens; //Informação dos itens que comprou=Carrinho
private Calendar data_Criacao; //DATA E HORA DA COMPRA
private final double IVA=0.17;
private double total_IVA; //Total de tudo
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
private String data=dateFormat.format(data_Criacao.getTime());
@Override
public String toString() {
	return "\t RECIBO SGM \nNUIT:1230120 \nLOCAL:Maputo \nVenda Número:" + id_venda + "\n------------------------------\nCliente=" + cliente.getNome() + "\nDATA:"
			+ data + ", \nIVA=" + IVA + ", \ntotal_IVA=" + total_IVA + "]";
}
public Venda_Dinheiro(int id_venda, Cliente cliente, Vector itens, double total_IVA) {
	this.id_venda=id_venda;
	this.cliente = cliente;
	this.itens = itens;
	this.data = data;
	this.total_IVA = total_IVA;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Vector getItens() {
	return itens;
}
public void setItens(Vector itens) {
	this.itens = itens;
}
public Calendar getData_Criacao() {
	return data_Criacao;
}
public void setData_Criacao(Calendar data_Criacao) {
	this.data_Criacao = data_Criacao;
}
public double getTotal() {
	return total_IVA;
}
public void setTotal(double total) {
	this.total_IVA = total;
}


}
