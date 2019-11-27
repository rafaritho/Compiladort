package decaf;
import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;
import org.antlr.symtab.VariableSymbol;
import org.antlr.symtab.Symbol;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.ArrayList;

public class DecafSymbolsAndScopes extends DecafParserBaseListener {

public class MetodoClass{
    
    private String nome_metodo;

        public String getnome_metodo() {
        return this.nome_metodo;
        }

        public void setnome_metodo(String nome_metodo) {
        this.nome_metodo=nome_metodo;
        }
}
ArrayList<String> variaveis = new ArrayList();
ArrayList<String> Escopo = new ArrayList();
ArrayList<String> Metodo = new ArrayList();


    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; 

    @Override
    public void enterProgram(DecafParser.ProgramContext ctx) {
        globals = new GlobalScope(null);

        for (int i=0; i<ctx.var_decl().size(); i++){
            for (int j=0; j<ctx.var_decl().get(i).ID().size(); j++){
             String globals = ctx.var_decl().get(i).ID().get(j).getText();
         }
     }

        pushScope(globals);
    }
    @Override
    public void exitProgram(DecafParser.ProgramContext ctx) {   
    String escopo ="";
    String variaveis ="";
    String metodo ="";
    String tipo_metodo="";
    String nome_metodo="";
    String var_tipo_metodo="";
    String var_name_metodo=""; 
    popScope();

     try { 

       for(int i =0; i<ctx.method_decl().size(); i++){
            escopo = ctx.method_decl().get(i).ID().getText();

            if(!Escopo.contains(escopo)){
             this.ERRO(ctx.method_decl().get(i).ID().getSymbol(), "ERRO Escopo não declarado: "+escopo);
             System.exit(0);
             } 
        }

        if(!Escopo.contains("main")){
             this.ERRO(ctx.method_decl().get(0).ID().getSymbol(), "ERRO Escopo não declarado: main");
             System.exit(0);
         }

      }catch (Exception e) {  }

      try {
        int cont = 0;
        int contt = 0;
        int varquant =0 ;
        int varquantMetodo = 0;
        String varType = "";
        String varName = "";
        String typeAtual[] = new String[10];
        for(int i =0; i<ctx.method_decl().size(); i++){ 
            varType = ctx.method_decl().get(i).type().getText();
            varName = ctx.method_decl().get(i).ID().getText();

            if(varType.equals("int")){
                for(int j =0; j<ctx.method_decl().get(i).var_decl().size(); j++){
                typeAtual[cont] = ctx.method_decl().get(i).var_decl().get(j).type().getText();
                cont++;
                varquant++;
                }
            } 

            for(int j =0; j<ctx.method_decl().get(1).block_decl().statement_decl().size(); j++){
                for(int k =0; k<ctx.method_decl().get(1).block_decl().statement_decl().get(j).expr_decl().size(); k++){
                    String metodoName = ctx.method_decl().get(1).block_decl().statement_decl().get(j).expr_decl().get(k).method_call().ID().getText();

                    if(varName.equals(metodoName)){ 
                            for(int o = 0; o<ctx.method_decl().get(1).block_decl().statement_decl().get(j).expr_decl().get(k).method_call().expr_decl().size(); o++){
                             String varAtualMetodo =ctx.method_decl().get(1).block_decl().statement_decl().get(j).expr_decl().get(k).method_call().expr_decl().get(o).getText();
                             varquantMetodo++;

                             try{
                             if(typeAtual[contt].equals("int")){
                                if(varAtualMetodo.matches("[a-z]+")){
                                    this.ERRO(ctx.method_decl().get(1).block_decl().statement_decl().get(j).expr_decl().get(k).method_call().ID().getSymbol(), "ERRO Metodo: "+varName+","+(contt+1)+", expected type "+typeAtual[contt]+"ERRO:"+varAtualMetodo);
                                    System.exit(0);
                                }
                             }

                             if(typeAtual[contt].equals("boolean")){
                                if(!varAtualMetodo.equals("true") && !varAtualMetodo.equals("false")){
                                    this.ERRO(ctx.method_decl().get(1).block_decl().statement_decl().get(j).expr_decl().get(k).method_call().ID().getSymbol(), "ERRO Metodo: "+varName+", "+(contt+1)+", expected type "+typeAtual[contt]+"ERRO:"+varAtualMetodo);
                                    System.exit(0);
                                }
                            }
                               }catch (Exception e) {  }

                            contt++;

                            }
                            if(varquantMetodo > varquant){
                             this.ERRO(ctx.method_decl().get(1).block_decl().statement_decl().get(j).expr_decl().get(k).method_call().ID().getSymbol(), "ERRO Metodo: "+varName+" expected: "+varquant+",ERRO:"+varquantMetodo);
                             System.exit(0);
                            }                             
                    }                    
                 }                
            } 
        }
        }catch (Exception e) {  }

      try {
        int l =0;

        for(int i =0; i<ctx.var_decl().size(); i++){
            if(ctx.var_decl().get(i).getText().contains("[")){
             String ArrayValue =ctx.var_decl().get(i).array_decl().INTLITERAL().getText();
             if(ctx.var_decl().get(i).array_decl().getText().contains("[") && ctx.var_decl().get(i).array_decl().getText().contains("]")){
              String ArrayName =ctx.var_decl().get(i).ID().get(0).getText();
              String ArrayType =ctx.var_decl().get(i).type().getText();

                for(int j=0; j<ctx.method_decl().size(); j++){
                    for(int k=0; k<ctx.method_decl().get(j).block_decl().statement_decl().size(); k++){
                        String declaracaoValue = ctx.method_decl().get(j).block_decl().statement_decl().get(k).location_decl().expr_decl().getText();
                        String declaracaoName = ctx.method_decl().get(j).block_decl().statement_decl().get(k).location_decl().ID().getText();
                        String declaracaoResultado = ctx.method_decl().get(j).block_decl().statement_decl().get(k).expr_decl().get(0).getText();

                        if(declaracaoName.equals(ArrayName)){

                           if(ArrayType.contains("int")){

                             if(declaracaoValue.matches("[a-z]+")){
                             this.ERRO(ctx.method_decl().get(j).block_decl().statement_decl().get(k).location_decl().ID().getSymbol(), "ERRO, Expect: "+ArrayName);
                             System.exit(0);
                             }

                             if(Integer.parseInt(declaracaoValue) > Integer.parseInt(ArrayValue) || Integer.parseInt(declaracaoValue) <= 0){
                             this.ERRO(ctx.method_decl().get(j).block_decl().statement_decl().get(k).location_decl().ID().getSymbol(), "ERRO, Expected array size "+ArrayValue);
                             System.exit(0);
                            }

                            if(declaracaoResultado.matches("[a-z]+")){
                             this.ERRO(ctx.method_decl().get(j).block_decl().statement_decl().get(k).location_decl().ID().getSymbol(), "ERRO: "+ArrayName+" int expected");
                             System.exit(0);
                             }

                             if(declaracaoResultado.contains("<") || declaracaoResultado.contains(">") || declaracaoResultado.contains("==") || declaracaoResultado.contains("=<") || declaracaoResultado.contains("=>")){
                             this.ERRO(ctx.method_decl().get(j).block_decl().statement_decl().get(k).location_decl().ID().getSymbol(), "ERRO: "+ArrayName+" int expected");
                             System.exit(0);
                             }
                             

                           }
                        }
                    }
                }
             }   
        }
    }
       

    }catch (Exception e) {  }

    try {

    for(int i =0; i<ctx.var_decl().size(); i++){
    String varType =ctx.var_decl().get(i).type().getText();
    
        for(int j =0; j<ctx.var_decl().get(i).ID().size(); j++){
        String varName =ctx.var_decl().get(i).ID().get(j).getText();        

           if(varType.equals("boolean")){
             for(int k=0; k<ctx.method_decl().size(); k++){
                    for(int l=0; l<ctx.method_decl().get(k).block_decl().statement_decl().size(); l++){
                        String metodoName = ctx.method_decl().get(k).block_decl().statement_decl().get(l).location_decl().getText();

                        if(varName.equals(metodoName)){
                            try{
                                String operador = ctx.method_decl().get(k).block_decl().statement_decl().get(l).assign_op().getText();
                                if(operador.equals("+=") || operador.equals("-=")){
                                  this.ERRO(ctx.method_decl().get(k).block_decl().statement_decl().get(l).location_decl().ID().getSymbol(), "ERRO Declaração inválida:"+operador);
                                   System.exit(0); 
                                }                                

                            }catch (Exception e) {  }

                            for(int o=0;o<ctx.method_decl().get(k).block_decl().statement_decl().get(l).expr_decl().size(); o++){
                            String metodoResultado = ctx.method_decl().get(k).block_decl().statement_decl().get(l).expr_decl().get(o).getText();
                            String metodoResultadoPrimeiro = ctx.method_decl().get(k).block_decl().statement_decl().get(l).expr_decl().get(o).expr_decl().get(0).getText();
                         
                            if(metodoResultadoPrimeiro.equals("true") || metodoResultadoPrimeiro.equals("false")){
                                if(metodoResultado.contains("<") || metodoResultado.contains(">") || metodoResultado.contains("=<") || metodoResultado.contains("=>") || metodoResultado.contains("=")){
                                this.ERRO(ctx.method_decl().get(k).block_decl().statement_decl().get(l).location_decl().ID().getSymbol(), "ERRO Declaração inválida:"+metodoResultado);
                                System.exit(0);    
                               }
                            }

                            if(metodoResultadoPrimeiro.matches("[0-9]+")){
                                if(!metodoResultado.equals("==") || !metodoResultado.equals("!=")){
                                this.ERRO(ctx.method_decl().get(k).block_decl().statement_decl().get(l).location_decl().ID().getSymbol(), "ERRO Declaração inválida:"+metodoResultado);
                                System.exit(0);
                                }
                              }

                            try{
                            String metodoResultadoSegundo = ctx.method_decl().get(k).block_decl().statement_decl().get(l).expr_decl().get(o).expr_decl().get(1).getText();
                            if(metodoResultadoSegundo.equals("true") || metodoResultadoSegundo.equals("false")){
                                if(!metodoResultadoPrimeiro.equals("true") && !metodoResultadoPrimeiro.equals("false")){
                                this.ERRO(ctx.method_decl().get(k).block_decl().statement_decl().get(l).location_decl().ID().getSymbol(), "Erro na declaracao: "+metodoResultado);
                                System.exit(0);
                                }
                              }

                            }catch (Exception e) {  }                            
                               
                        }
                            
                    }
                        
                }
           }
       }
    }

    }

    }catch (Exception e) {  }
        
}

