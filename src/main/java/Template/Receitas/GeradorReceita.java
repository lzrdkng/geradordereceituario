package Template.Receitas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import Template.Modelo.Atendimento;

public abstract class GeradorReceita {
    public final void gerarReceitas(Atendimento remedios){
        String cabecalho = this.gerarCabecalho(remedios);
        String corpo = this.gerarCorpo(remedios);
        this.mostrarNaTela(cabecalho, corpo);
    }

    public String gerarCabecalho(Atendimento remedios){
        SimpleDateFormat data = new SimpleDateFormat("d/M/y");
        return new String("RECEITUÁRIO \n" +
                "Paciente: "+ remedios.getNomePaciente()+
                "\nMédico: "+ remedios.getNomeMedico()+
                 "\nData: "+
                data.format(new Date()));
    }

    protected abstract String gerarCorpo(Atendimento remedios);
    protected abstract void mostrarNaTela(String cabecalho, String corpo);


}
