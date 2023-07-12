import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu extends JFrame{

    private String cadNumero ="";
    private String operacion = "nula";
    private double numero1,resul;
    private boolean activado = true;
    private boolean punto = true;
        public calcu() {
            a1Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "1";
                    }else{
                        cadNumero +="1";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }
            });
            a2Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "2";
                    }else{
                        cadNumero +="2";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }

            });
            a3Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "3";
                    }else{
                        cadNumero +="3";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }

            });
            a4Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "4";
                    }else{
                        cadNumero +="4";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }
            });
            a5Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "5";
                    }else{
                        cadNumero +="5";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }
            });
            a6Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "6";
                    }else{
                        cadNumero +="6";
                    }
                    resultado.setText(cadNumero);
                    activado = true;


                }
            });
            a7Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "7";
                    }else{
                        cadNumero +="7";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }
            });
            a8Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "8";
                    }else{
                        cadNumero +="8";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }
            });
            a9Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "9";
                    }else{
                        cadNumero +="9";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }
            });
            a0Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(resultado.getText().equals("0")){
                        cadNumero = "0";
                    }else{
                        cadNumero +="0";
                    }
                    resultado.setText(cadNumero);
                    activado = true;

                }
            });
            suma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(activado == true){
                        numero1 = Double.parseDouble(cadNumero);
                        proceso.setText(cadNumero+" + ");
                        cadNumero = "";
                        operacion = "suma";
                        activado = false;
                        punto = false;

                    }
                }
            });
            igual.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double numero2;
                    if(operacion.equals("nula")){
                        proceso.setText(cadNumero);

                    }
                    else if(operacion.equals("suma")){
                        numero2 = Double.parseDouble(cadNumero);
                        resul = numero1+numero2;;
                       proceso.setText(String.format("%.2f",resul));
                        cadNumero = String.valueOf(resul);
                        operacion ="nula";
                    }else if(operacion.equals("resta")){
                        numero2 = Double.parseDouble(cadNumero);
                        resul = numero1-numero2;;
                        proceso.setText(String.format("%.2f",resul));
                        cadNumero = String.valueOf(resul);
                        operacion ="nula";
                    }else if(operacion.equals("multiplicacion")){
                        numero2 = Double.parseDouble(cadNumero);
                        resul = numero1*numero2;;
                        proceso.setText(String.format("%.2f",resul));
                        cadNumero = String.valueOf(resul);
                        operacion ="nula";
                    }else if(operacion.equals("division")){
                        numero2 = Double.parseDouble(cadNumero);
                        if(numero2 == 0){
                            proceso.setText("No se divide * 0");
                        }else {
                            resul = numero1 / numero2;
                            ;
                            proceso.setText(String.format("%.2f", resul));
                            cadNumero = String.valueOf(resul);
                            operacion = "nula";
                        }
                    }
                    resultado.setText("");
                    activado = true;
                    punto = false;
                }
            });
            multiplicacion.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(activado == true){
                        numero1 = Double.parseDouble(cadNumero);
                        proceso.setText(cadNumero+" x ");
                        cadNumero = "";
                        operacion = "multiplicacion";
                        activado = false;
                        punto = false;

                    }
                }
            });
            division.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(activado == true){
                        numero1 = Double.parseDouble(cadNumero);
                        proceso.setText(cadNumero+" / ");
                        cadNumero = "";
                        operacion = "division";
                        activado = false;
                        punto = false;

                    }
                }
            });
            resta.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(activado == true){
                        numero1 = Double.parseDouble(cadNumero);
                        proceso.setText(cadNumero+" - ");
                        cadNumero = "";
                        operacion = "resta";
                        activado = false;
                        punto = false;

                    }
                }
            });
            raiz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(activado == true){
                        numero1 = Double.parseDouble(cadNumero);
                        proceso.setText("sqrt("+cadNumero+")");
                        resul = Math.sqrt(numero1);
                        proceso.setText(String.format("%.2f",resul));
                        cadNumero = String.valueOf(resul);// convertimos el valor a cadena
                        activado = false;
                        punto = false;
                    }
                }
            });
            eleminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    proceso.setText("");
                    resultado.setText("");
                    cadNumero = "";
                    operacion = "nula";
                    activado = true;
                    punto = true;

                }
            });
            puntito.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (punto == true){
                        if(cadNumero.equals("")){
                            cadNumero = "0.";
                        }else{
                            cadNumero += ".";

                        }

                        proceso.setText(cadNumero);
                        punto = false;

                    }
                }
            });

        }



    public JPanel pantalla;
    private JButton eleminar;
    private JButton a1Button;
    private JButton raiz;
    private JButton a5Button;
    private JButton suma;
    private JButton resta;
    private JButton division;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton multiplicacion;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a0Button;
    private JButton cos;
    private JButton seno;
    private JButton igual;
    private JTextField resultado;
    private JTextField proceso;
    private JButton puntito;

    public static void main(String[] args){
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new calcu().pantalla);
        frame.setBounds(750,300,1000,1050);
        //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
