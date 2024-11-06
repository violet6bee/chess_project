public class Rook extends ChessPiece {
    public Rook(String color) {
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

        if (Math.abs(line - toLine) == 0 && Math.abs(column - toColumn) != 0) {
            for (int i = Math.min(column, toColumn) + 1; i < Math.max(column, toColumn); i++) {
                if (chessBoard.board[toLine][i] != null) {
                    return false;
                }
            }
            return true;
        }

        if (Math.abs(line - toLine) != 0 && Math.abs(column - toColumn) == 0) {
            for (int i = Math.min(line, toLine) + 1; i < Math.max(line, toLine); i++) {
                if (chessBoard.board[i][toColumn] != null) {
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
