import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Atividade extends JFrame implements ActionListener {

    // Componentes do Tipo 0 ~ Indefinido
    JLabel indLabel1;
    JButton indOP1, indOP2, indOP3, ResetAll, Sobre;
    // Componentes do Tipo 1 ~ Comum
    JLabel jlcomPrimTermo, jlcomUltmTermo, jlNumTermSomados;
    JTextField tfcomPrimTermo, tfcomUltmTermo, tfcomNumTermSomados;
    JButton comCalcular;
    // Componentes do Tipo 2 ~ Infinita
    JLabel jlinfPrimTermo, jlinfNumTermSomados, jlinfRazao;
    JTextField tfinfPrimTermo, tfinfNumTermSomados, tfinfRazao;
    JButton infCalcular;
    // Componentes do tipo 3 ~ Progressão Geometrica Comum
    JLabel jlTermo, jlRazao, jlAdescobrir;
    JTextField tfTermo, tfRazao, tfAdescobrir;
    JButton jbCalcular;
    // Configurador de calculadora.
    int tipoCalc = 0; // 0 = Indefinido // 1 = Calculadora de PA Comum // 2 = Calculadora de PA
                      // Infinita

    public void Indefine() {
        repaint();
        setTitle("Menu da Calculadora!");
        setSize(810, 75);
        add(indLabel1);
        add(indOP1);
        add(indOP2);
        add(indOP3);
        add(Sobre);
        repaint();
    }

    public void Comunal() {
        repaint();
        setTitle("Somar termos de PA Comum");
        setSize(795, 100);
        remove(indLabel1);
        remove(indOP1);
        remove(indOP2);
        remove(indOP3);
        remove(Sobre);
        add(jlcomPrimTermo);
        add(tfcomPrimTermo);
        add(jlcomUltmTermo);
        add(tfcomUltmTermo);
        add(jlNumTermSomados);
        add(tfcomNumTermSomados);
        add(comCalcular);
        add(ResetAll);
        repaint();
    }

    public void Infinitivo() {
        repaint();
        setTitle("Somar termos de PA Infinitos");
        setSize(763, 94);
        remove(indLabel1);
        remove(indOP1);
        remove(indOP2);
        remove(indOP3);
        remove(Sobre);
        add(jlinfPrimTermo);
        add(tfinfPrimTermo);
        add(jlinfNumTermSomados);
        add(tfinfNumTermSomados);
        add(jlinfRazao);
        add(tfinfRazao);
        add(infCalcular);
        add(ResetAll);
        repaint();
    }

    public void Geometricamente() {
        repaint();
        setTitle("Somar termos de PG Comum");
        setSize(763, 94);
        remove(indLabel1);
        remove(indOP1);
        remove(indOP2);
        remove(indOP3);
        remove(Sobre);
        add(jlTermo);
        add(tfTermo);
        add(jlRazao);
        add(tfRazao);
        add(jlAdescobrir);
        add(tfAdescobrir);
        add(jbCalcular);
        add(ResetAll);
        repaint();
    }

    public void Resetar() {
        repaint();
        remove(jlinfPrimTermo);
        remove(tfinfPrimTermo);
        remove(jlinfNumTermSomados);
        remove(tfinfNumTermSomados);
        remove(jlinfRazao);
        remove(tfinfRazao);
        remove(infCalcular);
        remove(ResetAll);
        remove(jlcomPrimTermo);
        remove(tfcomPrimTermo);
        remove(jlcomUltmTermo);
        remove(tfcomUltmTermo);
        remove(jlNumTermSomados);
        remove(tfcomNumTermSomados);
        remove(comCalcular);
        remove(ResetAll);
        remove(jlTermo);
        remove(jlRazao);
        remove(jlAdescobrir);
        remove(tfTermo);
        remove(tfAdescobrir);
        remove(tfRazao);
        remove(jbCalcular);
        remove(Sobre);
        repaint();
    }

    // LayoutFlow principal <-------------
    public Atividade() {
        // Estrutura Básica!
        setLayout(new FlowLayout());
        setVisible(true);
        // Declarando os componentes!
        // Componentes do grupo Indefinidos
        indLabel1 = new JLabel("Qual Progressão quer calcular?");
        indOP1 = new JButton("PA Comum");
        indOP2 = new JButton("PA Infinita");
        indOP3 = new JButton("PG Comum");
        Sobre = new JButton("Sobre");
        ResetAll = new JButton("Voltar");
        // Componentes do grupo Comuns
        jlcomPrimTermo = new JLabel("Primeiro Termo:");
        jlcomUltmTermo = new JLabel("Ultimo Termo:");
        jlNumTermSomados = new JLabel("Numero de Termos:");
        tfcomPrimTermo = new JTextField(10);
        tfcomUltmTermo = new JTextField(10);
        tfcomNumTermSomados = new JTextField(10);
        comCalcular = new JButton("Calcular");
        // Componentes do grupo Infinitos
        jlinfPrimTermo = new JLabel("Primeiro Termo:");
        jlinfNumTermSomados = new JLabel("Numero de Termos:");
        jlinfRazao = new JLabel("Razão:");
        tfinfPrimTermo = new JTextField(10);
        tfinfNumTermSomados = new JTextField(10);
        tfinfRazao = new JTextField(10);
        infCalcular = new JButton("Calcular");
        // Componentes da PG
        jlTermo = new JLabel("Primeiro Termo:");
        jlRazao = new JLabel("Razão:");
        jlAdescobrir = new JLabel("Termo a descobrir");
        tfTermo = new JTextField(10);
        tfRazao = new JTextField(10);
        tfAdescobrir = new JTextField(10);
        jbCalcular = new JButton("Calcular");
        // Aninhamento de IFs que irão construir!
        if (tipoCalc == 0) {
            Indefine();
        } else if (tipoCalc == 1) {
            Comunal();
        } else if (tipoCalc == 2) {
            Infinitivo();
        } else if (tipoCalc == 3) {
            Geometricamente();
        }
        // Adicionando ações!
        indOP1.addActionListener(this);
        indOP2.addActionListener(this);
        indOP3.addActionListener(this);
        ResetAll.addActionListener(this);
        comCalcular.addActionListener(this);
        infCalcular.addActionListener(this);
        jbCalcular.addActionListener(this);
        Sobre.addActionListener(this);
        // Codigo;
    }

    public static void main(String[] args) {
        Atividade aa = new Atividade();
        aa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == indOP3) {
            tipoCalc = 3;
            this.Resetar();
            this.Geometricamente();
            this.repaint();
            this.setVisible(true);
        }
        if (ae.getSource() == Sobre) {
            JOptionPane.showMessageDialog(null,
                    "Calculadora desenvolvida por:\nFelipe Holanda\nVersão: 0.10.0\nObjetivo: Efetuar calculo de PA e PG de maneira simplificada.\n\nTentei criar uma espécie de interface dinâmica que muda de acordo\ncom a necessidade do usuário, construindo os objetos através de\nfunções que são invocadas de acordo com as variáveis!",
                    "Sobre esta Calculadora!",
                    JOptionPane.PLAIN_MESSAGE);
        }
        if (ae.getSource() == ResetAll) {
            tipoCalc = 0;
            this.Resetar();
            this.Indefine();
            this.repaint();
            this.setVisible(true);
        }
        if (ae.getSource() == indOP1) {
            tipoCalc = 1;
            this.Comunal();
            this.repaint();
            this.setVisible(true);
        }
        if (ae.getSource() == indOP2) {
            tipoCalc = 2;
            this.Infinitivo();
            this.repaint();
            this.setVisible(true);
        }
        if (ae.getSource() == jbCalcular) {
            int A1, q, n, x, y;
            double res;
            A1 = Integer.parseInt(tfTermo.getText());
            q = Integer.parseInt(tfRazao.getText());
            n = Integer.parseInt(tfAdescobrir.getText());
            if (tfTermo.getText().length() <= 0 || tfRazao.getText().length() <= 0
                    || tfAdescobrir.getText().length() <= 0) {
                JOptionPane.showMessageDialog(null,
                        "Certifique-se de prencher todos os campos!",
                        "Algo de errado não está certo!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                x = A1 * q;
                y = n - 1;
                res = Math.pow(x, y);
                JOptionPane.showMessageDialog(null,
                        "O resultado desta Progressão Geometrica Comum é " + res,
                        "Resultado",
                        JOptionPane.PLAIN_MESSAGE);
            }

        }
        if (ae.getSource() == comCalcular) {
            int Sn, A1, An, n;
            A1 = Integer.parseInt(tfcomPrimTermo.getText());
            An = Integer.parseInt(tfcomUltmTermo.getText());
            n = Integer.parseInt(tfcomNumTermSomados.getText());
            if (tfcomPrimTermo.getText().length() <= 0 || tfcomUltmTermo.getText().length() <= 0
                    || tfcomNumTermSomados.getText().length() <= 0) {
                JOptionPane.showMessageDialog(null,
                        "Certifique-se de prencher todos os campos!",
                        "Algo de errado não está certo!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                Sn = (A1 + An) * n / 2;
                JOptionPane.showMessageDialog(null,
                        "O resultado desta Progressão Aritmética Comum é " + Sn,
                        "Resultado",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        if (ae.getSource() == infCalcular) {
            int An, A1, n, r;
            A1 = Integer.parseInt(tfinfPrimTermo.getText());
            n = Integer.parseInt(tfinfNumTermSomados.getText());
            r = Integer.parseInt(tfinfRazao.getText());
            if (tfinfPrimTermo.getText().length() <= 0 || tfinfNumTermSomados.getText().length() <= 0
                    || tfinfRazao.getText().length() <= 0) {
                JOptionPane.showMessageDialog(null,
                        "Certifique-se de prencher todos os campos!",
                        "Algo de errado não está certo!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                An = A1 + (n - 1) * r;
                JOptionPane.showMessageDialog(null,
                        "O Termo N˚" + n + " Corresponde a: " + An,
                        "Resultado",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }

    }
}