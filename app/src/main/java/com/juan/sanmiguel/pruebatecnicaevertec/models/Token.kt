package com.juan.sanmiguel.pruebatecnicaevertec.models

data class Token(
    var token: String?,
    var subtoken: String?,
    var franchise: String?,
    var franchiseName: String?,
    var issuerName: String?,
    var lastDigits: String?,
    var validUntil: String?
)