/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap10;

/**
 *
 * @author Diogo
 */
public class Invoice implements Payable {

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

//construtor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0) { // valida quantidade
            throw new IllegalArgumentException("Quantity must be >=0");
        }
        if (pricePerItem < 0.0) { //valida pricePerItem
            throw new IllegalArgumentException("Price per item must be >=0");
        }

        this.quantity = quantity;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;

    } // fim do construtor

    //obtem o numero da peca
    public String getPartNumber() {
        return partNumber; // deve validar
    }

    //obtem da descricao
    public String getPartDescription() {
        return partDescription;
    }

    //configura quantidade
    public void seQuantity(int quantity) {
        if (quantity < 0) { //valida quantidade
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    //obtem a quantidade
    public int getQuantity() {
        return quantity;
    }

    //configura preco por item
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) { //valida pricePerItem
            throw new IllegalArgumentException("Price per item must be >=0");
        }
        this.pricePerItem = pricePerItem;
    }

    //obtem o preco por item
    public double getPricePerItem() {
        return pricePerItem;
    }

    //retorno da representacao de String do objeto Invoice
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "invoice", "part number", getPartNumber(), getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    //metodo requerido para executar o contrato com a interface payable
    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem(); //calcula custo total
    }
    
} // fim da classe Invoice
