package Template.Receitas;

import Template.Modelo.Atendimento;

import javax.swing.*;

public class ReceitaGUI extends GeradorReceita{
    @Override
    protected String gerarCorpo(Atendimento remedios) {
        StringBuilder corpo = new StringBuilder();
        corpo.append("Tomar remédio(s): "+remedios.getNomeRemedio()+"\n" +
                remedios.getQuantidadeDeComprimidos()
                +" Comprimido(s)"+
                "\nDurante: "+
                remedios.getDias()+" dia(s)\n"+"de "+remedios.getHoras()+" em "+
                remedios.getHoras()+" hora(s)");
        return corpo.toString();
    }

    @Override
    protected void mostrarNaTela(String cabecalho, String corpo) {
        JOptionPane.showMessageDialog(null, cabecalho + corpo, "Interface do Receituário",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
