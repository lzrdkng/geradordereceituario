package Template.Factory;

import Template.Modelo.Atendimento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FormularioGrafico extends JFrame {


    private JTextField jtfNomeMedico;
    private JTextField jtfNomePaciente;
    private JTextField jtfRemedio;
    private JTextField jtfDias;
    private JTextField jtfHoras;
    private JTextField jtfQuantidadeComprimidos;


    public FormularioGrafico() {
        super("Receituário");
        this.setSize(500, 300);
        this.setLocation(50, 100);

        Container content = this.getContentPane();
        content.setLayout(null);

        jtfNomeMedico = new JTextField();
        jtfNomePaciente = new JTextField();
        jtfRemedio = new JTextField();
        jtfDias = new JTextField();
        jtfHoras = new JTextField();
        jtfQuantidadeComprimidos = new JTextField();


        jtfNomeMedico.setBounds(250, 15, 150, 20);
        jtfNomePaciente.setBounds(250, 36, 150, 20);
        jtfRemedio.setBounds(250, 57, 150, 20);
        jtfDias.setBounds(250, 78, 150, 20);
        jtfHoras.setBounds(250, 99, 150, 20);
        jtfQuantidadeComprimidos.setBounds(250, 121, 150, 20);

        content.add(jtfNomeMedico);
        content.add(jtfNomePaciente);
        content.add(jtfRemedio);
        content.add(jtfDias);
        content.add(jtfHoras);
        content.add(jtfQuantidadeComprimidos);



        JLabel labelNomeMedico = new JLabel("Nome do medico:");
        JLabel labelNomePaciente = new JLabel("Nome do paciente:");
        JLabel labelRemedio = new JLabel("Remedio:");
        JLabel labelDias = new JLabel("Dias:");
        JLabel labelHoras = new JLabel("Horas:");
        JLabel labelQuantidadeComprimido = new JLabel("Quantidade de Comprimidos:");

        labelNomeMedico.setBounds(0, 15, 200, 20);
        labelNomePaciente.setBounds(0, 36, 200, 20);
        labelRemedio.setBounds(0, 57, 100, 20);
        labelDias.setBounds(0, 78, 100, 20);
        labelHoras.setBounds(0, 99, 100, 20);
        labelQuantidadeComprimido.setBounds(0, 120, 220,20 );

        content.add(labelNomeMedico);
        content.add(labelNomePaciente);
        content.add(labelRemedio);
        content.add(labelDias);
        content.add(labelHoras);
        content.add(labelQuantidadeComprimido);

        JButton ok = new JButton("OK");
        ok.setBounds(250, 150, 100, 50);
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(350,150,100,50);
        content.add(ok);
        content.add(cancelar);

        this.setVisible(true);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nomeMedicoValor = jtfNomeMedico.getText();
                String nomePacienteValor = jtfNomePaciente.getText();
                String remedioValor = jtfRemedio.getText();
                String diasValor = jtfDias.getText();
                String horasValor = jtfHoras.getText();
                String quantidadeComprimidosValor = jtfQuantidadeComprimidos.getText();
                Atendimento atendimento = new Atendimento(remedioValor, nomePacienteValor, nomeMedicoValor, quantidadeComprimidosValor, diasValor, horasValor );
                Opcoes.escolherOpcoes(atendimento);
            }
        });
            
            cancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.exit(0);
                }
            });
            
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}



