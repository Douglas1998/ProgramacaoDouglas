package caixa_eletronico;
public class Banco {
    
    String numerodobanco;
    String nomedobanco;
    
    
    String buscarBanco (String numerodobanco) {
        
        
        
   
       if ("001".equals(numerodobanco)){
          return "Banco do Brasil";
        }        
       
       
       
       else if ("047".equals(numerodobanco)) {
            return "Banco do Estado do Sergipe";
        }
       
       
       
       else if ("037".equals(numerodobanco)) {
           return "Banco do Estado do Pará";
       }
       
       
       
       else if ("041".equals(numerodobanco)){
           return "Banco do Estado RGS";
       }
       
       
       else if ("004".equals(numerodobanco)){
           return "Banco do Nordeste do Brasil";
       }
       
       
       else {
           return null;
       }
       
    
}
}