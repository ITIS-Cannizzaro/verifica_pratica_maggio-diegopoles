import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Verifica_Frame_Diego_Poles {
	JLabel txt1 = new JLabel("INSERISCI UN NUMERO:");
    JLabel txt2 = new JLabel("VISUALIZZA:");
    JTextArea num = new JTextArea();
    JButton agg = new JButton("AGGIUNGI");
    JButton canc = new JButton("CANCELLA");
    JButton vis = new JButton("VISUALIZZA");
    JTextArea vis_num = new JTextArea();
    ArrayList<Integer> vettore = new ArrayList<Integer>();
    public Verifica_Frame_Diego_Poles(){
        super ("Numeri");
        Container c = this.getContentPane();
        setLayout(null);
        setSize(620, 200);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.add(txt1);
        txt1.setBounds(50, 20, 180, 10);
        c.add(num);
        num.setBounds(260, 20, 200, 20);
        c.add(agg);
        agg.setBounds(0, 70, 200, 30);
        c.add(canc);
        canc.setBounds(210, 70, 200, 30);
        c.add(vis);
        vis.setBounds(420, 70, 200, 30);
        c.add(txt2);
        txt2.setBounds(50, 130, 180, 10);
        c.add(vis_num);
        vis_num.setBounds(260, 130, 200, 20);
    }
    public void Aggiungi(){
        int numero = Integer.parseInt(num.getText());
        vettore.add(numero);
        System.out.println(numero);
    }
    public void Visualizza(){

    }
    public void Cancella(){
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==agg){
            Aggiungi();
        }
        if (e.getSource()==vis) {
            Visualizza();
        }
        if (e.getSource()==canc) {
            Cancella();
        }
    }
}

}
/*la classe Verifica_Frame_Diego_Poles non implementa l'interfaccia ActionListener, quindi, i tre metodi (Aggiungi(), Visualizza() e Cancella()) che usano l'oggetto ActionEvent non hanno modo di funzionare.
 *  Inoltre, dovresti anche implementare il metodo actionPerformed() utili per l'interfaccia "ActionListener".*
 *  Oltre questo, il codice non posiziona il numero nella maniera ordinata all'interno dell'arraylist, aggiunge solo un elemento.
 */