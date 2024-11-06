public class Bishop extends ChessPiece {
    public Bishop(String color) {
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

        if (Math.abs(line - toLine) == Math.abs(column - toColumn)) {
            for (int i = 1; i < Math.abs(column - toColumn); i++) {
                int midLine, midCol;
                if (toLine > line) {
                    midLine = line + i;
                } else {
                    midLine = line - i;
                }
                if (toColumn < column) {
                    midCol = column - i;
                } else {
                    midCol = column + i;
                }

                if (chessBoard.board[midLine][midCol] != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    @Override
    public String getSymbol() {
        return "B";
    }
}
