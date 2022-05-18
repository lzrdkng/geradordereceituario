package Template.Factory;



import Template.Modelo.Atendimento;
import Template.Receitas.GeradorReceita;
import Template.Receitas.ReceitaGUI;
import Template.Receitas.ReceitaPDF;
import Template.Receitas.ReceitaSimples;

import javax.swing.*;

public class Opcoes {


    public static void escolherOpcoes(Atendimento atendimento) {
        Object[] opcoes = {"PDF", "GUI", "TERMINAL"};
        int caixa = JOptionPane.showOptionDialog(null, "Escolha o que fazer", "Decida",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        switch (caixa) {
            case 0:
                ReceitaPDF novareceitaPDF = new ReceitaPDF();
                String cabecalhoPDF = novareceitaPDF.gerarCabecalho(atendimento);
                String corpoPDF = novareceitaPDF.gerarCorpo(atendimento);
                novareceitaPDF.mostrarNaTela(cabecalhoPDF, corpoPDF);
                break;
            case 1:
                ReceitaGUI novareceitaGUI = new ReceitaGUI();
                String cabecalhoGUI = novareceitaGUI.gerarCabecalho(atendimento);
                String corpoGUI = novareceitaGUI.gerarCorpo(atendimento);
                novareceitaGUI.mostrarNaTela(cabecalhoGUI, corpoGUI);
                break;
            case 2:
                ReceitaSimples novareceita = new ReceitaSimples();
                String cabecalho = novareceita.gerarCabecalho(atendimento);
                String corpo = novareceita.gerarCorpo(atendimento);
                novareceita.mostrarNaTela(cabecalho, corpo);
                break;
            default:
                System.exit(0);

        }

    }
}

