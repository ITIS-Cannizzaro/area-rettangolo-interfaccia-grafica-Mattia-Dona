import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
	
	public class Calcolo_Area extends JFrame implements ActionListener {
	    JTextArea base=new JTextArea();
	    JTextArea altezza= new JTextArea();
	    JButton calcola=new JButton("Calcola");
	    JButton cancella=new JButton("Cancella");
	    JLabel bas=new JLabel("Lunghezza base: ");
	    JLabel alt=new JLabel("Lunghezza altezza: ");
	    JTextArea risultato= new JTextArea();
	    JLabel ris=new JLabel("L'area misura: ");
	    public Calcolo_Area(){
	        super("Calcolo Area Rettangolo");
	        Container c = this.getContentPane();
	        c.setLayout(new FlowLayout());
	        c.add(bas);
	        c.add(base);
	        c.add(alt);
	        c.add(altezza);
	        bas.setHorizontalTextPosition(bas.LEFT);
	        base.setPreferredSize(new Dimension(265, 20));
	        altezza.setPreferredSize(new Dimension(250, 20));
	        c.add(ris);
	        c.add(risultato);
	        ris.setHorizontalTextPosition(ris.LEFT);
	        risultato.setPreferredSize(new Dimension(280, 20));
	        c.add(calcola);
	        calcola.addActionListener(e -> calcolaArea());
	        c.add(cancella);
	        cancella.addActionListener(e -> cancella());
	        setSize(400, 400);
	        setVisible(true);
	        setResizable(false);
	    }

	    public void calcolaArea(){
	        double Base, Altezza, Area;
	        Base=Double.parseDouble(base.getText());
	        Altezza=Double.parseDouble(altezza.getText());
	        Area=Base*Altezza;
	        risultato.setText(Double.toString(Area));
	    }

	    public void cancella(){
	        base.setText("");
	        altezza.setText("");
	        risultato.setText("");
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if(e.getSource()==calcola){
	            calcolaArea();
	        }
	        if(e.getSource()==cancella){
	            cancella();
	        }
	    }
	}