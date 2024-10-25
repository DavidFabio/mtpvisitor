public class ConsultaVisitor implements PreciosVisitor{

    @Override
    public String visitarCorteingles(Corteingles corteingles){
        return "Precio Corteingles";
    }

    @Override
    public String visitarMediamarkt(Mediamarkt mediamarkt){
        return "Precio Mediamarkt";
    }

    @Override
    public String visitarFnac(Fnac fnac){
        return "Precio Fnac";
    }
}
