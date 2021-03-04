package com.juan.sanmiguel.pruebatecnicaevertec.models

data class Credit(
    var code: String?,
    var type: String?,
    var groupCode: String?,
    var installment: Int?,
    var installments: List<Int>?
)