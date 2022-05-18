package Template.Modelo;

public class Atendimento {
    private String nomeRemedio;
    private String nomePaciente;
    private String nomeMedico;
    private String quantidadeDeComprimidos;
    private String dias;
    private String horas;

    public Atendimento(String nomeRemedio, String nomePaciente, String nomeMedico, String quantidadeDeComprimidos,
                       String dias, String horas) {
        this.nomeRemedio = nomeRemedio;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dias = dias;
        this.horas = horas;
        this.quantidadeDeComprimidos = quantidadeDeComprimidos;
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

    public String getQuantidadeDeComprimidos() {
        return quantidadeDeComprimidos;
    }

    public String getDias() {
        return dias;
    }

    public String getHoras() {
        return horas;
    }
}
