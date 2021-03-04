package com.juan.sanmiguel.pruebatecnicaevertec.models

data class Instrument(
    var card: Card?,
    var token: Token?,
    var credit: Credit?,
    var otp: String?
)