import javax.swing.JOptionPane;
public class Main {
	//testando
    public static void main(String[] args){
    	 int estado = 0;
         
         Lampada acao = new Lampada();
        
        estado = JOptionPane.showConfirmDialog(null, "Ligar a lampada");
        if(estado == 0)
            acao.ligar();
        else
            acao.desligar();
        JOptionPane.showMessageDialog(null, acao.observar());
    }   
    }