package exelivrodeitelcap16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diogo
 */
public class PropertiesTest {

    public static void main(String[] args) {
        Properties table = new Properties();

        //configura propriedades
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);

        //substitui o valor de propriedade
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);

        saveProperties(table);

        table.clear(); //tabela vazia

        System.out.println("After clearing properties");
        listProperties(table);

        loadProperties(table);

        //obtem valor de cor da propriedade
        Object value = table.getProperty("color");

        //verifica se o valor esta na tabela
        if (value != null) {
            System.out.printf("Property color's value is %s%n", value);
        } else {
            System.out.println("Property color is not in table");
        }

    }

    //salva as propriedades em um arquivo
    public static void saveProperties(Properties props) {
        //salva o conteudo da tabela
        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); //salva as propriedades
            output.close();
            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
//carrega as propriedades de um arquivo

    private static void loadProperties(Properties props) {
        //carrega o conteudo da tabela
        try {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input);//carrega propriedades
            input.close();
            System.out.println("After loading properties");
            listProperties(props);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //gera saida de valores de propriedade
    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet(); //obtem nomes de propriedade

        //gera saida de pares nome/valor
        for (Object key : keys) {
            System.out.printf("%s\t%s%n", key, props.getProperty((String) key));
        }
        System.out.println();
    }
}
