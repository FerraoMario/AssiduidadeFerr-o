import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Calculadora extends JFrame implements ActionListener {

    JTextField txtDisplay;

    JButton btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9,
            btnSoma, btnSub, btnMult, btnDiv,
            btnIgual, btnLimpar;

    double numero1, numero2, resultado;
    String operador;

    public Calculadora() {

        setTitle("Calculadora");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtDisplay = new JTextField();
        txtDisplay.setFont(new Font("Arial", Font.BOLD, 24));
        txtDisplay.setHorizontalAlignment(JTextField.RIGHT);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4, 5, 5));

        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDiv = new JButton("/");

        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnMult = new JButton("*");

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnSub = new JButton("-");

        btn0 = new JButton("0");
        btnLimpar = new JButton("C");
        btnIgual = new JButton("=");
        btnSoma = new JButton("+");

        painel.add(btn7);
        painel.add(btn8);
        painel.add(btn9);
        painel.add(btnDiv);

        painel.add(btn4);
        painel.add(btn5);
        painel.add(btn6);
        painel.add(btnMult);

        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(btnSub);

        painel.add(btn0);
        painel.add(btnLimpar);
        painel.add(btnIgual);
        painel.add(btnSoma);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        btnSoma.addActionListener(this);
        btnSub.addActionListener(this);
        btnMult.addActionListener(this);
        btnDiv.addActionListener(this);
        btnIgual.addActionListener(this);
        btnLimpar.addActionListener(this);

        setLayout(new BorderLayout());

        add(txtDisplay, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object fonte = e.getSource();

        if (fonte == btn0) txtDisplay.setText(txtDisplay.getText() + "0");
        if (fonte == btn1) txtDisplay.setText(txtDisplay.getText() + "1");
        if (fonte == btn2) txtDisplay.setText(txtDisplay.getText() + "2");
        if (fonte == btn3) txtDisplay.setText(txtDisplay.getText() + "3");
        if (fonte == btn4) txtDisplay.setText(txtDisplay.getText() + "4");
        if (fonte == btn5) txtDisplay.setText(txtDisplay.getText() + "5");
        if (fonte == btn6) txtDisplay.setText(txtDisplay.getText() + "6");
        if (fonte == btn7) txtDisplay.setText(txtDisplay.getText() + "7");
        if (fonte == btn8) txtDisplay.setText(txtDisplay.getText() + "8");
        if (fonte == btn9) txtDisplay.setText(txtDisplay.getText() + "9");

        if (fonte == btnSoma) {
            numero1 = Double.parseDouble(txtDisplay.getText());
            operador = "+";
            txtDisplay.setText("");
        }

        if (fonte == btnSub) {
            numero1 = Double.parseDouble(txtDisplay.getText());
            operador = "-";
            txtDisplay.setText("");
        }

        if (fonte == btnMult) {
            numero1 = Double.parseDouble(txtDisplay.getText());
            operador = "*";
            txtDisplay.setText("");
        }

        if (fonte == btnDiv) {
            numero1 = Double.parseDouble(txtDisplay.getText());
            operador = "/";
            txtDisplay.setText("");
        }

        if (fonte == btnIgual) {

            numero2 = Double.parseDouble(txtDisplay.getText());

            switch (operador) {
                case "+":
                    resultado = numero1 + numero2;
                    break;

                case "-":
                    resultado = numero1 - numero2;
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    break;

                case "/":
                    resultado = numero1 / numero2;
                    break;
            }

            txtDisplay.setText(String.valueOf(resultado));
        }

        if (fonte == btnLimpar) {
            txtDisplay.setText("");
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }
}