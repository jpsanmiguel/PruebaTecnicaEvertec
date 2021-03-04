package com.juan.sanmiguel.pruebatecnicaevertec.models

data class Authentication(
    var login: String?,
    var tranKey: String?,
    var nonce: String?,
    var seed: String?
)