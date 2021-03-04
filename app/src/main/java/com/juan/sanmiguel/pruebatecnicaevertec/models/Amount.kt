package com.juan.sanmiguel.pruebatecnicaevertec.models

data class Amount (
    override val currency: String?,
    override val total: Float?,
    var taxes: List<TaxDetail>?,
    var details: List<AmountDetail>?
) : AmountBase(currency, total)