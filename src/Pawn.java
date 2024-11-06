public class Pawn extends ChessPiece {
    public Pawn(String color) {
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

        if (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 1 && chessBoard.board[toLine][toColumn] != null) {
            return true;
        }

        if (column - toColumn == 0) {

            if (color.equals("White") && line == 1 && Math.abs(line - toLine) <= 2 && chessBoard.board[toLine][toColumn] == null) {
                if (Math.abs(line - toLine) == 2 && chessBoard.board[2][toColumn] != null) {
                    return false;
                }
                return true;
            }

            if (color.equals("White") && line >= 2 && Math.abs(line - toLine) == 1) {
                return true;
            }

            if (color.equals("Black") && line == 6 && Math.abs(line - toLine) <= 2 && chessBoard.board[toLine][toColumn] == null) {
                if (Math.abs(line - toLine) == 2 && chessBoard.board[5][toColumn] != null) {
                    return false;
                }
                return true;
            }

            if (color.equals("Black") && line >= 2 && Math.abs(line - toLine) == 1) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String getSymbol() {
        return "P";
    }
}
