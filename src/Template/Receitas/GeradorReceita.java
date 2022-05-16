package Template.Receitas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import Template.Modelo.Atendimento;

public abstract class GeradorReceita {
    public final void gerarReceitas(Atendimento remedios){
        String cabecalho = this.gerarCabecalho();
        String corpo = this.gerarCorpo(remedios);
        this.mostrarNaTela(cabecalho, corpo);
    }

    protected String gerarCabecalho(){
        SimpleDateFormat data = new SimpleDateFormat("d/M/y");
        return new String("RECEITUÁRIO \n" +
                "Paciente: "+
                "Médico: \n"+
                "Registro: \n"+ "Unidade de saúde: \n"+"Data: "+
                data.format(new Date()));
    }

    protected abstract String gerarCorpo(Atendimento remedios);
    protected abstract void mostrarNaTela(String cabecalho, String corpo);


}
