package com.paparazziapps.pretamistapp.modulos.registro.pojo

import kotlinx.serialization.Serializable


@Serializable
data class Prestamo (
    var id:String?=null,
    var nombres:String? = null,
    var apellidos: String? = null,
    var dni:String? = null,
    var celular:String? = null,
    var fecha:String? = null,
    var unixtime:Long?= null,
    var unixtimeRegistered: Long? = null,
    var capital:Int? = null,
    var interes:Int? = null,
    var plazo_vto:Int?=null,
    //Calcular dias retrasados y
    var dias_restantes_por_pagar:Int?=null,
    var fechaUltimoPago: String? = null,
    var diasPagados: Int? = null,
    var montoTotalAPagar:Double?=null,
    var montoDiarioAPagar:Double?=null,
    var state:String?= null, //CERRADO,ABIERTO

    //Sucursal
    var sucursalId:Int?=null,
    var type:Int?=null,
    var title:String?=null
)

enum class TypePrestamo(val value: Int) {
    TITLE(0),
    CARD(1)
}