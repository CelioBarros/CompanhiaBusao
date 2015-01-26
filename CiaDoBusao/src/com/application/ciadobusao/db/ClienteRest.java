package com.application.ciadobusao.db;
import java.util.ArrayList;
import java.util.List;

import com.application.ciadobusao.util.Encontro;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class ClienteRest {

    private static final String URL_WS = "http://rnnvp.ddns.net:8080/teste123/cliente/";

    
    public String inserirEncontro(Encontro encontro) throws Exception {
     
     Gson gson = new Gson();
     String clienteJSON = gson.toJson(encontro);
     String[] resposta = new WebServiceCliente().post(URL_WS + "inserir", clienteJSON);
     if (resposta[0].equals("200")) {
         return resposta[1];
     } else {
         throw new Exception(resposta[1]);
     }
    }
    public Encontro getEncontro(int id) throws Exception {

        String[] resposta = new WebServiceCliente().get(URL_WS + id);
        
        if (resposta[0].equals("200")) {
            Gson gson = new Gson();
            Encontro cliente = gson.fromJson(resposta[1], Encontro.class);
            return cliente;
        } else {
            throw new Exception(resposta[1]);
        }
       }
    
    public List<Encontro> getListaEncontro() throws Exception {

        String[] resposta = new WebServiceCliente().get(URL_WS + "buscarTodosGSON");
//          String[] resposta = new WebServiceCliente().get(URL_WS + "buscarTodos");
        
        if (resposta[0].equals("200")) {
            Gson gson = new Gson();
            ArrayList<Encontro> listaCliente = new ArrayList<Encontro>();
            JsonParser parser = new JsonParser();
           JsonArray array = parser.parse(resposta[1]).getAsJsonArray();
            
           for (int i = 0; i < array.size(); i++) {
                listaCliente.add(gson.fromJson(array.get(i), Encontro.class));
            }
            return listaCliente;
        } else {
            throw new Exception(resposta[1]);
        }
       }
    
    public String deletarEncontro(int id) {   
        String[] resposta = new WebServiceCliente().get(URL_WS + "delete/" + id);
        return resposta[1];
       }
    
    public String confirmaPresenca(int id, String nome){
    	 String[] resposta = new WebServiceCliente().get(URL_WS + "confirma/"+id+"/"+nome);
    	 return resposta[1];
    }
   
}