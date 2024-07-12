package Celular;

import Funcoes.AparelhoTelefonico;
import Funcoes.NavegadorNaInternet;
import Funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical,AparelhoTelefonico, NavegadorNaInternet{

    @Override
    public void tocar() {
        
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
       
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        
        System.out.println("Selecionando Musica");
    }

    @Override
    public void exibirPagina() {
        
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        
        System.out.println("Adicionando Nova");
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar(String numero) {
        
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Iniciando Correio de VOz");
    }

  



}
