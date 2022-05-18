package Template.Receitas;

import Template.Modelo.Atendimento;

import java.util.List;

public class ReceitaSimples extends GeradorReceita{
    @Override
    public String gerarCorpo(Atendimento remedios) {
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
    public void mostrarNaTela(String cabecalho, String corpo) {
        System.out.println(cabecalho);
        System.out.println(corpo);
    }
}