    @Override 
    public void enterMethod_call(DecafParser.Method_callContext ctx) {

     }

    @Override 
    public void exitMethod_call(DecafParser.Method_callContext ctx) {

     }

    @Override
    public void enterMethod_decl(DecafParser.Method_declContext ctx) {
        String name = ctx.ID().getText();
        Escopo.add(ctx.ID().getText());
       
        FunctionSymbol function = new FunctionSymbol(name);
    
        currentScope.define(function);
        saveScope(ctx, function);
        pushScope(function);
          try{
          String tipoVoid = ctx.VOID().getText();
          if(tipoVoid.equals("void")){

            for(int i=0;i<ctx.block_decl().statement_decl().size(); i++){
                String returns =ctx.block_decl().statement_decl().get(i).RETURN().getText();

                  if(returns.equals("return")){
                    this.ERRO(ctx.block_decl().statement_decl().get(i).RETURN().getSymbol(), "ERRO Declaração do Return: "+ctx.ID().getText());
                    System.exit(0);
                  }
            }
        }
        }catch (Exception e) {  }

        try{
        String tipo =  ctx.type().getText();
        if(tipo.equals("int")){
           
            for(int i=0;i<ctx.block_decl().statement_decl().size(); i++){
                String returns =ctx.block_decl().statement_decl().get(i).RETURN().getText();

                  if(returns.equals("return")){
                    for(int j=0;j<ctx.block_decl().statement_decl().get(i).expr_decl().size(); j++){

                    String tipoRetorno = ctx.block_decl().statement_decl().get(i).expr_decl().get(j).getText();
                    if(tipoRetorno.matches("[a-z]+")){
                        this.ERRO(ctx.block_decl().statement_decl().get(i).RETURN().getSymbol(), "ERRO Falta de retorno tipo int: "+ctx.ID().getText());
                       System.exit(0);
                    }
                    
                    }

                  }
            }
        }
        }catch (Exception e) {  }
    }

