import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Verifica_Frame_Diego_Poles extends JFrame implements ActionListener {
    //1° FRAME:
    JLabel txt1 = new JLabel("INSERISCI UN NUMERO:");
    JLabel txt2 = new JLabel("VISUALIZZA:");
    JTextArea num = new JTextArea();
    JButton agg = new JButton("AGGIUNGI");
    JButton canc = new JButton("CANCELLA");
    JButton vis = new JButton("VISUALIZZA");
    JTextArea vis_num = new JTextArea("[]");
    //CREA ARRAYLIST:
    ArrayList<Integer> vettore = new ArrayList<Integer>();
    //2° FRAME:
    JFrame cancella = new JFrame("CANCELLA");
    JLabel txt3 = new JLabel("INSERSCI IL NUMERO DA RIMUOVERE:");
    JTextArea canc_num = new JTextArea();
    JButton aggi = new JButton("AGGIORNA");
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
        agg.addActionListener(e -> Aggiungi());
        c.add(canc);
        canc.setBounds(210, 70, 200, 30);
        canc.addActionListener(e -> Cancella());
        c.add(vis);
        vis.setBounds(420, 70, 200, 30);
        vis.addActionListener(e -> Visualizza());
        c.add(txt2);
        txt2.setBounds(50, 130, 180, 10);
        c.add(vis_num);
        vis_num.setBounds(260, 130, 200, 20);
    }
    public void Aggiungi() {
        int numero = Integer.parseInt(num.getText());
        vettore.add(numero);
        num.setText("");
    }
    public void Visualizza(){
        int temp = 0;
        for (int i = 0; i < vettore.size(); i++) {
            for (int k = 0; k < vettore.size() - 1; k++) {
                if (vettore.get(k) > vettore.get(k + 1)) {
                    temp = vettore.get(k);
                    vettore.set(k, vettore.get(k + 1));
                    vettore.set(k + 1, temp);
                }
            }
        }
        vis_num.setText("" + vettore);
    }
    public void Cancella(){
        cancella.setLayout(null);
        cancella.setSize(620, 180);
        cancella.setResizable(false);
        cancella.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cancella.setVisible(true);
        cancella.add(txt3);
        txt3.setBounds(50, 20, 240, 10);
        cancella.add(canc_num);
        canc_num.setBounds(300, 20, 200, 20);
        cancella.add(aggi);
        aggi.setBounds(210, 70, 200, 30);
        aggi.addActionListener(e -> Aggiorna());
    }
    public void Aggiorna(){

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
        if (e.getSource()==aggi) {
            Aggiorna();
        }
    }
}
