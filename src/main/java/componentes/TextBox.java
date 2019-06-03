/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;
import javax.annotation.ManagedBean;


/**
 *
 * @author Ellien
 */
public class TextBox {
    private String text;
    int i, j;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public int suma(String a,String b){
        int salida =0;
        i = Integer.parseUnsignedInt(a);
        j = Integer.parseUnsignedInt(b);
        salida = i + j;
        return salida;
    } 
    
}