    @Override 
    public void enterStatement_decl(DecafParser.Statement_declContext ctx) {
     try { 
     int i =0;
     String statement = ctx.location_decl().ID().getText();
        if(!variaveis.contains(statement)){  
            this.ERRO(ctx.location_decl().ID().getSymbol(), "ERRO Variavel não declarada: "+statement);
            System.exit(0);
            } 
     }catch (Exception e) {  }

     try {
        String metodo = ctx.IF().getText();
        if(metodo.equals("if")){
            for(int i =0; i<ctx.expr_decl().size(); i++){
                String value =ctx.expr_decl().get(i).getText();                

                if(!value.contains("<") && !value.contains(">") && !value.contains("==") && !value.contains("=<") && !value.contains("=>") ){
                 this.ERRO(ctx.IF().getSymbol(), "ERRO na declaracao de if: "+value);
                 System.exit(0);
                }
            }            
        }
      }catch (Exception e) {  }

       try {
        String metodo = ctx.FOR().getText();
          if(metodo.equals("for")){
               for(int i =0; i<ctx.expr_decl().size(); i++){
                     String forIgualdade = ctx.expr_decl().get(0).getText();

                     if(forIgualdade.matches("[a-z]+")){
                         this.ERRO(ctx.FOR().getSymbol(), "ERRO A condicao inicial deve ter valor int, ERRO: "+forIgualdade);
                         System.exit(0);
                     }
               }
        }

        }catch (Exception e) {  }

     }

