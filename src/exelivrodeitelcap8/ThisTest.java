/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class ThisTest {

    public static void main(String[] args) {

        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());

    } // fim do metodo principal ok

} //fim da classe ThisTest //

//classe SimpleTime demonstra a referencia "this"
class SimpleTime {

    private int hour; // 0-23
    private int minute; // 0-59
    private int second; //0-59

    //se o construtor utilizar nomes de parametro identicos a nomes de variaveis de instancia a referencia "this" sera exigida para distinguir entre os nomes
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour; // configura a hora do objeto "this"
        this.minute = minute; // configura os minutos do objeto "this"
        this.second = second; // configura os segundos do objeto "this"
    }

    // utilizam "this" explicidto e implicito para chamar toUniversalString
    public String buildString() {
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
    }

    // converte em String no formato de data/hora univeral (HH:MM:SS)
    public String toUniversalString() {
        // "this" nao e requerido aqui para acessar variaveis de instancia porque o metodo nao tem variaveis locais com os mesmos nomes das variaveis de instancia
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

} // fim da classe SimpleTime
