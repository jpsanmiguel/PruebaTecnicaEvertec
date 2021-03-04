package com.juan.sanmiguel.pruebatecnicaevertec.models

open class AmountBase(open val currency: String?, open val total: Float?) {
    override fun toString(): String {
        return "AmountBase(currency=$currency, total=$total)"
    }
}