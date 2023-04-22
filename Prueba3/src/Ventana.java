import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	int Aleatorios[] = new int [15];
	
public Ventana() {
		
		this.setVisible(true);
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Rompecabezas Numerico");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		JPanel fondo = new JPanel();
		fondo.setSize(500,560);
		fondo.setBackground(new Color(35,45,70));
        fondo.setLayout(new BorderLayout());
		this.add(fondo);

		//MARCO-----------------------------------------------------------
		JPanel PanelN = new JPanel();
		PanelN.setLayout(new BorderLayout());
		PanelN.setBackground(new Color(0,0,0));
		fondo.add(PanelN, BorderLayout.NORTH);
		JLabel espacioPN = new JLabel("X: ", JLabel.LEFT);
		espacioPN.setFont(new Font("Arial",Font.BOLD,30));
		espacioPN.setOpaque(false);
		espacioPN.setForeground(Color.black);
		PanelN.add(espacioPN);
		
		JPanel PanelS = new JPanel();
        PanelS.setLayout(new GridLayout(1,5));
		PanelS.setBackground(new Color(0,0,0));
		fondo.add(PanelS, BorderLayout.SOUTH);
		
		JLabel espacioPS = new JLabel("X: ", JLabel.LEFT);
		espacioPS.setOpaque(false);
		espacioPS.setForeground(Color.black);
		PanelS.add(espacioPS);

		JButton reinicio = new JButton("REINICIO");
		PanelS.add(reinicio);
		JLabel espacioPS2 = new JLabel("X: ", JLabel.LEFT);
		espacioPS2.setOpaque(false);
		espacioPS2.setForeground(Color.black);
		PanelS.add(espacioPS2);
		
		JButton ganar = new JButton("GANAR");
		PanelS.add(ganar);
		JLabel espacioPS3 = new JLabel("X: ", JLabel.LEFT);
		espacioPS3.setOpaque(false);
		espacioPS3.setForeground(Color.black);
		PanelS.add(espacioPS3);
		
		JPanel PanelE = new JPanel();
		PanelE.setLayout(new FlowLayout());
		PanelE.setBackground(new Color(0,0,0));
		fondo.add(PanelE, BorderLayout.EAST);
		JLabel espacioPE = new JLabel("X: ", JLabel.LEFT);
		espacioPE.setFont(new Font("Arial",Font.BOLD,30));
		espacioPE.setOpaque(false);
		espacioPE.setForeground(Color.black);
		PanelE.add(espacioPE);
		
		JPanel PanelO = new JPanel();
		PanelO.setLayout(new FlowLayout());
		PanelO.setBackground(new Color(0,0,0));
		fondo.add(PanelO, BorderLayout.WEST);
		JLabel espacioPO = new JLabel("X: ", JLabel.LEFT);
		espacioPO.setFont(new Font("Arial",Font.BOLD,30));
		espacioPO.setOpaque(false);
		espacioPO.setForeground(Color.black);
		PanelO.add(espacioPO);

		
		//BOTONES----------------------------------------------------
        JPanel panelB = new JPanel();
        panelB.setLayout(new GridLayout(4, 4));
        
        NumerosAleatorios();
        
        JButton b1 = new JButton("");
        b1.setText(String.valueOf(Aleatorios[0]));
        b1.setBackground(Color.LIGHT_GRAY);
        panelB.add(b1);
        
        JButton b2 = new JButton("");
        b2.setText(String.valueOf(Aleatorios[1]));
        b2.setBackground(Color.LIGHT_GRAY);
        panelB.add(b2);
        
        JButton b3 = new JButton("");
        b3.setText(String.valueOf(Aleatorios[2]));
        b3.setBackground(Color.LIGHT_GRAY);
        panelB.add(b3);
        
        JButton b4 = new JButton("");
        b4.setText(String.valueOf(Aleatorios[3]));
        b4.setBackground(Color.LIGHT_GRAY);
        panelB.add(b4);
        
        JButton b5 = new JButton("");
        b5.setText(String.valueOf(Aleatorios[4]));
        b5.setBackground(Color.LIGHT_GRAY);
        panelB.add(b5);
        
        JButton b6 = new JButton("");
        b6.setText(String.valueOf(Aleatorios[5]));
        b6.setBackground(Color.LIGHT_GRAY);
        panelB.add(b6);
        
        JButton b7 = new JButton("");
        b7.setText(String.valueOf(Aleatorios[6]));
        b7.setBackground(Color.LIGHT_GRAY);
        panelB.add(b7);
        
        JButton b8 = new JButton("");
        b8.setText(String.valueOf(Aleatorios[7]));
        b8.setBackground(Color.LIGHT_GRAY);
        panelB.add(b8);
        
        JButton b9 = new JButton("");
        b9.setText(String.valueOf(Aleatorios[8]));
        b9.setBackground(Color.LIGHT_GRAY);
        panelB.add(b9);
        
        JButton b10 = new JButton("");
        b10.setText(String.valueOf(Aleatorios[9]));
        b10.setBackground(Color.LIGHT_GRAY);
        panelB.add(b10);
        
        JButton b11 = new JButton("");
        b11.setText(String.valueOf(Aleatorios[10]));
        b11.setBackground(Color.LIGHT_GRAY);
        panelB.add(b11);
        
        JButton b12 = new JButton("");
        b12.setText(String.valueOf(Aleatorios[11]));
        b12.setBackground(Color.LIGHT_GRAY);
        panelB.add(b12);
        
        JButton b13 = new JButton("");
        b13.setText(String.valueOf(Aleatorios[12]));
        b13.setBackground(Color.LIGHT_GRAY);
        panelB.add(b13);
        
        JButton b14 = new JButton("");
        b14.setText(String.valueOf(Aleatorios[13]));
        b14.setBackground(Color.LIGHT_GRAY);
        panelB.add(b14);
        
        JButton b15 = new JButton("");
        b15.setText(String.valueOf(Aleatorios[14]));
        b15.setBackground(Color.LIGHT_GRAY);
        panelB.add(b15);
       
        JButton b16 = new JButton("");
        b16.setBackground(Color.LIGHT_GRAY);
        panelB.add(b16);
        
        reinicio.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					NumerosAleatorios();
					b1.setText(String.valueOf(Aleatorios[0]));
					b2.setText(String.valueOf(Aleatorios[1]));
					b3.setText(String.valueOf(Aleatorios[2]));
					b4.setText(String.valueOf(Aleatorios[3]));
					b5.setText(String.valueOf(Aleatorios[4]));
					b6.setText(String.valueOf(Aleatorios[5]));
					b7.setText(String.valueOf(Aleatorios[6]));
					b8.setText(String.valueOf(Aleatorios[7]));
					b9.setText(String.valueOf(Aleatorios[8]));
					b10.setText(String.valueOf(Aleatorios[9]));
					b11.setText(String.valueOf(Aleatorios[10]));
					b12.setText(String.valueOf(Aleatorios[11]));
					b13.setText(String.valueOf(Aleatorios[12]));
					b14.setText(String.valueOf(Aleatorios[13]));
					b15.setText(String.valueOf(Aleatorios[14]));
					b16.setText(String.valueOf(""));


					repaint();
					revalidate();
				}
		    });
        
        ganar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (b1.getText().equals("1") && b2.getText().equals("2") && b3.getText().equals("3") && 
			        	b4.getText().equals("4") && b5.getText().equals("5") && b6.getText().equals("6") &&
			        	b7.getText().equals("7") && b8.getText().equals("8") && b9.getText().equals("9") &&
			        	b10.getText().equals("10") && b11.getText().equals("11") && b12.getText().equals("12") &&
			        	b13.getText().equals("13") && b14.getText().equals("14") && b15.getText().equals("15") && b16.getText().equals("")) {
			            JOptionPane.showMessageDialog(null, "¡Felicidades, has ganado!");
			        }else {
			            JOptionPane.showMessageDialog(null, "La piezas no estan acomodadas correctamente");
			        }
				}
		    });
        
        //MOVIMIENTOS EN LAS ESQUINAS------------------------------------------------
        b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b1, b2, b5);
			}
        	
        });
        b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b4, b3, b8);
			}
        	
        });
        b13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b13, b9, b14);
			}
        	
        });
        b16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b16, b12, b15);
			}
        	
        });
        b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b16, b12, b15);
			}
        	
        });
        //MOVIMIENTO EN LOS LATERALES(ARRIBA)-----------------------------------
        b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b2, b1, b3, b6);
			}
        	
        });
        b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b3, b2, b4, b7);
			}
        	
        });
        //MOVIMIENTO EN LOS LATERALES(IZQUIERDA)-----------------------------------
        b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b5, b1, b6, b9);
			}
        	
        });
        b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b9, b5, b10, b13);
			}
        	
        });
        //MOVIMIENTO EN LOS LATERALES(DERECHA)-----------------------------------
        b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b8, b4, b7, b12);
			}
        	
        });
        b12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b12, b8, b11, b16);
			}
        	
        });
        //MOVIMIENTO EN LOS LATERALES(ABAJO)-----------------------------------
        b14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b14, b13, b10, b15);
			}
        	
        });
        b15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b15, b14, b11, b16);
			}
        	
        });
        //MOVIMIENTO EN EL CENTRO---------------------------------------------
        b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b6, b5, b2, b7, b10);
			}
        	
        });
        b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b7, b6, b3, b8, b11);
			}
        	
        });
        b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b10, b9, b6, b11, b14);
			}
        	
        });
        b11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Revisar(b11, b10, b7, b12, b15);
			}
        	
        });
        fondo.add(panelB, BorderLayout.CENTER);
        
        
		
		this.repaint();
		this.revalidate();
		
		}

        public void NumerosAleatorios() {
			Stack <Integer> NumerosAleatorios = new Stack<Integer>();
			Random Rnd = new Random();
			int Aleatorio;
			
			for(int i = 0; i < 15; i++) {
				Aleatorio = (int)(Rnd.nextDouble() * 15 + 1);
				while(NumerosAleatorios.contains(Aleatorio)) {
					Aleatorio = (int)(Rnd.nextDouble() * 15 + 1);
				}
				NumerosAleatorios.push(Aleatorio);
				Aleatorios[i] = Aleatorio;
				System.out.println(Aleatorios[i]);
				
				repaint();
				revalidate();
			}
		}
        
       public void Revisar (JButton b1, JButton b2, JButton b3) {
        	if (b1.getText()!="") {
        		if(b2.getText()=="") {
        			b2.setText(b1.getText());
        			b1.setText("");
        		}else if(b3.getText()=="") {
        			b3.setText(b1.getText());
        			b1.setText("");
        		}
        	}
        }
       public void Revisar (JButton b1, JButton b2, JButton b3, JButton b4) {
       	if (b1.getText()!="") {
       		if(b2.getText()=="") {
       			b2.setText(b1.getText());
       			b1.setText("");
       		}else if(b3.getText()=="") {
       			b3.setText(b1.getText());
       			b1.setText("");
       		}else if(b4.getText()=="") {
       			b4.setText(b1.getText());
       			b1.setText("");
       		}
       	}
       }
       public void Revisar (JButton b1, JButton b2, JButton b3, JButton b4, JButton b5) {
          	if (b1.getText()!="") {
          		if(b2.getText()=="") {
          			b2.setText(b1.getText());
          			b1.setText("");
          		}else if(b3.getText()=="") {
          			b3.setText(b1.getText());
          			b1.setText("");
          		}else if(b4.getText()=="") {
          			b4.setText(b1.getText());
          			b1.setText("");
          		}else if(b5.getText()=="") {
          			b5.setText(b1.getText());
          			b1.setText("");
          		}
          	}
          }
       
   
    	   

       public static void main(String[] args) {
			// TODO Auto-generated method stub
			Ventana frame = new Ventana();

		}

}
