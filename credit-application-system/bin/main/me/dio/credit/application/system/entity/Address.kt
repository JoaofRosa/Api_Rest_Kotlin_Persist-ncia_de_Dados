package me.dio.credit.application.system.entity
import jakarta.persistence.Column
import jakarta.persistence.Embedded

//@Embedded
 data class Address (
    @Column(nullable = false) var zipCode: String = "",
    @Column(nullable = false) var street: String = ""

 )