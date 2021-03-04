package com.juan.sanmiguel.pruebatecnicaevertec.models

data class Transaction(
    var status: Status?,
    var provider: String?,
    var internalReference: String?,
    var reference: String?,
    var paymentMethod: String?,
    var franchise: String?,
    var franchiseName: Address?,
    var issuerName: String?,
    var amount: Amount?,
    var conversion: AmountConversion?,
    var authorization: String?,
    var receipt: String?,
    var type: String?,
    var refunded: Boolean?,
    var lastDigits: String?,
    var additional: List<Any>?
)