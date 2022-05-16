package Template.Modelo;

public class Atendimento {
    private String nomeRemedio;
    private String nomePaciente;
    private String nomeMedico;
    private int quantidadeDeComprimidos;
    private int dias;
    private int horas;

    public Atendimento(String nomeRemedio, String nomePaciente, String nomeMedico, int quantidadeDeComprimidos,
                       int dias, int horas) {
        this.nomeRemedio = nomeRemedio;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dias = dias;
        this.horas = horas;
        this.quantidadeDeComprimidos = quantidadeDeComprimidos;
    }
    //sobrecarga para pegar apenas o remédio
    public Atendimento(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }


    public Atendimento(String nomeRemedio, int dias, int quantidadeDeComprimidos, int horas) {
        this.nomeRemedio = nomeRemedio;
        this.quantidadeDeComprimidos = quantidadeDeComprimidos;
        this.dias = dias;
        this.horas = horas;
    }

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public int getQuantidadeDeComprimidos() {
        return quantidadeDeComprimidos;
    }

    public int getDias() {
        return dias;
    }

    public int getHoras() {
        return horas;
    }
}
