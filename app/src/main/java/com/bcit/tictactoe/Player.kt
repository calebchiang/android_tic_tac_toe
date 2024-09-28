package com.bcit.tictactoe

class Player(val mark: Char) {

    fun getMark(): Char {
        return mark
    }

    override fun toString(): String {
        return "Player($mark)"
    }
}