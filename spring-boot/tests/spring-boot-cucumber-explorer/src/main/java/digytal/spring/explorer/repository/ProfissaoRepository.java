package digytal.spring.explorer.repository;

import digytal.spring.explorer.model.Profissao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfissaoRepository {
    private List<Profissao> profissoes = new ArrayList<>();
    public ProfissaoRepository(){
        String [] nomes = new String [] {
                "3171-2O PROGRAMADOR DE APLICATIVOS EDUCACIONAIS E DE ENTRETENIMENTO",
                "3171-20 PROGRAMADOR DE CD-ROM",
                "3171-10 PROGRAMADOR DE COMPUTADOR",
                "3911-25 PROGRAMADOR DE CONTROLE DE PRODUCAO",
                "7631-20 PROGRAMADOR DE ENCAIXE (CAD)",
                "7661-45 PROGRAMADOR DE FOTOCOMPOSICAO",
                "3171-05 PROGRAMADOR DE INTERNET",
                "3171-15 PROGRAMADOR DE MAQUINAS - FERRAMENTA COM COMANDO NUMERICO",
                "3171-20 PROGRAMADOR DE MULTIMIDIA",
                "3171-10 PROGRAMADOR DE PROCESSAMENTO DE DADOS",
                "7631-20 PROGRAMADOR DE RISCO E CORTE",
                "3171-10 PROGRAMADOR DE SISTEMAS DE COMPUTADOR",
                "3171-10 PROGRAMADOR DE SISTEMAS DE INFORMACAO",
                "3421-10 PROGRAMADOR DE TRANSPORTE MULTIMODAL",
                "3423-05 PROGRAMADOR DE TRANSPORTE RODOVIARIO",
                "3141-10 PROGRAMADOR DE USINAGEM",
                "3911-35 PROGRAMADOR E CONTROLADOR DE MATERIAIS",
                "7102-10 PROGRAMADOR FERROVIARIO",
                "3171-10 PROGRAMADOR FRONT-END",
                "7661-55 PROGRAMADOR VISUAL GRAFICO"
        };
        for(String nome:nomes){
            Profissao profissao = new Profissao();
            profissao.setNome(nome);
            profissoes.add(profissao);
        }
    }

    public List<Profissao> getProfissoes() {
        return profissoes;
    }
}
