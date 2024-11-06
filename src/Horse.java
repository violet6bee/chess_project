public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column,
                                     int toLine, int toColumn) {
        if (line > 7 || column > 7 || toLine > 7 || toColumn > 7 ||
                line < 0 || column < 0 || toLine < 0 || toColumn < 0) {
            return false;
        }
        if (Math.abs(line - toLine) == 2 && Math.abs(column - toColumn) == 1 ||
                Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 2) {
            return true;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
