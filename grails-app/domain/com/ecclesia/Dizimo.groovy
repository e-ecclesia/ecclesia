package com.ecclesia

class Dizimo {

    Date data
    BigDecimal valor
    
    static belongsTo = [membro:Membro]

    static constraints = {
    }
}
