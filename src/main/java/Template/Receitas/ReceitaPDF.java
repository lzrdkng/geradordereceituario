package Template.Receitas;

import Template.Modelo.Atendimento;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReceitaPDF extends GeradorReceita{
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
        Document receitaPDF = new Document();
        try{
            PdfWriter.getInstance(receitaPDF,
                    new FileOutputStream("Receita.pdf"));
            receitaPDF.open();

            Paragraph paragrafoCabecalho = new Paragraph(cabecalho);
            Paragraph paragrafoCorpo = new Paragraph(corpo);

            receitaPDF.add(paragrafoCabecalho);
            receitaPDF.add(paragrafoCorpo);
            receitaPDF.close();
        } catch(DocumentException excep){
            excep.printStackTrace();
        } catch(FileNotFoundException exce){
            exce.printStackTrace();
        }
    }
}
