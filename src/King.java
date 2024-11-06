public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line > 7 || column > 7 || toLine > 7 || toColumn > 7 ||
                line < 0 || column < 0 || toLine < 0 || toColumn < 0) {
            return false;
        }

        if (this.isUnderAttack(chessBoard, toLine, toColumn)) {
                return false;
        }

        if ((Math.abs(line - toLine) == 0 && Math.abs(column - toColumn) == 1) ||
                (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 0)) {
            return true;
        }

        return false;
    }

    public boolean isUnderAttack(ChessBoard board, int lineKing, int columnKing) {
        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 8; j++) {
                ChessPiece figure = board.board[i][j];
                if (figure != null && figure.getColor() != this.color && figure.canMoveToPosition(board, i, j,
                        lineKing, columnKing)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String getSymbol() {
        return "K";
    }
}
