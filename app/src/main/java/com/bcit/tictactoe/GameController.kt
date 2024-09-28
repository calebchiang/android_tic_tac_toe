package com.bcit.tictactoe

class GameController {
    private val gameBoard = GameBoard()
    private var currentPlayer: Player
    private var playerX = Player('X')
    private var playerO = Player('O')

    init {
        currentPlayer = playerX // Default start player
    }

    fun startGame() {
        gameBoard.resetBoard()
        currentPlayer = if (Math.random() < 0.5) playerX else playerO


    }







}