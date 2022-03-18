package com.paparazziapps.pretamistapp.modulos.registro.pojo

data class Prestamo (

    var nombres:String? = null,
    var apellidos: String? = null,
    var dni:String? = null,
    var celular:String? = null,
    var fecha:String? = null,
    var unixtime:Long?= null,

    var capital:Double? = null,
    var interes:Double? = null,
    var plazo_vto:Int?=null
)