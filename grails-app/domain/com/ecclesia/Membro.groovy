package com.ecclesia

class Membro {

    String nome
    String sobrenome
    String email
    Date dataNascimento
    Date dataBatismo


    static constraints = {
    }

    String toString(){
      "$nome $sobrenome"
    }

}
