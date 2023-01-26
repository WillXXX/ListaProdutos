package com.example.listaprodutos.model

import androidx.annotation.StringRes

data class Produto(
    val foto: Int,
    val nome: String,
    val descricao: String,
    val preco: String,
)