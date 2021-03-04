package com.juan.sanmiguel.pruebatecnicaevertec.models

data class Person(
    var documentType: String?,
    var document: String?,
    var name: String?,
    var surname: String?,
    var company: String?,
    var email: String?,
    var address: Address?,
    var mobile: String?
)