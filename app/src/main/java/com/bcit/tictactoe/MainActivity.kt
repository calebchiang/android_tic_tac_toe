package com.bcit.tictactoe

fun main() {
    val board = GameBoard()
    board.placeMark(0, 0, 'X')
    board.placeMark(0, 1, 'X')
    board.placeMark(0, 2, 'X')
    board.placeMark(1, 0, 'X')
    board.placeMark(1, 1, 'X')
    board.placeMark(1, 2, 'X')
    board.placeMark(2, 0, 'X')
    board.placeMark(2, 1, 'X')
    board.placeMark(2, 2, 'X')
    val boardFull = board.isBoardFull()
    println(boardFull)

}