     @Override 
     public void exitStatement_decl(DecafParser.Statement_declContext ctx) { 


     }

    @Override
    public void exitMethod_decl(DecafParser.Method_declContext ctx) {
        popScope();
    }

    @Override public void enterArray_decl(DecafParser.Array_declContext ctx) {
        try{

       String valor = ctx.INTLITERAL().getText(); 
       if(Integer.parseInt(valor) <= 0){  
            this.ERRO(ctx.INTLITERAL().getSymbol(), "ERRO Tamanho do Array inválido: "+valor);
            System.exit(0);
       }

       }catch (Exception e) {  }

    }

    @Override public void exitArray_decl(DecafParser.Array_declContext ctx) {


     }

    @Override
    public void enterVar_decl(DecafParser.Var_declContext ctx) { 
        String variaveisLocal ="";
        for (int i=0; i<ctx.ID().size(); i++){
            variaveisLocal = variaveisLocal+ ctx.ID().get(i).getText()+", ";
            variaveis.add(ctx.ID().get(i).getText());
            defineVar(ctx.type(), ctx.ID().get(i).getSymbol());
        }

    }

    @Override
    public void exitVar_decl(DecafParser.Var_declContext ctx) {
        for (int i=0; i<ctx.ID().size(); i++){
            String name = ctx.ID().get(i).getSymbol().getText();
            Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            this.ERRO(ctx.ID().get(i).getSymbol(), "ERRO Não existe tal variavel: "+name);
            System.exit(0);
        }
        if ( var instanceof FunctionSymbol ) {
            this.ERRO(ctx.ID().get(i).getSymbol(), name+" Não é uma variavel");
            System.exit(0);
        }

        }
    }

    void defineVar(DecafParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        VariableSymbol var = new VariableSymbol(nameToken.getText());

        currentScope.define(var); 
    }

    /**
     * Método que atuliza o escopo para o atual e imprime o valor
     *
     * @param s
     */
    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: "+currentScope.getName()+":"+s);
    }

    /**
     * Método que cria um novo escopo no contexto fornecido
     *
     * @param ctx
     * @param s
     */
    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    /**
     * Muda para o contexto superior e atualiza o escopo
     */
    private void popScope() {
        System.out.println("leaving: "+currentScope.getName()+":"+currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public static void ERRO(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                msg);
    }

    /**
     * Valida tipos encontrados na linguagem para tipos reais
     *
     
     * @param tokenType
     * @return
     */
    public static DecafSymbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case DecafParser.VOID :  return DecafSymbol.Type.tVOID;
            case DecafParser.INTVAR :   return DecafSymbol.Type.tINT;
        }
        return DecafSymbol.Type.tINVALID;
    }
}