package com.bcit.tictactoe

class GameBoard {
    private val board = Array(3) { Array(3) { ' ' } }

    fun resetBoard() {
        for (i in board.indices) {
            for (j in board[i].indices) {
                board[i][j] = ' '
            }
        }
    }

    fun isCellOccupied(row: Int, col: Int): Boolean {
        if (row !in 0..2 || col !in 0..2) {
            throw IllegalArgumentException("Indices out of bounds. ")
        }
        return board[row][col] != ' '
    }

    fun isBoardFull(): Boolean {
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == ' ')
                    return false
            }
        }
        return true
    }

    fun placeMark(row: Int, col: Int, mark: Char): Boolean {
        if (row !in 0..2 || col !in 0..2) {
            return false
        }
        if (board[row][col] == ' ') {
            board[row][col] = mark // Place the mark
            return true
        }
        return false
    }

    fun checkForWin(): Char {
        // Check rows and columns for a win
        for (i in 0 until 3) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0]
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i]
            }
        }

        // Check diagonals for a win
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0]
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2]
        }

        // No winner found, next user move
        return ' '
    }
}